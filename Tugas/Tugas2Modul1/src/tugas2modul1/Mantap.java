/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2modul1;

/**
 *
 * @author Khoderisasi
 */
public class Mantap extends javax.swing.JFrame {

    int mantul ;
    
    /**
     * Creates new form Mantap
     */
    public Mantap() {
        initComponents();
        khod1.setVisible(false);
        alvin2.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colors2 = new Colors.Colors();
        colors1 = new Colors.Colors();
        colors21 = new Colors2.Colors2();
        colors31 = new Colors3.Colors3();
        jButton1 = new javax.swing.JButton();
        alvin1 = new javax.swing.JButton();
        khod1 = new javax.swing.JButton();
        alvin2 = new javax.swing.JButton();
        khod2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setText("TAP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                jButton1ActionPerformed1(evt);
                jButton1ActionPerformed2(evt);
                jButton1ActionPerformed3(evt);
                jButton1ActionPerformed4(evt);
                jButton1ActionPerformed5(evt);
                jButton1ActionPerformed6(evt);
            }
        });

        alvin1.setIcon(new javax.swing.ImageIcon("D:\\S.T\\Praktikum RSBK\\Modul1\\ss\\asu.jpg")); // NOI18N
        alvin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alvin1ActionPerformed(evt);
            }
        });

        khod1.setIcon(new javax.swing.ImageIcon("D:\\S.T\\Praktikum RSBK\\Modul1\\ss\\asuu.jpg")); // NOI18N
        khod1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        alvin2.setIcon(new javax.swing.ImageIcon("D:\\S.T\\Praktikum RSBK\\Modul1\\ss\\asu.jpg")); // NOI18N
        alvin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alvin2ActionPerformed(evt);
            }
        });

        khod2.setIcon(new javax.swing.ImageIcon("D:\\S.T\\Praktikum RSBK\\Modul1\\ss\\asuu.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colors31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(colors1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(colors21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(khod2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alvin2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(khod1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alvin1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alvin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khod1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colors31, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(colors21, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(colors1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alvin2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khod2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        colors31.change();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed1
        colors1.change();
    }//GEN-LAST:event_jButton1ActionPerformed1

    private void jButton1ActionPerformed2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed2
        colors21.change();
    }//GEN-LAST:event_jButton1ActionPerformed2

    private void alvin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alvin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alvin1ActionPerformed

    private void jButton1ActionPerformed3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed3
        
        if (mantul == 0){
            alvin1.setVisible(false);
            khod1.setVisible(true);
            khod2.setVisible(false);
            alvin2.setVisible(true);
            mantul = 1;
        }
        else {
            alvin1.setVisible(true);
            khod1.setVisible(false);
            khod2.setVisible(true);
            alvin2.setVisible(false);
            mantul = 0;
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed3

    private void alvin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alvin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alvin2ActionPerformed

    private void jButton1ActionPerformed4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed4
  
    }//GEN-LAST:event_jButton1ActionPerformed4

    private void jButton1ActionPerformed5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed5
     
    }//GEN-LAST:event_jButton1ActionPerformed5

    private void jButton1ActionPerformed6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed6
   
    }//GEN-LAST:event_jButton1ActionPerformed6

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
            java.util.logging.Logger.getLogger(Mantap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alvin1;
    private javax.swing.JButton alvin2;
    private Colors.Colors colors1;
    private Colors.Colors colors2;
    private Colors2.Colors2 colors21;
    private Colors3.Colors3 colors31;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton khod1;
    private javax.swing.JButton khod2;
    // End of variables declaration//GEN-END:variables
}
