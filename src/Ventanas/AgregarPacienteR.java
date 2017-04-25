/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.conectar;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author dani_
 */
public class AgregarPacienteR extends javax.swing.JFrame {
//conexion
        conectar cc=new conectar();
        Connection cn=cc.conexion();
    /**
     * Creates new form AgregarPacienteR
     */
    public AgregarPacienteR() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Agregar Paciente");
        
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNExpediente = new javax.swing.JTextField();
        txtSNombre = new javax.swing.JTextField();
        txtPNombre = new javax.swing.JTextField();
        txtApeMat = new javax.swing.JTextField();
        txtApePat = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDomicilio = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTelDom = new javax.swing.JTextField();
        txtTelOfi = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtDerechohabiente = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtLugarNac1 = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        cmbMedico = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        lblPacientes = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombrePadre = new javax.swing.JTextField();
        txtNombreMadre = new javax.swing.JTextField();
        txtNombrePareja = new javax.swing.JTextField();
        txtProcedencia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEscolaridad = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Paciente");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Expediente No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 970, 10));

        jLabel2.setText("Nombre(s)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel4.setText("Domicilio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel5.setText("Ciudad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel7.setText("Codigo Postal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        txtNExpediente.setEditable(false);
        getContentPane().add(txtNExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        txtSNombre.setText(" ");
        getContentPane().add(txtSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, -1));

        txtPNombre.setText(" ");
        getContentPane().add(txtPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        txtApeMat.setText(" ");
        getContentPane().add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        txtApePat.setText(" ");
        getContentPane().add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        txtCiudad.setText(" ");
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, -1));

        txtCodigoPostal.setText(" ");
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 120, -1));

        txtEstado.setText(" ");
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 240, -1));

        txtDomicilio.setColumns(20);
        txtDomicilio.setRows(5);
        jScrollPane1.setViewportView(txtDomicilio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 68));

        jLabel8.setText("Teléfono Dom");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel9.setText("Telefono Oficina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel10.setText("Correo electronico");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel11.setText("Sexo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel12.setText("Derechohabiente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel13.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jLabel14.setText("Edad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jLabel15.setText("Medico");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));
        getContentPane().add(txtTelDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 159, -1));
        getContentPane().add(txtTelOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 159, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 160, -1));

        jLabel23.setText("Lugar de Nacimiento");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));
        getContentPane().add(txtDerechohabiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 158, -1));
        getContentPane().add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 158, -1));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 75, -1));
        getContentPane().add(txtLugarNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 158, -1));
        getContentPane().add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 158, -1));

        txtEstadoCivil.setText(" ");
        getContentPane().add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 240, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Hombre", "Mujer" }));
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 160, -1));

        jLabel24.setText("RFC");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 136, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 14, 300));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar_paciente.png"))); // NOI18N
        btnAgregar.setText("jButton1");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 240, 290));

        lblPacientes.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Paciente.png"))); // NOI18N
        lblPacientes.setText("Agregar Paciente");
        getContentPane().add(lblPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setText("Procedencia");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jLabel18.setText("Ocupacion");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel19.setText("Nombre de la Madre");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel20.setText("Nombre del Padre");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel21.setText("Nombre de Pareja");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        txtNombrePadre.setText(" ");
        getContentPane().add(txtNombrePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 240, -1));

        txtNombreMadre.setText(" ");
        getContentPane().add(txtNombreMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 240, -1));

        txtNombrePareja.setText(" ");
        getContentPane().add(txtNombrePareja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 240, -1));

        txtProcedencia.setText(" ");
        getContentPane().add(txtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 240, -1));

        jLabel25.setText("Estado Civil");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));
        getContentPane().add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 230, -1));

        jLabel26.setText("Escolaridad");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));
        getContentPane().add(txtEscolaridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 230, -1));

        jLabel27.setText("Observaciones");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 230, 80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_blanco.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 100, 1050, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       try{
            int NumExpediente= Integer.parseInt(txtNExpediente.getText());
            String primer_nom = txtPNombre.getText();
            String segundo_nom = txtSNombre.getText();
            String ape_pat = txtApePat.getText();
            String ape_mat = txtApeMat.getText();
            String domicilio = txtDomicilio.getText();
            String ciudad = txtCiudad.getText();
            String estado = txtEstado.getText();
            String Tel_Dom = txtTelDom.getText();
            String Tel_Ofi = txtTelOfi.getText();
            String correo = txtCorreo.getText();
            String sexo = cmbSexo.getSelectedItem().toString();
            String Lug_Nac = txtDerechohabiente.getText();
            String Fec_Nac = txtFechaNac.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String medico = cmbMedico.getSelectedItem().toString();
       
       if(validarCampos(primer_nom,ape_pat,domicilio, ciudad,estado,Tel_Dom,sexo,Lug_Nac,Fec_Nac,2,medico)==true){
           showMessageDialog(null, "se puede insertar");
       }else{
           showMessageDialog(null, "no se puede insertar");
       }
       }
       catch(java.lang.NumberFormatException ex){
           showMessageDialog(null, "Ingrese Edad ");
       }
              
    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean validarCampos(String nom,String apePat,String domicilio,
                String ciudad, String estado,String telDom,String sexo,
                String LugNac,String FechaNac,int edad, String medico){
    
        if(nom.equals("")){
            showMessageDialog(null, "Ingrese el nombre");
            return false;
        }
        if(apePat.equals("")){
            showMessageDialog(null, "Ingrese un apellido");
            return false;
        }
        if(domicilio.equals("")){
            showMessageDialog(null, "Ingrese un domicilio");
            return false;
        }
        if(ciudad.equals("")){
            showMessageDialog(null, "Ingrese un ciudad");
            return false;
        }
        if(estado.equals("")){
            showMessageDialog(null, "Ingrese un estado");
            return false;
        }
        if(telDom.equals("")){
            showMessageDialog(null, "Ingrese el telefono de domicilio");
            return false;
        }
        if(sexo.equals("")){
            showMessageDialog(null, "Ingrese el sexo");
            return false;
        }
        if(LugNac.equals("")){
            showMessageDialog(null, "Ingrese el Lugar de Naciemiento");
            return false;
        }
        if(FechaNac.equals("")){
            showMessageDialog(null, "Ingrese la Fecha de Nacimiento");
            return false;
        }
        if(edad<0){
            showMessageDialog(null, "Ingrese la edad");
            return false;
        }
        if(medico.equals("")){
            showMessageDialog(null, "Seleccione al medico");
            return false;
        }
        
        return true;
        
    }
    
    public void insertarP(int id_Exp,String nom,String seg_nom,String apePat,
                            String apeMat,String domicilio,String ciudad,
                            String estado,String telDom,String telOfi,
                            String correo,String sexo,String LugNac,
                            String FechaNac,int edad, String medico){
        String idPaciente = getRowNumber()+"";
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO paciente(id_paciente,"
                    + "nombre,segundo_nombre,apellido_paterno,"
                    + "apelledo_materno,domicilio,ciudad,estado,codigo_postal,tel_domicilio,"
                    + "tel_oficina,correo_electronico,sexo,"+
                    "derechohabiente,lugar_nacimiento,fecha_nacimiento,edad,rfc,"+
                    "estado_civil,nombre_madre,nombre_padre,nombre_pareja,procedencia,ocupacion,"+
                    "escolaridad,observaciones,id_doctor)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,idPaciente);
            pst.setString(2,id_Exp+"");
            pst.setString(3,nom);
            pst.setString(4,seg_nom);
            pst.setString(5, medico);
           
        } 
        
        catch(HeadlessException e){} catch (SQLException ex) {
                Logger.getLogger(AgregarPacienteR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public int getRowNumber(){
       int numberRow = 0;
            try{
                 String query = "select count(*) from PACIENTE ";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                   numberRow = rs.getInt("count(*)");
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
            return numberRow;
    }//getRowNumber  
    
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
            java.util.logging.Logger.getLogger(AgregarPacienteR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPacienteR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPacienteR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPacienteR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPacienteR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox cmbMedico;
    private javax.swing.JComboBox cmbSexo;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDerechohabiente;
    private javax.swing.JTextArea txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEscolaridad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLugarNac1;
    private javax.swing.JTextField txtNExpediente;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombrePareja;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPNombre;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSNombre;
    private javax.swing.JTextField txtTelDom;
    private javax.swing.JTextField txtTelOfi;
    // End of variables declaration//GEN-END:variables
}
