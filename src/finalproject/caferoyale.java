/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;
import java.sql.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
 import java.util.Date;

/**
 *
 * @author Chelito Guanco
 */
public class caferoyale extends javax.swing.JFrame {

    /**
     * Creates new form CafeRoyale
     */
    public caferoyale() {
        initComponents();
        

    }
DefaultTableModel model = new DefaultTableModel();
   Connection con;
   PreparedStatement ps1;
   PreparedStatement ps2;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PCB1 = new javax.swing.JCheckBox();
        PCB2 = new javax.swing.JCheckBox();
        PCB3 = new javax.swing.JCheckBox();
        CHEESERB1 = new javax.swing.JRadioButton();
        CHEESERB2 = new javax.swing.JRadioButton();
        CHEESERB3 = new javax.swing.JRadioButton();
        CHEESEQTY = new javax.swing.JSpinner();
        DONUTRB3 = new javax.swing.JRadioButton();
        DONUTRB2 = new javax.swing.JRadioButton();
        DONUTRB1 = new javax.swing.JRadioButton();
        BAGELRB3 = new javax.swing.JRadioButton();
        BAGELRB2 = new javax.swing.JRadioButton();
        BAGELRB1 = new javax.swing.JRadioButton();
        DONUTQTY = new javax.swing.JSpinner();
        BAGELQTY = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CBHC1 = new javax.swing.JCheckBox();
        HCCB2 = new javax.swing.JCheckBox();
        HCCB3 = new javax.swing.JCheckBox();
        CARAMELRB1 = new javax.swing.JRadioButton();
        CARAMELRB2 = new javax.swing.JRadioButton();
        CARAMELRB3 = new javax.swing.JRadioButton();
        CARAMELQTY = new javax.swing.JSpinner();
        IRISHRB1 = new javax.swing.JRadioButton();
        IRISHRB2 = new javax.swing.JRadioButton();
        IRISHRB3 = new javax.swing.JRadioButton();
        IRISHQTY = new javax.swing.JSpinner();
        SKINNYRB1 = new javax.swing.JRadioButton();
        SKINNYRB2 = new javax.swing.JRadioButton();
        SKINNYRB3 = new javax.swing.JRadioButton();
        SKINNYQTY = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        CCCB1 = new javax.swing.JCheckBox();
        CCCB2 = new javax.swing.JCheckBox();
        CCCB3 = new javax.swing.JCheckBox();
        ICEDLRB1 = new javax.swing.JRadioButton();
        ICEDLRB2 = new javax.swing.JRadioButton();
        ICEDLRB3 = new javax.swing.JRadioButton();
        ICEDLQTY = new javax.swing.JSpinner();
        FRAPRB1 = new javax.swing.JRadioButton();
        FRAPRB2 = new javax.swing.JRadioButton();
        FRAPRB3 = new javax.swing.JRadioButton();
        FRAPQTY = new javax.swing.JSpinner();
        ICEDCRB1 = new javax.swing.JRadioButton();
        ICEDCRB2 = new javax.swing.JRadioButton();
        ICEDCRB3 = new javax.swing.JRadioButton();
        ICEDCQTY = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ORDERTABLE = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        ECB1 = new javax.swing.JCheckBox();
        ECB2 = new javax.swing.JCheckBox();
        ECB3 = new javax.swing.JCheckBox();
        CAFELRB1 = new javax.swing.JRadioButton();
        CAFELRB2 = new javax.swing.JRadioButton();
        CAFELRB3 = new javax.swing.JRadioButton();
        CAFELQTY = new javax.swing.JSpinner();
        CAPPRB1 = new javax.swing.JRadioButton();
        CAPPRB2 = new javax.swing.JRadioButton();
        CAPPRB3 = new javax.swing.JRadioButton();
        CAPPQTY = new javax.swing.JSpinner();
        CAFEARB1 = new javax.swing.JRadioButton();
        CAFEARB2 = new javax.swing.JRadioButton();
        CAFEARB3 = new javax.swing.JRadioButton();
        CAFEAQTY = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        TotalBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        TotalText = new javax.swing.JTextField();
        DiscountText = new javax.swing.JTextField();
        PayText = new javax.swing.JTextField();
        ChangeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PayBtn = new javax.swing.JButton();
        DiscountBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ReceiptBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        DateText = new com.toedter.calendar.JDateChooser();
        ConfirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe Royale");
        setBackground(new java.awt.Color(176, 155, 113));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 52, 52));
        jPanel1.setForeground(new java.awt.Color(237, 223, 179));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(54, 52, 52));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 217, 198));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Café Royale");

        jPanel2.setBackground(new java.awt.Color(176, 155, 113));
        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(new java.awt.Dimension(1270, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel3.setBackground(new java.awt.Color(227, 217, 198));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pastries", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(54, 52, 52))); // NOI18N

        PCB1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        PCB1.setForeground(new java.awt.Color(54, 52, 52));
        PCB1.setText("Cheese Cake");

        PCB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        PCB2.setForeground(new java.awt.Color(54, 52, 52));
        PCB2.setText("Doughnut");

        PCB3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        PCB3.setForeground(new java.awt.Color(54, 52, 52));
        PCB3.setText("Bagel");

        buttonGroup10.add(CHEESERB1);
        CHEESERB1.setForeground(new java.awt.Color(54, 52, 52));
        CHEESERB1.setText("₱ 95");

        buttonGroup10.add(CHEESERB2);
        CHEESERB2.setForeground(new java.awt.Color(54, 52, 52));
        CHEESERB2.setText("₱ 550");

        buttonGroup10.add(CHEESERB3);
        CHEESERB3.setForeground(new java.awt.Color(54, 52, 52));
        CHEESERB3.setText("₱ 1100");

        CHEESEQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup11.add(DONUTRB3);
        DONUTRB3.setForeground(new java.awt.Color(54, 52, 52));
        DONUTRB3.setText("₱ 600");

        buttonGroup11.add(DONUTRB2);
        DONUTRB2.setForeground(new java.awt.Color(54, 52, 52));
        DONUTRB2.setText("₱ 300");

        buttonGroup11.add(DONUTRB1);
        DONUTRB1.setForeground(new java.awt.Color(54, 52, 52));
        DONUTRB1.setText("₱ 50");

        buttonGroup12.add(BAGELRB3);
        BAGELRB3.setForeground(new java.awt.Color(54, 52, 52));
        BAGELRB3.setText("₱ 1000");

        buttonGroup12.add(BAGELRB2);
        BAGELRB2.setForeground(new java.awt.Color(54, 52, 52));
        BAGELRB2.setText("₱ 500");

        buttonGroup12.add(BAGELRB1);
        BAGELRB1.setForeground(new java.awt.Color(54, 52, 52));
        BAGELRB1.setText("₱ 70");

        DONUTQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        BAGELQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(54, 52, 52));
        jLabel15.setText("Per pc.");

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(54, 52, 52));
        jLabel16.setText("Half/Half Dozen");

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(54, 52, 52));
        jLabel17.setText("Whole/Dozen");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PCB1)
                            .addComponent(PCB2)
                            .addComponent(PCB3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DONUTRB1)
                            .addComponent(BAGELRB1)
                            .addComponent(CHEESERB1)))
                    .addComponent(jLabel15))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DONUTRB2)
                            .addComponent(CHEESERB2)
                            .addComponent(BAGELRB2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DONUTRB3)
                            .addComponent(CHEESERB3)
                            .addComponent(BAGELRB3))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CHEESEQTY, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(DONUTQTY)
                    .addComponent(BAGELQTY))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCB1)
                    .addComponent(CHEESEQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHEESERB1)
                    .addComponent(CHEESERB2)
                    .addComponent(CHEESERB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCB2)
                    .addComponent(DONUTRB1)
                    .addComponent(DONUTRB2)
                    .addComponent(DONUTRB3)
                    .addComponent(DONUTQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PCB3)
                    .addComponent(BAGELRB1)
                    .addComponent(BAGELRB2)
                    .addComponent(BAGELRB3)
                    .addComponent(BAGELQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(227, 217, 198));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Hot Coffee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(54, 52, 52))); // NOI18N

        CBHC1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        CBHC1.setForeground(new java.awt.Color(54, 52, 52));
        CBHC1.setText("Caramel Macchiato");

        HCCB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        HCCB2.setForeground(new java.awt.Color(54, 52, 52));
        HCCB2.setText("Irish Coffee");

        HCCB3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        HCCB3.setForeground(new java.awt.Color(54, 52, 52));
        HCCB3.setText("Skinny Mocha");

        buttonGroup1.add(CARAMELRB1);
        CARAMELRB1.setForeground(new java.awt.Color(54, 52, 52));
        CARAMELRB1.setText("₱ 85");

        buttonGroup1.add(CARAMELRB2);
        CARAMELRB2.setForeground(new java.awt.Color(54, 52, 52));
        CARAMELRB2.setText("₱  110");

        buttonGroup1.add(CARAMELRB3);
        CARAMELRB3.setForeground(new java.awt.Color(54, 52, 52));
        CARAMELRB3.setText("₱ 140");

        CARAMELQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup2.add(IRISHRB1);
        IRISHRB1.setForeground(new java.awt.Color(54, 52, 52));
        IRISHRB1.setText("₱ 85");

        buttonGroup2.add(IRISHRB2);
        IRISHRB2.setForeground(new java.awt.Color(54, 52, 52));
        IRISHRB2.setText("₱  110");

        buttonGroup2.add(IRISHRB3);
        IRISHRB3.setForeground(new java.awt.Color(54, 52, 52));
        IRISHRB3.setText("₱ 140");

        IRISHQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup3.add(SKINNYRB1);
        SKINNYRB1.setForeground(new java.awt.Color(54, 52, 52));
        SKINNYRB1.setText("₱ 85");

        buttonGroup3.add(SKINNYRB2);
        SKINNYRB2.setForeground(new java.awt.Color(54, 52, 52));
        SKINNYRB2.setText("₱  110");

        buttonGroup3.add(SKINNYRB3);
        SKINNYRB3.setForeground(new java.awt.Color(54, 52, 52));
        SKINNYRB3.setText("₱ 140");

        SKINNYQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 52, 52));
        jLabel6.setText("Small");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 52, 52));
        jLabel7.setText("Medium");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 52, 52));
        jLabel8.setText("Large");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HCCB3)
                    .addComponent(HCCB2)
                    .addComponent(CBHC1))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(CARAMELRB1)
                        .addGap(27, 27, 27)
                        .addComponent(CARAMELRB2)
                        .addGap(30, 30, 30)
                        .addComponent(CARAMELRB3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(IRISHRB1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IRISHRB2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(SKINNYRB1)
                                .addGap(27, 27, 27)
                                .addComponent(SKINNYRB2)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IRISHRB3)
                            .addComponent(SKINNYRB3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IRISHQTY, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CARAMELQTY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(SKINNYQTY)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CBHC1)
                .addGap(12, 12, 12)
                .addComponent(HCCB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HCCB3)
                    .addComponent(SKINNYRB1)
                    .addComponent(SKINNYRB2)
                    .addComponent(SKINNYRB3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CARAMELQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CARAMELRB1)
                    .addComponent(CARAMELRB2)
                    .addComponent(CARAMELRB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IRISHQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IRISHRB1)
                    .addComponent(IRISHRB2)
                    .addComponent(IRISHRB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SKINNYQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(227, 217, 198));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cold Coffee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(54, 52, 52))); // NOI18N

        CCCB1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        CCCB1.setForeground(new java.awt.Color(54, 52, 52));
        CCCB1.setText("Iced Latte");

        CCCB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        CCCB2.setForeground(new java.awt.Color(54, 52, 52));
        CCCB2.setText("Frappuccino");

        CCCB3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        CCCB3.setForeground(new java.awt.Color(54, 52, 52));
        CCCB3.setText("Iced Coffee");

        buttonGroup4.add(ICEDLRB1);
        ICEDLRB1.setForeground(new java.awt.Color(54, 52, 52));
        ICEDLRB1.setText("₱ 95");

        buttonGroup4.add(ICEDLRB2);
        ICEDLRB2.setForeground(new java.awt.Color(54, 52, 52));
        ICEDLRB2.setText("₱ 125");

        buttonGroup4.add(ICEDLRB3);
        ICEDLRB3.setForeground(new java.awt.Color(54, 52, 52));
        ICEDLRB3.setText("₱ 150");

        ICEDLQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup5.add(FRAPRB1);
        FRAPRB1.setForeground(new java.awt.Color(54, 52, 52));
        FRAPRB1.setText("₱ 95");

        buttonGroup5.add(FRAPRB2);
        FRAPRB2.setForeground(new java.awt.Color(54, 52, 52));
        FRAPRB2.setText("₱ 125");

        buttonGroup5.add(FRAPRB3);
        FRAPRB3.setForeground(new java.awt.Color(54, 52, 52));
        FRAPRB3.setText("₱ 150");

        FRAPQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup6.add(ICEDCRB1);
        ICEDCRB1.setForeground(new java.awt.Color(54, 52, 52));
        ICEDCRB1.setText("₱ 95");

        buttonGroup6.add(ICEDCRB2);
        ICEDCRB2.setForeground(new java.awt.Color(54, 52, 52));
        ICEDCRB2.setText("₱ 125");

        buttonGroup6.add(ICEDCRB3);
        ICEDCRB3.setForeground(new java.awt.Color(54, 52, 52));
        ICEDCRB3.setText("₱ 150");

        ICEDCQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(54, 52, 52));
        jLabel9.setText("Small");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(54, 52, 52));
        jLabel10.setText("Medium");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(54, 52, 52));
        jLabel11.setText("Large");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CCCB3)
                                .addGap(75, 75, 75)
                                .addComponent(ICEDCRB1)
                                .addGap(30, 30, 30)
                                .addComponent(ICEDCRB2)
                                .addGap(30, 30, 30)
                                .addComponent(ICEDCRB3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CCCB2)
                                .addGap(66, 66, 66)
                                .addComponent(FRAPRB1)
                                .addGap(30, 30, 30)
                                .addComponent(FRAPRB2)
                                .addGap(30, 30, 30)
                                .addComponent(FRAPRB3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(CCCB1)
                                .addGap(77, 77, 77)
                                .addComponent(ICEDLRB1))
                            .addComponent(jLabel9))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ICEDLRB2)
                                .addGap(30, 30, 30)
                                .addComponent(ICEDLRB3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel10)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(ICEDLQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FRAPQTY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICEDCQTY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICEDLRB1)
                    .addComponent(ICEDLRB2)
                    .addComponent(ICEDLRB3)
                    .addComponent(ICEDLQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FRAPRB1)
                    .addComponent(FRAPRB2)
                    .addComponent(FRAPRB3)
                    .addComponent(FRAPQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCB2))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCCB3)
                    .addComponent(ICEDCRB1)
                    .addComponent(ICEDCRB2)
                    .addComponent(ICEDCRB3)
                    .addComponent(ICEDCQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ORDERTABLE.setBackground(new java.awt.Color(227, 217, 198));
        ORDERTABLE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ORDERTABLE.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ORDERTABLE.setForeground(new java.awt.Color(54, 52, 52));
        ORDERTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "quantity", "item", "price", "total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ORDERTABLE);

        jPanel8.setBackground(new java.awt.Color(227, 217, 198));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Espresso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(54, 52, 52))); // NOI18N

        ECB1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        ECB1.setForeground(new java.awt.Color(54, 52, 52));
        ECB1.setText("Cafe Latte");

        ECB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        ECB2.setForeground(new java.awt.Color(54, 52, 52));
        ECB2.setText("Cappuccino");

        ECB3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 15)); // NOI18N
        ECB3.setForeground(new java.awt.Color(54, 52, 52));
        ECB3.setText("Cafe Americano");

        buttonGroup7.add(CAFELRB1);
        CAFELRB1.setForeground(new java.awt.Color(54, 52, 52));
        CAFELRB1.setText("₱  95");

        buttonGroup7.add(CAFELRB2);
        CAFELRB2.setForeground(new java.awt.Color(54, 52, 52));
        CAFELRB2.setText("₱  110");

        buttonGroup7.add(CAFELRB3);
        CAFELRB3.setForeground(new java.awt.Color(54, 52, 52));
        CAFELRB3.setText("₱ 140");

        CAFELQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup8.add(CAPPRB1);
        CAPPRB1.setForeground(new java.awt.Color(54, 52, 52));
        CAPPRB1.setText("₱  95");

        buttonGroup8.add(CAPPRB2);
        CAPPRB2.setForeground(new java.awt.Color(54, 52, 52));
        CAPPRB2.setText("₱  110");

        buttonGroup8.add(CAPPRB3);
        CAPPRB3.setForeground(new java.awt.Color(54, 52, 52));
        CAPPRB3.setText("₱ 140");

        CAPPQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        buttonGroup9.add(CAFEARB1);
        CAFEARB1.setForeground(new java.awt.Color(54, 52, 52));
        CAFEARB1.setText("₱  95");

        buttonGroup9.add(CAFEARB2);
        CAFEARB2.setForeground(new java.awt.Color(54, 52, 52));
        CAFEARB2.setText("₱  110");

        buttonGroup9.add(CAFEARB3);
        CAFEARB3.setForeground(new java.awt.Color(54, 52, 52));
        CAFEARB3.setText("₱ 140");

        CAFEAQTY.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(54, 52, 52));
        jLabel12.setText("Small");

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(54, 52, 52));
        jLabel13.setText("Medium");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(54, 52, 52));
        jLabel14.setText("Large");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ECB1)
                                .addGap(75, 75, 75)
                                .addComponent(CAFELRB1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(11, 11, 11)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CAFELRB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(CAFELRB3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(CAFELQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ECB2)
                                .addGap(71, 71, 71)
                                .addComponent(CAPPRB1)
                                .addGap(30, 30, 30)
                                .addComponent(CAPPRB2)
                                .addGap(27, 27, 27)
                                .addComponent(CAPPRB3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ECB3)
                                .addGap(47, 47, 47)
                                .addComponent(CAFEARB1)
                                .addGap(30, 30, 30)
                                .addComponent(CAFEARB2)
                                .addGap(27, 27, 27)
                                .addComponent(CAFEARB3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CAPPQTY, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(CAFEAQTY)))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECB1)
                    .addComponent(CAFELRB1)
                    .addComponent(CAFELRB2)
                    .addComponent(CAFELRB3)
                    .addComponent(CAFELQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECB2)
                    .addComponent(CAPPRB1)
                    .addComponent(CAPPRB2)
                    .addComponent(CAPPRB3)
                    .addComponent(CAPPQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECB3)
                    .addComponent(CAFEARB1)
                    .addComponent(CAFEARB2)
                    .addComponent(CAFEARB3)
                    .addComponent(CAFEAQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ClearBtn.setBackground(new java.awt.Color(54, 52, 52));
        ClearBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(237, 223, 179));
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(54, 52, 52));
        AddBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(237, 223, 179));
        AddBtn.setText("Add Order");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        TotalBtn.setBackground(new java.awt.Color(54, 52, 52));
        TotalBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TotalBtn.setForeground(new java.awt.Color(237, 223, 179));
        TotalBtn.setText("Total Order");
        TotalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(54, 52, 52));
        DeleteBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(237, 223, 179));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(54, 52, 52));
        ResetBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(237, 223, 179));
        ResetBtn.setText("Reset All");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(227, 217, 198));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20), new java.awt.Color(54, 52, 52))); // NOI18N

        TotalText.setText("0");
        TotalText.setEnabled(false);

        DiscountText.setText("0");
        DiscountText.setEnabled(false);

        PayText.setText("0");

        ChangeText.setText("0");
        ChangeText.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 52, 52));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Amount");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 52, 52));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Discount");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 52, 52));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Payment");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 52, 52));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Change");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(DiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(PayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(113, 113, 113))
        );

        PayBtn.setBackground(new java.awt.Color(54, 52, 52));
        PayBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        PayBtn.setForeground(new java.awt.Color(237, 223, 179));
        PayBtn.setText("Pay");
        PayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBtnActionPerformed(evt);
            }
        });

        DiscountBtn.setBackground(new java.awt.Color(54, 52, 52));
        DiscountBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DiscountBtn.setForeground(new java.awt.Color(237, 223, 179));
        DiscountBtn.setText("Discount");
        DiscountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountBtnActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(227, 217, 198));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(54, 52, 52));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Café Royale");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/coffee.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(12, 12, 12))
        );

        ReceiptBtn.setBackground(new java.awt.Color(54, 52, 52));
        ReceiptBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ReceiptBtn.setForeground(new java.awt.Color(237, 223, 179));
        ReceiptBtn.setText("Generate Receipt");
        ReceiptBtn.setEnabled(false);
        ReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptBtnActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(227, 217, 198));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(54, 52, 52));
        jLabel20.setText("Name:");

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(54, 52, 52));
        jLabel21.setText("Date:");

        DateText.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameText)
                    .addComponent(DateText, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(DateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        ConfirmBtn.setBackground(new java.awt.Color(54, 52, 52));
        ConfirmBtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ConfirmBtn.setForeground(new java.awt.Color(237, 223, 179));
        ConfirmBtn.setText("Confirm");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(DiscountBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ReceiptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBtn)
                    .addComponent(AddBtn)
                    .addComponent(TotalBtn)
                    .addComponent(DeleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiscountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        // TODO add your handling code here:
        if(NameText.getText().isEmpty() && DateText.getDate() == null ){
            JOptionPane.showMessageDialog(null,"Empty name and date.","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            ReceiptBtn.setEnabled(true);
        }
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void ReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBtnActionPerformed

        sales();
    }//GEN-LAST:event_ReceiptBtnActionPerformed

    private void DiscountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountBtnActionPerformed
        int discountresult = JOptionPane.showConfirmDialog(this,"Avail Senior/PWD Discount?", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        double dis;
        double total =Double.parseDouble(TotalText.getText());
        double tot;
        if (discountresult ==JOptionPane.YES_OPTION ){
            int cusidnum = Integer.parseInt(JOptionPane.showInputDialog(" Enter your ID Number: "));
            dis = (double) (total *.20);
            tot= total - dis;
            TotalText.setText(String.valueOf(tot));
            JOptionPane.showMessageDialog(this, "Applied Successfully.");
            DiscountText.setText(String.valueOf(dis));

        }
        else{
            remove(discountresult);
        }

    }//GEN-LAST:event_DiscountBtnActionPerformed

    private void PayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBtnActionPerformed
        double total = Double.parseDouble(TotalText.getText());
        double payment = Double.parseDouble(PayText.getText());

        double change = payment - total;
        if (payment >= total){
            ChangeText.setText(String.valueOf(change));
            JOptionPane.showMessageDialog(this, "Payment Succesful. Please enter your name and date today.");
        }
        else if (payment != total){
            JOptionPane.showMessageDialog(null,"NOT ENOUGH MONEY PAID AMOUNT DUE           PHP " + total ,"Alert",JOptionPane.WARNING_MESSAGE);
            PayText.setText("");

        }
    }//GEN-LAST:event_PayBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        //CARAMEL MACCHIATO
        CBHC1.setSelected(false);
        buttonGroup1.clearSelection();
        CARAMELQTY.setValue(0);
        //IRISH COFFEE
        HCCB2.setSelected(false);
        buttonGroup2.clearSelection();
        IRISHQTY.setValue(0);
        //SKINNY MOCHA
        HCCB3.setSelected(false);
        buttonGroup3.clearSelection();
        SKINNYQTY.setValue(0);
        //ICED LATTE
        CCCB1.setSelected(false);
        buttonGroup4.clearSelection();
        CARAMELQTY.setValue(0);
        //FRAPPUCCINO
        CCCB2.setSelected(false);
        buttonGroup5.clearSelection();
        FRAPQTY.setValue(0);
        //ICED COFFEE
        CCCB3.setSelected(false);
        buttonGroup6.clearSelection();
        ICEDCQTY.setValue(0);
        //CAFE LATTE
        ECB1.setSelected(false);
        buttonGroup7.clearSelection();
        CAFELQTY.setValue(0);
        //CAPPUCCINO
        ECB2.setSelected(false);
        buttonGroup8.clearSelection();
        CAPPQTY.setValue(0);
        //CAFE AMERICANO
        ECB3.setSelected(false);
        buttonGroup9.clearSelection();
        CAFEAQTY.setValue(0);
        //CHEESE CAKE
        PCB1.setSelected(false);
        buttonGroup10.clearSelection();
        CHEESEQTY.setValue(0);
        //DOUGHNUT
        PCB2.setSelected(false);
        buttonGroup11.clearSelection();
        DONUTQTY.setValue(0);
        //BAGEL
        PCB3.setSelected(false);
        buttonGroup12.clearSelection();
        BAGELQTY.setValue(0);

        //ADD ORDER TABLE
        model.setNumRows(0);

        //PAYMENT SECTION
        TotalText.setText("0");
        PayText.setText("0");
        ChangeText.setText("0");
        DiscountText.setText("0");
        //RECEIPT
        ReceiptBtn.setEnabled(false);
        NameText.setText("");
        DateText.setCalendar(null);
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(ORDERTABLE.getSelectedRowCount() ==1) {

            model.removeRow (ORDERTABLE.getSelectedRow());
        }else{
            if(ORDERTABLE.getRowCount() ==0){

                JOptionPane.showMessageDialog(this, "Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Please select Single Row For Delete.");
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void TotalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBtnActionPerformed
        int sum = 0;
        for(int i = 0; i < ORDERTABLE.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(ORDERTABLE.getValueAt(i, 3).toString());
        }

        TotalText.setText(Integer.toString(sum));

    }//GEN-LAST:event_TotalBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        int price = 0, total, qty;
        //HOT COFFEE
        //CARAMEL MACCHIATO
        if(CBHC1.isSelected()) {
            String CARAMELMACCHIATO = CBHC1.getText();

            //SMALL
            if(CARAMELRB1.isSelected()){
                price = 85;
                qty = Integer.parseInt(CARAMELQTY.getValue().toString());
                total = price * qty;
                model = (DefaultTableModel)ORDERTABLE.getModel();

                if("0".equals(CARAMELQTY.getValue().toString())){
                    JOptionPane.showMessageDialog(null, " PLEASE ADD QUANTITY ");
                }
                else{
                    model.addRow(new Object[]
                        {
                            qty,CARAMELMACCHIATO,price,total
                        });
                    }

                }
                //MEDIUM
                else if(CARAMELRB2.isSelected()){
                    price = 110;
                    qty = Integer.parseInt(CARAMELQTY.getValue().toString());
                    total = price * qty;
                    model = (DefaultTableModel)ORDERTABLE.getModel();

                    if("0".equals(CARAMELQTY.getValue().toString())){
                        JOptionPane.showMessageDialog(null, " PLEASE ADD QUANTITY ");
                    }
                    else{
                        model.addRow(new Object[]
                            {
                                qty,CARAMELMACCHIATO,price,total
                            });
                        }
                    }
                    //LARGE
                    else if(CARAMELRB3.isSelected()){
                        price = 140;
                        qty = Integer.parseInt(CARAMELQTY.getValue().toString());
                        total = price * qty;
                        model = (DefaultTableModel)ORDERTABLE.getModel();

                        if("0".equals(CARAMELQTY.getValue().toString())){
                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                        }
                        else{
                            model.addRow(new Object[]
                                {
                                    qty,CARAMELMACCHIATO,price,total
                                });
                            }
                        }
                        else
                        JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                    }

                    //IRISH COFFEE
                    if(HCCB2.isSelected()) {
                        String IRISHCOFFEE = HCCB2.getText();

                        //SMALL
                        if(IRISHRB1.isSelected()){
                            price = 85;
                            qty = Integer.parseInt(IRISHQTY.getValue().toString());
                            total = price * qty;
                            model = (DefaultTableModel)ORDERTABLE.getModel();

                            if("0".equals(IRISHQTY.getValue().toString())){
                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                            }
                            else{
                                model.addRow(new Object[]
                                    {
                                        qty,IRISHCOFFEE,price,total
                                    });
                                }

                            }
                            //MEDIUM
                            else if(IRISHRB2.isSelected()){
                                price = 110;
                                qty = Integer.parseInt(IRISHQTY.getValue().toString());
                                total = price * qty;
                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                if("0".equals(IRISHQTY.getValue().toString())){
                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                }
                                else{
                                    model.addRow(new Object[]
                                        {
                                            qty,IRISHCOFFEE,price,total
                                        });
                                    }
                                }
                                //LARGE
                                else if(IRISHRB3.isSelected()){
                                    price = 140;
                                    qty = Integer.parseInt(IRISHQTY.getValue().toString());
                                    total = price * qty;
                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                    if("0".equals(IRISHQTY.getValue().toString())){
                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                    }
                                    else{
                                        model.addRow(new Object[]
                                            {
                                                qty,IRISHCOFFEE,price,total
                                            });
                                        }
                                    }
                                    else
                                    JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                }
                                //SKINNY MOCHA
                                if(HCCB3.isSelected()) {
                                    String SKINNYMOCHA = HCCB3.getText();

                                    //SMALL
                                    if(SKINNYRB1.isSelected()){
                                        price = 85;
                                        qty = Integer.parseInt(SKINNYQTY.getValue().toString());
                                        total = price * qty;
                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                        if("0".equals(SKINNYQTY.getValue().toString())){
                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                        }
                                        else{
                                            model.addRow(new Object[]
                                                {
                                                    qty,SKINNYMOCHA,price,total
                                                });
                                            }

                                        }
                                        //MEDIUM
                                        else if(SKINNYRB2.isSelected()){
                                            price = 110;
                                            qty = Integer.parseInt(SKINNYQTY.getValue().toString());
                                            total = price * qty;
                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                            if("0".equals(SKINNYQTY.getValue().toString())){
                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                            }
                                            else{
                                                model.addRow(new Object[]
                                                    {
                                                        qty,SKINNYMOCHA,price,total
                                                    });
                                                }
                                            }
                                            //LARGE
                                            else if(SKINNYRB3.isSelected()){
                                                price = 140;
                                                qty = Integer.parseInt(SKINNYQTY.getValue().toString());
                                                total = price * qty;
                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                if("0".equals(SKINNYQTY.getValue().toString())){
                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                }
                                                else{
                                                    model.addRow(new Object[]
                                                        {
                                                            qty,SKINNYMOCHA,price,total
                                                        });
                                                    }
                                                }
                                                else
                                                JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                            }
                                            //COLD COFFEE
                                            //ICED LATTE
                                            if(CCCB1.isSelected()) {
                                                String ICEDLATTE = CCCB1.getText();

                                                //SMALL
                                                if(ICEDLRB1.isSelected()){
                                                    price = 95;
                                                    qty = Integer.parseInt(ICEDLQTY.getValue().toString());
                                                    total = price * qty;
                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                    if("0".equals(ICEDLQTY.getValue().toString())){
                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                    }
                                                    else{
                                                        model.addRow(new Object[]
                                                            {
                                                                qty,ICEDLATTE,price,total
                                                            });
                                                        }

                                                    }
                                                    //MEDIUM
                                                    else if(ICEDLRB2.isSelected()){
                                                        price = 125;
                                                        qty = Integer.parseInt(ICEDLQTY.getValue().toString());
                                                        total = price * qty;
                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                        if("0".equals(ICEDLQTY.getValue().toString())){
                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                        }
                                                        else{
                                                            model.addRow(new Object[]
                                                                {
                                                                    qty,ICEDLATTE,price,total
                                                                });
                                                            }
                                                        }
                                                        //LARGE
                                                        else if(ICEDLRB3.isSelected()){
                                                            price = 150;
                                                            qty = Integer.parseInt(ICEDLQTY.getValue().toString());
                                                            total = price * qty;
                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                            if("0".equals(ICEDLQTY.getValue().toString())){
                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                            }
                                                            else{
                                                                model.addRow(new Object[]
                                                                    {
                                                                        qty,ICEDLATTE,price,total
                                                                    });
                                                                }
                                                            }
                                                            else
                                                            JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                        }
                                                        //FRAPPUCCINO
                                                        if(CCCB2.isSelected()) {
                                                            String FRAPPUCCINO = CCCB2.getText();

                                                            //SMALL
                                                            if(FRAPRB1.isSelected()){
                                                                price = 95;
                                                                qty = Integer.parseInt(FRAPQTY.getValue().toString());
                                                                total = price * qty;
                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                if("0".equals(FRAPQTY.getValue().toString())){
                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                }
                                                                else{
                                                                    model.addRow(new Object[]
                                                                        {
                                                                            qty,FRAPPUCCINO,price,total
                                                                        });
                                                                    }

                                                                }
                                                                //MEDIUM
                                                                else if(FRAPRB2.isSelected()){
                                                                    price = 125;
                                                                    qty = Integer.parseInt(FRAPQTY.getValue().toString());
                                                                    total = price * qty;
                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                    if("0".equals(FRAPQTY.getValue().toString())){
                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                    }
                                                                    else{
                                                                        model.addRow(new Object[]
                                                                            {
                                                                                qty,FRAPPUCCINO,price,total
                                                                            });
                                                                        }
                                                                    }
                                                                    //LARGE
                                                                    else if(FRAPRB3.isSelected()){
                                                                        price = 150;
                                                                        qty = Integer.parseInt(FRAPQTY.getValue().toString());
                                                                        total = price * qty;
                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                        if("0".equals(FRAPQTY.getValue().toString())){
                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                        }
                                                                        else{
                                                                            model.addRow(new Object[]
                                                                                {
                                                                                    qty,FRAPPUCCINO,price,total
                                                                                });
                                                                            }
                                                                        }
                                                                        else
                                                                        JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                    }
                                                                    //ICED COFFEE
                                                                    if(CCCB3.isSelected()) {
                                                                        String ICEDCOFFEE = CCCB3.getText();

                                                                        //SMALL
                                                                        if(ICEDCRB1.isSelected()){
                                                                            price = 95;
                                                                            qty = Integer.parseInt(ICEDCQTY.getValue().toString());
                                                                            total = price * qty;
                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                            if("0".equals(ICEDCQTY.getValue().toString())){
                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                            }
                                                                            else{
                                                                                model.addRow(new Object[]
                                                                                    {
                                                                                        qty,ICEDCOFFEE,price,total
                                                                                    });
                                                                                }

                                                                            }
                                                                            //MEDIUM
                                                                            else if(ICEDCRB2.isSelected()){
                                                                                price = 125;
                                                                                qty = Integer.parseInt(ICEDCQTY.getValue().toString());
                                                                                total = price * qty;
                                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                if("0".equals(ICEDCQTY.getValue().toString())){
                                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                }
                                                                                else{
                                                                                    model.addRow(new Object[]
                                                                                        {
                                                                                            qty,ICEDCOFFEE,price,total
                                                                                        });
                                                                                    }
                                                                                }
                                                                                //LARGE
                                                                                else if(ICEDCRB3.isSelected()){
                                                                                    price = 150;
                                                                                    qty = Integer.parseInt(ICEDCQTY.getValue().toString());
                                                                                    total = price * qty;
                                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                    if("0".equals(ICEDCQTY.getValue().toString())){
                                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                    }
                                                                                    else{
                                                                                        model.addRow(new Object[]
                                                                                            {
                                                                                                qty,ICEDCOFFEE,price,total
                                                                                            });
                                                                                        }
                                                                                    }
                                                                                    else
                                                                                    JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                }

                                                                                //ESPRESSO
                                                                                //CAFE LATTE
                                                                                if(ECB1.isSelected()) {
                                                                                    String CAFELATTE = ECB1.getText();

                                                                                    //SMALL
                                                                                    if(CAFELRB1.isSelected()){
                                                                                        price = 95;
                                                                                        qty = Integer.parseInt(CAFELQTY.getValue().toString());
                                                                                        total = price * qty;
                                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                        if("0".equals(CAFELQTY.getValue().toString())){
                                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                        }
                                                                                        else{
                                                                                            model.addRow(new Object[]
                                                                                                {
                                                                                                    qty,CAFELATTE,price,total
                                                                                                });
                                                                                            }

                                                                                        }
                                                                                        //MEDIUM
                                                                                        else if(CAFELRB2.isSelected()){
                                                                                            price = 110;
                                                                                            qty = Integer.parseInt(CAFELQTY.getValue().toString());
                                                                                            total = price * qty;
                                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                            if("0".equals(CAFELQTY.getValue().toString())){
                                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                            }
                                                                                            else{
                                                                                                model.addRow(new Object[]
                                                                                                    {
                                                                                                        qty,CAFELATTE,price,total
                                                                                                    });
                                                                                                }
                                                                                            }
                                                                                            //LARGE
                                                                                            else if(CAFELRB3.isSelected()){
                                                                                                price = 140;
                                                                                                qty = Integer.parseInt(CAFELQTY.getValue().toString());
                                                                                                total = price * qty;
                                                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                if("0".equals(CAFELQTY.getValue().toString())){
                                                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                }
                                                                                                else{
                                                                                                    model.addRow(new Object[]
                                                                                                        {
                                                                                                            qty,CAFELATTE,price,total
                                                                                                        });
                                                                                                    }
                                                                                                }
                                                                                                else
                                                                                                JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                            }
                                                                                            //CAPPUCCINO
                                                                                            if(ECB2.isSelected()) {
                                                                                                String CAPPUCCINO = ECB2.getText();

                                                                                                //SMALL
                                                                                                if(CAPPRB1.isSelected()){
                                                                                                    price = 95;
                                                                                                    qty = Integer.parseInt(CAPPQTY.getValue().toString());
                                                                                                    total = price * qty;
                                                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                    if("0".equals(CAPPQTY.getValue().toString())){
                                                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                    }
                                                                                                    else{
                                                                                                        model.addRow(new Object[]
                                                                                                            {
                                                                                                                qty,CAPPUCCINO,price,total
                                                                                                            });
                                                                                                        }

                                                                                                    }
                                                                                                    //MEDIUM
                                                                                                    else if(CAPPRB2.isSelected()){
                                                                                                        price = 110;
                                                                                                        qty = Integer.parseInt(CAPPQTY.getValue().toString());
                                                                                                        total = price * qty;
                                                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                        if("0".equals(CAPPQTY.getValue().toString())){
                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                        }
                                                                                                        else{
                                                                                                            model.addRow(new Object[]
                                                                                                                {
                                                                                                                    qty,CAPPUCCINO,price,total
                                                                                                                });
                                                                                                            }
                                                                                                        }
                                                                                                        //LARGE
                                                                                                        else if(CAPPRB3.isSelected()){
                                                                                                            price = 140;
                                                                                                            qty = Integer.parseInt(CAPPQTY.getValue().toString());
                                                                                                            total = price * qty;
                                                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                            if("0".equals(CAPPQTY.getValue().toString())){
                                                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                            }
                                                                                                            else{
                                                                                                                model.addRow(new Object[]
                                                                                                                    {
                                                                                                                        qty,CAPPUCCINO,price,total
                                                                                                                    });
                                                                                                                }
                                                                                                            }
                                                                                                            else
                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");         }
                                                                                                        //CAFE AMERICANO
                                                                                                        if(ECB3.isSelected()) {
                                                                                                            String CAFEAMERICANO = ECB3.getText();

                                                                                                            //SMALL
                                                                                                            if(CAPPRB1.isSelected()){
                                                                                                                price = 95;
                                                                                                                qty = Integer.parseInt(CAFEAQTY.getValue().toString());
                                                                                                                total = price * qty;
                                                                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                if("0".equals(CAFEAQTY.getValue().toString())){
                                                                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                }
                                                                                                                else{
                                                                                                                    model.addRow(new Object[]
                                                                                                                        {
                                                                                                                            qty,CAFEAMERICANO,price,total
                                                                                                                        });
                                                                                                                    }

                                                                                                                }
                                                                                                                //MEDIUM
                                                                                                                else if(CAFEARB2.isSelected()){
                                                                                                                    price = 110;
                                                                                                                    qty = Integer.parseInt(CAFEAQTY.getValue().toString());
                                                                                                                    total = price * qty;
                                                                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                    if("0".equals(CAFEAQTY.getValue().toString())){
                                                                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                    }
                                                                                                                    else{
                                                                                                                        model.addRow(new Object[]
                                                                                                                            {
                                                                                                                                qty,CAFEAMERICANO,price,total
                                                                                                                            });
                                                                                                                        }
                                                                                                                    }
                                                                                                                    //LARGE
                                                                                                                    else if(CAFEARB3.isSelected()){
                                                                                                                        price = 140;
                                                                                                                        qty = Integer.parseInt(CAFEAQTY.getValue().toString());
                                                                                                                        total = price * qty;
                                                                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                        if("0".equals(CAFEAQTY.getValue().toString())){
                                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                        }
                                                                                                                        else{
                                                                                                                            model.addRow(new Object[]
                                                                                                                                {
                                                                                                                                    qty,CAFEAMERICANO,price,total
                                                                                                                                });
                                                                                                                            }
                                                                                                                        }
                                                                                                                        else
                                                                                                                        JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                                                    }
                                                                                                                    //PASTRIES
                                                                                                                    //CHEESECAKE
                                                                                                                    if(PCB1.isSelected()) {
                                                                                                                        String CHEESECAKE = PCB1.getText();

                                                                                                                        //PERPIECE
                                                                                                                        if(CHEESERB1.isSelected()){
                                                                                                                            price = 95;
                                                                                                                            qty = Integer.parseInt(CHEESEQTY.getValue().toString());
                                                                                                                            total = price * qty;
                                                                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                            if("0".equals(CHEESEQTY.getValue().toString())){
                                                                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                            }
                                                                                                                            else{
                                                                                                                                model.addRow(new Object[]
                                                                                                                                    {
                                                                                                                                        qty,CHEESECAKE,price,total
                                                                                                                                    });
                                                                                                                                }

                                                                                                                            }
                                                                                                                            //HALFDOZEN
                                                                                                                            else if(CHEESERB2.isSelected()){
                                                                                                                                price = 550;
                                                                                                                                qty = Integer.parseInt(CHEESEQTY.getValue().toString());
                                                                                                                                total = price * qty;
                                                                                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                if("0".equals(CHEESEQTY.getValue().toString())){
                                                                                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                }
                                                                                                                                else{
                                                                                                                                    model.addRow(new Object[]
                                                                                                                                        {
                                                                                                                                            qty,CHEESECAKE,price,total
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                //WHOLEDOZEN
                                                                                                                                else if(CHEESERB3.isSelected()){
                                                                                                                                    price = 1100;
                                                                                                                                    qty = Integer.parseInt(CHEESEQTY.getValue().toString());
                                                                                                                                    total = price * qty;
                                                                                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                    if("0".equals(CHEESEQTY.getValue().toString())){
                                                                                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                    }
                                                                                                                                    else{
                                                                                                                                        model.addRow(new Object[]
                                                                                                                                            {
                                                                                                                                                qty,CHEESECAKE,price,total
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                                                                }
                                                                                                                                //DOUGHNUT
                                                                                                                                if(PCB2.isSelected()) {
                                                                                                                                    String DOUGHNUT = PCB2.getText();

                                                                                                                                    //PERPIECE
                                                                                                                                    if(DONUTRB1.isSelected()){
                                                                                                                                        price = 50;
                                                                                                                                        qty = Integer.parseInt(DONUTQTY.getValue().toString());
                                                                                                                                        total = price * qty;
                                                                                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                        if("0".equals(DONUTQTY.getValue().toString())){
                                                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                        }
                                                                                                                                        else{
                                                                                                                                            model.addRow(new Object[]
                                                                                                                                                {
                                                                                                                                                    qty,DOUGHNUT,price,total
                                                                                                                                                });
                                                                                                                                            }

                                                                                                                                        }
                                                                                                                                        //HALFDOZEN
                                                                                                                                        else if(DONUTRB2.isSelected()){
                                                                                                                                            price = 300;
                                                                                                                                            qty = Integer.parseInt(DONUTQTY.getValue().toString());
                                                                                                                                            total = price * qty;
                                                                                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                            if("0".equals(DONUTQTY.getValue().toString())){
                                                                                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                            }
                                                                                                                                            else{
                                                                                                                                                model.addRow(new Object[]
                                                                                                                                                    {
                                                                                                                                                        qty,DOUGHNUT,price,total
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            //WHOLEDOZEN
                                                                                                                                            else if(DONUTRB3.isSelected()){
                                                                                                                                                price = 600;
                                                                                                                                                qty = Integer.parseInt(DONUTQTY.getValue().toString());
                                                                                                                                                total = price * qty;
                                                                                                                                                model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                                if("0".equals(DONUTQTY.getValue().toString())){
                                                                                                                                                    JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                                }
                                                                                                                                                else{
                                                                                                                                                    model.addRow(new Object[]
                                                                                                                                                        {
                                                                                                                                                            qty,DOUGHNUT,price,total
                                                                                                                                                        });
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                else
                                                                                                                                                JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                                                                            }
                                                                                                                                            //BAGEL
                                                                                                                                            if(PCB3.isSelected()) {
                                                                                                                                                String BAGEL = PCB3.getText();

                                                                                                                                                //PERPIECE
                                                                                                                                                if(BAGELRB1.isSelected()){
                                                                                                                                                    price = 50;
                                                                                                                                                    qty = Integer.parseInt(BAGELQTY.getValue().toString());
                                                                                                                                                    total = price * qty;
                                                                                                                                                    model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                                    if("0".equals(BAGELQTY.getValue().toString())){
                                                                                                                                                        JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                                    }
                                                                                                                                                    else{
                                                                                                                                                        model.addRow(new Object[]
                                                                                                                                                            {
                                                                                                                                                                qty,BAGEL,price,total
                                                                                                                                                            });
                                                                                                                                                        }

                                                                                                                                                    }
                                                                                                                                                    //HALFDOZEN
                                                                                                                                                    else if(BAGELRB2.isSelected()){
                                                                                                                                                        price = 300;
                                                                                                                                                        qty = Integer.parseInt(BAGELQTY.getValue().toString());
                                                                                                                                                        total = price * qty;
                                                                                                                                                        model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                                        if("0".equals(BAGELQTY.getValue().toString())){
                                                                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                                        }
                                                                                                                                                        else{
                                                                                                                                                            model.addRow(new Object[]
                                                                                                                                                                {
                                                                                                                                                                    qty,BAGEL,price,total
                                                                                                                                                                });
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        //WHOLEDOZEN
                                                                                                                                                        else if(BAGELRB3.isSelected()){
                                                                                                                                                            price = 600;
                                                                                                                                                            qty = Integer.parseInt(BAGELQTY.getValue().toString());
                                                                                                                                                            total = price * qty;
                                                                                                                                                            model = (DefaultTableModel)ORDERTABLE.getModel();

                                                                                                                                                            if("0".equals(BAGELQTY.getValue().toString())){
                                                                                                                                                                JOptionPane.showMessageDialog(null, "PLEASE ADD QUANTITY ");
                                                                                                                                                            }
                                                                                                                                                            else{
                                                                                                                                                                model.addRow(new Object[]
                                                                                                                                                                    {
                                                                                                                                                                        qty,BAGEL,price,total
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            JOptionPane.showMessageDialog(null, "PLEASE SELECT SIZE ");
                                                                                                                                                        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        //CARAMEL MACCHIATO
        CBHC1.setSelected(false);
        buttonGroup1.clearSelection();
        CARAMELQTY.setValue(0);
        //IRISH COFFEE
        HCCB2.setSelected(false);
        buttonGroup2.clearSelection();
        IRISHQTY.setValue(0);
        //SKINNY MOCHA
        HCCB3.setSelected(false);
        buttonGroup3.clearSelection();
        SKINNYQTY.setValue(0);
        //ICED LATTE
        CCCB1.setSelected(false);
        buttonGroup4.clearSelection();
        ICEDLQTY.setValue(0);
        //FRAPPUCCINO
        CCCB2.setSelected(false);
        buttonGroup5.clearSelection();
        FRAPQTY.setValue(0);
        //ICED COFFEE
        CCCB3.setSelected(false);
        buttonGroup6.clearSelection();
        ICEDCQTY.setValue(0);
        //CAFE LATTE
        ECB1.setSelected(false);
        buttonGroup7.clearSelection();
        CAFELQTY.setValue(0);
        //CAPPUCCINO
        ECB2.setSelected(false);
        buttonGroup8.clearSelection();
        CAPPQTY.setValue(0);
        //CAFE AMERICANO
        ECB3.setSelected(false);
        buttonGroup9.clearSelection();
        CAFEAQTY.setValue(0);
        //CHEESE CAKE
        PCB1.setSelected(false);
        buttonGroup10.clearSelection();
        CHEESEQTY.setValue(0);
        //DOUGHNUT
        PCB2.setSelected(false);
        buttonGroup11.clearSelection();
        DONUTQTY.setValue(0);
        //BAGEL
        PCB3.setSelected(false);
        buttonGroup12.clearSelection();
        BAGELQTY.setValue(0);
    }//GEN-LAST:event_ClearBtnActionPerformed

    public void sales() {
    
        try {      
        String subtotal = TotalText.getText();
        String pay = PayText.getText();
        String tot = ChangeText.getText();
        String discount =DiscountText.getText();
        String name = NameText.getText();
        
        int lastid =0;
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/caferoyale","root","");
            String query = "insert into sales(total,pay,balance,discount,name,date)values(?,?,?,?,?,?)";
            ps1 = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
            ps1.setString(1, subtotal);
            ps1.setString(2, pay);
            ps1.setString(3, tot);
            ps1.setString(4, discount);
            ps1.setString(5, name);
            ps1.setString(6, ((JTextField)DateText.getDateEditor().getUiComponent()).getText());
            ps1.executeUpdate();
            
            ResultSet rs = ps1.getGeneratedKeys();
            
            if(rs.next())
            {
                lastid = rs.getInt(1);
            }
            int rows = ORDERTABLE.getRowCount();
            
            String query1 = "insert into sales_order(sales_id,quantity,item,price,total)values(?,?,?,?,?)";
            ps2 = con.prepareStatement(query1);
            
            String item;
            int qty;
            int price;
            int total = 0;
            
            for(int i=0; i<ORDERTABLE.getRowCount(); i++)
            {
                qty = (int)ORDERTABLE.getValueAt(i, 0);
                item = (String)ORDERTABLE.getValueAt(i, 1);
                price = (int)ORDERTABLE.getValueAt(i, 2);
                total = (int)ORDERTABLE.getValueAt(i, 3);
                
                 ps2.setInt(1,lastid);
                 ps2.setInt(2,qty);
                 ps2.setString(3,item);
                 ps2.setInt(4,price);
                 ps2.setInt(5,total);
                 ps2.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(this, "Sales Complete! Thank you for choosing Café Royale!");
            
            
            HashMap a = new HashMap();
            a.put("invo", lastid);
            
            try {
                JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Maria\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\receipt.jrxml");
                JasperReport jreport = JasperCompileManager.compileReport(jdesign);
                
                JasperPrint jprint = JasperFillManager.fillReport(jreport, a,con);
                
                JasperViewer.viewReport(jprint);
                
            } catch (JRException ex) {
                Logger.getLogger(caferoyale.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(caferoyale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        
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
            java.util.logging.Logger.getLogger(caferoyale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caferoyale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caferoyale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caferoyale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caferoyale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JSpinner BAGELQTY;
    private javax.swing.JRadioButton BAGELRB1;
    private javax.swing.JRadioButton BAGELRB2;
    private javax.swing.JRadioButton BAGELRB3;
    private javax.swing.JSpinner CAFEAQTY;
    private javax.swing.JRadioButton CAFEARB1;
    private javax.swing.JRadioButton CAFEARB2;
    private javax.swing.JRadioButton CAFEARB3;
    private javax.swing.JSpinner CAFELQTY;
    private javax.swing.JRadioButton CAFELRB1;
    private javax.swing.JRadioButton CAFELRB2;
    private javax.swing.JRadioButton CAFELRB3;
    private javax.swing.JSpinner CAPPQTY;
    private javax.swing.JRadioButton CAPPRB1;
    private javax.swing.JRadioButton CAPPRB2;
    private javax.swing.JRadioButton CAPPRB3;
    private javax.swing.JSpinner CARAMELQTY;
    private javax.swing.JRadioButton CARAMELRB1;
    private javax.swing.JRadioButton CARAMELRB2;
    private javax.swing.JRadioButton CARAMELRB3;
    private javax.swing.JCheckBox CBHC1;
    private javax.swing.JCheckBox CCCB1;
    private javax.swing.JCheckBox CCCB2;
    private javax.swing.JCheckBox CCCB3;
    private javax.swing.JSpinner CHEESEQTY;
    private javax.swing.JRadioButton CHEESERB1;
    private javax.swing.JRadioButton CHEESERB2;
    private javax.swing.JRadioButton CHEESERB3;
    private javax.swing.JTextField ChangeText;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JSpinner DONUTQTY;
    private javax.swing.JRadioButton DONUTRB1;
    private javax.swing.JRadioButton DONUTRB2;
    private javax.swing.JRadioButton DONUTRB3;
    private com.toedter.calendar.JDateChooser DateText;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DiscountBtn;
    private javax.swing.JTextField DiscountText;
    private javax.swing.JCheckBox ECB1;
    private javax.swing.JCheckBox ECB2;
    private javax.swing.JCheckBox ECB3;
    private javax.swing.JSpinner FRAPQTY;
    private javax.swing.JRadioButton FRAPRB1;
    private javax.swing.JRadioButton FRAPRB2;
    private javax.swing.JRadioButton FRAPRB3;
    private javax.swing.JCheckBox HCCB2;
    private javax.swing.JCheckBox HCCB3;
    private javax.swing.JSpinner ICEDCQTY;
    private javax.swing.JRadioButton ICEDCRB1;
    private javax.swing.JRadioButton ICEDCRB2;
    private javax.swing.JRadioButton ICEDCRB3;
    private javax.swing.JSpinner ICEDLQTY;
    private javax.swing.JRadioButton ICEDLRB1;
    private javax.swing.JRadioButton ICEDLRB2;
    private javax.swing.JRadioButton ICEDLRB3;
    private javax.swing.JSpinner IRISHQTY;
    private javax.swing.JRadioButton IRISHRB1;
    private javax.swing.JRadioButton IRISHRB2;
    private javax.swing.JRadioButton IRISHRB3;
    private javax.swing.JTextField NameText;
    private javax.swing.JTable ORDERTABLE;
    private javax.swing.JCheckBox PCB1;
    private javax.swing.JCheckBox PCB2;
    private javax.swing.JCheckBox PCB3;
    private javax.swing.JButton PayBtn;
    private javax.swing.JTextField PayText;
    private javax.swing.JButton ReceiptBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JSpinner SKINNYQTY;
    private javax.swing.JRadioButton SKINNYRB1;
    private javax.swing.JRadioButton SKINNYRB2;
    private javax.swing.JRadioButton SKINNYRB3;
    private javax.swing.JButton TotalBtn;
    private javax.swing.JTextField TotalText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
