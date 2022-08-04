package librarysystemfinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author balta
 */
public class SearchItem extends javax.swing.JFrame {
    public LoadItems item = new LoadItems();
    public User userNow;
    BufferedReader bReader;
    FileChannel src;
    FileChannel dest;
    File fDelete;
    FileWriter fWriter;
    PrintWriter writer;

    public SearchItem() throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(false);
        this.returnButton.setVisible(false);
    }

    public SearchItem(int init, User user) throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(true);
        this.returnButton.setVisible(false);
        this.userNow = user;
    }

    public SearchItem(int init, User user, String title) throws IOException {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.checkOutButton.setVisible(false);
        this.returnButton.setVisible(true);
        this.userNow = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFrame = new javax.swing.JFrame();
        titleLabel = new java.awt.Label();
        itemNum = new java.awt.Label();
        valueLabel = new java.awt.Label();
        authorLabel = new java.awt.Label();
        typeLabel = new java.awt.Label();
        rentableLabel = new java.awt.Label();
        bSellerLabel = new java.awt.Label();
        checkOutButton = new javax.swing.JButton();
        copiesLabel = new java.awt.Label();
        returnButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        infoFrame.setTitle("Item Information");
        infoFrame.setBounds(new java.awt.Rectangle(0, 0, 561, 272));
        infoFrame.setResizable(false);

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleLabel.setText("label1");

        itemNum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemNum.setText("label1");

        valueLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        valueLabel.setText("label1");

        authorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        authorLabel.setText("label1");

        typeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        typeLabel.setText("label1");

        rentableLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rentableLabel.setText("label1");

        bSellerLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bSellerLabel.setText("label1");

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        copiesLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        copiesLabel.setText("label1");

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(itemNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(rentableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(infoFrameLayout.createSequentialGroup()
                                                .addComponent(bSellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkOutButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(returnButton)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        infoFrameLayout.setVerticalGroup(
                infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoFrameLayout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(itemNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rentableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bSellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(checkOutButton)
                                                .addComponent(returnButton))
                                        .addComponent(copiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enter Item Name:");

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
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title = jTextField1.getText();
        try {
            validateItem(title);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        String itemCount = String.valueOf(Integer.parseInt(userNow.itemsBorrowed) + 1);
        String copiesCount = String.valueOf(Integer.parseInt(item.items.get(jTextField1.getText()).copies) - 1);
        String line;
        int temp = Integer.parseInt(userNow.cardID);
        int temp3 = Integer.parseInt(item.items.get(jTextField1.getText()).itemNum);
        int temp2 = 0;
        int iterator = 1;
        int iterator2 = 1;


        if ((item.items.get(jTextField1.getText()).itemType.compareTo("reference") != 0) && (item.items.get(jTextField1.getText()).itemType.compareTo("magazine") != 0)) {
            //update users file
            if (Integer.parseInt(item.items.get(jTextField1.getText()).copies) > 0) {
                String date = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
                userNow.items.add(jTextField1.getText());
                userNow.itemsBorrowed = itemCount;
                item.items.get(jTextField1.getText()).dueDate = date;
                item.items.get(jTextField1.getText()).copies = copiesCount;

                try {
                    fWriter = new FileWriter("usersTemp.txt", true);
                    try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                        bReader = new BufferedReader(new FileReader("users.txt"));

                        while ((line = bReader.readLine()) != null) {
                            if (iterator == temp) {
                                bWriter.write(userNow.cardID + ",");
                                bWriter.write(userNow.name + ",");
                                bWriter.write(userNow.age + ",");
                                bWriter.write(userNow.phoneNum + ",");
                                bWriter.write(userNow.address + ",");
                                bWriter.write(userNow.fines + ",");

                                if (userNow.items.isEmpty()) {
                                    bWriter.write(userNow.itemsBorrowed);
                                } else {
                                    bWriter.write(userNow.itemsBorrowed + ",");
                                }

                                for (String x : userNow.items) {
                                    bWriter.write(x);
                                    if (temp2 < userNow.items.size() - 1)
                                        bWriter.write(",");
                                    temp2++;
                                }
                            } else {
                                bWriter.write(line);
                            }
                            if (iterator < item.itemsCount) {
                                bWriter.newLine();
                            }
                            iterator++;
                        }
                        bWriter.close();

                        src = new FileInputStream("usersTemp.txt").getChannel();
                        dest = new FileOutputStream("users.txt").getChannel();
                        dest.transferFrom(src, 0, src.size());
                        fDelete = new File("usersTemp.txt");
                        writer = new PrintWriter(fDelete);
                        writer.print("");
                        writer.close();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                }

                //update items file
                try {
                    fWriter = new FileWriter("itemsTemp.txt", true);
                    try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                        bReader = new BufferedReader(new FileReader("items.txt"));

                        while ((line = bReader.readLine()) != null) {
                            if (iterator2 == temp3) {
                                bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                                bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                            } else {
                                bWriter.write(line);
                            }
                            if (iterator2 < item.itemsCount) {
                                bWriter.newLine();
                            }
                            iterator2++;
                        }
                        bWriter.close();

                        src = new FileInputStream("itemsTemp.txt").getChannel();
                        dest = new FileOutputStream("items.txt").getChannel();
                        dest.transferFrom(src, 0, src.size());
                        fDelete = new File("itemsTemp.txt");
                        writer = new PrintWriter(fDelete);
                        writer.print("");
                        writer.close();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("No more copies");
            }
        } else {
            System.out.println("Cannot Check Out Item");
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        String itemCount = String.valueOf(Integer.parseInt(userNow.itemsBorrowed) - 1);
        String copiesCount = String.valueOf(Integer.parseInt(item.items.get(jTextField1.getText()).copies) + 1);
        String line;
        int temp = Integer.parseInt(userNow.cardID);
        int temp3 = Integer.parseInt(item.items.get(jTextField1.getText()).itemNum);
        int temp2 = 0;
        int iterator = 1;
        int iterator2 = 1;


        //update users file
        //String date = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
        //userNow.items.add(jTextField1.getText());
        int toRemove = 0;
        for (String x : userNow.items) {
            if (x.compareTo(jTextField1.getText()) == 0) {
                toRemove = x.indexOf(x);
            }
        }
        userNow.items.remove(toRemove);
        userNow.itemsBorrowed = itemCount;
        item.items.get(jTextField1.getText()).dueDate = "";
        item.items.get(jTextField1.getText()).copies = copiesCount;
        try {
            fWriter = new FileWriter("usersTemp.txt", true);
            try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                bReader = new BufferedReader(new FileReader("users.txt"));

                while ((line = bReader.readLine()) != null) {
                    if (iterator == temp) {
                        bWriter.write(userNow.cardID + ",");
                        bWriter.write(userNow.name + ",");
                        bWriter.write(userNow.age + ",");
                        bWriter.write(userNow.phoneNum + ",");
                        bWriter.write(userNow.address + ",");
                        bWriter.write(userNow.fines + ",");

                        if (userNow.items.isEmpty()) {
                            bWriter.write(userNow.itemsBorrowed);
                        } else {
                            bWriter.write(userNow.itemsBorrowed + ",");
                        }

                        for (String x : userNow.items) {
                            bWriter.write(x);
                            if (temp2 < userNow.items.size() - 1)
                                bWriter.write(",");
                            temp2++;
                        }
                    } else {
                        bWriter.write(line);
                    }
                    if (iterator < item.itemsCount) {
                        bWriter.newLine();
                    }
                    iterator++;
                }
                bWriter.close();

                src = new FileInputStream("usersTemp.txt").getChannel();
                dest = new FileOutputStream("users.txt").getChannel();
                dest.transferFrom(src, 0, src.size());
                fDelete = new File("usersTemp.txt");
                writer = new PrintWriter(fDelete);
                writer.print("");
                writer.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        //update items file
        try {
            fWriter = new FileWriter("itemsTemp.txt", true);
            try (BufferedWriter bWriter = new BufferedWriter(fWriter)) {
                bReader = new BufferedReader(new FileReader("items.txt"));

                while ((line = bReader.readLine()) != null) {
                    if (iterator2 == temp3) {
                        bWriter.write(item.items.get(jTextField1.getText()).title + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).itemNum + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).author + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).value + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).itemType + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).bSeller + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).copies + ",");
                        bWriter.write(item.items.get(jTextField1.getText()).dueDate);
                    } else {
                        bWriter.write(line);
                    }
                    if (iterator2 < item.itemsCount) {
                        bWriter.newLine();
                    }
                    iterator2++;
                }
                bWriter.close();

                src = new FileInputStream("itemsTemp.txt").getChannel();
                dest = new FileOutputStream("items.txt").getChannel();
                dest.transferFrom(src, 0, src.size());
                fDelete = new File("itemsTemp.txt");
                writer = new PrintWriter(fDelete);
                writer.print("");
                writer.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void validateItem(String title) throws IOException {
        if (item.items.containsKey(title)) {
            itemNum.setText("Item Number: " + item.items.get(title).itemNum);
            titleLabel.setText("Item Title: " + item.items.get(title).title);
            typeLabel.setText("Item Type: " + item.items.get(title).itemType);
            valueLabel.setText("Item Value: $" + item.items.get(title).value);
            authorLabel.setText("Author: " + item.items.get(title).author);
            rentableLabel.setText(item.items.get(title).rentable);
            bSellerLabel.setText("Best Seller: " + item.items.get(title).bSeller);
            copiesLabel.setText("Copies available: " + item.items.get(title).copies);
            //infoFrame.setVisible(true);
            infoFrame.setVisible(true);
        } else {
            System.out.println("User not found");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label authorLabel;
    private java.awt.Label bSellerLabel;
    private javax.swing.JButton checkOutButton;
    private java.awt.Label copiesLabel;
    private javax.swing.JFrame infoFrame;
    private java.awt.Label itemNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label rentableLabel;
    private javax.swing.JButton returnButton;
    private java.awt.Label titleLabel;
    private java.awt.Label typeLabel;
    private java.awt.Label valueLabel;
    // End of variables declaration//GEN-END:variables
}