package librarysystemfinal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * @author balta
 */
public class SearchUser extends javax.swing.JFrame {
    public LoadUsers user = new LoadUsers();
    DefaultListModel DefaultListModel = new DefaultListModel();

    public SearchUser() throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

        //jTextArea1.append(user.users.get(jTextField1.getText()).items.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFrame = new javax.swing.JFrame();
        nameLabel = new java.awt.Label();
        idLabel = new java.awt.Label();
        phoneLabel = new java.awt.Label();
        addressLabel = new java.awt.Label();
        ageLabel = new java.awt.Label();
        finesLabel = new java.awt.Label();
        checkOutButton = new javax.swing.JToggleButton();
        itemsBorrowedLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        itemsBorrowedCountLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        returnButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        infoFrame.setTitle("User Information");
        infoFrame.setBounds(new java.awt.Rectangle(0, 0, 500, 550));
        infoFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        infoFrame.setResizable(false);

        nameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nameLabel.setText("label1");

        idLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idLabel.setText("label1");

        phoneLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phoneLabel.setText("label1");

        addressLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addressLabel.setText("label1");

        ageLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ageLabel.setText("label1");

        finesLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        finesLabel.setText("label1");

        checkOutButton.setText("Check Out New item");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        itemsBorrowedLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemsBorrowedLabel.setText("Items Borrowed:");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        itemsBorrowedCountLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemsBorrowedCountLabel.setText("label1");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        returnButton.setText("Return Item");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(itemsBorrowedLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(itemsBorrowedCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkOutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(returnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        infoFrameLayout.setVerticalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(itemsBorrowedLabel)
                                                        .addComponent(checkOutButton)))
                                        .addComponent(itemsBorrowedCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(returnButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(refreshButton)))
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter ID:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1))
                                        .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        try {
            validateUser(name);

        } catch (IOException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        try {
            new SearchItem(1, user.users.get(jTextField1.getText())).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        repaintFrame();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        try {
            new SearchItem(1, user.users.get(jTextField1.getText()), "").setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SearchUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void repaintFrame() {
        String temp = "";
        for (int i = 0; i < user.users.get(jTextField1.getText()).items.size(); i++) {
            temp = temp + user.users.get(jTextField1.getText()).items.get(i) + "\n";
        }
        jTextArea1.setText(temp);
        itemsBorrowedCountLabel.setText(user.users.get(jTextField1.getText()).itemsBorrowed);
        //itemsList.setListData(user.users.get(jTextField1.getText()).items);
        this.repaint();
    }

    private void validateUser(String name) throws IOException {
        if (user.users.containsKey(name)) {
            idLabel.setText("Card Number: " + user.users.get(name).cardID);
            nameLabel.setText(user.users.get(name).name + "'s Library Card");
            if (Integer.parseInt(user.users.get(name).age) <= 12)
                ageLabel.setText("Age: " + user.users.get(name).age + " (child)");
            else
                ageLabel.setText("Age: " + user.users.get(name).age);
            phoneLabel.setText("Phone: " + user.users.get(name).phoneNum);
            addressLabel.setText("Address: " + user.users.get(name).address);
            finesLabel.setText("Fines: $" + user.users.get(name).fines);
            itemsBorrowedCountLabel.setText(user.users.get(name).itemsBorrowed);
            for (int x = 0; x < user.users.get(name).items.size(); x++) {
                jTextArea1.append(user.users.get(name).items.elementAt(x));
                jTextArea1.append("\n");
            }

            infoFrame.setVisible(true);
            repaintFrame();
        } else {
            System.out.println("User not found");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label addressLabel;
    private java.awt.Label ageLabel;
    private javax.swing.JToggleButton checkOutButton;
    private java.awt.Label finesLabel;
    private java.awt.Label idLabel;
    private javax.swing.JFrame infoFrame;
    private java.awt.Label itemsBorrowedCountLabel;
    private javax.swing.JLabel itemsBorrowedLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label nameLabel;
    private java.awt.Label phoneLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JToggleButton returnButton;
    // End of variables declaration//GEN-END:variables
}