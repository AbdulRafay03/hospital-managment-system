/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class add_doc extends javax.swing.JFrame {

    /**
     * Creates new form add_doc
     */
    public add_doc() {
        initComponents();
        addholder(dname);
        addholder(pass);
        addholder(sp);
        addholder(eoy);
        addholder(ph_no);
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

        sex = new javax.swing.ButtonGroup();
        sp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        eoy = new javax.swing.JTextField();
        addbut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ph_no = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male1 = new javax.swing.JRadioButton();
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

        sp.setBackground(new java.awt.Color(29, 164, 196));
        sp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sp.setForeground(new java.awt.Color(255, 255, 255));
        sp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sp.setText("Specialization");
        sp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                spFocusLost(evt);
            }
        });
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor's Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 60));

        dname.setBackground(new java.awt.Color(29, 164, 196));
        dname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dname.setForeground(new java.awt.Color(255, 255, 255));
        dname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dname.setText("Doctor Name");
        dname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dnameFocusLost(evt);
            }
        });
        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });
        dname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dnameKeyPressed(evt);
            }
        });
        getContentPane().add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, 40));

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
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, 40));

        eoy.setBackground(new java.awt.Color(29, 164, 196));
        eoy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eoy.setForeground(new java.awt.Color(255, 255, 255));
        eoy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eoy.setText("Experience(Years)");
        eoy.setToolTipText("");
        eoy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eoyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eoyFocusLost(evt);
            }
        });
        eoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eoyActionPerformed(evt);
            }
        });
        eoy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eoyKeyPressed(evt);
            }
        });
        getContentPane().add(eoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 220, 40));

        addbut.setBackground(new java.awt.Color(29, 164, 196));
        addbut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbut.setForeground(new java.awt.Color(255, 255, 255));
        addbut.setText("Add ");
        addbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbutMouseClicked(evt);
            }
        });
        getContentPane().add(addbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 140, 40));

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 40));

        ph_no.setBackground(new java.awt.Color(29, 164, 196));
        ph_no.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ph_no.setForeground(new java.awt.Color(255, 255, 255));
        ph_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ph_no.setText("Phone number");
        ph_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ph_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ph_noFocusLost(evt);
            }
        });
        ph_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ph_noActionPerformed(evt);
            }
        });
        ph_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ph_noKeyPressed(evt);
            }
        });
        getContentPane().add(ph_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 220, 40));

        female.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.setOpaque(true);
        female.setActionCommand("Famale");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 100, -1));

        male1.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(male1);
        male1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        male1.setForeground(new java.awt.Color(255, 255, 255));
        male1.setText("Male");
        male1.setOpaque(true);
        male1.setActionCommand("Male");
        getContentPane().add(male1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 80, -1));

        jLabel1.setForeground(new java.awt.Color(29, 164, 196));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.setMaximumSize(new java.awt.Dimension(1100, 520));
        jLabel1.setMinimumSize(new java.awt.Dimension(1100, 520));
        jLabel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void eoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eoyActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void dnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnameFocusGained
        if (dname.getText().equals("Doctor Name")) {
            dname.setText(null);
            dname.requestFocus();
            removeholder(dname);
        }
    }//GEN-LAST:event_dnameFocusGained

    private void dnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnameFocusLost
        if (dname.getText().length() == 0) {
            addholder(dname);
            dname.setText("Doctor Name");
        }
    }//GEN-LAST:event_dnameFocusLost

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

    private void spFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spFocusGained
        if (sp.getText().equals("Specialization")) {
            sp.setText(null);
            sp.requestFocus();
            removeholder(sp);
        }
    }//GEN-LAST:event_spFocusGained

    private void spFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spFocusLost
        if (sp.getText().length() == 0) {
            addholder(sp);
            sp.setText("Specialization");
        }

    }//GEN-LAST:event_spFocusLost

    private void eoyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eoyFocusGained
        if (eoy.getText().equals("Experience(Years)")) {
            eoy.setText(null);
            eoy.requestFocus();
            removeholder(eoy);
        }
    }//GEN-LAST:event_eoyFocusGained

    private void eoyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eoyFocusLost
        if (eoy.getText().length() == 0) {
            addholder(eoy);
            eoy.setText("Experience(Years)");
        }
    }//GEN-LAST:event_eoyFocusLost

    private void addbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutMouseClicked
        int id = 0;

        if (ok()) {
            
            try {
                File myObj = new File("doctors.csv");
                id = 0000;
                if (myObj.createNewFile()) {
                    System.out.println("Doc File created: " + myObj.getName());
                } else {
                    System.out.println("doctors file already exist");
                }
                File f = new File("doctors.csv");

                String line;
                BufferedReader br = new BufferedReader(new FileReader("doctors.csv"));
                while ((line = br.readLine()) != null) {
                    String values[] = line.split(",");
                    id = Integer.parseInt(values[0]) + 1;
                }

                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(id + "," + dname.getText() + "," + pass.getText() + "," + sp.getText() + "," + eoy.getText() + ","
                        + ph_no.getText() + "," + sex.getSelection().getActionCommand());

                pw.flush();
                pw.close();
                bw.close();
                fw.close();
                br.close();
                System.out.println("doctor saved");

                
            } catch (IOException e) {
                System.out.println("error in saving patient.");
                e.printStackTrace();
            }
            
             try {
               
                File f = new File("slots.csv");
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(dname.getText());

                pw.flush();
                pw.close();
                bw.close();
                fw.close();
                System.out.println("doctor saved");

                this.setVisible(false);
                new saved(null, true, false, id).show();

            } catch (IOException e) {
                System.out.println("error in saving slots.");
                e.printStackTrace();
            }
            
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_addbutMouseClicked

    private void ph_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ph_noFocusGained
        if (ph_no.getText().equals("Phone number")) {
            ph_no.setText(null);
            ph_no.requestFocus();
            removeholder(ph_no);
        }
    }//GEN-LAST:event_ph_noFocusGained

    private void ph_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ph_noFocusLost
        if (ph_no.getText().length() == 0) {
            addholder(ph_no);
            ph_no.setText("Phone number");
        }
    }//GEN-LAST:event_ph_noFocusLost

    private void ph_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ph_noActionPerformed

    }//GEN-LAST:event_ph_noActionPerformed

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        jLabel1.requestFocus();
    }//GEN-LAST:event_jLabel1FocusGained

    private void ph_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ph_noKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            ph_no.setEditable(false);
        } else {
            ph_no.setEditable(true);
        }
    }//GEN-LAST:event_ph_noKeyPressed

    private void eoyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eoyKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            eoy.setEditable(false);
        } else {
            eoy.setEditable(true);
        }
    }//GEN-LAST:event_eoyKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void dnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnameKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            dname.setEditable(false);
        } else {
            dname.setEditable(true);
        }
    }//GEN-LAST:event_dnameKeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new Admin_home().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    public boolean ok() {
        boolean oki = true;
        if (dname.getText().equals("Doctor Name")) {
            dname.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            dname.setBorder(new LineBorder(Color.white));
        }
        if (pass.getText().equals("Password")) {
            pass.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            pass.setBorder(new LineBorder(Color.white));
        }

        if (sp.getText().equals("Specialization")) {
            sp.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            sp.setBorder(new LineBorder(Color.white));
        }

        if (eoy.getText().equals("Experience(Years)")) {
            eoy.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            eoy.setBorder(new LineBorder(Color.white));
        }

        if (ph_no.getText().equals("Phone number") || ph_no.getText().length() != 10 ) {
            ph_no.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            ph_no.setBorder(new LineBorder(Color.white));
        }
        if (sex.getSelection() == null) {
            male1.setBackground(Color.red);
            female.setBackground(Color.red);
            oki = false;
        } else {
            male1.setBackground(new Color(29, 164, 196));
            female.setBackground(new Color(29, 164, 196));

        }
        return oki;
    }

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
            java.util.logging.Logger.getLogger(add_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbut;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField eoy;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton male1;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField ph_no;
    private javax.swing.ButtonGroup sex;
    private javax.swing.JTextField sp;
    // End of variables declaration//GEN-END:variables
}
