/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class add_pat extends javax.swing.JFrame {

    /**
     * Creates new form add_pat
     */
    public add_pat() {
        initComponents();
//        Pname.setEditable(true);
        addholder(Pname);
        addholder(city);
        addholder(gard_name);
        addholder(h_no);
        addholder(pass);
        addholder(ph_no);
        addholder(st_col);
        addholder(st_col);
        addholder(prob);
        setdocs();
    }

    public void setdocs() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("doctors.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                doc_name.addItem(values[1] + "," + values[3]);

            }
        } catch (FileNotFoundException ex) {
            this.setVisible(false);
            new update(this, rootPaneCheckingEnabled, "no Doctors Exists", WIDTH);
        } catch (IOException ex) {
            this.setVisible(false);
            new update(this, rootPaneCheckingEnabled, "no Doctors Exists", WIDTH);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                this.setVisible(false);
                new update(this, rootPaneCheckingEnabled, "no Doctors Exists", WIDTH);
            }
        }
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
        Pname = new javax.swing.JTextField();
        ph_no = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        st_col = new javax.swing.JTextField();
        h_no = new javax.swing.JTextField();
        gard_name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        pass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bl_grp = new javax.swing.JComboBox<>();
        prob = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        doc_name = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 520));
        setMinimumSize(new java.awt.Dimension(1100, 520));
        setSize(new java.awt.Dimension(1100, 520));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pname.setEditable(true);
        Pname.setBackground(new java.awt.Color(29, 164, 196));
        Pname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        Pname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pname.setText("Patient Name");
        Pname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PnameFocusLost(evt);
            }
        });
        Pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnameActionPerformed(evt);
            }
        });
        Pname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PnameKeyPressed(evt);
            }
        });
        getContentPane().add(Pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, 40));

        ph_no.setEditable(true);
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
        getContentPane().add(ph_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 220, 40));

        city.setEditable(true);
        city.setBackground(new java.awt.Color(29, 164, 196));
        city.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        city.setForeground(new java.awt.Color(255, 255, 255));
        city.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        city.setText("City");
        city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityFocusLost(evt);
            }
        });
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 220, 40));

        st_col.setEditable(true);
        st_col.setBackground(new java.awt.Color(29, 164, 196));
        st_col.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        st_col.setForeground(new java.awt.Color(255, 255, 255));
        st_col.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_col.setText("Street/Colony");
        st_col.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                st_colFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                st_colFocusLost(evt);
            }
        });
        st_col.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_colActionPerformed(evt);
            }
        });
        getContentPane().add(st_col, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 220, 40));

        h_no.setEditable(true);
        h_no.setBackground(new java.awt.Color(29, 164, 196));
        h_no.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        h_no.setForeground(new java.awt.Color(255, 255, 255));
        h_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        h_no.setText("House Number");
        h_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                h_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                h_noFocusLost(evt);
            }
        });
        h_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_noActionPerformed(evt);
            }
        });
        getContentPane().add(h_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 220, 40));

        gard_name.setEditable(true
        );
        gard_name.setBackground(new java.awt.Color(29, 164, 196));
        gard_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gard_name.setForeground(new java.awt.Color(255, 255, 255));
        gard_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gard_name.setText("Guardian's Name");
        gard_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gard_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gard_nameFocusLost(evt);
            }
        });
        gard_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gard_nameActionPerformed(evt);
            }
        });
        gard_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gard_nameKeyPressed(evt);
            }
        });
        getContentPane().add(gard_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, 40));

        male.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        male.setText("Male");
        male.setOpaque(true);
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, 30));
        male.setActionCommand("male");

        female.setBackground(new java.awt.Color(29, 164, 196));
        sex.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        female.setText("Female");
        female.setOpaque(true);
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, 30));
        female.setActionCommand("female");

        pass.setEditable(true);
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
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 220, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 50));

        bl_grp.setBackground(new java.awt.Color(29, 164, 196));
        bl_grp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bl_grp.setForeground(new java.awt.Color(255, 255, 255));
        bl_grp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Group", "A+", "A-", "B+", "B-", "O+", "O-", "AB", "AB- " }));
        getContentPane().add(bl_grp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 160, 30));

        prob.setEditable(true
        );
        prob.setBackground(new java.awt.Color(29, 164, 196));
        prob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prob.setForeground(new java.awt.Color(255, 255, 255));
        prob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prob.setText("Description of Disease");
        prob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                probFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                probFocusLost(evt);
            }
        });
        prob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probActionPerformed(evt);
            }
        });
        getContentPane().add(prob, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 300, 100));

        jButton1.setBackground(new java.awt.Color(29, 164, 196));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 160, 40));

        doc_name.setBackground(new java.awt.Color(29, 164, 196));
        doc_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doc_name.setForeground(new java.awt.Color(255, 255, 255));
        doc_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor Name" }));
        doc_name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(doc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 270, 40));

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameActionPerformed

    private void PnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnameFocusGained
        if (Pname.getText().equals("Patient Name")) {
            Pname.setText(null);
            Pname.requestFocus();
            removeholder(Pname);
        }
    }//GEN-LAST:event_PnameFocusGained

    private void PnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnameFocusLost
        if (Pname.getText().length() == 0) {
            addholder(Pname);
            Pname.setText("Patient Name");
        }

    }//GEN-LAST:event_PnameFocusLost

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        jLabel1.requestFocus();
    }//GEN-LAST:event_jLabel1FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

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
        // TODO add your handling code here:
    }//GEN-LAST:event_ph_noActionPerformed

    private void cityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusGained
        if (city.getText().equals("City")) {
            city.setText(null);
            city.requestFocus();
            removeholder(city);
        }
    }//GEN-LAST:event_cityFocusGained

    private void cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusLost
        if (city.getText().length() == 0) {
            addholder(city);
            city.setText("City");
        }
    }//GEN-LAST:event_cityFocusLost

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void st_colFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_st_colFocusGained
        if (st_col.getText().equals("Street/Colony")) {
            st_col.setText(null);
            st_col.requestFocus();
            removeholder(st_col);
        }
    }//GEN-LAST:event_st_colFocusGained

    private void st_colFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_st_colFocusLost
        if (st_col.getText().length() == 0) {
            addholder(st_col);
            st_col.setText("Street/Colony");
        }
    }//GEN-LAST:event_st_colFocusLost

    private void st_colActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_colActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_colActionPerformed

    private void h_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_h_noFocusGained
        if (h_no.getText().equals("House Number")) {
            h_no.setText(null);
            h_no.requestFocus();
            removeholder(h_no);
        }
    }//GEN-LAST:event_h_noFocusGained

    private void h_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_h_noFocusLost
        if (h_no.getText().length() == 0) {
            addholder(h_no);
            h_no.setText("House Number");
        }
    }//GEN-LAST:event_h_noFocusLost

    private void h_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h_noActionPerformed

    private void gard_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gard_nameFocusGained
        if (gard_name.getText().equals("Guardian's Name")) {
            gard_name.setText(null);
            gard_name.requestFocus();
            removeholder(gard_name);
        }
    }//GEN-LAST:event_gard_nameFocusGained

    private void gard_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gard_nameFocusLost
        if (gard_name.getText().length() == 0) {
            addholder(gard_name);
            gard_name.setText("Guardian's Name");
        }
    }//GEN-LAST:event_gard_nameFocusLost

    private void gard_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gard_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gard_nameActionPerformed

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

    private void probFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_probFocusGained

        if (prob.getText().equals("description of disease")) {
            prob.setText(null);
            prob.requestFocus();
            removeholder(prob);
        }
    }//GEN-LAST:event_probFocusGained

    private void probFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_probFocusLost
        if (prob.getText().length() == 0) {
            addholder(prob);
            prob.setText("description of disease");
        }
    }//GEN-LAST:event_probFocusLost

    private void probActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probActionPerformed

    }//GEN-LAST:event_probActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ph_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ph_noKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            ph_no.setEditable(false);
        } else {
            ph_no.setEditable(true);
        }
    }//GEN-LAST:event_ph_noKeyPressed
    public boolean ok() {
        boolean oki = true;
        if (Pname.getText().equals("Patient Name")) {
            Pname.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            Pname.setBorder(new LineBorder(Color.WHITE, 1));
        }
        if (pass.getText().equals("Password")) {
            pass.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            pass.setBorder(new LineBorder(Color.white, 1));
        }
        if (doc_name.getSelectedItem().equals("Doctor Name")) {
            doc_name.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            doc_name.setBorder(new LineBorder(Color.white, 1));
        }
        if (prob.getText().equals("description of disease")) {
            prob.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            prob.setBorder(new LineBorder(Color.white, 1));
        }
        if (gard_name.getText().equals("Guardian's Name")) {
            gard_name.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            gard_name.setBorder(new LineBorder(Color.white, 1));

        }
        if (ph_no.getText().equals("Phone number") || ph_no.getText().length() != 10) {
            ph_no.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            ph_no.setBorder(new LineBorder(Color.white, 1));

        }
        if (h_no.getText().equals("House Number")) {
            h_no.setBorder(new LineBorder(red, 1));
            oki = false;
        } else {
            h_no.setBorder(new LineBorder(Color.white, 1));
        }

        if (st_col.getText().equals("Street/Colony")) {
            st_col.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            st_col.setBorder(new LineBorder(Color.white, 1));

        }
        if (city.getText().equals("City")) {
            city.setBorder(new LineBorder(red, 2));
            oki = false;
        }
        if (bl_grp.getSelectedItem().equals("Blood Group")) {
            bl_grp.setBorder(new LineBorder(red, 2));
            oki = false;
        } else {
            bl_grp.setBorder(new LineBorder(Color.white, 1));

        }
        if (sex.getSelection() == null) {
            male.setBackground(red);
            female.setBackground(red);
            oki = false;
        } else {
            male.setBackground(new Color(29, 164, 196));
            female.setBackground(new Color(29, 164, 196));
        }
        return oki;
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int id = 0;

        if (ok()) {
            try {
                File myObj = new File("patients.csv");

                if (myObj.createNewFile()) {
                    System.out.println("Pat File created: " + myObj.getName());
                } else {
                    System.out.println("patient file already exist");
                }
                File f = new File("patients.csv");
                id = 0000;
                String line;
                BufferedReader br = new BufferedReader(new FileReader("patients.csv"));
                while ((line = br.readLine()) != null) {
                    String values[] = line.split(",");
                    id = Integer.parseInt(values[0]) + 1;

                }

                String x = (String) doc_name.getSelectedItem();
                String name[] = x.split(",");

                String dname = name[0];

                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(id + "," + Pname.getText() + "," + pass.getText() + "," + dname + "," + prob.getText() + ","
                        + bl_grp.getSelectedItem() + "," + sex.getSelection().getActionCommand() + "," + gard_name.getText() + ","
                        + ph_no.getText() + "," + h_no.getText() + " " + st_col.getText() + " " + city.getText());

                pw.flush();
                pw.close();
                bw.close();
                fw.close();
                br.close();
                System.out.println("Patient saved");

                this.setVisible(false);
                new saved(null, true, true, id).show();

            } catch (IOException e) {
                System.out.println("error in saving patient.");
                e.printStackTrace();
            }
            try {
                File f = new File("pres.csv");

                String line;
                BufferedReader br = new BufferedReader(new FileReader("pres.csv"));

                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.println(id + "," + prob.getText() + "," + "NO Prescription");

                pw.flush();
                pw.close();
                bw.close();
                fw.close();
                System.out.println("pres saved");

            } catch (IOException e) {
                System.out.println("error in saving pres.");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
        new Admin_home().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PnameKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            Pname.setEditable(false);
        } else {
            Pname.setEditable(true);
        }
    }//GEN-LAST:event_PnameKeyPressed

    private void gard_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gard_nameKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            gard_name.setEditable(false);
        } else {
            gard_name.setEditable(true);
        }
    }//GEN-LAST:event_gard_nameKeyPressed

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
            java.util.logging.Logger.getLogger(add_pat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_pat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_pat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_pat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new add_pat().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pname;
    private javax.swing.JComboBox<String> bl_grp;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> doc_name;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField gard_name;
    private javax.swing.JTextField h_no;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField ph_no;
    private javax.swing.JTextField prob;
    private javax.swing.ButtonGroup sex;
    private javax.swing.JTextField st_col;
    // End of variables declaration//GEN-END:variables
}
