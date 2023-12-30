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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class up_doc extends javax.swing.JFrame {

    /**
     * Creates new form up_doc
     */
    String val[];

    public up_doc() {
        initComponents();
        dname.setVisible(false);
        pass.setVisible(false);
        ph_no.setVisible(false);
        sp.setVisible(false);
        eoy.setVisible(false);
        male.setVisible(false);
        female.setVisible(false);
        update1.setVisible(false);
        delete.setVisible(false);

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
        dname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        ph_no = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        update1 = new javax.swing.JButton();
        eoy = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 220, 50));

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
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 50));

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
        getContentPane().add(ph_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 220, 50));

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, 40));

        female.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.setOpaque(true);
        female.setActionCommand("Famale");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 120, -1));

        male.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.setOpaque(true);
        male.setActionCommand("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 80, -1));

        update1.setBackground(new java.awt.Color(29, 164, 196));
        update1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update1.setForeground(new java.awt.Color(255, 255, 255));
        update1.setText("Update");
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
        });
        getContentPane().add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 160, 40));

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
        getContentPane().add(eoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 220, 50));

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
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 220, 50));

        delete.setBackground(new java.awt.Color(29, 164, 196));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 160, 40));

        id.setBackground(new java.awt.Color(29, 164, 196));
        id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Enter ID");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 40));

        jButton3.setBackground(new java.awt.Color(29, 164, 196));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("enter");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void dnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnameKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            dname.setEditable(false);
        } else {
            dname.setEditable(true);
        }
    }//GEN-LAST:event_dnameKeyPressed

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

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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

    private void ph_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ph_noKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            ph_no.setEditable(false);
        } else {
            ph_no.setEditable(true);
        }
    }//GEN-LAST:event_ph_noKeyPressed

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

    private void eoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eoyActionPerformed

    private void eoyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eoyKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            eoy.setEditable(false);
        } else {
            eoy.setEditable(true);
        }
    }//GEN-LAST:event_eoyKeyPressed

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

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spActionPerformed

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

        if (ph_no.getText().equals("Phone number") || ph_no.getText().length() != 10) {
            ph_no.setBorder(new LineBorder(Color.red, 2));
            oki = false;
        } else {
            ph_no.setBorder(new LineBorder(Color.white));
        }
        if (sex.getSelection() == null) {
            male.setBackground(Color.red);
            female.setBackground(Color.red);
            oki = false;
        } else {
            male.setBackground(new Color(29, 164, 196));
            female.setBackground(new Color(29, 164, 196));

        }
        return oki;
    }

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        String line;
        try {

            File oldfile = new File("doctors.csv");
            File newfile = new File("temp");
            FileWriter fw = new FileWriter(newfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(new FileReader("doctors.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                if (values[0].equals(id.getText())) {
                    continue;
                } else {
                    pw.println(line);
                }

            }
            pw.flush();
            pw.close();
            br.close();
            bw.close();
            fw.close();
            String x = oldfile.getAbsolutePath();

            oldfile.delete();

            if (oldfile.exists()) {
                System.out.println("not deleted");
            }
            File dump = new File(x);

            newfile.renameTo(dump);
            System.out.println("doc deleted");

            setpatdox();

            this.setVisible(false);
            new update(this, rootPaneCheckingEnabled, "DOCTOR DELETED", WIDTH).setVisible(true);

        } catch (IOException e) {
            System.out.println("reading error");
        }
    }//GEN-LAST:event_deleteMouseClicked

    public void setpatdox() {
        String line;
        try {

            File oldfile = new File("patients.csv");
            File newfile = new File("temp");
            FileWriter fw = new FileWriter(newfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(new FileReader("patients.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");

                if (values[3].equals(val[1])) {
                    pw.println(values[0] + "," + values[1] + "," + values[2] + "," + " *doc deleted* " + "," + values[4] + "," + values[5] + ","
                            + values[5] + "," + values[6] + "," + values[7] + "," + values[8] + "," + values[9]);

                } else {
                    pw.println(line);
                }

            }
            pw.flush();
            pw.close();
            br.close();
            bw.close();
            fw.close();
            String x = oldfile.getAbsolutePath();

            oldfile.delete();

            if (oldfile.exists()) {
                System.out.println("not deleted");
            }
            File dump = new File(x);

            newfile.renameTo(dump);
            System.out.println("pat updated");
            new update(this, rootPaneCheckingEnabled, "PATIENT UPDATED ", WIDTH).setVisible(true);
        } catch (IOException e) {
            System.out.println("reading error");
        }
    }

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        if (id.getText().equals("Enter ID")) {
            id.setText(null);
            id.requestFocus();
            removeholder(id);
        }
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        if (id.getText().length() == 0) {
            addholder(id);
            id.setText("Enter ID");
        }
    }//GEN-LAST:event_idFocusLost

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("doctors.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                if (values[0].equals(id.getText())) {
                    val = values;
                    dname.setVisible(true);
                    dname.setText(val[1]);

                    pass.setVisible(true);
                    pass.setText(val[2]);

                    sp.setVisible(true);
                    sp.setText(val[3]);

                    eoy.setVisible(true);
                    eoy.setText(val[4]);

                    ph_no.setVisible(true);
                    ph_no.setText(val[5]);

                    male.setVisible(true);
                    female.setVisible(true);
                    if (val[6].equals("Male")) {
                        male.setSelected(true);
                    } else {
                        female.setSelected(true);
                    }

                    delete.setVisible(true);
                    update1.setVisible(true);

                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("reading error");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        if (ok()) {
            String line;

            try {
                File newfile = new File("temp.csv");
                File oldfile = new File("doctors.csv");
                FileWriter fw = new FileWriter(newfile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                BufferedReader br = new BufferedReader(new FileReader("doctors.csv"));
                while ((line = br.readLine()) != null) {
                    String values[] = line.split(",");
                    if (values[0].equals(id.getText())) {
                        pw.println(id.getText() + "," + dname.getText() + "," + pass.getText() + "," + sp.getText() + "," + eoy.getText() + ","
                                + ph_no.getText() + "," + sex.getSelection().getActionCommand());

                    } else {
                        pw.println(line);
                    }

                }
                pw.flush();
                pw.close();
                br.close();
                bw.close();
                fw.close();
                System.out.println("updated");
                String xx = oldfile.getAbsolutePath();

                oldfile.delete();

                if (oldfile.exists()) {
                    System.out.println("not deleted");
                }
                File dump = new File(xx);

                newfile.renameTo(dump);
                System.out.println("doc updated");
                this.setVisible(false);
                new update(this, rootPaneCheckingEnabled, "DOCTOR UPDATED ", WIDTH).setVisible(true);

            } catch (IOException ex) {
                System.out.println("yayan se");
                
            }
        }

    }//GEN-LAST:event_update1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new Admin_home().setVisible(true);
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
            java.util.logging.Logger.getLogger(up_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(up_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(up_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(up_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new up_doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField eoy;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField ph_no;
    private javax.swing.ButtonGroup sex;
    private javax.swing.JTextField sp;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
}