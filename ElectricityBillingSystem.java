
package BillingSystem;
import java.util.Random;

 

public class ElectricityBillingSystem extends javax.swing.JFrame {

     String operations;
     String answers;
     double firstnum,secondnum,result;
     
    public ElectricityBillingSystem() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        badd = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        bequalto = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Exit1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 370));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 370));
        jPanel1.setLayout(null);

        txtDisplay.setEditable(false);
        txtDisplay.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(txtDisplay);
        txtDisplay.setBounds(10, 10, 300, 50);

        badd.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        badd.setText("+");
        badd.setPreferredSize(new java.awt.Dimension(60, 50));
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel1.add(badd);
        badd.setBounds(240, 70, 60, 50);

        b7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b7.setText("7");
        b7.setPreferredSize(new java.awt.Dimension(60, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(20, 70, 60, 50);

        b8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(60, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(90, 70, 60, 50);

        b9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(60, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(170, 70, 60, 50);

        b4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(60, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(20, 130, 60, 50);

        b5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(60, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(90, 130, 60, 50);

        b6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(60, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(170, 130, 60, 50);

        bsub.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bsub.setText("-");
        bsub.setPreferredSize(new java.awt.Dimension(60, 50));
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });
        jPanel1.add(bsub);
        bsub.setBounds(240, 130, 60, 50);

        b1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(60, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(20, 190, 60, 50);

        b2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(60, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(90, 190, 60, 50);

        b3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(60, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(170, 190, 60, 50);

        bmul.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bmul.setText("*");
        bmul.setPreferredSize(new java.awt.Dimension(60, 50));
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });
        jPanel1.add(bmul);
        bmul.setBounds(240, 190, 60, 50);

        bequalto.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bequalto.setText("=");
        bequalto.setPreferredSize(new java.awt.Dimension(60, 50));
        bequalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequaltoActionPerformed(evt);
            }
        });
        jPanel1.add(bequalto);
        bequalto.setBounds(170, 310, 130, 40);

        bdot.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdot.setText(".");
        bdot.setPreferredSize(new java.awt.Dimension(60, 50));
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        jPanel1.add(bdot);
        bdot.setBounds(90, 250, 60, 50);

        bmod.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bmod.setText("%");
        bmod.setPreferredSize(new java.awt.Dimension(60, 50));
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });
        jPanel1.add(bmod);
        bmod.setBounds(170, 250, 60, 50);

        bdiv.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bdiv.setText("/");
        bdiv.setPreferredSize(new java.awt.Dimension(60, 50));
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        jPanel1.add(bdiv);
        bdiv.setBounds(240, 250, 60, 50);

        b0.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        b0.setText("0");
        b0.setPreferredSize(new java.awt.Dimension(60, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(20, 250, 60, 50);

        bclear.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        bclear.setText("CE");
        bclear.setPreferredSize(new java.awt.Dimension(60, 50));
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        jPanel1.add(bclear);
        bclear.setBounds(20, 310, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 110, 330, 370);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 370));
        jPanel2.setLayout(null);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("BILL5601255");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(190, 290, 110, 30);

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(190, 80, 110, 30);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(190, 140, 110, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BILLNUMBER");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 290, 140, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("CUSTOMERNO");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 30, 140, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AREACODE");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 80, 140, 30);

        jPanel3.setMinimumSize(new java.awt.Dimension(570, 350));
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 330));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("COST OF FIXEDCHARGE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 70, 190, 40);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("COST OF ENERGYCHARGE");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 20, 230, 40);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("COST OF GOVTELECTRITCITY DUTY");
        jLabel10.setToolTipText("");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 120, 270, 40);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8);
        jTextField8.setBounds(330, 120, 110, 30);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(270, 220, 110, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(330, 20, 110, 30);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7);
        jTextField7.setBounds(330, 70, 110, 30);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10);
        jTextField10.setBounds(270, 280, 110, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CGST");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(60, 220, 120, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SGST");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 280, 100, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(310, 20, 570, 330);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("lb11254231 ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(190, 30, 110, 30);

        jCheckBox2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox2.setText("CONNECTEDLAOD");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(20, 210, 150, 30);

        jCheckBox1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox1.setText("METERREADERCODE");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(20, 140, 160, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setText("Select No between 1 Kw to 150 Kw");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 240, 180, 20);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setText("Select No between 30 to 200");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 170, 180, 20);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(190, 210, 60, 30);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("KW");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(250, 210, 50, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 110, 910, 370);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 10, 10);
        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 10, 10);

        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new java.awt.Dimension(1200, 110));
        jPanel7.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setText("TOTAL AMOUNT");
        jLabel11.setToolTipText("");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(160, 90, 180, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setText("SUB TOTAL");
        jLabel12.setToolTipText("");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(160, 10, 180, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setText("TAX");
        jLabel13.setToolTipText("");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(160, 50, 180, 30);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Rs 0.00");
        jTextField12.setPreferredSize(new java.awt.Dimension(65, 30));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField12);
        jTextField12.setBounds(380, 50, 310, 30);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Rs 0.00");
        jTextField13.setPreferredSize(new java.awt.Dimension(65, 30));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField13);
        jTextField13.setBounds(380, 90, 310, 30);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Rs 0.00");
        jTextField11.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel7.add(jTextField11);
        jTextField11.setBounds(380, 10, 310, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(760, 70, 310, 50);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(760, 10, 310, 50);

        Exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel7.add(Exit);
        Exit.setBounds(420, 230, 100, 40);

        Exit1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Exit1.setText("Exit");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        jPanel7.add(Exit1);
        Exit1.setBounds(420, 230, 100, 40);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3);
        jButton3.setBounds(1110, 40, 100, 60);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(20, 490, 1250, 130);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ELECTRICITY BILLLNG SYSTEM");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(220, 20, 790, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_bclearActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
       String EnterNumber = txtDisplay.getText() + b0.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     String EnterNumber = txtDisplay.getText() + b1.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
     String EnterNumber = txtDisplay.getText() + b2.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
     String EnterNumber = txtDisplay.getText() + b3.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
     String EnterNumber = txtDisplay.getText() + b4.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
     String EnterNumber = txtDisplay.getText() + b5.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
     String EnterNumber = txtDisplay.getText() + b6.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     String EnterNumber = txtDisplay.getText() + b7.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
     String EnterNumber = txtDisplay.getText() + b8.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
     String EnterNumber = txtDisplay.getText() + b9.getText();
       txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b9ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
      if(!txtDisplay.getText().contains("."))
      {
           txtDisplay.setText(txtDisplay.getText() + bdot.getText());
      }
    }//GEN-LAST:event_bdotActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText(" ");
         operations = "%";
    }//GEN-LAST:event_bmodActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText(" ");
         operations = "*";
    }//GEN-LAST:event_bmulActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
         
         firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText(" ");
         operations = "+";
    }//GEN-LAST:event_baddActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
        firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText(" ");
         operations = "-";
    }//GEN-LAST:event_bsubActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
       firstnum = Double.parseDouble(txtDisplay.getText());
         txtDisplay.setText(" ");
         operations = "/";
    }//GEN-LAST:event_bdivActionPerformed

    private void bequaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequaltoActionPerformed
        secondnum = Double.parseDouble(txtDisplay.getText());

        if(operations == "+")
        {
            result = firstnum + secondnum;
            answers = String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else if(operations == "-")
        {
            result = firstnum - secondnum;
            answers = String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else if(operations == "*")
        {
            result = firstnum * secondnum;
            answers = String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else if(operations == "/")
        {
            result = firstnum / secondnum;
            answers = String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else
        {
            result = firstnum % secondnum;
            answers = String.format("%.2f",result);
            txtDisplay.setText(answers);
        }

    }//GEN-LAST:event_bequaltoActionPerformed
      
    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

         txtDisplay.setText("lb11254231 ");

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if((jCheckBox1.isSelected()) || (jCheckBox2.isSelected()))
       {
           double M = Double.parseDouble(jTextField3.getText()) * 30;
           double C = Double.parseDouble(jTextField4.getText()) * 30;
           
           double total = M + C;
           double Cf = total * 5 / 100;
           double Cg = Cf * 5 / 100;
           
           double subtotal = total + Cf + Cg;
           double cgst = subtotal * 9 / 100;
           double sgst = cgst;
           
           double tax = cgst + sgst;
           
           double amount = subtotal + tax;
           
           String item = String.format("%.2f",total);
           jTextField6.setText((String)item);
           
           String costf = String.format("%.2f",Cf);
           jTextField7.setText((String)costf);
           
           String costg = String.format("%.2f",Cg);
           jTextField8.setText((String)costg);
           
           String c = String.format("%.2f",cgst);
           jTextField9.setText((String)c);
           
           String s = String.format("%.2f",sgst);
           jTextField10.setText((String)s);
           
           String sub = String.format("%.2f",subtotal);
           jTextField11.setText((String)sub);
           
           String ta = String.format("%.2f",tax);
           jTextField12.setText((String)ta);
           
           String a = String.format("%.2f",amount);
           jTextField13.setText((String)a);
       }
       else
       {
           txtDisplay.setText("Enter Choice");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       txtDisplay.setText("");
      
       jTextField2.setText("0");
       jTextField3.setText("0");
       jTextField4.setText("0");
     
       jTextField6.setText("0");
       jTextField7.setText("0");
       jTextField8.setText("0");
       jTextField9.setText("0");
       jTextField10.setText("0");
       jTextField11.setText("Rs 0.00");
       jTextField12.setText("Rs 0.00");
       jTextField13.setText("Rs 0.00");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {
           jTextField3.setEditable(true);
           jTextField3.setText(" ");
           jTextField3.requestFocus();
       }
       else
       {
           jTextField3.setEditable(true);
           jTextField3.setText("0");
           
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
       if(jCheckBox2.isSelected())
       {
           jTextField4.setEditable(true);
           jTextField4.setText(" ");
           jTextField4.requestFocus();
       }
       else
       {
           jTextField4.setEditable(true);
           jTextField4.setText("0");
           
       }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElectricityBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectricityBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectricityBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectricityBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectricityBillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequalto;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
