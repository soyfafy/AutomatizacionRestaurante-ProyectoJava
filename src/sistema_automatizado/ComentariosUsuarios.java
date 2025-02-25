/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */

package sistema_automatizado;

import java.io.File;
import javax.swing.JOptionPane;
import java.util.Formatter;

public class ComentariosUsuarios extends javax.swing.JFrame {
    
    String barra = File.separator;
    String CrearUbicacion = System.getProperty("user.dir")+barra+"Comentarios"+barra;
    
    
    public ComentariosUsuarios() {
        initComponents();
    }

    private void crear(){
        String archivo = TNombre.getText()+".txt";
        File CrearUbi = new File(CrearUbicacion);
        File CrearArchi = new File(CrearUbicacion+archivo);
        
        if(TNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "No existe este nombre");
            }else{
                try{
                    if(CrearArchi.exists()){
                    JOptionPane.showMessageDialog(rootPane, "El nombre se encuentra registrado, prueba con otro para evitar SPAM");  
                    }else{
                        CrearUbi.mkdirs();
                        Formatter CrearForma = new Formatter(CrearUbicacion+archivo);
                        CrearForma.format("%s\r\n%s\r\n%s\r\n","Nombre: "+TNombre.getText(),"Correo: " +TCorreo.getText(), "Comentario: " +TComentario.getText());
                        
                        CrearForma.close();
                        JOptionPane.showMessageDialog(rootPane, "Su comentario fue enviado con exito.");
                        System.exit(0);
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Su comentario no se pudo enviar por un ERROR, intente de nuevo."); 
                }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TComentario = new javax.swing.JTextField();
        BotonEnviar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gracias por visitarnos");
        jLabel1.setToolTipText("");

        jLabel2.setText("Sus comentarios seran de gran ayuda para crecer, por favor si lo desea comente ");

        jLabel3.setText("que le parecio nuestro sistema Automatizado de ventas de nuestro restaurante.");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        TNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Correo:");

        TCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCorreoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Su comentario:");

        TComentario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TComentario.setToolTipText("");
        TComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TComentarioActionPerformed(evt);
            }
        });

        BotonEnviar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonEnviar.setText("ENVIAR");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(BotonEnviar)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TComentario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotonEnviar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreActionPerformed

    private void TCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCorreoActionPerformed

    private void TComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TComentarioActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
    crear();
    TNombre.setText("");
    TCorreo.setText("");
    TComentario.setText("");
    }//GEN-LAST:event_BotonEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComentariosUsuarios().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JTextField TComentario;
    private javax.swing.JTextField TCorreo;
    private javax.swing.JTextField TNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
