import java.sql.*;
import project.ConnectionProvider;
import java.awt.Color;
import javax.swing.JOptionPane;
public class newProduct extends javax.swing.JFrame {

    public newProduct() {
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        productT = new javax.swing.JTextField();
        rateT = new javax.swing.JTextField();
        descT = new javax.swing.JTextField();
        activateC = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setMaximumSize(new java.awt.Dimension(536, 386));
        setMinimumSize(new java.awt.Dimension(536, 386));
        setUndecorated(true);
        setSize(new java.awt.Dimension(536, 386));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Product ani.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new product.png"))); // NOI18N

        jLabel3.setText("Product ID");

        jLabel4.setText("Product Name");

        jLabel5.setText("Rate");

        jLabel6.setText("100");

        jLabel7.setText("Description");

        jLabel8.setText("Activate");

        productT.setForeground(new java.awt.Color(153, 153, 153));
        productT.setText("Enter Product Name");
        productT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                productTFocusLost(evt);
            }
        });

        rateT.setForeground(new java.awt.Color(153, 153, 153));
        rateT.setText("Enter Product Rate");
        rateT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rateTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rateTFocusLost(evt);
            }
        });

        descT.setForeground(new java.awt.Color(153, 153, 153));
        descT.setText("Enter Product Description");
        descT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descTFocusLost(evt);
            }
        });

        activateC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

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
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addComponent(close))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel3)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel6))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addComponent(jSeparator2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(activateC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descT)
                                .addComponent(rateT)
                                .addComponent(productT)))
                        .addComponent(jSeparator3)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(productT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rateT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(descT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset)
                    .addComponent(close))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productTFocusGained
        String pName = productT.getText();
        if(pName.equals("Enter Product Name")){
            productT.setText("");
            productT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_productTFocusGained

    private void productTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productTFocusLost
        String pName = productT.getText();
        if(pName.equals("")){
            productT.setText("Enter Product Name");
            productT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_productTFocusLost

    private void rateTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateTFocusGained
        String rate = rateT.getText();
        if(rate.equals("Enter Product Rate")){
            rateT.setText("");
            rateT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_rateTFocusGained

    private void rateTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateTFocusLost
        String rate = rateT.getText();
        if(rate.equals("")){
            rateT.setText("Enter Product Rate");
            rateT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_rateTFocusLost

    private void descTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descTFocusGained
        String desc = descT.getText();
        if(desc.equals("Enter Product Description")){
            descT.setText("");
            descT.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_descTFocusGained

    private void descTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descTFocusLost
        String desc = descT.getText();
        if(desc.equals("")){
            descT.setText("Enter Product Description");
            descT.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_descTFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(pID) from product");
            if(rs.first()){
                int id = rs.getInt(1);
                id = id+1;
                String str = String.valueOf(id);
                jLabel6.setText(str);
            }
            else{
                jLabel6.setText("1");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String pId = jLabel6.getText();
        String pName = productT.getText();
        String rate = rateT.getText();
        String description = descT.getText();
        String activate = (String)activateC.getSelectedItem();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into product values('"+pId+"','"+pName+"','"+rate+"','"+description+"','"+activate+"')");
            JOptionPane.showMessageDialog(null, "Successfully Saved");
            setVisible(false);
            new newProduct().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        setVisible(false);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activateC;
    private javax.swing.JButton close;
    private javax.swing.JTextField descT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField productT;
    private javax.swing.JTextField rateT;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
