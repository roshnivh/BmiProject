/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author roshn
 */
public class Vetpercentage extends javax.swing.JFrame {

    /**
     * Creates new form Vetpercentage
     */
    public Vetpercentage() {
        initComponents();
    }
    public void details (double Leeftijd, double RoundOff) {
    
        dataBMI.setText("Dit was je BMI: "+ RoundOff);
        dataLeeftijd.setText("Dit was je leeftijd: " + Leeftijd);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vetButton = new javax.swing.JButton();
        infoR1 = new javax.swing.JLabel();
        VrouwButton = new javax.swing.JRadioButton();
        ManButton = new javax.swing.JRadioButton();
        ResetButton = new javax.swing.JButton();
        dataBMI = new javax.swing.JLabel();
        dataLeeftijd = new javax.swing.JLabel();
        BMIlabel2 = new javax.swing.JLabel();
        BMIfield = new javax.swing.JTextField();
        LeeftijdLabel2 = new javax.swing.JLabel();
        Leeftijdfield = new javax.swing.JTextField();
        InfoR2 = new javax.swing.JLabel();
        Vetpercentage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vetpercentage berekenen");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vetButton.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        vetButton.setText("Bereken jouw vetpercentage!");
        vetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, 59));

        infoR1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        infoR1.setText("Bereken je vetpercentage");
        getContentPane().add(infoR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 44, 460, -1));

        VrouwButton.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        VrouwButton.setText("Vrouw");
        VrouwButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VrouwButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VrouwButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        ManButton.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        ManButton.setText("Man");
        ManButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ManButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        ResetButton.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 605, 170, 60));

        dataBMI.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        dataBMI.setText("JLabel2");
        getContentPane().add(dataBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 142, 426, 40));

        dataLeeftijd.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        dataLeeftijd.setText("JLabel1");
        getContentPane().add(dataLeeftijd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 516, 60));

        BMIlabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        BMIlabel2.setText("BMI");
        getContentPane().add(BMIlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 137, 130, 50));

        BMIfield.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        BMIfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMIfieldActionPerformed(evt);
            }
        });
        getContentPane().add(BMIfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 138, 190, -1));

        LeeftijdLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        LeeftijdLabel2.setText("Leeftijd");
        getContentPane().add(LeeftijdLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 231, 170, 50));

        Leeftijdfield.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        getContentPane().add(Leeftijdfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 232, 190, -1));

        InfoR2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        InfoR2.setText("Vorige informatie:");
        getContentPane().add(InfoR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 44, -1, -1));

        Vetpercentage.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        Vetpercentage.setText("Hier komt de vetpercentage");
        getContentPane().add(Vetpercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 790, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sianie\\Downloads\\image-2016-10-27.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VrouwButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VrouwButtonActionPerformed
        // TODO add your handling code here:
        if (VrouwButton.isSelected())
            ManButton.setSelected(false);
    }//GEN-LAST:event_VrouwButtonActionPerformed

    private void ManButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManButtonActionPerformed
        // TODO add your handling code here:
        if (ManButton.isSelected())
            VrouwButton.setSelected(false);
    }//GEN-LAST:event_ManButtonActionPerformed

    private void vetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetButtonActionPerformed
        // TODO add your handling code here
        double BMI2 = (Double.parseDouble(BMIfield.getText()));
        int Leeftijd2 = (Integer.parseInt(Leeftijdfield.getText()));
        double LeeftijdEind = (0.23 * Leeftijd2) ;
        double BMIEind = (1.2 * BMI2);
        double TotaalLfBMI = (LeeftijdEind + BMIEind - 5.4);
        double GeslachtM = (TotaalLfBMI - 10.8);
          
       if (VrouwButton.isSelected())
       {
           Vetpercentage.setText("Je vetpercentage is: " + TotaalLfBMI);
       }
       else 
       {
           Vetpercentage.setText("Je vetpercentage is: " + GeslachtM);
       
       }
           
    }//GEN-LAST:event_vetButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        BodyMassIndex bf = new BodyMassIndex ();
        bf.setVisible(true);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void BMIfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMIfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMIfieldActionPerformed

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
            java.util.logging.Logger.getLogger(Vetpercentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vetpercentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vetpercentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vetpercentage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vetpercentage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BMIfield;
    private javax.swing.JLabel BMIlabel2;
    private javax.swing.JLabel InfoR2;
    private javax.swing.JLabel LeeftijdLabel2;
    private javax.swing.JTextField Leeftijdfield;
    private javax.swing.JRadioButton ManButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel Vetpercentage;
    private javax.swing.JRadioButton VrouwButton;
    public javax.swing.JLabel dataBMI;
    public static javax.swing.JLabel dataLeeftijd;
    private javax.swing.JLabel infoR1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JButton vetButton;
    // End of variables declaration//GEN-END:variables
}
