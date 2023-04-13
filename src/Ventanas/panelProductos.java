package Ventanas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author Álvaro Fernández de Cordova Orta
 */

public class panelProductos extends javax.swing.JPanel {

    public panelProductos() {
        initComponents();
        mostrarProductos();
        mostrarTallas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelReferencia = new javax.swing.JLabel();
        textFieldReferencia = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelTalla = new javax.swing.JLabel();
        comboBoxTalla = new javax.swing.JComboBox<>();
        labelPrecio = new javax.swing.JLabel();
        textFieldPrecio = new javax.swing.JTextField();
        labelCantidad = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        labelReferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia.setText("REFERENCIA");

        textFieldReferencia.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(0, 0, 0));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("NOMBRE");

        textFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelTalla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTalla.setForeground(new java.awt.Color(0, 0, 0));
        labelTalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTalla.setText("TALLA");

        comboBoxTalla.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxTalla.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione talla...", " " }));

        labelPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrecio.setText("PRECIO");

        textFieldPrecio.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldPrecio.setForeground(new java.awt.Color(0, 0, 0));
        textFieldPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        labelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCantidad.setText("CANTIDAD");

        textFieldCantidad.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldCantidad.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR PRODUCTO");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setText("AGREGAR PRODUCTO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxTalla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldPrecio)
                    .addComponent(labelPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNombre)
                    .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia)
                    .addComponent(labelReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void mostrarProductos() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
            String[] filas = new String[5];

            DefaultTableModel tabla = new DefaultTableModel(null, columnas);

            String consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                    + "FROM producto P, talla T "
                    + "WHERE P.talla = T.talla;";

            try {
                Statement st = conect.conect.createStatement();
                ResultSet rs = st.executeQuery(consultaSQL);

                while (rs.next()) {
                    filas[0] = rs.getString("referencia");
                    filas[1] = rs.getString("nombre");
                    filas[2] = rs.getString("talla");
                    filas[3] = rs.getString("precio");
                    filas[4] = rs.getString("cantidad");

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
    
    public void mostrarTallas(){
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();
            
            Statement st;
            ResultSet rs;
            
            DefaultComboBoxModel combo = new DefaultComboBoxModel();
            comboBoxTalla.setModel(combo);
            
            String consultaSQL = "SELECT T.talla "
                    + "FROM producto P, talla T "
                    + "WHERE P.talla = T.talla;";
            
            try {
                st = conect.conect.createStatement();
                rs = st.executeQuery(consultaSQL);
                
                while(rs.next()){
                    combo.addElement(rs.getString("talla"));
                }
                
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
    
    public void agregarProducto(){
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();
            
            String referencia = textFieldReferencia.getText();
            String nombre = textFieldNombre.getText();
            String talla = comboBoxTalla.getSelectedItem().toString();
            String precio = textFieldPrecio.getText();
            String cantidad = textFieldCantidad.getText();
            
            String consultaSQL;
            PreparedStatement ps;
            ResultSet rs;
            
            try {
                consultaSQL = "INSERT INTO producto";
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
    }
    
    public void limpiar(){
        textFieldReferencia.setText("");
        textFieldNombre.setText("");
        comboBoxTalla.setSelectedIndex(0);
        textFieldPrecio.setText("");
        textFieldCantidad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboBoxTalla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelTalla;
    private javax.swing.JTextField textFieldCantidad;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPrecio;
    private javax.swing.JTextField textFieldReferencia;
    // End of variables declaration//GEN-END:variables
}
