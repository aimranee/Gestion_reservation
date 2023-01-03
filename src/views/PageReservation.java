/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entities.Chambre;
import entities.Client;
import entities.Reservation;    
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.ChambreService;
import service.ClientService;
import service.ReservationService;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


/**
 *
 * @author aimra
 */
public class PageReservation extends javax.swing.JFrame {

    private ReservationService rs = new ReservationService();
    private ClientService cs = new ClientService();
    private ChambreService chs = new ChambreService();
    //private static int id;
    DefaultTableModel model;
    DefaultTableModel model1;
    Client client ;
    Chambre chambre;
    Date dateDebut;
    Date dateFin;
    
    public PageReservation() {
        initComponents();   
        loadClient();
        loadChambre();
        model= (DefaultTableModel) reservationTable.getModel();
        model1= (DefaultTableModel) reservationTable1.getModel();
        load();
    }
    
    private void loadClient(){
        
        for (entities.Client c : cs.findAll()){
           clientCombo.addItem(c);
        }
    }
    
    private void loadChambre(){
        
        for (entities.Chambre c : chs.findAll()){
           chambreCombo.addItem(c);
        }
    }
    
    private void load(){
        model.setRowCount(0);
        for(Reservation r : rs.findAll()){
            model.addRow(new Object[]{
                r.getId(),
                r.getClient(),
                r.getChambre(),
                r.getDatedebut(),
                r.getDatefin()
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
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        ajouter = new javax.swing.JButton();
        supp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        chercher = new javax.swing.JButton();
        clientCombo = new javax.swing.JComboBox();
        chambreCombo = new javax.swing.JComboBox();
        jDateF = new com.toedter.calendar.JDateChooser();
        jDateD = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        idR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Page Reservations");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Client");
        jLabel3.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Date debut");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Chambre");

        modifier.setBackground(new java.awt.Color(255, 255, 255));
        modifier.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(0, 204, 255));
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

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "ClientID", "ChambreID", "DateDebut", "DateFin"
            }
        ));
        reservationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reservationTable);
        if (reservationTable.getColumnModel().getColumnCount() > 0) {
            reservationTable.getColumnModel().getColumn(3).setHeaderValue("Date Reservation");
            reservationTable.getColumnModel().getColumn(4).setHeaderValue("DateFin");
        }

        ajouter.setBackground(new java.awt.Color(255, 255, 255));
        ajouter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(0, 204, 255));
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
        supp.setForeground(new java.awt.Color(0, 204, 255));
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
        clear.setForeground(new java.awt.Color(0, 204, 255));
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

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Date fin");

        chercher.setBackground(new java.awt.Color(255, 255, 255));
        chercher.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chercher.setForeground(new java.awt.Color(0, 204, 255));
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

        jDateF.setDateFormatString("yyyy-MM-d");

        jDateD.setDateFormatString("yyyy-MM-d");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Id");

        idR.setEnabled(false);
        idR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRActionPerformed(evt);
            }
        });

        jButton1.setText("Generate PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reservationTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Telephone", "Categorie"
            }
        ));
        reservationTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reservationTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(supp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chambreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(clientCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(34, 34, 34)))
                                .addComponent(idR, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jLabel2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(64, 64, 64)
                            .addComponent(jDateF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(41, 41, 41)
                            .addComponent(jDateD, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clientCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDateD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chambreCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("x");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
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

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Categories");
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

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Employee Page");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Logout");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel14)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        
        if (idR.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select the reservation!!");
        
        }else{
            
            client =  (Client) clientCombo.getSelectedItem();
            chambre =  (Chambre) chambreCombo.getSelectedItem();
            dateDebut = (Date) jDateD.getDate();
            dateFin = (Date) jDateD.getDate();
        
            Reservation c = rs.findById(Integer.parseInt(idR.getText()));
            c.setClient(client);
            c.setChambre(chambre);
            c.setDatedebut(dateDebut);
            c.setDatefin(dateFin);

            int response = JOptionPane.showConfirmDialog(this, "voulez vous modifier cette reservation ?");
            if(response == 0){
                rs.update(c);
            }
            load();
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        client =  (Client) clientCombo.getSelectedItem();
        chambre =  (Chambre) chambreCombo.getSelectedItem();
        dateDebut =(Date) jDateD.getDate();
        dateFin = (Date) jDateF.getDate();
        if (rs.verifierRes(chambre, dateDebut, dateFin)){
            JOptionPane.showMessageDialog(this, "Le chmbre "+chambre.getId()+" est non reserver!!");
            if(rs.create(new Reservation(client, chambre,dateDebut, dateFin))){
                JOptionPane.showConfirmDialog(this, "Reservation bien ajoutée");
                load();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Le chmbre "+chambre.getId()+" est déja reserver!!");
        }
        
    }//GEN-LAST:event_ajouterActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        if(idR.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Entrer ID");
            
        }else{
            Reservation reservation = rs.findById(Integer.parseInt(idR.getText()));
            int response = JOptionPane.showConfirmDialog(this, "voulez-vous supprimer cette reservation");
            if(response == 0){
                rs.delete(reservation);
            }
            load();
        }
    }//GEN-LAST:event_suppActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
    }//GEN-LAST:event_clearActionPerformed

    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed

        client =  (Client) clientCombo.getSelectedItem();
        chambre =  (Chambre) chambreCombo.getSelectedItem();
        dateDebut = (Date) jDateD.getDate();
        dateFin = (Date) jDateF.getDate();

        model1.setRowCount(0);
        for(Chambre r : rs.findChambreBetweenDates(client, dateDebut, dateFin)){
            model1.addRow(new Object[]{
                r.getId(),
                r.getTelephone(),
                r.getCategorie(),
            });
        }
        
    }//GEN-LAST:event_chercherActionPerformed

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked

    }//GEN-LAST:event_ajouterMouseClicked

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked

    }//GEN-LAST:event_suppMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new PageChambre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        new PageCategorie().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        load();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void reservationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)reservationTable.getModel();
        int Myindex = reservationTable.getSelectedRow();
        
        idR.setText((model.getValueAt(reservationTable.getSelectedRow(), 0).toString()));
        clientCombo.getModel().setSelectedItem(model.getValueAt(reservationTable.getSelectedRow(), 1));
        chambreCombo.getModel().setSelectedItem(model.getValueAt(reservationTable.getSelectedRow(), 2));
        jDateD.setDate((Date) model.getValueAt(reservationTable.getSelectedRow(), 3));
        jDateF.setDate((Date) model.getValueAt(reservationTable.getSelectedRow(), 4));
        
    }//GEN-LAST:event_reservationTableMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked

    }//GEN-LAST:event_modifierMouseClicked

    private void chercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chercherMouseClicked
        
        /*if (empCIN.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        
        }else{
        
           try{
           String c = empCIN.getText();
            
           String query="select * from Employee where CIN = '"+c+"'";
           rst=stm.executeQuery(query);
           selectEmployee.setModel(DbUtils.resultSetToTableModel(rst));
           
           int nbrRow=0;
           
           nbrRow=selectEmployee.getRowCount();
           
           if(nbrRow!=0)
               JOptionPane.showMessageDialog(this, "Employee Existed");
           else
               JOptionPane.showMessageDialog(this, "Employee Not Existed");
        }catch(Exception e){
        System.out.println("Erreur:"+e);
        }
        }*/
    }//GEN-LAST:event_chercherMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        this.idR.setText("");
        load();
        
    }//GEN-LAST:event_clearMouseClicked

    private void idRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        new PageCategorie().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        Document doc = new Document();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+date+".pdf"));
            doc.open();
            PdfPTable tbl = new PdfPTable(5);
            tbl.addCell("ID");
            tbl.addCell("ClientId");
            tbl.addCell("ChambreId");
            tbl.addCell("Date Debut");
            tbl.addCell("Date Fin");
            for (int i =0; i<reservationTable.getRowCount(); i++){
                String id = reservationTable.getValueAt(i,0).toString();
                String c = reservationTable.getValueAt(i,1).toString();
                String ch = reservationTable.getValueAt(i,2).toString();
                String dd = reservationTable.getValueAt(i,3).toString();
                String df = reservationTable.getValueAt(i,4).toString();
                tbl.addCell(id);
                tbl.addCell(c);
                tbl.addCell(ch);
                tbl.addCell(dd);
                tbl.addCell(df);
            }
            doc.add(tbl);
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(PageReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new PageCharts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void reservationTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationTable1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new PageEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JComboBox chambreCombo;
    private javax.swing.JButton chercher;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox clientCombo;
    private javax.swing.JTextField idR;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateD;
    private com.toedter.calendar.JDateChooser jDateF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifier;
    private javax.swing.JTable reservationTable;
    private javax.swing.JTable reservationTable1;
    private javax.swing.JButton supp;
    // End of variables declaration//GEN-END:variables

}
