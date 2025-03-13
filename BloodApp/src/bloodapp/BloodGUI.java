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

        wardWarn = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priorityLbl = new javax.swing.JLabel();
        priorityTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        priorityWarnBtn = new javax.swing.JToggleButton();
        gpLbl1 = new javax.swing.JLabel();
        gpTf = new javax.swing.JTextField();
        submitBtn = new javax.swing.JToggleButton();
        nextPatientBtn = new javax.swing.JToggleButton();
        noShowBtn = new javax.swing.JToggleButton();
        ageLbl = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        wardWarnLbl = new javax.swing.JLabel();
        wardYesRb = new javax.swing.JRadioButton();
        wardNoRb = new javax.swing.JRadioButton();

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
        getContentPane().add(priorityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));
        getContentPane().add(priorityTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 30));
        getContentPane().add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, 30));

        priorityWarnBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priorityWarnBtn.setText("What is Priority Level?");
        priorityWarnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityWarnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(priorityWarnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 190, -1));

        gpLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gpLbl1.setText("GP Details:");
        getContentPane().add(gpLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, -1));
        getContentPane().add(gpTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, 30));

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        nextPatientBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextPatientBtn.setText("Next Patient");
        nextPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 150, -1));

        noShowBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noShowBtn.setText("Last 5 People Who Have Not Shown");
        noShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(noShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 290, -1));

        ageLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ageLbl.setText("Age:");
        getContentPane().add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(ageTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));

        wardWarnLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wardWarnLbl.setText("Are you currently coming from a hospital ward?");
        getContentPane().add(wardWarnLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        wardWarn.add(wardYesRb);
        wardYesRb.setText("Yes");
        getContentPane().add(wardYesRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        wardWarn.add(wardNoRb);
        wardNoRb.setText("No");
        getContentPane().add(wardNoRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priorityWarnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityWarnBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Low: (Type 1 in textfield) \n Medium: (Type 2 in textfield) \n Urgent: (Type 3 in textfield)");
        
        
        
        
    }//GEN-LAST:event_priorityWarnBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        int priority;
        String ward;
        Blood b = new Blood();
        b.setName(nameTf.getText());
        b.setGpDetails(gpTf.getText());
        b.setAge(Integer.parseInt(ageTf.getText()));
        if(wardYesRb.isSelected()){
            b.setWard("Status: Currently coming from ward");
            ward = "Status: Currently coming from ward";
        }
        else if (wardNoRb.isSelected()){
            b.setWard("Status: Not currently coming from ward");
            ward = "Status: Not currently coming from ward";
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Please state if you are coming from the hospital ward via the radio buttons");
            return;
        }
        priority = Integer.parseInt(priorityTf.getText());
        if(!priorityTf.getText().equals("1") && !priorityTf.getText().equals("2") && !priorityTf.getText().equals("3")){
            JOptionPane.showMessageDialog(null, "Invalid Priority, please try again");
            JOptionPane.showMessageDialog(null, priorityTf.getText());
            return;
        }
        
        pqBloodList.enqueue(priority, b);
        qBloodList.enqueue(b);
        sBloodList.push(b);
        if(priorityTf.getText().equals("1")){
            JOptionPane.showMessageDialog(null, "Patient with a low priority has been added: \n"+"Name: "+nameTf.getText()+ "\n GP Details: "+gpTf.getText()+"\n Priority: "+priority+"\n Age: "+ageTf.getText()+"\n "+ward);
        }
        else if(priorityTf.getText().equals("2")){
            JOptionPane.showMessageDialog(null, "Patient with a medium priority has been added: \n"+"Name: "+nameTf.getText()+ "\n GP Details: "+gpTf.getText()+"\n Priority: "+priority+"\n Age: "+ageTf.getText()+"\n "+ward);
        }
        else if(priorityTf.getText().equals("3")){
            JOptionPane.showMessageDialog(null, "Patient with an URGENT!! priority has been added: \n"+"Name: "+nameTf.getText()+ "\n GP Details: "+gpTf.getText()+"\n Priority: "+priority+"\n Age: "+ageTf.getText()+"\n "+ward);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void nextPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBtnActionPerformed
        // TODO add your handling code here:
        
        if(pqBloodList.isEmpty()){
            JOptionPane.showMessageDialog(null, "There are no more patients");
        }
        //Makes an instance of the PQ arraylist and the Blood variables
        //Uses the setters and getters from the respective classes and displays them
        else{
            PQElement pqElement = (PQElement) pqBloodList.dequeue();
            Blood bloodPatient = (Blood)pqElement.getPatient();
            Blood sBlood = (Blood) sBloodList.reversePop(); //removes from the stack 
            
            
            JOptionPane.showMessageDialog(null, "Next Patient: "+bloodPatient.getName()+" \n Priority: "+pqElement.getPriority()+"\n Age: "+bloodPatient.getAge()+"\n "+bloodPatient.getWard());
        }
        
    }//GEN-LAST:event_nextPatientBtnActionPerformed

    private void noShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBtnActionPerformed
        // TODO add your handling code here:
        
           JOptionPane.showMessageDialog(null, sBloodList.displayStack());
        
    }//GEN-LAST:event_noShowBtnActionPerformed

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
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTf;
    private javax.swing.JLabel gpLbl1;
    private javax.swing.JTextField gpTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTf;
    private javax.swing.JToggleButton nextPatientBtn;
    private javax.swing.JToggleButton noShowBtn;
    private javax.swing.JLabel priorityLbl;
    private javax.swing.JTextField priorityTf;
    private javax.swing.JToggleButton priorityWarnBtn;
    private javax.swing.JToggleButton submitBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JRadioButton wardNoRb;
    private javax.swing.ButtonGroup wardWarn;
    private javax.swing.JLabel wardWarnLbl;
    private javax.swing.JRadioButton wardYesRb;
    // End of variables declaration//GEN-END:variables
}
