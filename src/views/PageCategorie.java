/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import entities.Categorie;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;

/**
 *
 * @author aimra
 */
public class PageCategorie extends javax.swing.JFrame {

    /** Creates new form PageEmployee */
    private CategorieService cs = new CategorieService();
    private Categorie c;
    private DefaultTableModel model;
    private static int id;
    
    
    public PageCategorie() {
        initComponents();
        model = (DefaultTableModel) catTable.getModel();
        load();
    }
    
    private void load(){
        model.setRowCount(0);
        for(Categorie c : cs.findAll()){
            model.addRow(new Object[]{
            c.getId(),
            c.getCode(),
            c.getLibelle()
        });
        }
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lebelle = new javax.swing.JTextField();
        modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        ajouter = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        chercher = new javax.swing.JButton();
        idCat = new javax.swing.JTextField();
        idClient1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contra Page");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Client Page");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Voiture Page");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Employee Page");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Page Categories");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Code");

        code.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Libelle");

        lebelle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lebelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lebelleActionPerformed(evt);
            }
        });

        modifier.setBackground(new java.awt.Color(255, 255, 255));
        modifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(0, 153, 255));
        modifier.setText("Modifier");
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
        });
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Code", "Libelle"
            }
        ));
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catTable);

        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(0, 153, 255));
        ajouter.setText("Ajouter");
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
        });
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        supp.setBackground(new java.awt.Color(255, 255, 255));
        supp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        supp.setForeground(new java.awt.Color(0, 153, 255));
        supp.setText("Suppimer");
        supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppMouseClicked(evt);
            }
        });
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 153, 255));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        chercher.setBackground(new java.awt.Color(255, 255, 255));
        chercher.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chercher.setForeground(new java.awt.Color(0, 153, 255));
        chercher.setText("Rechercher");
        chercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chercherMouseClicked(evt);
            }
        });
        chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherActionPerformed(evt);
            }
        });

        idCat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        idCat.setEnabled(false);
        idCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCatActionPerformed(evt);
            }
        });

        idClient1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idClient1.setForeground(new java.awt.Color(0, 153, 255));
        idClient1.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(360, 360, 360))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lebelle, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(idClient1)
                        .addGap(18, 18, 18)
                        .addComponent(idCat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        idClient1.getAccessibleContext().setAccessibleName("idClient");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("x");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Reservations");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Chambres");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Clients");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Catagories");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Charts");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1033, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void lebelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lebelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lebelleActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        if (idCat.getText().isEmpty()){
            JOptionPane.showConfirmDialog(this, "Id est null");
        }else{
            Categorie c = cs.findById(Integer.parseInt(idCat.getText()));
            c.setCode(code.getText());
            c.setLibelle(lebelle.getText());

            int response = JOptionPane.showConfirmDialog(this, "voulez vous  modifier le categorie ?");
            if(response == 0){
                cs.update(c);
            }
            load();
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        if (code.getText().isEmpty() || lebelle.getText().isEmpty()){
            JOptionPane.showConfirmDialog(this, "Missing Information!!");
        }else{
            if(cs.create(new Categorie(code.getText(), lebelle.getText()))){
                JOptionPane.showConfirmDialog(this, "Categorie bien ajouté");
                load();
            }
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        if(idCat.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Entrer ID est vide!!");
        }else{
            
            Categorie c = cs.findById(Integer.parseInt(idCat.getText()));
            int response = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer ce categorie");
            if(response == 0){
                cs.delete(c);
            }
            load();
        }
    }//GEN-LAST:event_suppActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
    }//GEN-LAST:event_clearActionPerformed

    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chercherActionPerformed

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        
        if (code.getText().isEmpty() || lebelle.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Misssing Information");
        }else{
        
            c = new Categorie (code.getText(), lebelle.getText());
            if (cs.create(c)){
                JOptionPane.showMessageDialog(this,"Le categorie est bien ajouter !!");
            }else{
                JOptionPane.showMessageDialog(this,"Le categorie n'est pas ajouter !!");
            }
        
        }
    }//GEN-LAST:event_ajouterMouseClicked

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked
        
        
    }//GEN-LAST:event_suppMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new PageChambre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        load();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        new PageReservation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)catTable.getModel();
        int Myindex = catTable.getSelectedRow();
        idCat.setText(model.getValueAt(Myindex, 0).toString());
        lebelle.setText(model.getValueAt(Myindex, 2).toString());
        code.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_catTableMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked

    }//GEN-LAST:event_modifierMouseClicked

    private void chercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chercherMouseClicked
        
        if (lebelle.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        
        }else{
        
           
        }
    }//GEN-LAST:event_chercherMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        this.idCat.setText("");
        this.lebelle.setText("");
        this.code.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void idCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCatActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new PageCharts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked
    
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
            java.util.logging.Logger.getLogger(PageCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JTable catTable;
    private javax.swing.JButton chercher;
    private javax.swing.JButton clear;
    private javax.swing.JTextField code;
    private javax.swing.JTextField idCat;
    private javax.swing.JLabel idClient1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lebelle;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables

}
