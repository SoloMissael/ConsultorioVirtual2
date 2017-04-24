package Ventanas;
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


public class Doctor extends javax.swing.JFrame {

    conectar cc=new conectar();
    Connection cn=cc.conexion();
    DefaultTableModel modelo;
    String cabeceraCitas[]={"Hora", "Paciente", "Fecha", "Doctor"};
    String cabeceraPacientes[]={"Primer nombre", "Segundo nombre", "Apellido paterno", "Apellido materno"};
    String datos[][]={};
    public Doctor() {/*debe recibir el id del doctor para que solo pueda ver
        los pacientes que le corresponden*/
        initComponents();
        setLocationRelativeTo(null);
        setTitle("DOCTOR");
        setExtendedState(this.MAXIMIZED_BOTH);
        tablaAgenda();
        obtenerFecha();
        
    }
    public void tablaAgenda(){
        modelo=new DefaultTableModel(datos,cabeceraCitas);
        Tabla.setModel(modelo);
    }
    
    public void tablaPacientes(){
        modelo=new DefaultTableModel(datos,cabeceraPacientes);
        Tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        AgendaPanel = new javax.swing.JPanel();
        lblNuevaConsulta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Fondo_Agenda = new javax.swing.JLabel();
        PacientePanel = new javax.swing.JPanel();
        lblModificarExpediente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Fondo_Pacientes = new javax.swing.JLabel();
        PerfilPanel = new javax.swing.JPanel();
        lblModificarPerfil = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Fondo_Pacientes1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAgregarPaciente = new javax.swing.JLabel();
        lblModificarUsuario = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Fondo_Pacientes2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtBusquedaAgenda = new javax.swing.JTextField();
        cmbPacientes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnIr = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        AgendaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevaConsulta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consulta_32.png"))); // NOI18N
        lblNuevaConsulta.setText("Nueva Consulta");
        lblNuevaConsulta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblNuevaConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNuevaConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblNuevaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevaConsultaMouseClicked(evt);
            }
        });
        AgendaPanel.add(lblNuevaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acciones");
        AgendaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        AgendaPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        Fondo_Agenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        AgendaPanel.add(Fondo_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Agenda", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario_64.png")), AgendaPanel); // NOI18N

        PacientePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModificarExpediente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModificarExpediente.setForeground(new java.awt.Color(255, 255, 255));
        lblModificarExpediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        lblModificarExpediente.setText("Modificar Expediente");
        lblModificarExpediente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificarExpediente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblModificarExpediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarExpedienteMouseClicked(evt);
            }
        });
        PacientePanel.add(lblModificarExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        lblModificarPerfil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModificarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblModificarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        lblModificarPerfil.setText("Modificar Perfil");
        lblModificarPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificarPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblModificarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarPerfilMouseClicked(evt);
            }
        });
        PerfilPanel.add(lblModificarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgregarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAgregarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevaCita_32.png"))); // NOI18N
        lblAgregarPaciente.setText("Agregar Usuario");
        lblAgregarPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAgregarPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarPacienteMouseClicked(evt);
            }
        });
        jPanel2.add(lblAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblModificarUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarPaciente_32.png"))); // NOI18N
        lblModificarUsuario.setText("Modificar Usuario");
        lblModificarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModificarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblModificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarUsuarioMouseClicked(evt);
            }
        });
        jPanel2.add(lblModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 80));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Acciones");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        Fondo_Pacientes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        Fondo_Pacientes2.setText("jLabel4");
        jPanel2.add(Fondo_Pacientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel.addTab("Usuarios", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/network.png")), jPanel2); // NOI18N

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 920, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 910, 310));
        getContentPane().add(txtBusquedaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 260, 24));

        cmbPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        getContentPane().add(cmbPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jLabel7.setText("REALIZAR BUSQUEDA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 230, -1));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda2_32.png"))); // NOI18N
        lblBuscar.setText("Buscar");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 90, -1));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnIr.setText("Ir a fecha");
        btnIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrActionPerformed(evt);
            }
        });
        getContentPane().add(btnIr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1400, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        tablaAgenda();
        obtenerFecha();
        panel.setSelectedIndex(0);
    }//GEN-LAST:event_btnIrActionPerformed

    private void lblNuevaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaConsultaMouseClicked
        new Consulta().setVisible(true);
    }//GEN-LAST:event_lblNuevaConsultaMouseClicked

    private void lblAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarPacienteMouseClicked
        new RegistroNuevo().setVisible(true);
    }//GEN-LAST:event_lblAgregarPacienteMouseClicked

    private void lblModificarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarPerfilMouseClicked
        new PerfilDoctor().setVisible(true);
        /*enviar el id del doctor para saber cual modificar o de cual
        recuperar datos*/
    }//GEN-LAST:event_lblModificarPerfilMouseClicked

    private void lblModificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarUsuarioMouseClicked
        new ModificarRecepcionista().setVisible(true);
    }//GEN-LAST:event_lblModificarUsuarioMouseClicked

    private void lblModificarExpedienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarExpedienteMouseClicked
        new Expediente().setVisible(true);
    }//GEN-LAST:event_lblModificarExpedienteMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendaPanel;
    private javax.swing.JLabel Fondo_Agenda;
    private javax.swing.JLabel Fondo_Pacientes;
    private javax.swing.JLabel Fondo_Pacientes1;
    private javax.swing.JLabel Fondo_Pacientes2;
    private javax.swing.JPanel PacientePanel;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnIr;
    private javax.swing.JComboBox<String> cmbPacientes;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblAgregarPaciente;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblModificarExpediente;
    private javax.swing.JLabel lblModificarPerfil;
    private javax.swing.JLabel lblModificarUsuario;
    private javax.swing.JLabel lblNuevaConsulta;
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
        TableModel tableModel = Tabla.getModel();
        tablaAgenda();
        try{
                 String query = "select hora, paciente, fecha, doctor from citas\n" +
                "WHERE fecha= '"+ fecha +"' and estado = 1 ORDER BY hora";
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
            for(int i=0;i<horaArr.length;i++){//i=filas
                Object datos[]={horaArr[i], pacienteArr[i], fechaActArr[i], doctArr[i]};
                modelo.addRow(datos);
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
