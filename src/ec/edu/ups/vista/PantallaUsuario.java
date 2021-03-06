/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Estudiantes
 */
public class PantallaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PantallaUsuarios
     */
    
    ControladorPersona controladorPersona;
    PantallaAgregarUsuario pantallaAgregarUsuario;
    
    public PantallaUsuario(ControladorPersona controladorPersona) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.controladorPersona = controladorPersona;
        pantallaAgregarUsuario = new PantallaAgregarUsuario(controladorPersona);
                
        deshabilitarCampos();
        deshabilitarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextDireccion1 = new javax.swing.JTextField();
        jTextApellido1 = new javax.swing.JTextField();
        jTextNombre1 = new javax.swing.JTextField();
        jTextCedula1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBtnAgregar1 = new javax.swing.JButton();
        jBtnEditar1 = new javax.swing.JButton();
        jBtnEliminar1 = new javax.swing.JButton();
        jBtnActualizar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblUsuario1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblUsuario = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setTitle("Usuarios");
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame1formWindowActivated(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("Usuarios");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Cedula:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Apellido:");

        jLabel11.setText("Direccion:");

        jTextDireccion1.setEditable(false);

        jTextApellido1.setEditable(false);

        jTextNombre1.setEditable(false);

        jTextCedula1.setEditable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/anadir.png"))); // NOI18N
        jBtnAgregar1.setText("Agregar");
        jBtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregar1ActionPerformed(evt);
            }
        });

        jBtnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/editar.png"))); // NOI18N
        jBtnEditar1.setText("Editar");
        jBtnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditar1ActionPerformed(evt);
            }
        });

        jBtnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/eliminar-usuario.png"))); // NOI18N
        jBtnEliminar1.setText("Eliminar");

        jBtnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/actualizar.png"))); // NOI18N
        jBtnActualizar1.setText("Actualizar");
        jBtnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizar1ActionPerformed(evt);
            }
        });

        jTblUsuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTblUsuario1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAgregar1)
                .addGap(18, 18, 18)
                .addComponent(jBtnEditar1)
                .addGap(18, 18, 18)
                .addComponent(jBtnEliminar1)
                .addGap(18, 18, 18)
                .addComponent(jBtnActualizar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregar1)
                    .addComponent(jBtnEditar1)
                    .addComponent(jBtnEliminar1)
                    .addComponent(jBtnActualizar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDireccion1)
                    .addComponent(jTextApellido1)
                    .addComponent(jTextNombre1)
                    .addComponent(jTextCedula1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/usuario.png"))); // NOI18N

        jMenu2.setText("Archivos");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenu2.add(jMenuItem2);

        jMenuBar2.add(jMenu2);

        jFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Cedula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Direccion:");

        jTextDireccion.setEditable(false);

        jTextApellido.setEditable(false);

        jTextNombre.setEditable(false);

        jTextCedula.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/anadir.png"))); // NOI18N
        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/editar.png"))); // NOI18N
        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/eliminar-usuario.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/actualizar.png"))); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jTblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Id", "Cedula", "Nombre", "Apellido", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblUsuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jBtnEditar)
                .addGap(18, 18, 18)
                .addComponent(jBtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBtnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregar)
                    .addComponent(jBtnEditar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("ID:");

        jTxtId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDireccion)
                    .addComponent(jTextApellido)
                    .addComponent(jTextNombre)
                    .addComponent(jTextCedula)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/usuario.png"))); // NOI18N

        jMenu1.setText("Archivos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        pantallaAgregarUsuario.setVisible(true);
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        int id = Integer.parseInt(jTxtId.getText());
        String cedula = jTextCedula.getText();
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String direccion = jTextDireccion.getText();
        
        if(cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty()){
            JOptionPane.showMessageDialog(this, "LLene todos los campos");
        }else{
            controladorPersona.update(new Persona(id, cedula, nombre, apellido, direccion));
            JOptionPane.showMessageDialog(this, "Se ha actualizado con exito");
            deshabilitarBotones();
            jTblUsuario.clearSelection();
            limpiarCampos();
            habilitarBotonesEditar();
            llenarTabla();
        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAgregar1ActionPerformed

    private void jBtnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEditar1ActionPerformed

    private void jBtnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnActualizar1ActionPerformed

    private void jFrame1formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame1formWindowActivated

    private void jTblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblUsuarioMouseClicked
        int pos = jTblUsuario.getSelectedRow();
        
        int id = (int) jTblUsuario.getValueAt(pos, 0);
        String cedula = (String) jTblUsuario.getValueAt(pos, 1);
        String nombre = (String) jTblUsuario.getValueAt(pos, 2);
        String apellido = (String) jTblUsuario.getValueAt(pos, 3);
        String direccion = (String) jTblUsuario.getValueAt(pos, 4);
        
        
        jTxtId.setText(id+"");
        jTextCedula.setText(cedula);
        jTextNombre.setText(nombre);
        jTextApellido.setText(apellido);
        jTextDireccion.setText(direccion);
        
        habilitarBotones();
        habilitarCampos();
        deshabilitarBotonesEditar();
    }//GEN-LAST:event_jTblUsuarioMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        int id = Integer.parseInt(jTxtId.getText());
        String cedula = jTextCedula.getText();
        String nombre = jTextNombre.getText();
        String apellido = jTextApellido.getText();
        String direccion = jTextDireccion.getText();
        
        boolean eliminar= controladorPersona.delite(new Persona(id, cedula, nombre, apellido, direccion));
        
        if(eliminar){
            JOptionPane.showMessageDialog(this, "Se a eliminado con exito");
        }else{
            JOptionPane.showMessageDialog(this, "No se ha eliminado");
        }
        habilitarBotonesEditar();
        deshabilitarBotones();
        limpiarCampos();
        llenarTabla();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    public void deshabilitarCampos(){
        jTextNombre.setEditable(false);
        jTextApellido.setEditable(false);
        jTextDireccion.setEditable(false);
    }
    
    public void habilitarCampos(){
        jTextNombre.setEditable(true);
        jTextApellido.setEditable(true);
        jTextDireccion.setEditable(true);
    }
    
    public void habilitarBotones(){
        jBtnEditar.setEnabled(true);
        jBtnEliminar.setEnabled(true);
    }
    
    public void deshabilitarBotones(){
        jBtnEditar.setEnabled(false);
        jBtnEliminar.setEnabled(false);
    }
    
    public void limpiarCampos(){
        jTxtId.setText("");
        jTextCedula.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextDireccion.setText("");
    }

    public void deshabilitarBotonesEditar(){
        jBtnAgregar.setEnabled(false);
        jBtnActualizar.setEnabled(false);
    }
    public void habilitarBotonesEditar(){
        jBtnAgregar.setEnabled(true);
        jBtnActualizar.setEnabled(true);
    }
    
    public void llenarTabla(){
        List<Persona> lista = controladorPersona.getLista();
    
        controladorPersona.imprimirListaReflexion(lista);
        
        DefaultTableModel modelo = (DefaultTableModel) jTblUsuario.getModel();
        modelo.setRowCount(0);
        
        if(lista.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay ningun usuario registrado");
        }else{
            for (Persona persona : lista) {
                Object[] objeto = {persona.getId(), persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getDireccion()};
                modelo.addRow(objeto);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnActualizar1;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnAgregar1;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEditar1;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnEliminar1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblUsuario;
    private javax.swing.JTable jTblUsuario1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextApellido1;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextCedula1;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDireccion1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombre1;
    private javax.swing.JTextField jTxtId;
    // End of variables declaration//GEN-END:variables
}
