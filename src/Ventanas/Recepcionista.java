/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Carlos Puga
 */
public class Recepcionista extends javax.swing.JFrame {

    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    public Recepcionista() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("ASISTENTE");
        setExtendedState(this.MAXIMIZED_BOTH);
        tablaAgenda();
        //obtenerFecha();
        
        
    }
    public void tablaAgenda(){
        TablaAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
                "Hora", "Paciente", "Fecha", "Doctor"
            }
        ));
    }
    
    public void tablaPacientes(){
        TablaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Primer nombre", "Segundo nombre", "Apellido paterno", "Apellido materno"
            }
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        AgendaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Fondo_Agenda = new javax.swing.JLabel();
        PacientePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo_Pacientes = new javax.swing.JLabel();
        PerfilPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAgenda = new javax.swing.JTable();
        txtBusquedaAgenda = new javax.swing.JTextField();
        cmbPacientes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        AgendaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgendaPanelMouseClicked(evt);
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
        AgendaPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarCita_32.png"))); // NOI18N
        jLabel3.setText("Cancelar Cita");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AgendaPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acciones");
        AgendaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        AgendaPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 20, 80));

        Fondo_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        AgendaPanel.add(Fondo_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Agenda", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario_64.png")), AgendaPanel); // NOI18N

        PacientePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PacientePanelMouseClicked(evt);
            }
        });
        PacientePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        jLabel6.setText("Agregar Paciente");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PacientePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        jLabel4.setText("Modificar Paciente");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        panel.addTab("Mi Perfil", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuracion_64.png")), PerfilPanel); // NOI18N

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 920, -1));

        TablaAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaAgenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 910, 310));
        getContentPane().add(txtBusquedaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 260, 24));

        cmbPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        cmbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jLabel7.setText("REALIZAR BUSQUEDA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 230, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda2_32.png"))); // NOI18N
        jLabel8.setText("Buscar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 90, -1));

        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar1MouseClicked(evt);
            }
        });
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnIr.setText("Ir a fecha");
        btnIr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrMouseClicked(evt);
            }
        });
        getContentPane().add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPacientesActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void AgendaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendaPanelMouseClicked
   
    }//GEN-LAST:event_AgendaPanelMouseClicked

    private void PacientePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PacientePanelMouseClicked

    }//GEN-LAST:event_PacientePanelMouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if(panel.getSelectedIndex()==0){
            tablaAgenda();
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
            cmbPacientes.addItem("Fecha");
            cmbPacientes.addItem("Doctor");
        }
        if(panel.getSelectedIndex()==1){
            tablaPacientes();
            cmbPacientes.removeAllItems();
            cmbPacientes.addItem("Seleccione una opcion");
            cmbPacientes.addItem("Paciente");
        }
    }//GEN-LAST:event_panelMouseClicked

    private void jCalendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseClicked
        
    }//GEN-LAST:event_jCalendar1MouseClicked

    private void btnIrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrMouseClicked
        obtenerFecha();
    }//GEN-LAST:event_btnIrMouseClicked
    
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
    private javax.swing.JLabel Fondo_Agenda;
    private javax.swing.JLabel Fondo_Pacientes;
    private javax.swing.JPanel PacientePanel;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JTable TablaAgenda;
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cmbPacientes;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextField txtBusquedaAgenda;
    // End of variables declaration//GEN-END:variables

    public void obtenerCitas(String fecha){
        String hora="";
        String paciente="";
        String fechaAct="";
        String doct="";
        String horaArr [];
        String pacienteArr [];
        String fechaActArr [];
        String doctArr [];
        TableModel tableModel = TablaAgenda.getModel();
        tablaAgenda();
        try{
                 String query = "select hora, paciente, fecha, doctor from citas\n" +
                "WHERE fecha= '"+ fecha +"' and estado = 1";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    hora += rs.getString("hora")+",";
                    paciente+=rs.getString("paciente")+",";
                    fechaAct+=rs.getString("fecha")+",";
                    doct+=rs.getString("doctor")+",";
                    }
                 
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        horaArr=hora.split(",");
        pacienteArr=paciente.split(",");
        fechaActArr=fechaAct.split(",");
        doctArr=doct.split(",");
        
        for(int j = 0;j < tableModel.getColumnCount();j++){//j=columnas
            for(int i=0;i<horaArr.length;i++){//i=filas
                TablaAgenda.setValueAt(horaArr[i], i, 0);//valor, fila, columna
                TablaAgenda.setValueAt(pacienteArr[i], i, 1);//valor, fila, columna
                TablaAgenda.setValueAt(fechaActArr[i], i, 2);//valor, fila, columna
                TablaAgenda.setValueAt(doctArr[i], i, 3);//valor, fila, columna
            }
        }
    }//obtenerCitas
    
    public void obtenerFecha(){
        String date = jCalendar1.getDate()+"";
        String meses[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String fecha[] = date.split(" ");
        for(int i=0;i<meses.length;i++){
            if(meses[i].equals(fecha[1])){
                if((i+1)<10){
                    date=fecha[5]+"-0"+(i+1)+"-"+fecha[2];
                }else
                date=fecha[5]+"-"+(i+1)+"-"+fecha[2];
            }
        }//for
            obtenerCitas(date);
    }//obtenerFecha
}//class
