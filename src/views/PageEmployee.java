/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import entities.Employee;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.EmployeeService;

/**
 *
 * @author aimra
 */
public class PageEmployee extends javax.swing.JFrame {
    
    private EmployeeService es = new EmployeeService();
    private Employee e;
    private DefaultTableModel model;
    
    public PageEmployee() {
        initComponents();   
        model = (DefaultTableModel) selectEmployee.getModel();
        load();
    }

    private void load(){
        model.setRowCount(0);
        for(Employee c : es.findAll()){
            model.addRow(new Object[]{
            c.getId(),
            c.getNom(),
            c.getPrenom(),
            c.getCin(),
            c.getPassword(),
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
        empNom = new javax.swing.JTextField();
        empre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empCIN = new javax.swing.JTextField();
        modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectEmployee = new javax.swing.JTable();
        ajouter = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        empS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idClient1 = new javax.swing.JLabel();
        idEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Emloyee Information");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Nom");

        empNom.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empNom.setSelectionColor(new java.awt.Color(255, 102, 102));
        empNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNomActionPerformed(evt);
            }
        });

        empre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empre.setSelectionColor(new java.awt.Color(255, 102, 102));
        empre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Prénom");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("CIN");

        empCIN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empCIN.setSelectionColor(new java.awt.Color(255, 102, 102));
        empCIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empCINActionPerformed(evt);
            }
        });

        modifier.setBackground(new java.awt.Color(255, 255, 255));
        modifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 102, 102));
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

        selectEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom", "Prénom", "CIN", "PassWord"
            }
        ));
        selectEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selectEmployee);

        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 102, 102));
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
        supp.setForeground(new java.awt.Color(255, 102, 102));
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
        clear.setForeground(new java.awt.Color(255, 102, 102));
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

        empS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        empS.setSelectionColor(new java.awt.Color(255, 102, 102));
        empS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("PassWord");

        idClient1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idClient1.setForeground(new java.awt.Color(255, 102, 102));
        idClient1.setText("ID");

        idEmp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        idEmp.setEnabled(false);
        idEmp.setSelectionColor(new java.awt.Color(255, 102, 102));
        idEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(empNom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(303, 303, 303)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(empCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(idClient1)
                                .addGap(18, 18, 18)
                                .addComponent(idEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("x");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
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

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Employee Page");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
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

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Statistiques");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Reservations");
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
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(922, 922, 922)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void empNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNomActionPerformed

    private void empreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empreActionPerformed

    private void empCINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empCINActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        if (idEmp.getText().isEmpty() || empNom.getText().isEmpty() || empre.getText().isEmpty() || empCIN.getText().isEmpty() || empS.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Misssing Information");
 
        }else{
            e = es.findById(Integer.parseInt(idEmp.getText()));
            e.setNom(empNom.getText());
            e.setPrenom(empre.getText());
            e.setCin(empCIN.getText());
            e.setPassword(empS.getText());

            int response = JOptionPane.showConfirmDialog(this, "voulez vous modifier le Employee ?");
            if(response == 0){
                es.update(e);
            }
            JOptionPane.showMessageDialog(this, "Employee modifier Successfully!!");
            load();
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        if (empNom.getText().isEmpty() || empre.getText().isEmpty() || empCIN.getText().isEmpty() || empS.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Misssing Information");
 
        }else{
            if(es.create(new Employee(empNom.getText(), empre.getText(), empCIN.getText(), empS.getText()))){
                JOptionPane.showConfirmDialog(this, "Employee bien ajouté");
                load();
            }
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        if(empCIN.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "EID est vide!!");
        }else{
            e = es.findById(Integer.parseInt(idEmp.getText()));
            int response = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer cette Employee");
            if(response == 0){
                es.delete(e);
            }
            JOptionPane.showMessageDialog(this, "Employee Supprimer Successfully!!");
            load();
        }
    }//GEN-LAST:event_suppActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        this.empCIN.setText("");
        this.empNom.setText("");
        this.empS.setText("");
        this.empre.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void empSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSActionPerformed

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked
        
    }//GEN-LAST:event_ajouterMouseClicked

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked
        
        
    }//GEN-LAST:event_suppMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new PageChambre().setVisible(true);
        this.dispose();
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

    private void selectEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectEmployeeMouseClicked
        DefaultTableModel model = (DefaultTableModel)selectEmployee.getModel();
        int Myindex = selectEmployee.getSelectedRow();
        empCIN.setText(model.getValueAt(Myindex, 2).toString());
        empNom.setText(model.getValueAt(Myindex, 0).toString());
        empS.setText(model.getValueAt(Myindex, 3).toString());
        empre.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_selectEmployeeMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked

    }//GEN-LAST:event_modifierMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        
        
    }//GEN-LAST:event_clearMouseClicked

    private void idEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEmpActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        new PageCharts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new PageReservation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        load();
    }//GEN-LAST:event_jLabel13MouseClicked
    
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
            java.util.logging.Logger.getLogger(PageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JButton clear;
    private javax.swing.JTextField empCIN;
    private javax.swing.JTextField empNom;
    private javax.swing.JTextField empS;
    private javax.swing.JTextField empre;
    private javax.swing.JLabel idClient1;
    private javax.swing.JTextField idEmp;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JTable selectEmployee;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables

}
