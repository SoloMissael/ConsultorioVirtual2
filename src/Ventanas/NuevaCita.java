/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

//fecha   hora  paciente  doctor estado 

import Clases.CitasClase;
import Clases.conectar;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import static javax.swing.JOptionPane.showMessageDialog;

public class NuevaCita extends javax.swing.JFrame {
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    CitasClase c = new CitasClase();
    /**
     * Creates new form NuevaCita
     */
    public NuevaCita() {
        initComponents();
        setTitle("Agregar cita");
        setLocationRelativeTo(null);
        c.obtenerDoctor(txtDoctor);
        c.obtenerPacientes(txtPaciente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAceptar = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        DateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hora: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel2.setText("Paciente: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel3.setText("Doctor: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setForeground(new java.awt.Color(0, 102, 153));

        lblCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_32.png"))); // NOI18N
        lblCancelar.setText("Cancelar");
        jPanel2.add(lblCancelar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 100, 40));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        lblAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAceptar.setForeground(new java.awt.Color(255, 255, 255));
        lblAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_32.png"))); // NOI18N
        lblAceptar.setText("Aceptar");
        lblAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(lblAceptar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 100, 40));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 278, -1));
        getContentPane().add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 278, -1));
        getContentPane().add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 278, -1));
        getContentPane().add(DateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_blanco.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, 230));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        jLabel7.setText("Nueva Cita");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAceptarMouseClicked
    /*String fecha, String hora, int id_paciente, int id_doctor*/

       c.insertarCita(c.obtenerFecha(DateChooser1),txtHora.getText(),
               c.obtenerIdPaciente(txtPaciente.getText()),
               c.obtenerIdMedico(txtDoctor.getText()));
    }//GEN-LAST:event_lblAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAceptar;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}//clase
