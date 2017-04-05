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
        txtLugarNac = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox();
        cmbMedico = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        lblPacientes = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Paciente");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Expedinte No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 177, -1, -1));

        jLabel2.setText("Nombre(s)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 220, -1, -1));

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 261, -1, -1));

        jLabel4.setText("Domicilio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 298, -1, -1));

        jLabel5.setText("Ciudad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 387, -1, -1));

        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 434, -1, -1));

        jLabel7.setText("Codigo Postal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 481, -1, -1));

        txtNExpediente.setEditable(false);
        txtNExpediente.setText("1");
        getContentPane().add(txtNExpediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 174, 79, -1));

        txtSNombre.setText(" ");
        getContentPane().add(txtSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 217, 97, -1));

        txtPNombre.setText(" ");
        getContentPane().add(txtPNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 217, 105, -1));

        txtApeMat.setText(" ");
        getContentPane().add(txtApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 258, 97, -1));

        txtApePat.setText(" ");
        getContentPane().add(txtApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 258, 105, -1));

        txtCiudad.setText(" ");
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 384, 105, -1));

        txtCodigoPostal.setText(" ");
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 478, 105, -1));

        txtEstado.setText(" ");
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 431, 105, -1));

        txtDomicilio.setColumns(20);
        txtDomicilio.setRows(5);
        jScrollPane1.setViewportView(txtDomicilio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 298, 219, 68));

        jLabel8.setText("Telefono Dom");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 177, -1, -1));

        jLabel9.setText("Telefono Oficina");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 220, -1, -1));

        jLabel10.setText("Correo electronico");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 261, -1, -1));

        jLabel11.setText("Sexo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 301, -1, -1));

        jLabel12.setText("Lugar de Nacimiento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 345, -1, -1));

        jLabel13.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 384, -1, -1));

        jLabel14.setText("Edad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 434, -1, -1));

        jLabel15.setText("Medico");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 481, -1, -1));
        getContentPane().add(txtTelDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 174, 159, -1));
        getContentPane().add(txtTelOfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 217, 159, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 258, 203, -1));
        getContentPane().add(txtLugarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 342, 158, -1));
        getContentPane().add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 393, 158, -1));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 431, 75, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opcion", "Hombre", "Mujer" }));
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 298, -1, -1));

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 478, 136, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 156, 14, 364));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar_paciente.png"))); // NOI18N
        btnAgregar.setText("jButton1");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 205, 233, 282));

        lblPacientes.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblPacientes.setText("AGREGAR PACIENTE");
        getContentPane().add(lblPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        lblBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barra.png"))); // NOI18N
        lblBarra.setText("jLabel16");
        getContentPane().add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1090, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_blanco.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1090, 410));

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
            String Lug_Nac = txtLugarNac.getText();
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
            PreparedStatement pst = cn.prepareStatement("INSERT INTO PACIENTE(id_paciente,"
                    + "id_expediente,nombre_paciente,segnombre_paciente,apepat_paciente,"
                    + "apemat_paciente,domicilio,ciudad,estado,codigo_postal,telefono_domicilio,"
                    + "telefono_oficina,correo_electronico,sexo,Lugar_Nac,Fecha_Nac,Edad,Medico)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,idPaciente);
            pst.setString(2,id_Exp+"");
            pst.setString(3,nom);
            pst.setString(4,seg_nom);
           
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblPacientes;
    private javax.swing.JTextField txtApeMat;
    private javax.swing.JTextField txtApePat;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtNExpediente;
    private javax.swing.JTextField txtPNombre;
    private javax.swing.JTextField txtSNombre;
    private javax.swing.JTextField txtTelDom;
    private javax.swing.JTextField txtTelOfi;
    // End of variables declaration//GEN-END:variables
}