/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classsync;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class signupjf extends javax.swing.JFrame {
    
    public static HashMap<String, String> students = new HashMap<>();
    
    /**
     * Creates new form signupjf
     */
    public signupjf() {
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

        colorPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        welcome1 = new java.awt.Label();
        studentidLabel1 = new java.awt.Label();
        sstudentidTF = new javax.swing.JTextField();
        passwordLabel2 = new java.awt.Label();
        spasswordTF = new javax.swing.JPasswordField();
        passwordLabel1 = new java.awt.Label();
        sconfpasswordTF = new javax.swing.JPasswordField();
        ssignupBtn = new javax.swing.JButton();
        subtext3 = new java.awt.Label();
        sloginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(823, 314));
        setPreferredSize(new java.awt.Dimension(850, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorPanel.setBackground(new java.awt.Color(0, 102, 153));
        colorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        colorPanel.setToolTipText("");

        logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classsync/images/CL.png"))); // NOI18N

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(colorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        welcome1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        welcome1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        welcome1.setText("Create account");
        getContentPane().add(welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        studentidLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentidLabel1.setText("Student ID");
        getContentPane().add(studentidLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 70, 20));

        sstudentidTF.setVerifyInputWhenFocusTarget(false);
        sstudentidTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sstudentidTFActionPerformed(evt);
            }
        });
        getContentPane().add(sstudentidTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 201, -1));

        passwordLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passwordLabel2.setText("Password");
        getContentPane().add(passwordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 60, 20));

        spasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spasswordTFActionPerformed(evt);
            }
        });
        getContentPane().add(spasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 201, -1));

        passwordLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        passwordLabel1.setText("Confirm Password");
        getContentPane().add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 110, 10));

        sconfpasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sconfpasswordTFActionPerformed(evt);
            }
        });
        getContentPane().add(sconfpasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 201, -1));

        ssignupBtn.setBackground(new java.awt.Color(0, 102, 153));
        ssignupBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ssignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        ssignupBtn.setText("Sign Up");
        ssignupBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ssignupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ssignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssignupBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ssignupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 63, 24));

        subtext3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subtext3.setEnabled(false);
        subtext3.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        subtext3.setForeground(new java.awt.Color(102, 102, 102));
        subtext3.setText("Already have an account?");
        getContentPane().add(subtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 120, 14));

        sloginBtn.setBackground(new java.awt.Color(242, 242, 242));
        sloginBtn.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        sloginBtn.setForeground(new java.awt.Color(0, 102, 153));
        sloginBtn.setText("Log In");
        sloginBtn.setBorder(null);
        sloginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sloginBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sloginBtnStateChanged(evt);
            }
        });
        sloginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sloginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sloginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sstudentidTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sstudentidTFActionPerformed
        
    }//GEN-LAST:event_sstudentidTFActionPerformed

    private void spasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spasswordTFActionPerformed
        
    }//GEN-LAST:event_spasswordTFActionPerformed

    private void sconfpasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sconfpasswordTFActionPerformed

    }//GEN-LAST:event_sconfpasswordTFActionPerformed

    private void ssignupBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
        //Checks if any of the text fields are empty
        if (sstudentidTF.getText().isEmpty() || spasswordTF.getText().isEmpty() || sconfpasswordTF.getText().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error: Please fill in all fields");
        } else if (sconfpasswordTF.getText().equals(spasswordTF.getText())) { //Checks is password matches
        String studentID = sstudentidTF.getText();
        String password = spasswordTF.getText();
        //Checks if student ID already exists
        if (studentExists(studentID)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Student ID is already taken");
        } else if (password.length() < 8) { //Checks if password length is less than 8 characters
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Password length must be at least 8 characters");
        } else {
            try {
                //Write student ID and password to accounts text file.
                FileWriter fw = new FileWriter("accounts.txt", true);
                fw.write(studentID + "\t" + password + "\n");
                fw.close();
                javax.swing.JOptionPane.showMessageDialog(null, "Account created successfully");
            } catch(IOException e) {}
            
            //Gets current window location
            int currentX = getLocation().x;
            int currentY = getLocation().y;
            
            // Create a new login frame, set its location, make it visible, and dispose current frame
            loginjf loginFrame = new loginjf();
            loginFrame.setLocation(currentX, currentY);
            loginFrame.setVisible(true);
            dispose();
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Error: Passwords do not match");
    }
}                                   

    private void sloginBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sloginBtnStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sloginBtnStateChanged

    private void sloginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sloginBtnActionPerformed
        //Gets current window location
        int currentX = getLocation().x;
        int currentY = getLocation().y;
        
        // Create a new login frame, set its location, make it visible, and dispose current frame
        loginjf loginFrame = new loginjf();
        loginFrame.setLocation(currentX, currentY);
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_sloginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new signupjf().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel logo;
    private java.awt.Label passwordLabel1;
    private java.awt.Label passwordLabel2;
    private javax.swing.JPasswordField sconfpasswordTF;
    private javax.swing.JButton sloginBtn;
    private javax.swing.JPasswordField spasswordTF;
    private javax.swing.JButton ssignupBtn;
    private javax.swing.JTextField sstudentidTF;
    private java.awt.Label studentidLabel1;
    private java.awt.Label subtext3;
    private java.awt.Label welcome1;
    // End of variables declaration//GEN-END:variables
    
    public boolean studentExists(String studentID) {
        try {
            FileReader fr = new FileReader("accounts.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            //Reads each line from the file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t"); // Split the line into parts
                if (parts.length > 0 && parts[0].equals(studentID)) { // Check if the first part equals the student ID
                    return true;
                }
            }
        } catch (IOException e) {
        }
        return false;
    }
}

