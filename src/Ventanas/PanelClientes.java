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
public class PanelClientes extends javax.swing.JPanel {

    /**
     * Creates new form PanelClientes
     */
    public PanelClientes() {
        initComponents();
        mostrarClientes();
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

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1896, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarClientes() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            String[] columnas = {"DNI", "Nombre", "Apellidos", "Correo Electrnico", "Teléfono"};
            String[] filas = new String[5];

            DefaultTableModel tabla = new DefaultTableModel(null, columnas);

            String consultaSQL = "SELECT * FROM cliente";

            try {
                Statement st = conect.conect.createStatement();
                ResultSet rs = st.executeQuery(consultaSQL);

                while (rs.next()) {
                    filas[0] = rs.getString("dni");
                    filas[1] = rs.getString("nombre");
                    filas[2] = rs.getString("apellidos");
                    filas[3] = rs.getString("email");
                    filas[4] = rs.getString("tfno");

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}