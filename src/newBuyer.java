import java.awt.Color;
import project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
public class newBuyer extends javax.swing.JFrame {

    public newBuyer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        contactT = new javax.swing.JTextField();
        emailT = new javax.swing.JTextField();
        addressT = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setMaximumSize(new java.awt.Dimension(536, 386));
        setMinimumSize(new java.awt.Dimension(536, 386));
        setUndecorated(true);
        setSize(new java.awt.Dimension(536, 386));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New buyer ani.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new buyer.png"))); // NOI18N

        jLabel3.setText("Name");

        jLabel4.setText("Contact No");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        nameT.setForeground(new java.awt.Color(153, 153, 153));
        nameT.setText("Enter Name");
        nameT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTFocusLost(evt);
            }
        });

        contactT.setForeground(new java.awt.Color(153, 153, 153));
        contactT.setText("Enter Contact No");
        contactT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactTFocusLost(evt);
            }
        });

        emailT.setForeground(new java.awt.Color(153, 153, 153));
        emailT.setText("Enter Email");
        emailT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTFocusLost(evt);
            }
        });
        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });

        addressT.setForeground(new java.awt.Color(153, 153, 153));
        addressT.setText("Enter Address");
        addressT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTFocusLost(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(save))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contactT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(nameT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressT, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(contactT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset)
                    .addComponent(close))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        setVisible(false);
        new newBuyer().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void nameTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFocusGained
        if(nameT.getText().equals("Enter Name")){
            nameT.setText("");
            nameT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_nameTFocusGained

    private void nameTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFocusLost
        if(nameT.getText().equals("")){
            nameT.setText("Enter Name");
            nameT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nameTFocusLost

    private void contactTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactTFocusGained
        if(contactT.getText().equals("Enter Contact No")){
            contactT.setText("");
            contactT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_contactTFocusGained

    private void contactTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactTFocusLost
        if(contactT.getText().equals("")){
            contactT.setText("Enter Contact No");
            contactT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_contactTFocusLost

    private void emailTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFocusGained
        if(emailT.getText().equals("Enter Email")){
            emailT.setText("");
            emailT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailTFocusGained

    private void emailTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTFocusLost
        if(emailT.getText().equals("")){
            emailT.setText("Enter Email");
            emailT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailTFocusLost

    private void addressTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTFocusGained
        if(addressT.getText().equals("Enter Address")){
            addressT.setText("");
            addressT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_addressTFocusGained

    private void addressTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTFocusLost
        if(addressT.getText().equals("")){
            addressT.setText("Enter Address");
            addressT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addressTFocusLost

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String name = nameT.getText();
        String contactNo = contactT.getText();
        String email = emailT.getText();
        String address = addressT.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO buyer VALUES ('"+name+"','"+contactNo+"','"+email+"','"+address+"');");
            con.close();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new newBuyer().setVisible(true);
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Mobile number already exists.");
        }
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressT;
    private javax.swing.JButton close;
    private javax.swing.JTextField contactT;
    private javax.swing.JTextField emailT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameT;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
