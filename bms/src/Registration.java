
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.util.Random;
import java.awt.event.KeyEvent;
import javax.swing.text.Caret;

public class Registration extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    Statement stm;
    Boolean userinfo;
    Boolean accountinfo;

    public Registration() {
        initComponents();
        con = database.db();
        RpassField1.setEchoChar((char) 0);
        RpassField2.setEchoChar((char) 0);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        Rusername.setCaretPosition(1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RfirstName = new javax.swing.JTextField();
        RlastName = new javax.swing.JTextField();
        RemailId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        RphoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RbackButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RconfirmButton = new javax.swing.JButton();
        Rusername = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        RdepositAmount = new javax.swing.JTextField();
        RpassField1 = new javax.swing.JPasswordField();
        RpassField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RadharNumber = new javax.swing.JTextField();
        RpanNumber = new javax.swing.JTextField();
        RconfirmButton1 = new javax.swing.JButton();
        RbackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 82, 240), 5));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_new.gif"))); // NOI18N

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Registration");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_icon.png"))); // NOI18N

        RfirstName.setForeground(new java.awt.Color(120, 120, 120));
        RfirstName.setText(" First Name");
        RfirstName.setToolTipText(" First Name");
        RfirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true)
        );
        RfirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RfirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RfirstNameFocusLost(evt);
            }
        });
        RfirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RfirstNameMouseClicked(evt);
            }
        });
        RfirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfirstNameActionPerformed(evt);
            }
        });
        RfirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RfirstNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RfirstNameKeyReleased(evt);
            }
        });

        RlastName.setForeground(new java.awt.Color(120, 120, 120));
        RlastName.setText(" Last Name");
        RlastName.setToolTipText(" Last Name");
        RlastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RlastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RlastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RlastNameFocusLost(evt);
            }
        });
        RlastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RlastNameMouseClicked(evt);
            }
        });
        RlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RlastNameActionPerformed(evt);
            }
        });
        RlastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RlastNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RlastNameKeyReleased(evt);
            }
        });

        RemailId.setForeground(new java.awt.Color(120, 120, 120));
        RemailId.setText(" Email Id");
        RemailId.setToolTipText(" Email Id");
        RemailId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RemailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RemailIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RemailIdFocusLost(evt);
            }
        });
        RemailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemailIdActionPerformed(evt);
            }
        });
        RemailId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RemailIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RemailIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RemailIdKeyTyped(evt);
            }
        });

        jLabel4.setText(" Gender :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        RphoneNumber.setForeground(new java.awt.Color(120, 120, 120));
        RphoneNumber.setText(" Phone Number");
        RphoneNumber.setToolTipText(" Phone Number");
        RphoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RphoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RphoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RphoneNumberFocusLost(evt);
            }
        });
        RphoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RphoneNumberMouseClicked(evt);
            }
        });
        RphoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RphoneNumberActionPerformed(evt);
            }
        });
        RphoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RphoneNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RphoneNumberKeyReleased(evt);
            }
        });

        jLabel5.setText(" Date Of Birth :");

        RbackButton.setBackground(new java.awt.Color(176, 82, 240));
        RbackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RbackButton.setText("Cancel");
        RbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RbackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RbackButtonMouseExited(evt);
            }
        });
        RbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbackButtonActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        RconfirmButton.setBackground(new java.awt.Color(176, 82, 240));
        RconfirmButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RconfirmButton.setText("Next");
        RconfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RconfirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RconfirmButtonMouseExited(evt);
            }
        });
        RconfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RconfirmButtonActionPerformed(evt);
            }
        });

        Rusername.setForeground(new java.awt.Color(120, 120, 120));
        Rusername.setText(" UserName");
        Rusername.setToolTipText("Username");
        Rusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        Rusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RusernameFocusLost(evt);
            }
        });
        Rusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RusernameMouseClicked(evt);
            }
        });
        Rusername.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                RusernameCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        Rusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RusernameActionPerformed(evt);
            }
        });
        Rusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RusernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RusernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RusernameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RfirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(RbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RconfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RemailId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RlastName)
                    .addComponent(RphoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(Rusername)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(Rusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemailId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RconfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jLayeredPane1.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        RdepositAmount.setForeground(new java.awt.Color(120, 120, 120));
        RdepositAmount.setText(" Deposit Amount");
        RdepositAmount.setToolTipText(" Depsoit Amount");
        RdepositAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RdepositAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RdepositAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RdepositAmountFocusLost(evt);
            }
        });
        RdepositAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdepositAmountMouseClicked(evt);
            }
        });
        RdepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdepositAmountActionPerformed(evt);
            }
        });
        RdepositAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RdepositAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RdepositAmountKeyReleased(evt);
            }
        });

        RpassField1.setForeground(new java.awt.Color(120, 120, 120));
        RpassField1.setText(" Password");
        RpassField1.setToolTipText(" Password");
        RpassField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpassField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpassField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpassField1FocusLost(evt);
            }
        });
        RpassField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpassField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RpassField1KeyReleased(evt);
            }
        });

        RpassField2.setForeground(new java.awt.Color(120, 120, 120));
        RpassField2.setText(" Confirm Password");
        RpassField2.setToolTipText(" Confirm Password");
        RpassField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpassField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpassField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpassField2FocusLost(evt);
            }
        });
        RpassField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpassField2ActionPerformed(evt);
            }
        });
        RpassField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpassField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RpassField2KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Registration");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_icon.png"))); // NOI18N

        RadharNumber.setForeground(new java.awt.Color(120, 120, 120));
        RadharNumber.setText(" Aadhaar Number");
        RadharNumber.setToolTipText(" Aadhaar Number");
        RadharNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RadharNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RadharNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RadharNumberFocusLost(evt);
            }
        });
        RadharNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadharNumberMouseClicked(evt);
            }
        });
        RadharNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadharNumberActionPerformed(evt);
            }
        });
        RadharNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RadharNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RadharNumberKeyReleased(evt);
            }
        });

        RpanNumber.setForeground(new java.awt.Color(120, 120, 120));
        RpanNumber.setText(" Pan Number");
        RpanNumber.setToolTipText(" Pan Number");
        RpanNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpanNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpanNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpanNumberFocusLost(evt);
            }
        });
        RpanNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RpanNumberMouseClicked(evt);
            }
        });
        RpanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpanNumberActionPerformed(evt);
            }
        });
        RpanNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpanNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RpanNumberKeyReleased(evt);
            }
        });

        RconfirmButton1.setBackground(new java.awt.Color(176, 82, 240));
        RconfirmButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RconfirmButton1.setText("Confirm");
        RconfirmButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RconfirmButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RconfirmButton1MouseExited(evt);
            }
        });
        RconfirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RconfirmButton1ActionPerformed(evt);
            }
        });

        RbackButton1.setBackground(new java.awt.Color(176, 82, 240));
        RbackButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RbackButton1.setText("Back");
        RbackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RbackButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RbackButton1MouseExited(evt);
            }
        });
        RbackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(RbackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(RconfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RpassField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RpassField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdepositAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RpanNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadharNumber, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(RadharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RdepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpassField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpassField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RconfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel3, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(860, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RconfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RconfirmButtonActionPerformed
        // TODO add your handling code here:
        boolean checker;

        String gender = "";
        if (jRadioButton1.isSelected()) {
            gender = "Male";
        }
        if (jRadioButton2.isSelected()) {
            gender = "Female";
        }
        if (Rusername.getText().equals("") || Rusername.getText().equals(" UserName")) {
            JOptionPane.showMessageDialog(null, "Username is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RfirstName.getText().equals("") || RfirstName.getText().equals(" First Name")) {
            JOptionPane.showMessageDialog(null, "Firstname is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RlastName.getText().equals(" Last Name") || RlastName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lastame is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RemailId.getText().equals(" Email Id") || RemailId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email id is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        }else if (!RemailId.getText().contains("@gmail.com" )) {
            JOptionPane.showMessageDialog(null, "Invalid Email Formant", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RphoneNumber.getText().equals(" Phone Number") || RphoneNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone Number is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RphoneNumber.getText().length() < 11) {
            JOptionPane.showMessageDialog(null, "Phone Number has only " + (RphoneNumber.getText().length() -1 ) + " digits", "Phone Number Incorrect", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Gender is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date of Birth is empty !", "Warning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else {
            checker = true;
        }

        if (checker) {
            try {
                String uname = Rusername.getText().trim();
                String query = "select * from accountdetails where Username = '" + uname + "';";
                stm = con.createStatement();
                rs = stm.executeQuery(query);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Duplicate entry!,Username already exists", "Warning", JOptionPane.ERROR_MESSAGE);
                } else {
                    jPanel3.setVisible(true);
                    jPanel2.setVisible(false);
                }
                accountinfo = true;
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_RconfirmButtonActionPerformed

    private void RconfirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButtonMouseExited
        // TODO add your handling code here:
        RconfirmButton.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RconfirmButtonMouseExited

    private void RconfirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButtonMouseEntered
        // TODO add your handling code here:
        RconfirmButton.setBackground(new java.awt.Color(51, 153, 0));
        RconfirmButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RconfirmButtonMouseEntered

    private void RpassField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField2KeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();

        RpassField2.setEditable(true);
        int pos = RpassField2.getCaretPosition();
        String pass = new String(RpassField2.getPassword());
        if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && pass.equals(" Confirm Password")) {
            evt.consume();
        } else if (key == KeyEvent.VK_SPACE) {
            RpassField2.setEditable(false);
        } else if ((key == KeyEvent.VK_BACK_SPACE && pass.equals(" Confirm Password") && pos == 1)) {

            evt.consume();
        } else if (pass.equals(" Confirm Password")) {
            RpassField2.setForeground(new Color(0, 0, 0));
            RpassField2.setEchoChar(('*'));
            RpassField2.setEditable(true);

            RpassField2.setText("");
        } else if (pass.length() == 1 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 1) {
            RpassField2.setForeground(new Color(120, 120, 120));
            RpassField2.setEchoChar((char) 0);
            RpassField2.setText("  Confirm Password");
            RpassField2.setCaretPosition(2);
        }
    }//GEN-LAST:event_RpassField2KeyPressed

    private void RpassField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpassField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpassField2ActionPerformed

    private void RpassField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField2FocusLost
        // TODO add your handling code here:
        if (new String(RpassField2.getPassword()).equals("")) {
            RpassField2.setEchoChar((char) 0);

            RpassField2.setText(" Confirm Password");
            RpassField2.setForeground(new java.awt.Color(120, 120, 120));
        }
    }//GEN-LAST:event_RpassField2FocusLost

    private void RpassField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField2FocusGained
        // TODO add your handling code here:

        String Pass = new String(RpassField2.getPassword());

        if (Pass.equals(" Confirm Password"))
            RpassField2.setCaretPosition(1);
    }//GEN-LAST:event_RpassField2FocusGained

    private void RbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbackButtonActionPerformed

        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RbackButtonActionPerformed

    private void RbackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButtonMouseExited
        // TODO add your handling code here:
        RbackButton.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RbackButtonMouseExited

    private void RbackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButtonMouseEntered
        // TODO add your handling code here:
        RbackButton.setBackground(new java.awt.Color(51, 153, 0));
        RbackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_RbackButtonMouseEntered

    private void RpassField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField1KeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();

        RpassField1.setEditable(true);
        int pos = RpassField1.getCaretPosition();
        String pass = new String(RpassField1.getPassword());
        if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && pass.equals(" Password")) {
            evt.consume();
        } else if (key == KeyEvent.VK_SPACE) {
            RpassField1.setEditable(false);
        } else if ((key == KeyEvent.VK_BACK_SPACE && pass.equals(" Password") && pos == 1)) {

            evt.consume();
        } else if (pass.equals(" Password")) {
            RpassField1.setForeground(new Color(0, 0, 0));
            RpassField1.setEchoChar(('*'));
            RpassField1.setEditable(true);

            RpassField1.setText("");
        } else if (pass.length() == 1 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 1) {
            RpassField1.setForeground(new Color(120, 120, 120));
            RpassField1.setEchoChar((char) 0);
            RpassField1.setText("  Password");
            RpassField1.setCaretPosition(2);
        }

    }//GEN-LAST:event_RpassField1KeyPressed

    private void RpassField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField1FocusLost
        // TODO add your handling code 
    }//GEN-LAST:event_RpassField1FocusLost

    private void RpassField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField1FocusGained
        // TODO add your handling code here:\
        String Pass = new String(RpassField1.getPassword());

        if (Pass.equals(" Password")) {
            RpassField1.setCaretPosition(1);
        }

    }//GEN-LAST:event_RpassField1FocusGained

    private void RdepositAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RdepositAmountKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();

        RdepositAmount.setEditable(true);
        int pos = RdepositAmount.getCaretPosition();
        if ( RdepositAmount.getText().length() > 10) {
            if (key == 37 && pos != 1) {
                 RdepositAmount.setCaretPosition(pos - 1);
                evt.consume();
                return;
            } else if (key == 39) {
                 RdepositAmount.setCaretPosition(pos + 1);
                evt.consume();
                return;
            }

        }
        if ((key >= '0' && key <= '9') || key == KeyEvent.VK_BACK_SPACE || (key == 37 || key == 39)) {

            if ((key == 37 && pos == 1) || (key == 39 && RdepositAmount.getText().equals(" Deposit Amount"))) {
                evt.consume();
            } else if (key == KeyEvent.VK_SPACE) {
                RdepositAmount.setEditable(false);
            } else if ((key == KeyEvent.VK_BACK_SPACE && RdepositAmount.getText().equals(" Deposit Amount")) || (pos == 1 && RdepositAmount.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            } else if (RdepositAmount.getText().equals(" Deposit Amount")) {
                RdepositAmount.setForeground(new Color(0, 0, 0));
                RdepositAmount.setEditable(true);
                RdepositAmount.setText(" ");
            } else if (RdepositAmount.getText().length() == 2 && key == KeyEvent.VK_BACK_SPACE && pos == 2) {
                RdepositAmount.setForeground(new Color(120, 120, 120));
                RdepositAmount.setText("  Deposit Amount");
                RdepositAmount.setCaretPosition(2);
            } else if (!RdepositAmount.getText().equals(" Deposit Amount") && RdepositAmount.getText().length() > 11 && key != KeyEvent.VK_BACK_SPACE) {
                RdepositAmount.setEditable(false);
            }
        } else {
            RdepositAmount.setEditable(false);
        }
    }//GEN-LAST:event_RdepositAmountKeyPressed

    private void RdepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdepositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdepositAmountActionPerformed

    private void RdepositAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdepositAmountFocusLost
        // TODO add your handling code here:
        if (RdepositAmount.getText().equals("")) {
            RdepositAmount.setText(" Deposit Amount");
        }
    }//GEN-LAST:event_RdepositAmountFocusLost

    private void RdepositAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdepositAmountFocusGained
        // TODO add your handling code here:
        if (RdepositAmount.getText().equals(" Deposit Amount")) {
            RdepositAmount.setCaretPosition(1);
        }
    }//GEN-LAST:event_RdepositAmountFocusGained

    private void RphoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RphoneNumberKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();

        RphoneNumber.setEditable(true);
        int pos = RphoneNumber.getCaretPosition();
        String num = RphoneNumber.getText();
        if (RphoneNumber.getText().length() > 10) {
            if (key == 37 && pos != 1) {
                RphoneNumber.setCaretPosition(pos - 1);
                evt.consume();
                return;
            } else if (key == 39) {
                RphoneNumber.setCaretPosition(pos + 1);
                evt.consume();
                return;
            }

        }
        if ((key >= '0' && key <= '9') || key == KeyEvent.VK_BACK_SPACE || key == 37 || key == 39 || key == 40 || key == 38) {

            if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && RphoneNumber.getText().equals(" Phone Number")) {
                evt.consume();
            } else if (key == KeyEvent.VK_SPACE) {
                RphoneNumber.setEditable(false);
            } else if ((key == KeyEvent.VK_BACK_SPACE && RphoneNumber.getText().equals(" Phone Number")) || (pos == 1 && RphoneNumber.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            } else if (RphoneNumber.getText().equals(" Phone Number")) {
                RphoneNumber.setForeground(new Color(0, 0, 0));
                RphoneNumber.setEditable(true);
                RphoneNumber.setText(" ");
            } else if (RphoneNumber.getText().length() == 2 && key == KeyEvent.VK_BACK_SPACE && pos == 2) {
                RphoneNumber.setForeground(new Color(120, 120, 120));
                RphoneNumber.setText("  Phone Number");
                RphoneNumber.setCaretPosition(2);
            } else if (!RphoneNumber.getText().equals(" Phone Number") && RphoneNumber.getText().length() > 10 && key != KeyEvent.VK_BACK_SPACE && pos !=12) {
                RphoneNumber.setEditable(false);
            }

        } else {
            RphoneNumber.setEditable(false);
        }
    }//GEN-LAST:event_RphoneNumberKeyPressed

    private void RphoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RphoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RphoneNumberActionPerformed

    private void RphoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RphoneNumberFocusLost
        // TODO add your handling code here:
        if (RphoneNumber.getText().equals("")) {
            RphoneNumber.setText(" Phone Number");
        }
    }//GEN-LAST:event_RphoneNumberFocusLost

    private void RphoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RphoneNumberFocusGained
        // TODO add your handling code here:
        // TODO add your handling code here:

        if (RphoneNumber.getText().equals(" Phone Number")) {
            RphoneNumber.setCaretPosition(1);

        }
    }//GEN-LAST:event_RphoneNumberFocusGained

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void RemailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RemailIdKeyPressed
        // TODO add your handling code here:
        
        
        int key = evt.getKeyCode();
        RemailId.setEditable(true);
        int pos = RemailId.getCaretPosition();
        
        if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && RemailId.getText().equals(" Email Id")) {
            evt.consume();
          
        } else if (key == KeyEvent.VK_SPACE) {
            RemailId.setEditable(false);
        } else if ((key == KeyEvent.VK_BACK_SPACE && RemailId.getText().equals(" Email Id")) || (pos == 1 && RemailId.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if (RemailId.getText().equals(" Email Id")) {
            RemailId.setForeground(new Color(0, 0, 0));
            RemailId.setEditable(true);
            RemailId.setText(" @gmail.com");
            RemailId.setCaretPosition(1);
        } else if (RemailId.getText().length() == 2 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 2) {
            RemailId.setForeground(new Color(120, 120, 120));
            RemailId.setText("  Email Id");
            RemailId.setCaretPosition(2);
        }


    }//GEN-LAST:event_RemailIdKeyPressed

    private void RemailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemailIdActionPerformed

    private void RemailIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemailIdFocusLost
        // TODO add your handling code here:
        
        if (RemailId.getText().equals("") || RemailId.getText().equals(" Email Id")) {
            RemailId.setForeground(new java.awt.Color(120, 120, 120));
            RemailId.setText(" Email Id");
        } else {
            String emailid = RemailId.getText();
            if (!emailid.contains("@gmail.com")) {
                RemailId.setForeground(Color.red);
            } else {
                RemailId.setForeground(Color.black);
            }

        }
    }//GEN-LAST:event_RemailIdFocusLost

    private void RemailIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemailIdFocusGained
        // TODO add your handling code here:

        if (RemailId.getText().equals(" Email Id") || RemailId.getText().equals(" @gmail.com")) {
            RemailId.setCaretPosition(1);

        }
    }//GEN-LAST:event_RemailIdFocusGained

    private void RlastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RlastNameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
       
        int pos = RlastName.getCaretPosition();

        if( !RlastName.isEditable() && pos ==11 ){
            RlastName.setEditable(true);
            RlastName.setCaretPosition(10);
        }
        
        if ((key >= 65 && key <= 90) || (key >= 97 && key <= 122) || key == java.awt.event.KeyEvent.VK_BACK_SPACE || key == 37 || key == 39 || key == 40 || key == 38) {
        
            if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && RlastName.getText().equals(" Last Name")) {
                evt.consume();
            } else if (key == KeyEvent.VK_SPACE) {
                RlastName.setEditable(false);
            } else if ((key == KeyEvent.VK_BACK_SPACE && RlastName.getText().equals(" Last Name")) || (pos == 1 && RlastName.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            } else if (RlastName.getText().equals(" Last Name")) {
                RlastName.setForeground(new Color(0, 0, 0));
                RlastName.setEditable(true);
                RlastName.setText(" ");
            } else if (RlastName.getText().length() == 2 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 2) {
                RlastName.setForeground(new Color(120, 120, 120));
                RlastName.setText("  Last Name");
                RlastName.setCaretPosition(2);
            }
        } else {
            RlastName.setEditable(false);

        }
    }//GEN-LAST:event_RlastNameKeyPressed

    private void RlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RlastNameActionPerformed

    private void RlastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RlastNameFocusLost
        // TODO add your handling code here:
        if (RlastName.getText().isEmpty() || RlastName.getText().equals(" ")) {
            RlastName.setForeground(new java.awt.Color(120, 120, 120));
            RlastName.setText(" Last Name");
        } else {
            String cap = RlastName.getText().substring(0, 2).toUpperCase() + RlastName.getText().substring(2);
            RlastName.setText(cap);
        }
    }//GEN-LAST:event_RlastNameFocusLost

    private void RlastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RlastNameFocusGained
        // TODO add your handling code here:
        if (RlastName.getText().equals(" Last Name")) {
            RlastName.setCaretPosition(1);
        }
    }//GEN-LAST:event_RlastNameFocusGained

    private void RfirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RfirstNameKeyPressed
        // TODO add your handling code here:

        int key = evt.getKeyCode();
        RfirstName.setEditable(true);
        int pos = RfirstName.getCaretPosition();
        if ((key >= 65 && key <= 90) || (key >= 97 && key <= 122) || key == java.awt.event.KeyEvent.VK_BACK_SPACE || key == 37 || key == 39 || key == 40 || key == 38) {
            if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && RfirstName.getText().equals(" First Name")) {
                evt.consume();
            } else if (key == KeyEvent.VK_SPACE) {
                RfirstName.setEditable(false);
            } else if ((key == KeyEvent.VK_BACK_SPACE && RfirstName.getText().equals(" First Name")) || (pos == 1 && RfirstName.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            } else if (RfirstName.getText().equals(" First Name")) {
                RfirstName.setForeground(new Color(0, 0, 0));
                RfirstName.setEditable(true);
                RfirstName.setText(" ");
            } else if (RfirstName.getText().length() == 2 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 2) {
                RfirstName.setForeground(new Color(120, 120, 120));
                RfirstName.setText("  First Name");
                RfirstName.setCaretPosition(2);
            }
        } else {
            RfirstName.setEditable(false);

        }

    }//GEN-LAST:event_RfirstNameKeyPressed

    private void RfirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RfirstNameActionPerformed

    private void RfirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RfirstNameFocusLost
        // TODO add your handling code here:
        if (RfirstName.getText().isEmpty() || RfirstName.getText().equals(" ")) {
            RfirstName.setForeground(new java.awt.Color(120, 120, 120));
            RfirstName.setText(" First Name");
        } else {
            String cap = RfirstName.getText().substring(0, 2).toUpperCase() + RfirstName.getText().substring(2);
            RfirstName.setText(cap);
        }
    }//GEN-LAST:event_RfirstNameFocusLost

    private void RfirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RfirstNameFocusGained
        // TODO add your handling code here:

        if (RfirstName.getText().equals(" First Name")) {
            RfirstName.setCaretPosition(1);
        }
    }//GEN-LAST:event_RfirstNameFocusGained

    private void RadharNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadharNumberFocusGained
        // TODO add your handling code here:
        if (RadharNumber.getText().equals(" Aadhaar Number")) {
            RadharNumber.setCaretPosition(1);
        }


    }//GEN-LAST:event_RadharNumberFocusGained
    Boolean ad = false;
    private void RadharNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadharNumberFocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_RadharNumberFocusLost

    private void RadharNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadharNumberMouseClicked
        // TODO add your handling code here:
        Caret caret = RadharNumber.getCaret();
        caret.setVisible(true);
    }//GEN-LAST:event_RadharNumberMouseClicked

    private void RadharNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadharNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberActionPerformed

    private void RadharNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RadharNumberKeyPressed
        // TODO add your handling code here:

        int key = evt.getKeyCode();

        RadharNumber.setEditable(true);
        int pos = RadharNumber.getCaretPosition();
        if (RadharNumber.getText().length() > 12) {
            if (key == 37 && pos != 1) {
                RadharNumber.setCaretPosition(pos - 1);
                evt.consume();
                return;
            } else if (key == 39) {
                RadharNumber.setCaretPosition(pos + 1);
                evt.consume();
                return;
            }

        }
        if ((key >= '0' && key <= '9') || key == KeyEvent.VK_BACK_SPACE || (key == 37 || key == 39)) {

            if ((key == 37 && pos == 1) || (key == 39 && RadharNumber.getText().equals(" Aadhaar Number"))) {
                evt.consume();
            } else if (key == KeyEvent.VK_SPACE) {
                RadharNumber.setEditable(false);
            } else if ((key == KeyEvent.VK_BACK_SPACE && RadharNumber.getText().equals(" Aadhaar Number")) || (pos == 1 && RadharNumber.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            } else if (RadharNumber.getText().equals(" Aadhaar Number")) {
                RadharNumber.setForeground(new Color(0, 0, 0));
                RadharNumber.setEditable(true);
                RadharNumber.setText(" ");
            } else if (RadharNumber.getText().length() == 2 && key == KeyEvent.VK_BACK_SPACE && pos == 2) {
                RadharNumber.setForeground(new Color(120, 120, 120));
                RadharNumber.setText("  Aadhaar Number");
                RadharNumber.setCaretPosition(2);
            } else if (!RadharNumber.getText().equals(" Aadhaar Number") && RadharNumber.getText().length() > 12 && key != KeyEvent.VK_BACK_SPACE) {
                RadharNumber.setEditable(false);
            }
        } else {
            RadharNumber.setEditable(false);
        }
    }//GEN-LAST:event_RadharNumberKeyPressed

    private void RpanNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpanNumberFocusGained
        // TODO add your handling code here:
        if (RpanNumber.getText().equals(" Pan Number")) {
            RpanNumber.setCaretPosition(1);
        }


    }//GEN-LAST:event_RpanNumberFocusGained

    private void RpanNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpanNumberFocusLost
        // TODO add your handling code here:
        if (RpanNumber.getText().equals("")) {
            RpanNumber.setForeground(new Color(120, 120, 120));
            RpanNumber.setText(" Pan Number");
        } else if( !RpanNumber.getText().equals(" Pan Number")) {
            
            RpanNumber.setText(RpanNumber.getText().toUpperCase());
        }
    }//GEN-LAST:event_RpanNumberFocusLost

    private void RpanNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RpanNumberMouseClicked
        // TODO add your handling code here:
        Caret caret = RpanNumber.getCaret();
        caret.setVisible(true);
    }//GEN-LAST:event_RpanNumberMouseClicked

    private void RpanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberActionPerformed

    private void RpanNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpanNumberKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        RpanNumber.setEditable(true);
        int pos = RpanNumber.getCaretPosition();
        if (RpanNumber.getText().length() > 10) {
            if (key == 37 && pos != 1) {
                RpanNumber.setCaretPosition(pos - 1);
                evt.consume();
                return;
            } else if (key == 39) {
                RpanNumber.setCaretPosition(pos + 1);
                evt.consume();
                return;
            }

        }
        if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && RpanNumber.getText().equals(" Pan Number")) {
            evt.consume();
        } else if (key == KeyEvent.VK_SPACE) {
            RpanNumber.setEditable(false);
        } else if ((key == KeyEvent.VK_BACK_SPACE && RpanNumber.getText().equals(" Pan Number")) || (pos == 1 && RpanNumber.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if (RpanNumber.getText().equals(" Pan Number")) {
            RpanNumber.setForeground(new Color(0, 0, 0));
            RpanNumber.setEditable(true);
            RpanNumber.setText(" ");
        } else if (RpanNumber.getText().length() == 2 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 2) {
            RpanNumber.setForeground(new Color(120, 120, 120));
            RpanNumber.setText("  Pan Number");
            RpanNumber.setCaretPosition(2);
        } else if (RpanNumber.getText().length() > 10 && key!=KeyEvent.VK_BACK_SPACE) {
            RpanNumber.setEditable(false);
        }

    }//GEN-LAST:event_RpanNumberKeyPressed

    private void RconfirmButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButton1MouseEntered
        // TODO add your handling code here:
        RconfirmButton1.setBackground(new java.awt.Color(51, 153, 0));
        RconfirmButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RconfirmButton1MouseEntered

    private void RconfirmButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButton1MouseExited
        // TODO add your handling code here:
        RconfirmButton1.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RconfirmButton1MouseExited
    public boolean accountnumbercheck(long n) {
        try {
            String query = "select * from accountdetails where AccountNumber = '" + n + "';";
            stm = con.createStatement();
            rs = stm.executeQuery(query);

            if (rs.next()) {
                return true;
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    private void RconfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RconfirmButton1ActionPerformed
        boolean checker, b1 = true;
        if (RadharNumber.getText().equals(" Aadhaar Number") || RadharNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Adhaar Number is empty !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RadharNumber.getText().length() < 12) {
            JOptionPane.showMessageDialog(null, "Adhaar Number has only " + RadharNumber.getText().length() + " digits !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RpanNumber.getText().equals(" Pan Number") || RpanNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Pan Number is empty !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RpanNumber.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "Pan Number has only " + RpanNumber.getText().length() + " digits !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (RdepositAmount.getText().equals(" Deposit Amount") || RdepositAmount.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Deposit Amount is empty !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        }else if (Double.parseDouble(RdepositAmount.getText())>10000000.0) {
            JOptionPane.showMessageDialog(null, "Deposit Amount should not exccede 1 cr !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (new String(RpassField1.getPassword()).equals("") || new String(RpassField1.getPassword()).equals(" Password")) {
            JOptionPane.showMessageDialog(null, "Password is empty !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        }else if (new String(RpassField1.getPassword()).length() <6) {
            JOptionPane.showMessageDialog(null, "Password must have 6 characters !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else if (new String(RpassField2.getPassword()).equals("") || new String(RpassField2.getPassword()).equals(" Confirm Password")) {
            JOptionPane.showMessageDialog(null, "Confirm Password is empty !", "Warnning", JOptionPane.WARNING_MESSAGE);
            checker = false;
        } else {
            checker = true;
        }

        if (checker) {
            try {
                String sql = "insert into AccountDetails values(?,?,?,?,?,?,?,?,?,?,?,?);";
                pst = con.prepareStatement(sql);
                String gender = "";
                if (jRadioButton1.isSelected()) {
                    gender = "Male";
                }
                if (jRadioButton2.isSelected()) {
                    gender = "Female";
                }

                long number = Math.abs((new Random()).nextInt(999999999));
                while (b1) {
                    if (accountnumbercheck(number)) {
                        number = Math.abs((new Random()).nextInt(999999999));
                    } else {
                        b1 = false;
                    }
                }
                String Raccount = Integer.toString((int) number);
                pst.setString(1, Raccount);
                pst.setString(2, RfirstName.getText().trim());
                pst.setString(3, RlastName.getText().trim());
                pst.setString(4, Rusername.getText().trim());
                pst.setString(5, RemailId.getText().trim());
                pst.setString(6, gender);
                pst.setString(7, RphoneNumber.getText().trim());
                pst.setString(8, ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
                pst.setString(9, RadharNumber.getText().trim());
                pst.setString(10, RpanNumber.getText().trim());
                pst.setString(11, RdepositAmount.getText().trim());
                pst.setString(12, new String(RpassField1.getPassword()).trim());

                if (new String(RpassField1.getPassword()).trim().equals(new String(RpassField2.getPassword()).trim())) {

                    int p = JOptionPane.showConfirmDialog(null, "Are you Sure to save?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (p == 0) {
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Account created sucessfully ");
                        new Login().setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    } else {
                        this.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password not matched please check ! ");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_RconfirmButton1ActionPerformed

    private void RbackButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButton1MouseEntered
        // TODO add your handling code here:
        RbackButton1.setBackground(new java.awt.Color(51, 153, 0));
        RbackButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RbackButton1MouseEntered

    private void RbackButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButton1MouseExited
        // TODO add your handling code here:
        RbackButton1.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RbackButton1MouseExited

    private void RbackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbackButton1ActionPerformed
        userinfo = true;
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_RbackButton1ActionPerformed


    private void RusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RusernameKeyPressed
        // TODO add your handling code here:

        int key = evt.getKeyCode();
        Rusername.setEditable(true);
        int pos = Rusername.getCaretPosition();

        if ((key == 37 && pos == 1) || (key == 39 || key == 40 || key == 38) && Rusername.getText().equals(" UserName")) {
            evt.consume();
        } else if (key == KeyEvent.VK_SPACE) {
            Rusername.setEditable(false);
        } else if ((key == KeyEvent.VK_BACK_SPACE && Rusername.getText().equals(" UserName")) || (pos == 1 && Rusername.getText().length() >= 2 && key == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if (Rusername.getText().equals(" UserName")) {
            Rusername.setForeground(new Color(0, 0, 0));
            Rusername.setEditable(true);
            Rusername.setText(" ");
        } else if (Rusername.getText().length() == 2 && evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE && pos == 2) {
            Rusername.setForeground(new Color(120, 120, 120));
            Rusername.setText("  UserName");
            Rusername.setCaretPosition(2);
        }
    }//GEN-LAST:event_RusernameKeyPressed

    private void RusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RusernameFocusGained
        // TODO add your handling code here:

        if (Rusername.getText().equals(" UserName")) {
            Rusername.setCaretPosition(1);
        }
    }//GEN-LAST:event_RusernameFocusGained

    private void RusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RusernameFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_RusernameFocusLost

    private void RfirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RfirstNameMouseClicked
        // TODO add your handling code here:
        RfirstName.setEditable(true);
        Caret caret= RfirstName.getCaret();
        caret.setVisible(true);
    }//GEN-LAST:event_RfirstNameMouseClicked

    private void RlastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RlastNameMouseClicked
        // TODO add your handling code here:
        
        RlastName.setEditable(true);
        Caret caret= RlastName.getCaret();
        caret.setVisible(true);
    }//GEN-LAST:event_RlastNameMouseClicked

    private void RusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RusernameActionPerformed

    private void RusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RusernameMouseClicked
        // TODO add your handling code here:
        int i = Rusername.getCaretPosition();


    }//GEN-LAST:event_RusernameMouseClicked

    private void RusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RusernameKeyTyped
        // TODO add your handling code here:
//        if(Rusername.getText().equals("") || Rusername.getText().equals(" ")){
//            Rusername.setForeground(new Color(120,120,120));
//            Rusername.setText(" UserName");
//            Rusername.setCaretPosition(1);
//        }
    }//GEN-LAST:event_RusernameKeyTyped

    private void RusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RusernameKeyReleased
        // TODO add your handling code here:
        if (Rusername.getText().equals("") || Rusername.getText().equals(" ")) {
            Rusername.setForeground(new Color(120, 120, 120));
            Rusername.setText(" UserName");
            Rusername.setCaretPosition(1);
        }
    }//GEN-LAST:event_RusernameKeyReleased

    private void RfirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RfirstNameKeyReleased
        // TODO add your handling code here:
        if (RfirstName.getText().equals("") || RfirstName.getText().equals(" ")) {
            RfirstName.setForeground(new Color(120, 120, 120));
            RfirstName.setText(" First Name");
            RfirstName.setCaretPosition(1);
        }
    }//GEN-LAST:event_RfirstNameKeyReleased

    private void RlastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RlastNameKeyReleased
        // TODO add your handling code here:
        if (RlastName.getText().equals("") || RlastName.getText().equals(" ")) {
            RlastName.setForeground(new Color(120, 120, 120));
            RlastName.setText(" Last Name");
            RlastName.setCaretPosition(1);
        }
    }//GEN-LAST:event_RlastNameKeyReleased

    private void RemailIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RemailIdKeyReleased
        // TODO add your handling code here:
        if (RemailId.getText().equals("") || RemailId.getText().equals(" ")) {
            RemailId.setForeground(new Color(120, 120, 120));
            RemailId.setText(" Email Id");
            RemailId.setCaretPosition(1);
        }
        if(RemailId.getText().contains("@gmail.com")){
            RemailId.setForeground(Color.black);
        }else if( !RemailId.getText().contains(("@gmail.com")) && !RemailId.getText().equals(" Email Id"))
            RemailId.setForeground(Color.red);
        
    }//GEN-LAST:event_RemailIdKeyReleased

    private void RphoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RphoneNumberKeyReleased
        // TODO add your handling code here:
        if (RphoneNumber.getText().equals("") || RphoneNumber.getText().equals(" ")) {
            RphoneNumber.setForeground(new Color(120, 120, 120));
            RphoneNumber.setText(" Phone Number");
            RphoneNumber.setCaretPosition(1);
        }
    }//GEN-LAST:event_RphoneNumberKeyReleased

    private void RadharNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RadharNumberKeyReleased
        // TODO add your handling code here:
        if (RadharNumber.getText().equals("") || RadharNumber.getText().equals(" ")) {
            RadharNumber.setForeground(new Color(120, 120, 120));
            RadharNumber.setText(" Aadhaar Number");
            RadharNumber.setCaretPosition(1);
        }
    }//GEN-LAST:event_RadharNumberKeyReleased

    private void RpanNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpanNumberKeyReleased
        // TODO add your handling code here:

        if (RpanNumber.getText().equals("") || RpanNumber.getText().equals(" ")) {
            RpanNumber.setForeground(new Color(120, 120, 120));
            RpanNumber.setText(" Pan Number");
            RpanNumber.setCaretPosition(1);
        }
    }//GEN-LAST:event_RpanNumberKeyReleased

    private void RdepositAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RdepositAmountKeyReleased
        // TODO add your handling code here:
        if (RdepositAmount.getText().equals("") || RdepositAmount.getText().equals(" ")) {
            RdepositAmount.setForeground(new Color(120, 120, 120));
            RdepositAmount.setText(" Deposit Amount");
            RdepositAmount.setCaretPosition(1);
        }
    }//GEN-LAST:event_RdepositAmountKeyReleased

    private void RpassField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField2KeyReleased
        // TODO add your handling code here:
        String pass = new String(RpassField2.getPassword());
        if (pass.equals("")) {
            RpassField2.setForeground(new Color(120, 120, 120));
            RpassField2.setEchoChar((char) 0);
            RpassField2.setText(" Confirm Password");
            RpassField2.setCaretPosition(1);
        }
    }//GEN-LAST:event_RpassField2KeyReleased

    private void RpassField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField1KeyReleased
        // TODO add your handling code here:
        String pass = new String(RpassField1.getPassword());
        if (pass.equals("")) {
            RpassField1.setForeground(new Color(120, 120, 120));
            RpassField1.setEchoChar((char) 0);
            RpassField1.setText(" Password");
            RpassField1.setCaretPosition(1);
        }
    }//GEN-LAST:event_RpassField1KeyReleased

    private void RphoneNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RphoneNumberMouseClicked
        // TODO add your handling code here:
        RphoneNumber.setEditable(true);
        Caret caret = RphoneNumber.getCaret();
        caret.setVisible(true);

    }//GEN-LAST:event_RphoneNumberMouseClicked

    private void RusernameCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_RusernameCaretPositionChanged
        // TODO add your handling code here:
        int i = Rusername.getCaretPosition();
        if (Rusername.getText().equals(" UserName") && i != 1)
            Rusername.setCaretPosition(1);
    }//GEN-LAST:event_RusernameCaretPositionChanged

    private void RemailIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RemailIdKeyTyped
        // TODO add your handling code here:
        String str= RemailId.getText();
        
        
    }//GEN-LAST:event_RemailIdKeyTyped

    private void RdepositAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdepositAmountMouseClicked
        // TODO add your handling code here:
        Caret caret = RdepositAmount.getCaret();
        caret.setVisible(true);
    }//GEN-LAST:event_RdepositAmountMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RadharNumber;
    private javax.swing.JButton RbackButton;
    private javax.swing.JButton RbackButton1;
    private javax.swing.JButton RconfirmButton;
    private javax.swing.JButton RconfirmButton1;
    private javax.swing.JTextField RdepositAmount;
    private javax.swing.JTextField RemailId;
    private javax.swing.JTextField RfirstName;
    private javax.swing.JTextField RlastName;
    private javax.swing.JTextField RpanNumber;
    private javax.swing.JPasswordField RpassField1;
    private javax.swing.JPasswordField RpassField2;
    private javax.swing.JTextField RphoneNumber;
    private javax.swing.JTextField Rusername;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
