/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Coll Alejandro
 * @author Castro Javier
 * 
 */
public class grafprueba extends javax.swing.JFrame {


    public grafprueba() {
        initComponents();
        JPAgregar.setVisible(false);
        JPBuscar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        JPBuscar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JLTitout1 = new javax.swing.JLabel();
        JLAutout1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JLPclaves1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jCBSelr = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        JPAgregar = new javax.swing.JPanel();
        jTextarchivo = new javax.swing.JTextField();
        JBSeleccionar = new javax.swing.JButton();
        JBSeleccionar1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Titulo de la Investigacion");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Autores");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Palabras Claves");

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPBuscarLayout = new javax.swing.GroupLayout(JPBuscar);
        JPBuscar.setLayout(JPBuscarLayout);
        JPBuscarLayout.setHorizontalGroup(
            JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBuscarLayout.createSequentialGroup()
                        .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBuscarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPBuscarLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLPclaves1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPBuscarLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLAutout1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPBuscarLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLTitout1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(132, 132, 132)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBuscarLayout.createSequentialGroup()
                        .addComponent(jCBSelr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        JPBuscarLayout.setVerticalGroup(
            JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBuscarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JLTitout1))
                .addGap(18, 18, 18)
                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JLAutout1))
                .addGap(18, 18, 18)
                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(JLPclaves1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(JPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jCBSelr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        JPAgregar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                JPAgregarComponentHidden(evt);
            }
        });

        JBSeleccionar.setText("Seleccionar");
        JBSeleccionar.setToolTipText("");
        JBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSeleccionarActionPerformed(evt);
            }
        });

        JBSeleccionar1.setBackground(new java.awt.Color(255, 51, 51));
        JBSeleccionar1.setForeground(new java.awt.Color(255, 255, 255));
        JBSeleccionar1.setText("Salir");
        JBSeleccionar1.setToolTipText("");
        JBSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSeleccionar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPAgregarLayout = new javax.swing.GroupLayout(JPAgregar);
        JPAgregar.setLayout(JPAgregarLayout);
        JPAgregarLayout.setHorizontalGroup(
            JPAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(JPAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        JPAgregarLayout.setVerticalGroup(
            JPAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAgregarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(JPAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSeleccionar))
                .addGap(18, 18, 18)
                .addComponent(JBSeleccionar1)
                .addContainerGap(558, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(JPBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(JPBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jMenu3.setText("RESUMEN DE INVESTIGACIONES");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Buscar");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Agregar");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Salir");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        JPAgregar.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void JBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSeleccionarActionPerformed
        JFileChooser fsel = new JFileChooser();
        
        fsel.setApproveButtonText("Ok");

        fsel.setApproveButtonMnemonic('a');

        
        fsel.setApproveButtonToolTipText("New Approve Tool Tip");
        int result = fsel.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
 
            File f=fsel.getSelectedFile();
            String filename=f.getAbsolutePath();
            jTextarchivo.setText(filename);

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String texto="",titulo="",autores="",palabras="";
                String linea;
                int lineac = 0;
                while(((linea=br.readLine())) !=null){
                    String[] linea_split = linea.split("\\|");
                    titulo=linea_split[0];
                    palabras=linea_split[1];
                    autores=linea_split[2];
                    texto=linea_split[3];
                    tableh.put(titulo, titulo+"|"+palabras+"|"+autores+"|"+texto);
                    lineac ++;
                }

                System.out.println("MUESTRA HASHTABLE");
                for (String key : tableh.keySet()){
                    System.out.println(key.hashCode() % 21 + "\t"  + key + "\t" + tableh.get(key));
                }

                try {
                    File file = new File("hashtable.txt");
                    FileWriter fileReader = new FileWriter(file); // A stream that connects to the text file , true
                    BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter

                    for (String key : tableh.keySet()){
                        bufferedWriter.write(tableh.get(key)+ "\n");
                    }

                    bufferedWriter.close (); // Close the stream
                } catch (Exception e) {
                    e.printStackTrace();
                }            
                }catch(Exception e){
                } // fin bloque
            
                JOptionPane.showMessageDialog(null, "Se Agregaron Resumenes");
                JPAgregar.setVisible(false);
                jTextarchivo.setText("");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JPAgregar.setVisible(false);
            System.out.println("Cancel was selected");
        }        
    }//GEN-LAST:event_JBSeleccionarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selec = (String) jCBSelr.getSelectedItem();
        
        String[] value_split = tableh.get(selec).split("\\|");
        JLTitout1.setText(value_split[0]);
        JLAutout1.setText(value_split[1]);
        JLPclaves1.setText(value_split[2]);
        jTextArea2.setText(value_split[3]);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        JPBuscar.setVisible(true);
        jCBSelr.removeAllItems();
        for (String key : tableh.keySet()){
            String[] value_split = tableh.get(key).split("\\|");
            jCBSelr.addItem(value_split[0]);
            System.out.println(key.hashCode() % 21 + "\t"  + key + "\t" + tableh.get(key));
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void JPAgregarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_JPAgregarComponentHidden

    }//GEN-LAST:event_JPAgregarComponentHidden

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JPBuscar.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JBSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSeleccionar1ActionPerformed
        JPAgregar.setVisible(false);
    }//GEN-LAST:event_JBSeleccionar1ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafprueba().setVisible(true);
            }
        });
        
        //  LEER RESUMEN PREEXISTENTES //
            String f = "hashtable.txt";
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String texto="",titulo="",autores="",palabras="";
            String linea;
            int lineac = 0;
            
            while(((linea=br.readLine())) !=null){
                //System.out.print("LECTURA ");System.out.println(lineac);
                //System.out.println(linea);
                String[] value_split = linea.split("\\|");
                //System.out.println(value_split[0]);
                //System.out.println(value_split[1]);
                //System.out.println(value_split[2]);
                //System.out.print(value_split[3]);
                titulo=value_split[0];
                palabras=value_split[1];
                autores=value_split[2];
                texto=value_split[3];
                tableh.put(titulo, titulo+"|"+palabras+"|"+autores+"|"+texto);
                lineac ++;
            }
            System.out.println("PRECARGADOS");
            System.out.println(tableh.get("TIRAR PIEDRAS AL RIO"));
            System.out.println(tableh.get("TIRAR COHETES A LA LUNA"));
            
    }

    
    
    private static Hashtable<String, String> tableh = new Hashtable<>(21);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSeleccionar;
    private javax.swing.JButton JBSeleccionar1;
    private javax.swing.JLabel JLAutout1;
    private javax.swing.JLabel JLPclaves1;
    private javax.swing.JLabel JLTitout1;
    private javax.swing.JPanel JPAgregar;
    private javax.swing.JPanel JPBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBSelr;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextarchivo;
    // End of variables declaration//GEN-END:variables
}
