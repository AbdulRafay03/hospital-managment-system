/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class set_app extends javax.swing.JFrame {

    /**
     * Creates new form set_app
     */
    String Name;
    ArrayList<Date> arr = new ArrayList();
    DateFormat sdf = new SimpleDateFormat("hh:mm");

    public set_app(String name) {
        initComponents();
        Name = name;
        setlist();
        addholder(time);
        jLabel4.setVisible(false);
    }

    DefaultListModel demoList = new DefaultListModel();

    public void setlist() {
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader("slots.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                if (values[0].equals(Name)) {
                    System.out.println("helo");
                    for (int i = 1; i < values.length; i++) {
                        try {
                            System.out.println(values[i]);
                            arr.add(sdf.parse(values[i]));
                        } catch (ParseException ex) {
                            Logger.getLogger(set_app.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        JList slot = new JList(demoList);
                    }
                    break;
                }
            }
            System.out.println("hehehehe");
            for (Date d : arr) {
                demoList.addElement(d.getHours() + ":" + d.getMinutes());
            }
            slot.setModel(demoList);
            br.close();
        } catch (IOException e) {
            System.out.println("reading error");
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

        jButton2 = new javax.swing.JButton();
        time = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        slot = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 100, 40));

        time.setBackground(new java.awt.Color(29, 164, 196));
        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setText("HH:MM");
        time.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                timeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeFocusLost(evt);
            }
        });
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Slots");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 60, 30));

        jButton3.setBackground(new java.awt.Color(29, 164, 196));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 40));

        slot.setBackground(new java.awt.Color(29, 164, 196));
        slot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        slot.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(slot);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 410, 270));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Slot Added");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Date t = null;
        DefaultListModel newList = new DefaultListModel();

        boolean added = false;
        try {
            System.out.println(time.getText());
            t = sdf.parse(time.getText());
            System.out.println(t.getHours() + " " + t.getMinutes());
            time.setBorder(new LineBorder(Color.white, 1));
            if (!arr.isEmpty()) {
                for (Date e : arr) {
                    if (t.after(e)) {
                        long diffMs = t.getTime() - e.getTime();
                        long diffSec = diffMs / 1000;
                        long min = diffSec / 60;
                        System.out.println(min);
                        if (min < 30) {

                            time.setBorder(new LineBorder(Color.red));
                            jLabel4.setText("slot smoler than 30 min");
                            jLabel4.setForeground(Color.red);
                            jLabel4.setVisible(true);
                            added = false;
                            break;
                        } else {
                            added = true;
                        }
                    }

                    if (t.before(e)) {
                        long diffMs = e.getTime() - t.getTime();
                        long diffSec = diffMs / 1000;
                        long min = diffSec / 60;
                        System.out.println(min);
                        if (min < 30) {
                            added = false;
                            time.setBorder(new LineBorder(Color.red));
                            jLabel4.setText("slot smoler than 30 min");
                            jLabel4.setForeground(Color.red);
                            jLabel4.setVisible(true);
                            break;
                        } else {
                            added = true;
                        }
                    }
                }
            } else {
                added = true;
                time.setBorder(new LineBorder(Color.WHITE));
            }
            if (added) {
                arr.add(t);
                newList.removeAllElements();
                for (Date d : arr) {
                    newList.addElement(d.getHours() + ":" + d.getMinutes());
                }
                System.out.println(arr);
                slot.setModel(newList);

                jLabel4.setVisible(true);
                jLabel4.setText("Slot Added");
                jLabel4.setForeground(Color.white);
            }
        } catch (ParseException ex) {
            time.setBorder(new LineBorder(Color.red, 2));
            jLabel4.setText("incorrect time");
            jLabel4.setVisible(true);
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void timeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeFocusGained
        if (time.getText().equals("HH:MM")) {
            time.setText(null);
            time.requestFocus();
            removeholder(time);
        }
    }//GEN-LAST:event_timeFocusGained

    private void timeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeFocusLost
        if (time.getText().length() == 0) {
            addholder(time);
            time.setText("HH:MM");
        }
    }//GEN-LAST:event_timeFocusLost

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String line;
        String x[];

        try {
            File newfile = new File("temp.csv");
            File oldfile = new File("slots.csv");
            FileWriter fw = new FileWriter(newfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(new FileReader("slots.csv"));
            while ((line = br.readLine()) != null) {
                String values[] = line.split(",");
                if (values[0].equals(Name)) {
                    pw.print(Name);
                    for (Date d : arr) {
                        pw.print("," + d.getHours() + ":" + d.getMinutes());
                    }
                    pw.println();

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
            this.setVisible(false);
            new doctor_logged(Name).setVisible(true);
        } catch (IOException ex) {
            System.out.println("yayan se");

        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(set_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(set_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(set_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(set_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new set_app("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> slot;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
