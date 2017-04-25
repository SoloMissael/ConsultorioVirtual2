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
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("CONSULTA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtAreaMotivoConsulta = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAparatos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAreaSintomas = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtNoConsulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        spnPresionArterial2 = new javax.swing.JSpinner();
        spnOximetria = new javax.swing.JSpinner();
        spnFeccCardiaca = new javax.swing.JSpinner();
        spnTemperatura = new javax.swing.JSpinner();
        spnPresionArterial = new javax.swing.JSpinner();
        spnFreccRespiratoria = new javax.swing.JSpinner();
        spnTalla = new javax.swing.JSpinner();
        spnPeso = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaExploracion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMedicamento = new javax.swing.JTextArea();
        txtAreaTratamiento = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        txtAreaDiagnostico = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        txtAreaEstudios = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Receta_32.png"))); // NOI18N
        jLabel31.setText("Receta Medica");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_32.png"))); // NOI18N
        jLabel30.setText("Guardar Consulta");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir_32.png"))); // NOI18N
        jLabel32.setText("Imprimir Resumen");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu Azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtAreaMotivoConsulta.setViewportView(jTextArea1);

        jPanel1.add(txtAreaMotivoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 440, 120));

        txtAreaAparatos.setColumns(20);
        txtAreaAparatos.setRows(5);
        jScrollPane1.setViewportView(txtAreaAparatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 410, 370));

        jLabel5.setText("Síntomas:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setText("Motivo de la Consulta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APARATOS Y SISTEMAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 450, 410));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PADECIMIENTO ACTUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 410));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        txtAreaSintomas.setViewportView(jTextArea2);

        jPanel1.add(txtAreaSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 440, 200));

        jLabel6.setText("Consulta No.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));
        jPanel1.add(txtNoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, -1));

        jLabel7.setText("Fecha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 20));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

        jLabel8.setText("Hora");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 100, -1));

        jTabbedPane1.addTab("Interrogatorio", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(spnPresionArterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 50, -1));
        jPanel2.add(spnOximetria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, -1));
        jPanel2.add(spnFeccCardiaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 90, -1));
        jPanel2.add(spnTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, -1));
        jPanel2.add(spnPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, -1));
        jPanel2.add(spnFreccRespiratoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, -1));
        jPanel2.add(spnTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, -1));
        jPanel2.add(spnPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 90, -1));

        jLabel20.setText("%");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 20));

        jLabel19.setText("/");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 20));

        jLabel18.setText("Kg");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 20));

        jLabel16.setText("Oximetria");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 20));

        txtAreaExploracion.setColumns(20);
        txtAreaExploracion.setRows(5);
        jScrollPane2.setViewportView(txtAreaExploracion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 410, 410));

        jLabel15.setText("Temperatura");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        jLabel14.setText("Presion Arterial");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));

        jLabel13.setText("Frecc. Respiratoria");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel12.setText("Talla");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 20));

        jLabel11.setText("Peso");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 20));

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXPLORACION FISICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 450, 450));

        jLabel17.setText("Frecuencia Cardiaca");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 450));

        jLabel21.setText("Cm");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 20));

        jLabel22.setText("x Minuto");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 20));

        jLabel23.setText("C");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 20));

        jLabel24.setText("x Minuto");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 20));

        jTabbedPane1.addTab("Exploracion", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRATAMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 410, 150));

        txtAreaMedicamento.setColumns(20);
        txtAreaMedicamento.setRows(5);
        jScrollPane3.setViewportView(txtAreaMedicamento);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 500, 360));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        txtAreaTratamiento.setViewportView(jTextArea5);

        jPanel3.add(txtAreaTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 370, 110));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        txtAreaDiagnostico.setViewportView(jTextArea4);

        jPanel3.add(txtAreaDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 370, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        txtAreaEstudios.setViewportView(jTextArea3);

        jPanel3.add(txtAreaEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 370, -1));

        jLabel29.setText("Medicamento / Vademecum");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda_32.png"))); // NOI18N
        jButton1.setText("Buscar Medicamento");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TERAPEUTICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 540, 450));

        jLabel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIAGNOSTICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 410, 140));

        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTUDIOS DE LABORATORIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 140));

        jTabbedPane1.addTab("Evaluacion", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JSpinner spnFeccCardiaca;
    private javax.swing.JSpinner spnFreccRespiratoria;
    private javax.swing.JSpinner spnOximetria;
    private javax.swing.JSpinner spnPeso;
    private javax.swing.JSpinner spnPresionArterial;
    private javax.swing.JSpinner spnPresionArterial2;
    private javax.swing.JSpinner spnTalla;
    private javax.swing.JSpinner spnTemperatura;
    private javax.swing.JTextArea txtAreaAparatos;
    private javax.swing.JScrollPane txtAreaDiagnostico;
    private javax.swing.JScrollPane txtAreaEstudios;
    private javax.swing.JTextArea txtAreaExploracion;
    private javax.swing.JTextArea txtAreaMedicamento;
    private javax.swing.JScrollPane txtAreaMotivoConsulta;
    private javax.swing.JScrollPane txtAreaSintomas;
    private javax.swing.JScrollPane txtAreaTratamiento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNoConsulta;
    // End of variables declaration//GEN-END:variables
}
