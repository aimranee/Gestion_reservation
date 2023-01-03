/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import entities.Categorie;
import entities.Chambre;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.CategorieService;
import service.ChambreService;

/**
 *
 * @author aimra
 */
public class PageChambre extends javax.swing.JFrame {

    /** Creates new form PageEmployee */
    private ChambreService cs = new ChambreService();
    private CategorieService cats = new CategorieService();
    private DefaultTableModel model;
    private static int id;
    Categorie categorie;
    
    
    public PageChambre() {
        initComponents();
        cats = new CategorieService();
        cs = new ChambreService();
        loadCategorie();
        model = (DefaultTableModel) chambreTable.getModel();
        load();
    }
    
    private void loadCategorie() {

        for (Categorie c : cats.findAll()) {
            categorieList.addItem(c);
        }
    }
    
    private void load() {
        model.setRowCount(0);
        for (Chambre c : cs.findAll()) {
            model.addRow(new Object[]{
                c.getId(),
                c.getTelephone(),
                c.getCategorie(),});
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
        tele = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idChambre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        categorieList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        chambreTable = new javax.swing.JTable();
        ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        chercher = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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
        jLabel2.setText("Page Chambre");

        tele.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Téléphone");

        idChambre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        idChambre.setEnabled(false);
        idChambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idChambreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Chambre");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Categorie");

        cat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cat.setEnabled(false);
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        categorieList.setBackground(new java.awt.Color(240, 240, 240));
        categorieList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieListActionPerformed(evt);
            }
        });

        chambreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Téléphone", "Categorie"
            }
        ));
        chambreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chambreTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chambreTable);

        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(0, 102, 255));
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

        modifier.setBackground(new java.awt.Color(255, 255, 255));
        modifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(0, 102, 255));
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

        chercher.setBackground(new java.awt.Color(255, 255, 255));
        chercher.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chercher.setForeground(new java.awt.Color(0, 102, 255));
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

        supp.setBackground(new java.awt.Color(255, 255, 255));
        supp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        supp.setForeground(new java.awt.Color(0, 102, 255));
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
        clear.setForeground(new java.awt.Color(0, 102, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(360, 360, 360))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(idChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(386, 386, 386)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(categorieList, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idChambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categorieList, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(382, Short.MAX_VALUE)))
        );

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
        jLabel18.setText("Categories");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
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

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reservations");
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

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Employee Page");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
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
                            .addComponent(jLabel21)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
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
    
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        load();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        new PageClient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        new PageCategorie().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void idChambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idChambreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idChambreActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void chambreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chambreTableMouseClicked
        id = Integer.parseInt(model.getValueAt(chambreTable.getSelectedRow(), 0).toString());
        idChambre.setText(model.getValueAt(chambreTable.getSelectedRow(), 0).toString());
        tele.setText((model.getValueAt(chambreTable.getSelectedRow(), 1).toString()));
        cat.setText(model.getValueAt(chambreTable.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_chambreTableMouseClicked

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked

    }//GEN-LAST:event_ajouterMouseClicked

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
      Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
      Matcher matcher = pattern.matcher(tele.getText());

        if (tele.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Misssing Information");
        } else if (matcher.matches()){
            JOptionPane.showConfirmDialog(this, "Phone Number must be in the form XXX-XXX-XXXX");
        }else{
            categorie = (Categorie) categorieList.getSelectedItem();

            if (cs.create(new entities.Chambre(tele.getText(), categorie))) {
                JOptionPane.showConfirmDialog(this, "Chambre bien ajoutée");
                load();
            }
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked
        
    }//GEN-LAST:event_modifierMouseClicked

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        categorie = (Categorie) categorieList.getSelectedItem();

        entities.Chambre c = cs.findById(id);
        c.setTelephone(tele.getText());
        c.setCategorie(cats.findById(categorie.getId()));

        int response = JOptionPane.showConfirmDialog(this, "voulez vous modifier cette chambre ?");
        if (response == 0) {
            cs.update(c);
        }
        load();
    }//GEN-LAST:event_modifierActionPerformed

    private void chercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chercherMouseClicked

        if (categorieList.getItemCount()<1) {
            JOptionPane.showMessageDialog(this, "Missing Information");

        } else {
            
            Categorie cat = (Categorie) categorieList.getSelectedItem();
            if (cat.getId() == 4){
                load();
            }else{
                ChambreService cs = new ChambreService();
                model.setRowCount(0);
                for (Chambre c : cs.findByCats(cat.getId())) {
                    model.addRow(new Object[]{
                        c.getId(),
                        c.getTelephone(),
                        c.getCategorie(),});
                }
            }
        }
    }//GEN-LAST:event_chercherMouseClicked

    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed
        
    }//GEN-LAST:event_chercherActionPerformed

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked

    }//GEN-LAST:event_suppMouseClicked

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        Chambre chambre = cs.findById(id);
        int response = JOptionPane.showConfirmDialog(this, "voulez-vous supprimer cet chambre ?");
        if (response == 0) {
            cs.delete(chambre);
        }
        load();
    }//GEN-LAST:event_suppActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        idChambre.setText("");
        tele.setText("");
        cat.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

    }//GEN-LAST:event_clearActionPerformed

    private void categorieListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorieListActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        new PageReservation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new PageCharts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new PageEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageChambre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JTextField cat;
    private javax.swing.JComboBox categorieList;
    private javax.swing.JTable chambreTable;
    private javax.swing.JButton chercher;
    private javax.swing.JButton clear;
    private javax.swing.JTextField idChambre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supp;
    private javax.swing.JTextField tele;
    // End of variables declaration//GEN-END:variables

}
