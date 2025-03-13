/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodapp;

import javax.swing.JOptionPane;

/**
 *
 * @author flips
 */
public class BloodGUI extends javax.swing.JFrame {
    private SInterface sBloodList;
    private QInterface qBloodList;
    private PQInterface pqBloodList;
    
    
    /**
     * Creates new form BloodGUI
     */
    public BloodGUI() {
        sBloodList = new Stack();
        qBloodList = new Queue();
        pqBloodList = new PriorityQueue();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priorityLbl = new javax.swing.JLabel();
        priorityTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        nextPatientBtn = new javax.swing.JTextField();
        priorityWarnBtn = new javax.swing.JToggleButton();
        noShowBtn1 = new javax.swing.JTextField();
        gpLbl1 = new javax.swing.JLabel();
        gpTf1 = new javax.swing.JTextField();
        submitBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl.setText("Blood Test");
        getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 6, 266, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        priorityLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priorityLbl.setText("Priority Level:");
        getContentPane().add(priorityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, -1));
        getContentPane().add(priorityTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));
        getContentPane().add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, 30));

        nextPatientBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPatientBtn.setText("Next Patient");
        nextPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 300, 40));

        priorityWarnBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priorityWarnBtn.setText("What is Priority Level?");
        priorityWarnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityWarnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(priorityWarnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 190, -1));

        noShowBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noShowBtn1.setText("Last 5 People who have not been shown");
        noShowBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(noShowBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 300, 40));

        gpLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gpLbl1.setText("GP Details:");
        getContentPane().add(gpLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));
        getContentPane().add(gpTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPatientBtnActionPerformed

    private void noShowBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noShowBtn1ActionPerformed

    private void priorityWarnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityWarnBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Low: (Type 1 in textfield) \n Medium: (Type 2 in textfield) \n Urgent: (Type 3 in textfield)");
        
        
        
        
    }//GEN-LAST:event_priorityWarnBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gpLbl1;
    private javax.swing.JTextField gpTf1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField nextPatientBtn;
    private javax.swing.JTextField noShowBtn1;
    private javax.swing.JLabel priorityLbl;
    private javax.swing.JTextField priorityTf;
    private javax.swing.JToggleButton priorityWarnBtn;
    private javax.swing.JToggleButton submitBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
