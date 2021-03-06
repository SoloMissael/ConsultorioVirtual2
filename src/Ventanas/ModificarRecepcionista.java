/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Carlos Puga
 */
public class ModificarRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form PerfilDoctor
     */
    public ModificarRecepcionista() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("MODIFICAR RECEPCIONISTA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMedicoNo = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtTelefonoOficina = new javax.swing.JTextField();
        txtTelefonoDomicilio = new javax.swing.JTextField();
        pswContraseña = new javax.swing.JPasswordField();
        txtTelefonoExtra = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtTelefonoMovil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDomicilio = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBusquedaAgenda = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_32.png"))); // NOI18N
        jLabel23.setText("Guardar");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 20, 80));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Acciones");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMedicoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicoNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, -1));
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, -1));
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, -1));
        jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 300, -1));
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 300, -1));
        jPanel1.add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 110, -1));
        jPanel1.add(txtTelefonoOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 150, -1));
        jPanel1.add(txtTelefonoDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, -1));

        pswContraseña.setText("jPasswordField1");
        jPanel1.add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));
        jPanel1.add(txtTelefonoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 240, -1));
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 140, -1));
        jPanel1.add(txtTelefonoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 140, -1));

        txtAreaDomicilio.setColumns(20);
        txtAreaDomicilio.setRows(5);
        jScrollPane1.setViewportView(txtAreaDomicilio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 300, 70));

        jLabel19.setText("Correo Electronico");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, 20));

        jLabel18.setText("Telefono Extra");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, 20));

        jLabel17.setText("Teléfono Movil");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, 20));

        jLabel16.setText("Contraseña");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, 20));

        jLabel15.setText("Nombre de Usuario");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, 20));

        jLabel14.setText("Nombre de Usuario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, 20));

        jLabel12.setText("Telefono Oficina");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 20));

        jLabel11.setText("Codigo Postal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 20));

        jLabel6.setText("Usuario No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        jLabel5.setText("Nombre(s)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 380, 100));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Adicional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 380, 130));

        jLabel8.setText("Apellido(s)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 20));

        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 20));

        jLabel9.setText("Domicilio");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        jLabel10.setText("Ciudad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 20));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 450, 440));

        jLabel20.setText("Telefono Domicilio");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jLabel13.setText("REALIZAR BUSQUEDA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, -1));
        jPanel1.add(txtBusquedaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 24));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda2_32.png"))); // NOI18N
        jLabel21.setText("Buscar");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicoNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicoNoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextArea txtAreaDomicilio;
    private javax.swing.JTextField txtBusquedaAgenda;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMedicoNo;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefonoDomicilio;
    private javax.swing.JTextField txtTelefonoExtra;
    private javax.swing.JTextField txtTelefonoMovil;
    private javax.swing.JTextField txtTelefonoOficina;
    // End of variables declaration//GEN-END:variables
}
