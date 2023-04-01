/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author MI
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuanLyNhanSu = new javax.swing.JTabbedPane();
        Quanly = new javax.swing.JPanel();
        IconPhongban = new javax.swing.JButton();
        IconNhanvien = new javax.swing.JButton();
        IconChucvu = new javax.swing.JButton();
        IconBangluong = new javax.swing.JButton();
        IconBaohiem = new javax.swing.JButton();
        Phongban = new javax.swing.JLabel();
        Nhanvien = new javax.swing.JLabel();
        Chucvu = new javax.swing.JLabel();
        Bangluong = new javax.swing.JLabel();
        Baohiem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        HeThong = new javax.swing.JPanel();
        IconDoimk = new javax.swing.JButton();
        IconDangxuat = new javax.swing.JButton();
        IconThoat = new javax.swing.JButton();
        Doimk = new javax.swing.JLabel();
        Dangxuat = new javax.swing.JLabel();
        Thoat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        QuanLyNhanSu.setBackground(new java.awt.Color(60, 100, 80));
        QuanLyNhanSu.setMinimumSize(new java.awt.Dimension(100, 80));

        IconPhongban.setBackground(new java.awt.Color(255, 255, 255));
        IconPhongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Icojam-Blueberry-Basic-Home.32.png"))); // NOI18N
        IconPhongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconPhongbanActionPerformed(evt);
            }
        });

        IconNhanvien.setBackground(new java.awt.Color(255, 255, 255));
        IconNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Custom-Icon-Design-Mini-Users.48.png"))); // NOI18N
        IconNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconNhanvienActionPerformed(evt);
            }
        });

        IconChucvu.setBackground(new java.awt.Color(255, 255, 255));
        IconChucvu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/xanh.png"))); // NOI18N

        IconBangluong.setBackground(new java.awt.Color(255, 255, 255));
        IconBangluong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Aha-Soft-Large-Seo-SEO.64.png"))); // NOI18N
        IconBangluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconBangluongActionPerformed(evt);
            }
        });

        IconBaohiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Icons-Land-Buildings-Care.64.png"))); // NOI18N

        Phongban.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Phongban.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phongban.setText("Phòng Ban");

        Nhanvien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nhanvien.setText("Nhân Viên");

        Chucvu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Chucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chucvu.setText("Chức Vụ");

        Bangluong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bangluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bangluong.setText("Bảng Lương");

        Baohiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Baohiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Baohiem.setText("Bảo Hiểm");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHÒNG BAN");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Phòng Ban");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Phòng Ban");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
                        .addGap(67, 67, 67)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QuanlyLayout = new javax.swing.GroupLayout(Quanly);
        Quanly.setLayout(QuanlyLayout);
        QuanlyLayout.setHorizontalGroup(
            QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanlyLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Phongban, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(IconPhongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconChucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(Chucvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bangluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconBangluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconBaohiem, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(Baohiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanlyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        QuanlyLayout.setVerticalGroup(
            QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanlyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconBangluong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconBaohiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(IconPhongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(QuanlyLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(QuanlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Phongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Chucvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bangluong, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                    .addGroup(QuanlyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Baohiem, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        QuanLyNhanSu.addTab("     Quản Lý     ", Quanly);

        IconDoimk.setBackground(new java.awt.Color(255, 255, 255));
        IconDoimk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Iconshock-Cms-User-login.64.png"))); // NOI18N

        IconDangxuat.setBackground(new java.awt.Color(255, 255, 255));
        IconDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Pictogrammers-Material-Account-arrow-right.64.png"))); // NOI18N

        IconThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Hopstarter-Sleek-Xp-Basic-Close.64.png"))); // NOI18N

        Doimk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Doimk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doimk.setText("Đổi Mật Khẩu");

        Dangxuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Dangxuat.setText("Đăng Xuất");

        Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Thoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Thoat.setText("Thoát");

        javax.swing.GroupLayout HeThongLayout = new javax.swing.GroupLayout(HeThong);
        HeThong.setLayout(HeThongLayout);
        HeThongLayout.setHorizontalGroup(
            HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeThongLayout.createSequentialGroup()
                .addGroup(HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeThongLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Doimk))
                    .addGroup(HeThongLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(IconDoimk)))
                .addGap(60, 60, 60)
                .addGroup(HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconDangxuat))
                .addGap(60, 60, 60)
                .addGroup(HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        HeThongLayout.setVerticalGroup(
            HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeThongLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(IconDoimk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeThongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Doimk, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(536, Short.MAX_VALUE))
        );

        QuanLyNhanSu.addTab("     Hệ Thống     ", HeThong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuanLyNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuanLyNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IconBangluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconBangluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IconBangluongActionPerformed

    private void IconNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconNhanvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IconNhanvienActionPerformed

    private void IconPhongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconPhongbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IconPhongbanActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bangluong;
    private javax.swing.JLabel Baohiem;
    private javax.swing.JLabel Chucvu;
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JLabel Doimk;
    private javax.swing.JPanel HeThong;
    private javax.swing.JButton IconBangluong;
    private javax.swing.JButton IconBaohiem;
    private javax.swing.JButton IconChucvu;
    private javax.swing.JButton IconDangxuat;
    private javax.swing.JButton IconDoimk;
    private javax.swing.JButton IconNhanvien;
    private javax.swing.JButton IconPhongban;
    private javax.swing.JButton IconThoat;
    private javax.swing.JLabel Nhanvien;
    private javax.swing.JLabel Phongban;
    private javax.swing.JTabbedPane QuanLyNhanSu;
    private javax.swing.JPanel Quanly;
    private javax.swing.JLabel Thoat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
