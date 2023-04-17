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
 *
 *
 */
public class panelProductos extends javax.swing.JPanel {

    public panelProductos() {
        initComponents();
        mostrarProductos();
        mostrarTallas();
        filtros();
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
        labelFiltros = new javax.swing.JLabel();
        comboBoxFiltros = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

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
        comboBoxTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR PRODUCTO");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR PRODUCTO");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        labelFiltros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelFiltros.setForeground(new java.awt.Color(0, 0, 0));
        labelFiltros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFiltros.setText("FILTROS");

        comboBoxFiltros.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxFiltros.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio Ascendente", "Precio Descendente", "Cantidad" }));

        btnBuscar.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(578, 578, 578)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(356, 356, 356)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(comboBoxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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
        agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProductos();
        mostrarProductos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtros();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void mostrarProductos() {
        ConexionBD conect = new ConexionBD();
        conect.conexion();

        String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
        String[] filas = new String[5];

        DefaultTableModel tabla = new DefaultTableModel(null, columnas);

        String consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                + "FROM producto P, talla T "
                + "WHERE P.talla = T.talla";

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
            conect.conect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarTallas() {
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

                while (rs.next()) {
                    combo.addElement(rs.getString("talla"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminarProductos() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            int filaSeleccionada = jTable1.getSelectedRow();

            String sql = "DELETE FROM producto WHERE referencia = '" + jTable1.getValueAt(filaSeleccionada, 0) + "'";

            Statement st = conect.conect.createStatement();

            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarProducto() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            if (btnAgregar.getText().equals("AGREGAR PRODUCTO")) {
                String referencia = textFieldReferencia.getText();
                String nombre = textFieldNombre.getText();
                int talla = idTalla(comboBoxTalla.getSelectedItem().toString());
                Double precio = Double.valueOf(textFieldPrecio.getText());
                int cantidad = Integer.parseInt(textFieldCantidad.getText());

                String consultaSQL;
                PreparedStatement ps;

                try {
                    consultaSQL = "INSERT INTO producto(referencia, nombre, talla, precio, cantidad) VALUES (?, ?, ?, ?, ?)";
                    ps = conect.conect.prepareStatement(consultaSQL);

                    // RELLENAMOS LAS INTERROGACIONES CON LOS DATOS
                    ps.setString(1, referencia);
                    ps.setString(2, nombre);
                    ps.setInt(3, talla);
                    ps.setDouble(4, precio);
                    ps.setInt(5, cantidad);

                    ps.executeUpdate();

                    limpiar();
                    mostrarProductos();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conect.conect.close();
            }
        } catch (NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
    }

    public int idTalla(String x) {
        ConexionBD conect = new ConexionBD();
        conect.conexion();

        String comboTalla = x;

        String consultaSQL;
        PreparedStatement ps;
        ResultSet rs;
        int talla = 0;

        try {
            consultaSQL = "SELECT id FROM talla WHERE talla = ?";
            ps = conect.conect.prepareStatement(consultaSQL);

            ps.setString(1, comboTalla);
            rs = ps.executeQuery();
            if (rs.next()) {
                talla = rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return talla;
    }

    public void editarProductos() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            int filaSeleccionada = jTable1.getSelectedRow();

            String referencia = jTable1.getValueAt(filaSeleccionada, 0).toString();
            String nombre = jTable1.getValueAt(filaSeleccionada, 1).toString();
            String talla = jTable1.getValueAt(filaSeleccionada, 2).toString();
            Double precio = Double.valueOf(jTable1.getValueAt(filaSeleccionada, 3).toString());
            int cantidad = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 4).toString());

            textFieldReferencia.setText(referencia);
            textFieldNombre.setText(nombre);
            comboBoxTalla.setSelectedIndex(0);
            textFieldPrecio.setText(String.valueOf(precio));
            textFieldCantidad.setText(String.valueOf(cantidad));

            int totalFilas = jTable1.getRowCount();
            String referenciaBD;

            for (int i = 0; i <= totalFilas; i++) {
                referenciaBD = jTable1.getValueAt(i, 0).toString();

                if (referenciaBD.equals(textFieldReferencia.getText())) {
                    btnAgregar.setText("EDITAR PRODUCTO");
                }
            }

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

    }

    public void filtros() {
        try {
            ConexionBD conect = new ConexionBD();
            conect.conexion();

            boolean nombre = false;
            boolean precioAsc = false;
            boolean precioDes = false;
            String consultaSQL;

            Statement st;
            ResultSet rs;

            if (comboBoxFiltros.getSelectedItem().toString().equals("Nombre")) {
                nombre = true;
                precioAsc = false;
                precioDes = false;
            } else if (comboBoxFiltros.getSelectedItem().toString().equals("Precio Ascendente")) {
                nombre = false;
                precioAsc = true;
                precioDes = false;
            } else if (comboBoxFiltros.getSelectedItem().toString().equals("Precio Descendente")) {
                nombre = false;
                precioAsc = false;
                precioDes = true;
            } else {
                nombre = false;
                precioAsc = false;
                precioDes = false;
            }

            if (nombre == true) {
                try {
                    String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
                    String[] filas = new String[5];

                    DefaultTableModel tabla = new DefaultTableModel(null, columnas);

                    consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                            + "FROM producto P, talla T "
                            + "WHERE P.talla = T.talla "
                            + "ORDER BY nombre";
                    st = conect.conect.createStatement();
                    rs = st.executeQuery(consultaSQL);

                    while (rs.next()) {
                        filas[0] = rs.getString("referencia");
                        filas[1] = rs.getString("nombre");
                        filas[2] = rs.getString("talla");
                        filas[3] = rs.getString("precio");
                        filas[4] = rs.getString("cantidad");

                        tabla.addRow(filas);
                    }
                    jTable1.setModel(tabla);
                    conect.conect.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            } else if (precioAsc == true) {
                try {
                    String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
                    String[] filas = new String[5];

                    DefaultTableModel tabla = new DefaultTableModel(null, columnas);

                    consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                            + "FROM producto P, talla T "
                            + "WHERE P.talla = T.talla "
                            + "ORDER BY precio";
                    st = conect.conect.createStatement();
                    rs = st.executeQuery(consultaSQL);

                    while (rs.next()) {
                        filas[0] = rs.getString("referencia");
                        filas[1] = rs.getString("nombre");
                        filas[2] = rs.getString("talla");
                        filas[3] = rs.getString("precio");
                        filas[4] = rs.getString("cantidad");

                        tabla.addRow(filas);
                    }
                    jTable1.setModel(tabla);
                    conect.conect.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            } else if (precioDes == true) {
                try {
                    String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
                    String[] filas = new String[5];

                    DefaultTableModel tabla = new DefaultTableModel(null, columnas);

                    consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                            + "FROM producto P, talla T "
                            + "WHERE P.talla = T.talla "
                            + "ORDER BY precio DESC";
                    st = conect.conect.createStatement();
                    rs = st.executeQuery(consultaSQL);

                    while (rs.next()) {
                        filas[0] = rs.getString("referencia");
                        filas[1] = rs.getString("nombre");
                        filas[2] = rs.getString("talla");
                        filas[3] = rs.getString("precio");
                        filas[4] = rs.getString("cantidad");

                        tabla.addRow(filas);
                    }
                    jTable1.setModel(tabla);
                    conect.conect.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                try {
                    String[] columnas = {"Referencia", "Nombre", "Talla", "Precio", "Cantidad"};
                    String[] filas = new String[5];

                    DefaultTableModel tabla = new DefaultTableModel(null, columnas);

                    consultaSQL = "SELECT P.referencia, P.nombre, T.talla, P.precio, P.cantidad "
                            + "FROM producto P, talla T "
                            + "WHERE P.talla = T.talla "
                            + "ORDER BY cantidad";
                    st = conect.conect.createStatement();
                    rs = st.executeQuery(consultaSQL);

                    while (rs.next()) {
                        filas[0] = rs.getString("referencia");
                        filas[1] = rs.getString("nombre");
                        filas[2] = rs.getString("talla");
                        filas[3] = rs.getString("precio");
                        filas[4] = rs.getString("cantidad");

                        tabla.addRow(filas);
                    }
                    jTable1.setModel(tabla);
                    conect.conect.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
            conect.conect.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void limpiar() {
        textFieldReferencia.setText("");
        textFieldNombre.setText("");
        comboBoxTalla.setSelectedIndex(0);
        textFieldPrecio.setText("");
        textFieldCantidad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboBoxFiltros;
    private javax.swing.JComboBox<String> comboBoxTalla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelFiltros;
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
