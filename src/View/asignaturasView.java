package View;

import ClassController.asignaturasController;
import ClassController.principalController;
import Model.asignaturasModel;

public class asignaturasView extends javax.swing.JFrame {

    asignaturasModel asignaturas = new asignaturasModel();
    principalController pController = new principalController();

    public asignaturasView() {
        initComponents();
        tablaAsignaturas.setModel(asignaturas.mostrarAsignaturas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAsignaturas = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbCreditos = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        lbTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lbCurso = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        lbCuatrimestre = new javax.swing.JLabel();
        txtCuatrimestre = new javax.swing.JTextField();
        lbIdProfesor = new javax.swing.JLabel();
        txtIdProfesor = new javax.swing.JTextField();
        lbIdGrado = new javax.swing.JLabel();
        txtIdGrado = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAsignaturas = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Asignaturas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAsignaturas.setBackground(new java.awt.Color(255, 255, 255));
        panelAsignaturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Panel Asignaturas");
        panelAsignaturas.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 32));

        panelControl.setBackground(new java.awt.Color(204, 204, 255));
        panelControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbId.setText("Id");
        panelControl.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 24, 42, 25));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtId.setToolTipText("");
        panelControl.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 26, 204, -1));

        lbNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombre.setText("Nombre");
        panelControl.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 55, 54, 25));

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtNombre.setNextFocusableComponent(txtCreditos);
        panelControl.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 57, 192, -1));

        lbCreditos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbCreditos.setText("Creditos");
        panelControl.add(lbCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, -1, 25));

        txtCreditos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCreditos.setNextFocusableComponent(txtTipo);
        panelControl.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 87, 192, -1));

        lbTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTipo.setText("Tipo");
        panelControl.add(lbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 115, -1, 25));

        txtTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtTipo.setNextFocusableComponent(txtCurso);
        panelControl.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 117, 216, -1));

        lbCurso.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbCurso.setText("Curso");
        panelControl.add(lbCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 24, -1, 25));

        txtCurso.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCurso.setNextFocusableComponent(txtCuatrimestre);
        panelControl.add(txtCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 26, 215, -1));

        lbCuatrimestre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbCuatrimestre.setText("Cuatrimestre");
        panelControl.add(lbCuatrimestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 55, -1, 25));

        txtCuatrimestre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtCuatrimestre.setNextFocusableComponent(txtIdProfesor);
        panelControl.add(txtCuatrimestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 57, 180, -1));

        lbIdProfesor.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdProfesor.setText("Id Profesor");
        panelControl.add(lbIdProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 85, -1, 25));

        txtIdProfesor.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtIdProfesor.setNextFocusableComponent(txtIdGrado);
        panelControl.add(txtIdProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 87, 186, -1));

        lbIdGrado.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdGrado.setText("Id Grado");
        panelControl.add(lbIdGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 115, -1, 25));

        txtIdGrado.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtIdGrado.setNextFocusableComponent(btnInsertar);
        panelControl.add(txtIdGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 117, 206, -1));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 191));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText(" Eliminar");
        btnEliminar.setToolTipText("Eliminar Asignaturas");
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
        panelControl.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 164, -1, -1));

        btnModificar.setBackground(new java.awt.Color(153, 153, 191));
        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-editar.png"))); // NOI18N
        btnModificar.setText(" Modificar");
        btnModificar.setToolTipText("Modificar Asignaturas");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setNextFocusableComponent(btnEliminar);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelControl.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 164, -1, -1));

        btnInsertar.setBackground(new java.awt.Color(153, 153, 191));
        btnInsertar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnInsertar.setText(" Insertar");
        btnInsertar.setToolTipText("Insertar Asignaturas");
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
        panelControl.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 164, -1, -1));

        panelAsignaturas.add(panelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, -1));

        tablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAsignaturas.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaAsignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAsignaturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAsignaturas);

        panelAsignaturas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 700, 260));

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
        panelAsignaturas.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, 30));

        getContentPane().add(panelAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int seleccionarFila = tablaAsignaturas.getSelectedRow();
        String idString = (String) tablaAsignaturas.getValueAt(seleccionarFila, 0);
        asignaturasController asigControl = new asignaturasController();
        asigControl.botonEliminar(seleccionarFila, idString);
        tablaAsignaturas.setModel(asignaturas.mostrarAsignaturas());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        asignaturasController asigControl = new asignaturasController();
        String nombre = txtNombre.getText();
        String creditos = txtCreditos.getText();
        String tipo = txtTipo.getText();
        String curso = txtCurso.getText();
        String cuatrimestre = txtCuatrimestre.getText();
        String idProfesor = txtIdProfesor.getText();
        String idGrado = txtIdGrado.getText();
        String whereId = txtId.getText();
        asigControl.botonModificar(nombre, creditos, tipo, curso, cuatrimestre, idProfesor, idGrado, whereId);
        tablaAsignaturas.setModel(asignaturas.mostrarAsignaturas());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        asignaturasController asigControl = new asignaturasController();
        String nombre = txtNombre.getText();
        String creditos = txtCreditos.getText();
        String tipo = txtTipo.getText();
        String curso = txtCurso.getText();
        String cuatrimestre = txtCuatrimestre.getText();
        String idProfesor = txtIdProfesor.getText();
        String idGrado = txtIdGrado.getText();
        asigControl.botonInsertar(nombre, creditos, tipo, curso, cuatrimestre, idProfesor, idGrado);
        tablaAsignaturas.setModel(asignaturas.mostrarAsignaturas());
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tablaAsignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAsignaturasMouseClicked
        int seleccionar = tablaAsignaturas.getSelectedRow();
        txtId.setText(tablaAsignaturas.getValueAt(seleccionar, 0) + "");
        txtNombre.setText(tablaAsignaturas.getValueAt(seleccionar, 1) + "");
        txtCreditos.setText(tablaAsignaturas.getValueAt(seleccionar, 2) + "");
        txtTipo.setText(tablaAsignaturas.getValueAt(seleccionar, 3) + "");
        txtCurso.setText(tablaAsignaturas.getValueAt(seleccionar, 4) + "");
        txtCuatrimestre.setText(tablaAsignaturas.getValueAt(seleccionar, 5) + "");
        txtIdProfesor.setText(tablaAsignaturas.getValueAt(seleccionar, 6) + "");
        txtIdGrado.setText(tablaAsignaturas.getValueAt(seleccionar, 7) + "");
    }//GEN-LAST:event_tablaAsignaturasMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        pController.mostrarPanelPrincipal();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public void limpiarAsignaturas() {
        txtId.setText("");
        txtNombre.setText("");
        txtCreditos.setText("");
        txtTipo.setText("");
        txtCurso.setText("");
        txtCuatrimestre.setText("");
        txtIdProfesor.setText("");
        txtIdGrado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCreditos;
    private javax.swing.JLabel lbCuatrimestre;
    private javax.swing.JLabel lbCurso;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbIdGrado;
    private javax.swing.JLabel lbIdProfesor;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelAsignaturas;
    private javax.swing.JPanel panelControl;
    private javax.swing.JTable tablaAsignaturas;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtCuatrimestre;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdGrado;
    private javax.swing.JTextField txtIdProfesor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
