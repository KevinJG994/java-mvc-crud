package View;

import ClassController.alumnoController;
import ClassController.principalController;
import Model.alumnoModel;

public class alumnoView extends javax.swing.JFrame{

    alumnoModel alumno = new alumnoModel();
    principalController pController = new principalController();

    public alumnoView() {
        initComponents();
        tablaAlumnos.setModel(alumno.mostrarAlumnos());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAlumnos = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNif = new javax.swing.JLabel();
        txtNif = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lbCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Alumnos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        panelAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Panel Alumnos");
        panelAlumnos.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 32));

        panelControl.setBackground(new java.awt.Color(204, 204, 255));
        panelControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbId.setText("Id");
        panelControl.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 24, 42, 25));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtId.setToolTipText("");
        panelControl.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 26, 221, -1));

        lbNif.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNif.setText("NIF");
        panelControl.add(lbNif, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 55, 42, 25));

        txtNif.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNif.setNextFocusableComponent(txtNombre);
        panelControl.add(txtNif, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 57, 221, -1));

        lbNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombre.setText("Nombre");
        panelControl.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, -1, 25));

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNombre.setNextFocusableComponent(txtApellido);
        panelControl.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 87, 212, -1));

        lbApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApellido.setText("Apellido");
        panelControl.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 115, -1, 25));

        txtApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtApellido.setNextFocusableComponent(txtCiudad);
        panelControl.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 117, 213, -1));

        lbCiudad.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbCiudad.setText("Ciudad");
        panelControl.add(lbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 24, -1, 25));

        txtCiudad.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCiudad.setNextFocusableComponent(txtDireccion);
        panelControl.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 26, 196, -1));

        lbDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbDireccion.setText("Dirección");
        panelControl.add(lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 55, -1, 25));

        txtDireccion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtDireccion.setNextFocusableComponent(txtTelefono);
        panelControl.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 57, 189, -1));

        lbTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTelefono.setText("Teléfono");
        panelControl.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 85, -1, 25));

        txtTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTelefono.setNextFocusableComponent(txtFecha);
        panelControl.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 87, 186, -1));

        lbFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbFecha.setText("Fecha Nacimiento");
        panelControl.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 115, -1, 25));

        txtFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtFecha.setNextFocusableComponent(btnInsertar);
        panelControl.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 117, 141, -1));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 191));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText(" Eliminar");
        btnEliminar.setToolTipText("Eliminar Alumnos");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setMaximumSize(new java.awt.Dimension(135, 30));
        btnEliminar.setMinimumSize(new java.awt.Dimension(135, 30));
        btnEliminar.setNextFocusableComponent(btnVolver);
        btnEliminar.setPreferredSize(new java.awt.Dimension(135, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelControl.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 164, -1, -1));

        btnModificar.setBackground(new java.awt.Color(153, 153, 191));
        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-editar.png"))); // NOI18N
        btnModificar.setText(" Modificar");
        btnModificar.setToolTipText("Modificar Alumnos");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setNextFocusableComponent(btnEliminar);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelControl.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 164, -1, -1));

        btnInsertar.setBackground(new java.awt.Color(153, 153, 191));
        btnInsertar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnInsertar.setText(" Insertar");
        btnInsertar.setToolTipText("Insertar Alumnos");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.setMaximumSize(new java.awt.Dimension(135, 30));
        btnInsertar.setMinimumSize(new java.awt.Dimension(135, 30));
        btnInsertar.setNextFocusableComponent(btnModificar);
        btnInsertar.setPreferredSize(new java.awt.Dimension(135, 30));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelControl.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 164, -1, -1));

        panelAlumnos.add(panelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, -1));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAlumnos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAlumnos);

        panelAlumnos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 700, 260));

        btnVolver.setBackground(new java.awt.Color(153, 153, 191));
        btnVolver.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-arrow.png"))); // NOI18N
        btnVolver.setText(" Volver");
        btnVolver.setToolTipText("Panel Principal");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setNextFocusableComponent(txtId);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelAlumnos.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, 30));

        getContentPane().add(panelAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int seleccionarFila = tablaAlumnos.getSelectedRow();
        String idString = (String) tablaAlumnos.getValueAt(seleccionarFila, 0);
        alumnoController aControl = new alumnoController();
        aControl.botonEliminar(seleccionarFila, idString);
        tablaAlumnos.setModel(alumno.mostrarAlumnos());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        alumnoController aControl = new alumnoController();
        String nif = txtNif.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String ciudad = txtCiudad.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fechaNac = txtFecha.getText();
        String whereId = txtId.getText();
        aControl.botonModificar(nif, nombre, apellido, ciudad, direccion, telefono, fechaNac, whereId);
        tablaAlumnos.setModel(alumno.mostrarAlumnos());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        alumnoController aControl = new alumnoController();
        String nif = txtNif.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String ciudad = txtCiudad.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String fecha = txtFecha.getText();
        aControl.botonInsertar(nif, nombre, apellido, ciudad, direccion, telefono, fecha);
        tablaAlumnos.setModel(alumno.mostrarAlumnos());
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        int seleccionar = tablaAlumnos.getSelectedRow();
        txtId.setText(tablaAlumnos.getValueAt(seleccionar, 0) + "");
        txtNif.setText(tablaAlumnos.getValueAt(seleccionar, 1) + "");
        txtNombre.setText(tablaAlumnos.getValueAt(seleccionar, 2) + "");
        txtApellido.setText(tablaAlumnos.getValueAt(seleccionar, 3) + "");
        txtCiudad.setText(tablaAlumnos.getValueAt(seleccionar, 4) + "");
        txtDireccion.setText(tablaAlumnos.getValueAt(seleccionar, 5) + "");
        txtTelefono.setText(tablaAlumnos.getValueAt(seleccionar, 6) + "");
        txtFecha.setText(tablaAlumnos.getValueAt(seleccionar, 7) + "");
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        pController.mostrarPanelPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public void limpiarAlumnos() {
        txtId.setText("");
        txtNif.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCiudad.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFecha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNif;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelAlumnos;
    private javax.swing.JPanel panelControl;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNif;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}