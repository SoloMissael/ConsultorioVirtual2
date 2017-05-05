package Ventanas;
import Clases.RecepcionistaClase;
import Clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import Ventanas.AgregarPacienteR;
import javax.swing.table.DefaultTableModel;


public class Recepcionista extends javax.swing.JFrame {
    RecepcionistaClase r =  new RecepcionistaClase();
    public Recepcionista() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("RECEPCIONISTA");
        Tabla.setModel(r.tablaAgenda());
        //obtenerFecha();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Calendar1 = new com.toedter.calendar.JCalendar();
        btnIr = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBusquedaAgenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        cmbPacientes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        panel = new javax.swing.JTabbedPane();
        AgendaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Fondo_Agenda = new javax.swing.JLabel();
        PacientePanel = new javax.swing.JPanel();
        lblAgregarPaciente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo_Pacientes = new javax.swing.JLabel();
        PerfilPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Fondo_Pacientes1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Calendar1.setBackground(new java.awt.Color(51, 255, 204));
        Calendar1.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        Calendar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(Calendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        btnIr.setText("Ir a fecha");
        btnIr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrMouseClicked(evt);
            }
        });
        jPanel3.add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 400, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 170));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jLabel7.setText("Realizar Busqueda");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));
        jPanel4.add(txtBusquedaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 890, 170));

        cmbPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        jPanel4.add(cmbPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 260, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda2_32.png"))); // NOI18N
        jLabel8.setText("Buscar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 910, 430));

        panel.setForeground(new java.awt.Color(0, 102, 153));
        panel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        AgendaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        jLabel2.setText("Nueva Cita");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        AgendaPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarCita_32.png"))); // NOI18N
        jLabel3.setText("Cancelar Cita");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        AgendaPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acciones");
        AgendaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        AgendaPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        Fondo_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        AgendaPanel.add(Fondo_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        panel.addTab("Agenda", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario_64.png")), AgendaPanel); // NOI18N

        PacientePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAgregarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        lblAgregarPaciente.setText("Agregar Paciente");
        lblAgregarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAgregarPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarPacienteMouseClicked(evt);
            }
        });
        PacientePanel.add(lblAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        jLabel4.setText("Modificar Paciente");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        PacientePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acciones");
        PacientePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PacientePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        Fondo_Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        Fondo_Pacientes.setText("jLabel4");
        PacientePanel.add(Fondo_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Pacientes", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.png")), PacientePanel); // NOI18N

        PerfilPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        jLabel10.setText("Modificar Perfil");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        PerfilPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PerfilPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Acciones");
        PerfilPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        Fondo_Pacientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        PerfilPanel.add(Fondo_Pacientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Mi Perfil", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuracion_64.png")), PerfilPanel); // NOI18N

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 910, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if(panel.getSelectedIndex()==0){
            Tabla.setModel(r.tablaPacientes());
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
            cmbPacientes.addItem("Fecha");
            cmbPacientes.addItem("Doctor");
        }
        if(panel.getSelectedIndex()==1){
            Tabla.setModel(r.obtenerPacientes());
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
        }
    }//GEN-LAST:event_panelMouseClicked

    private void lblAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarPacienteMouseClicked
        AgregarPacienteR ap = new AgregarPacienteR();
        ap.setVisible(true);
    }//GEN-LAST:event_lblAgregarPacienteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new NuevaCita().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new PerfilRecepcionista().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new ModificarPaciente().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new CancelarCita().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnIrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrMouseClicked
        String fecha = Calendar1.getDate().toString();
        fecha=r.obtenerFecha(fecha);
        Tabla.setModel(r.obtenerCitas(fecha));
    }//GEN-LAST:event_btnIrMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendaPanel;
    private com.toedter.calendar.JCalendar Calendar1;
    private javax.swing.JLabel Fondo_Agenda;
    private javax.swing.JLabel Fondo_Pacientes;
    private javax.swing.JLabel Fondo_Pacientes1;
    private javax.swing.JPanel PacientePanel;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cmbPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAgregarPaciente;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextField txtBusquedaAgenda;
    // End of variables declaration//GEN-END:variables
}//class
