/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mxrck.autocompleter.TextAutoCompleter;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;


public class CitasClase {
    /*Variables*/
    conectar cc=new conectar();
    Connection cn=cc.conexion();
    
    /*Metodos*/
    public void obtenerDoctor(JTextField txtDoctor){
    TextAutoCompleter AutoCompletado = new TextAutoCompleter(txtDoctor);
    String nombres="";
    
    try{
                 String query = "select nombre, segundo_nombre, apellido_paterno,apellido_materno from usuarios\n" +
                    "where tipo_usuario=\"DOCTOR\"";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombres += rs.getString("nombre")+" "+
                           rs.getString("segundo_nombre")+" "+
                            rs.getString("apellido_paterno")+" "+
                            rs.getString("apellido_materno")+" "+",";
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
    String arrNombres[]= nombres.split(",");
    for(int i=0;i<arrNombres.length;i++){
        AutoCompletado.addItem(arrNombres[i]);
    }
}//obtenerDoctor

    public void obtenerPacientes(JTextField txtPaciente) {
       TextAutoCompleter AutoCompletado = new TextAutoCompleter(txtPaciente);
    String nombres="";
    try{
                 String query = "select nombre, segundo_nombre, apellido_paterno,"
                         + "apellido_materno from paciente";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    nombres += rs.getString("nombre")+" "+
                           rs.getString("segundo_nombre")+" "+
                            rs.getString("apellido_paterno")+" "+
                            rs.getString("apellido_materno")+" "+",";
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        String arrNombres[]= nombres.split(",");
        for(int i=0;i<arrNombres.length;i++){
          AutoCompletado.addItem(arrNombres[i]);
        }
     }//obtenerPacientes
    
    public String obtenerFecha(JDateChooser dateC){
        String date = dateC.getDate()+"";
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
            return date;
    }//obtenerFecha
    
    public int obtenerIdMedico(String nombre){
        int id=0;
        String nombres[]= nombre.split(" ");
            try{
                 String query = "select id_doctor \n" +
                    "from doctor d\n" +
                    "	inner join usuarios u \n" +
                    "    on d.id_usuario=u.id_usuario\n" +
                    "where nombre = \""+nombres[0]+"\" and apellido_paterno=\""+nombres[2]+"\"";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id=Integer.parseInt( rs.getString("d.id_doctor"));
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return id;
    }//obtenerIdMedico
    
    public int obtenerIdPaciente(String nombre){
        int id=0;
        String nombres[]= nombre.split(" ");
            try{
                 String query = "select id_paciente from paciente where nombre ="
                         + " '"+nombres[0]+"' and apellido_paterno = '"+nombres[2]+"'";
                 PreparedStatement st = cn.prepareStatement(query);
                 ResultSet rs = st.executeQuery();
                 while(rs.next()){
                    id=Integer.parseInt( rs.getString("id_paciente"));
                    }
            }catch (SQLException ex){
                    System.out.println(ex.getMessage());
              }
        return id;
    }//obtenerIdPaciente
    
    public boolean insertarCita(String fecha, String hora, int id_paciente, 
            int id_doctor){
        boolean estado=true;
        String id_citas=getRowNumber("citas")+1+"";
            try{
               PreparedStatement pst=cn.prepareStatement("INSERT INTO citas"
        + "(id_citas, fecha, hora, estado, id_paciente, id_doctor) VALUES(?,?,?,?,?,?)"); 
               pst.setString(1,id_citas);
               pst.setString(2,fecha);
               pst.setString(3,hora);
               pst.setString(4,"1");
               pst.setString(5,id_paciente+"");
               pst.setString(6,id_doctor+"");
               int a=pst.executeUpdate();
         if(a>0){
               showMessageDialog(null,"Cita registrada");
           }
           else{
                showMessageDialog(null,"Error al agregar");
                estado = false;
           }
           }catch(HeadlessException | SQLException e){
           }  
        return estado;
    }//insertarCita
    
         public int getRowNumber(String tabla){
       int numberRow = 0;
            try{
                 String query = "select count(*) from "+tabla;
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
}//clase
