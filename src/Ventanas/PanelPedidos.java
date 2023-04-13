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

    /**
     * Creates new form PanelPedidos
     */
    public PanelPedidos() {
        initComponents();
        mostrarPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Actualizar tabla de pedidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarPedidos(){
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
                
                while(rs.next()){
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
                jTable1.setModel(tabla);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conect.conect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}