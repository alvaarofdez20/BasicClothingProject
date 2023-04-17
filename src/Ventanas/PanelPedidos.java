/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro
 */
public class PanelPedidos extends javax.swing.JPanel {

    public PanelPedidos() {
        initComponents();
        mostrarPedidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        btnEntregado = new javax.swing.JButton();
        btnReparto = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tablaPedidos.setBackground(new java.awt.Color(255, 255, 255));
        tablaPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPedidos);

        btnEntregado.setBackground(new java.awt.Color(0, 153, 153));
        btnEntregado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEntregado.setForeground(new java.awt.Color(255, 255, 255));
        btnEntregado.setText("Entregado");
        btnEntregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregadoActionPerformed(evt);
            }
        });

        btnReparto.setBackground(new java.awt.Color(0, 153, 153));
        btnReparto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnReparto.setForeground(new java.awt.Color(255, 255, 255));
        btnReparto.setText("Reparto");
        btnReparto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(btnEntregado, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(319, 319, 319)
                        .addComponent(btnReparto, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReparto, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnEntregado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregadoActionPerformed
        editarProductoEntregado();
        mostrarPedidos();
    }//GEN-LAST:event_btnEntregadoActionPerformed

    private void btnRepartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartoActionPerformed
        editarProductoReparto();
        mostrarPedidos();
    }//GEN-LAST:event_btnRepartoActionPerformed

    public void mostrarPedidos() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            String[] columnas = {"Número de pedido", "Referencia de producto", "Nombre de producto", "DNI de cliente", "Nombre de cliente", "Apellidos de cliente", "Fecha", "Estado de pedido"};
            String[] filas = new String[8];

            DefaultTableModel tabla = new DefaultTableModel(null, columnas);

            String consultaSQL = "SELECT P.num_pedido, P.referencia, Pr.nombre, P.dni, C.nombre, C.apellidos, P.fecha, P.estado "
                    + "FROM pedidos P, producto Pr, cliente C "
                    + "WHERE P.referencia = Pr.referencia AND P.dni = C.dni";

            try {
                Statement st = conect.conect.createStatement();
                ResultSet rs = st.executeQuery(consultaSQL);

                while (rs.next()) {
                    filas[0] = rs.getString("num_pedido");
                    filas[1] = rs.getString("referencia");
                    filas[2] = rs.getString("nombre");
                    filas[3] = rs.getString("dni");
                    filas[4] = rs.getString("nombre");
                    filas[5] = rs.getString("apellidos");
                    filas[6] = rs.getString("fecha");
                    filas[7] = rs.getString("estado");

                    tabla.addRow(filas);
                }
                tablaPedidos.setModel(tabla);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conect.conect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editarProductoEntregado() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            int filaSeleccionada = 0;
            filaSeleccionada = tablaPedidos.getSelectedRow();

            int numPedido = Integer.parseInt(tablaPedidos.getValueAt(filaSeleccionada, 0).toString());

            String sql = "UPDATE pedidos SET estado = 'Entregado' WHERE num_pedido = '" + numPedido + "'";
            Statement st = conect.conect.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editarProductoReparto() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            int filaSeleccionada = 0;
            filaSeleccionada = tablaPedidos.getSelectedRow();

            int numPedido = Integer.parseInt(tablaPedidos.getValueAt(filaSeleccionada, 0).toString());

            String sql = "UPDATE pedidos SET estado = 'Reparto' WHERE num_pedido = '" + numPedido + "'";
            Statement st = conect.conect.createStatement();
            st.executeUpdate(sql);

            conect.conect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntregado;
    private javax.swing.JButton btnReparto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedidos;
    // End of variables declaration//GEN-END:variables
}
