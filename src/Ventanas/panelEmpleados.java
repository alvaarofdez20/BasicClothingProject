/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvaro
 */
public class panelEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form panelEmpleados
     */
    public panelEmpleados() {
        initComponents();
        mostrarEmpleados();
    }

    public void mostrarEmpleados() {
        ConexionBD conect = new ConexionBD();
        conect.conexion();

        String[] columnas = {"DNI", "Nombre", "Apellidos", "Correo Electrónico", "Nombre de Usuario"};
        String[] filas = new String[5];

        DefaultTableModel tabla = new DefaultTableModel(null, columnas);

        String consultaSQL = "SELECT dni, nombre, apellidos, email, usuario FROM empleado";

        try {
            Statement st = conect.conect.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);

            while (rs.next()) {
                filas[0] = rs.getString("dni");
                filas[1] = rs.getString("nombre");
                filas[2] = rs.getString("apellidos");
                filas[3] = rs.getString("email");
                filas[4] = rs.getString("usuario");

                tabla.addRow(filas);
            }
            tablaEmpleados.setModel(tabla);
            conect.conect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarEmpleado() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            String dni = textFieldDNI.getText();
            String nombre = textFieldNombre.getText();
            String apellidos = textFieldApellidos.getText();
            String email = textFieldCorreo.getText();
            String username = textFieldUsuario.getText();
            String password = textFieldPassword.getText();

            String consultaSQL;
            PreparedStatement ps;

            try {
                consultaSQL = "INSERT INTO empleado(DNI, nombre, apellidos, email, usuario, contrasenia) VALUES (?, ?, ?, ?, ?, ?)";
                ps = conect.conect.prepareStatement(consultaSQL);

                // RELLENAMOS LAS INTERROGACIONES CON LOS DATOS
                ps.setString(1, dni);
                ps.setString(2, nombre);
                ps.setString(3, apellidos);
                ps.setString(4, email);
                ps.setString(5, username);
                ps.setString(6, password);

                ps.executeUpdate();

                limpiar();
                mostrarEmpleados();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conect.conect.close();
        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void limpiar(){
        textFieldDNI.setText("");
        textFieldNombre.setText("");
        textFieldApellidos.setText("");
        textFieldCorreo.setText("");
        textFieldUsuario.setText("");
        textFieldPassword.setText("");
    }
    
    public void eliminarEmpleado() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            int filaSeleccionada = tablaEmpleados.getSelectedRow();

            String sql = "DELETE FROM empleado WHERE DNI = '" + tablaEmpleados.getValueAt(filaSeleccionada, 0) + "'";

            Statement st = conect.conect.createStatement();

            st.executeUpdate(sql);
            
            mostrarEmpleados();
            
            conect.conect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        labelDNI = new javax.swing.JLabel();
        textFieldDNI = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelApellidos = new javax.swing.JLabel();
        textFieldApellidos = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        labelDNI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(0, 0, 0));
        labelDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDNI.setText("DNI");

        textFieldDNI.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDNI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldDNI.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(0, 0, 0));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("NOMBRE");

        textFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellidos.setText("APELLIDOS");

        textFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        textFieldApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldApellidos.setForeground(new java.awt.Color(0, 0, 0));
        textFieldApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorreo.setForeground(new java.awt.Color(0, 0, 0));
        labelCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorreo.setText("CORREO ELECTRÓNICO");

        textFieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldCorreo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("NOMBRE DE USUARIO");

        textFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        textFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(0, 0, 0));
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword.setText("CONTRASEÑA");

        textFieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        textFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAgregar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR EMPLEADO");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR EMPLEADO");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
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
                    .addComponent(textFieldDNI)
                    .addComponent(labelDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldNombre)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldApellidos)
                    .addComponent(labelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldCorreo)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldUsuario)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldPassword)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addComponent(labelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarEmpleado();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarEmpleado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField textFieldApellidos;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldDNI;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
