/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    boolean ptt;

    public login(boolean pat) {
        ptt = pat;
        this.toFront();
        this.requestFocus();
        initComponents();
        if (pat) {
            jLabel2.setText("Patient login");
            
        } else {
            jLabel2.setText("Doctor login");

        }
        addholder(ID1);
        addholder(pass);
    }

    public void addholder(JTextField txt) {
        Font font = txt.getFont();
        font = font.deriveFont(Font.ITALIC);
        txt.setFont(font);
        txt.setForeground(Color.BLACK);
    }

    public void removeholder(JTextField txt) {
        Font font = txt.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        txt.setFont(font);
        txt.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JTextField();
        ID1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBackground(new java.awt.Color(29, 164, 196));
        pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("Password");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 170, 30));

        ID1.setBackground(new java.awt.Color(29, 164, 196));
        ID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ID1.setForeground(new java.awt.Color(255, 255, 255));
        ID1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID1.setText("ID");
        ID1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ID1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ID1FocusLost(evt);
            }
        });
        getContentPane().add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 170, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 164, 196));
        jLabel2.setText("Patient Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 370, 90));

        jButton1.setBackground(new java.awt.Color(29, 164, 196));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 40));

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/logim.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if (pass.getText().equals("Password")) {
            pass.setText(null);
            pass.requestFocus();
            removeholder(pass);
        }

    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        if (pass.getText().length() == 0) {
            addholder(pass);
            pass.setText("Password");
        }

    }//GEN-LAST:event_passFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void ID1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ID1FocusGained
        if (ID1.getText().equals("ID")) {
            ID1.setText(null);
            ID1.requestFocus();
            removeholder(ID1);
        }
    }//GEN-LAST:event_ID1FocusGained

    private void ID1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ID1FocusLost
        if (ID1.getText().length() == 0) {
            addholder(ID1);
            ID1.setText("ID");
        }
    }//GEN-LAST:event_ID1FocusLost

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        jLabel1.requestFocus();
    }//GEN-LAST:event_jLabel1FocusGained

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String line;
        BufferedReader br = null;

        if (ptt) {
            try {
                br = new BufferedReader(new FileReader("patients.csv"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                br = new BufferedReader(new FileReader("doctors.csv"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {

            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                if (ID1.getText().equals(values[0]) && pass.getText().equals(values[2])) {
                    this.setVisible(false);
                    if (ptt) {
                        new pat_logged(ID1.getText()).setVisible(true);
                    } else {
                        new doctor_logged(values[1]).setVisible(true);
                    }
                }
            }
            ID1.setBorder(new LineBorder(Color.red));
            pass.setBorder(new LineBorder(Color.red));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables
}
