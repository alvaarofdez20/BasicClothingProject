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
public class panelEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form panelEmpleados
     */
    public panelEmpleados() {
        initComponents();
        mostrarProductos();
    }

    public void mostrarProductos() {
        ConexionBD conect = new ConexionBD();
        conect.conexion();

        String[] columnas = {"DNI", "Nombre", "Apellidos", "Correo Electrónico", "Nombre de Usuario"};
        String[] filas = new String[5];

        DefaultTableModel tabla = new DefaultTableModel(null, columnas);

        String consultaSQL = "SELECT dni, nombre, apellidos, email, username FROM empleado";

        try {
            Statement st = conect.conect.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);

            while (rs.next()) {
                filas[0] = rs.getString("dni");
                filas[1] = rs.getString("nombre");
                filas[2] = rs.getString("apellidos");
                filas[3] = rs.getString("email");
                filas[4] = rs.getString("username");

                tabla.addRow(filas);
            }
            jTable1.setModel(tabla);
            conect.conect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelReferencia = new javax.swing.JLabel();
        textFieldReferencia = new javax.swing.JTextField();
        labelReferencia1 = new javax.swing.JLabel();
        textFieldReferencia1 = new javax.swing.JTextField();
        labelReferencia2 = new javax.swing.JLabel();
        textFieldReferencia2 = new javax.swing.JTextField();
        labelReferencia3 = new javax.swing.JLabel();
        textFieldReferencia3 = new javax.swing.JTextField();
        labelReferencia4 = new javax.swing.JLabel();
        textFieldReferencia4 = new javax.swing.JTextField();
        labelReferencia5 = new javax.swing.JLabel();
        textFieldReferencia5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
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
        labelReferencia.setText("DNI");

        textFieldReferencia.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReferencia1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia1.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia1.setText("NOMBRE");

        textFieldReferencia1.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia1.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReferencia2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia2.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia2.setText("APELLIDOS");

        textFieldReferencia2.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia2.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReferencia3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia3.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia3.setText("CORREO ELECTRÓNICO");

        textFieldReferencia3.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia3.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReferencia4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia4.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia4.setText("NOMBRE DE USUARIO");

        textFieldReferencia4.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia4.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReferencia5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelReferencia5.setForeground(new java.awt.Color(0, 0, 0));
        labelReferencia5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReferencia5.setText("CONTRASEÑA");

        textFieldReferencia5.setBackground(new java.awt.Color(255, 255, 255));
        textFieldReferencia5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textFieldReferencia5.setForeground(new java.awt.Color(0, 0, 0));
        textFieldReferencia5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AGREGAR EMPLEADO");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldReferencia)
                    .addComponent(labelReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia1)
                    .addComponent(labelReferencia1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia2)
                    .addComponent(labelReferencia2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia3)
                    .addComponent(labelReferencia3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia4)
                    .addComponent(labelReferencia4, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(textFieldReferencia5)
                    .addComponent(labelReferencia5, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addComponent(labelReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelReferencia5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldReferencia5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelReferencia1;
    private javax.swing.JLabel labelReferencia2;
    private javax.swing.JLabel labelReferencia3;
    private javax.swing.JLabel labelReferencia4;
    private javax.swing.JLabel labelReferencia5;
    private javax.swing.JTextField textFieldReferencia;
    private javax.swing.JTextField textFieldReferencia1;
    private javax.swing.JTextField textFieldReferencia2;
    private javax.swing.JTextField textFieldReferencia3;
    private javax.swing.JTextField textFieldReferencia4;
    private javax.swing.JTextField textFieldReferencia5;
    // End of variables declaration//GEN-END:variables
}
