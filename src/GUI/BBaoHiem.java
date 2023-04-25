/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.*;
import Connect.Connect;
import DTO.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MI
 */
public class BBaoHiem extends javax.swing.JPanel {

    /**
     * Creates new form BBaoHiem
     */
    BaoHiemBUS baohiemBUS;
    BaoHiemDTO baohiemDTO;
    DefaultTableModel defaultTableModel;
    public BBaoHiem() {
        initComponents();
        baohiemBUS = new BaoHiemBUS();
        baohiemDTO = new BaoHiemDTO();
        
        defaultTableModel = new DefaultTableModel()
                {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
                    
                };
        tableBaohiem.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã Bảo Hiểm");
        defaultTableModel.addColumn("Mã Nhân Viên");
        defaultTableModel.addColumn("Tên Nhân Viên");
        defaultTableModel.addColumn("Loại Bảo Hiểm");
        defaultTableModel.addColumn("Ngày Cấp ");
        defaultTableModel.addColumn("Ngày Hết Hạn");
        setBaohiemData(baohiemBUS.getBaohiem());
        
        
        tableBaohiem.addMouseListener(new MouseAdapter()
        {
                public void mouseClicked(MouseEvent e) 
        {
            int row = tableBaohiem.getSelectedRow();
            if (row >= 0) 
            {
                String MaBH = "";
                String MaNv = "";
                String TenNv = "";
                String LoaiBH = "";
                String Ngcap = "";
                String Nghethan = "";

                if (tableBaohiem.getValueAt(row, 0) != null) {
                    MaBH = tableBaohiem.getValueAt(row, 0).toString();
                }
                if (tableBaohiem.getValueAt(row, 1) != null) {
                    MaNv = tableBaohiem.getValueAt(row, 1).toString();
                }
                if (tableBaohiem.getValueAt(row, 2) != null) {
                    TenNv = tableBaohiem.getValueAt(row, 2).toString();
                }
                if (tableBaohiem.getValueAt(row, 3) != null) {
                    LoaiBH = tableBaohiem.getValueAt(row, 3).toString();
                }
                if (tableBaohiem.getValueAt(row, 4) != null) {
                    Ngcap = tableBaohiem.getValueAt(row, 4).toString();
                }
                if (tableBaohiem.getValueAt(row, 5) != null) {
                    Nghethan = tableBaohiem.getValueAt(row, 5).toString();
                }

                MaBhf.setText(MaBH);
                MaNvf.setText(MaNv);
                TenNvf.setText(TenNv);
                Loaibhf.setText(LoaiBH);
                Ngaycapf.setText(Ngcap);
                Ngayhethanf.setText(Nghethan);
            }
}

            });
    }
     public void setBaohiemData(ArrayList<BaoHiemDTO> bbaohiem)
     {
            for (BaoHiemDTO baohiem : bbaohiem) {
                defaultTableModel.addRow(new Object[]{
                    baohiem.getMaBH(),
                    baohiem.getMaNv(),
                    baohiem.getTenNvbh(),
                    baohiem.getLoaiBH(),
                    baohiem.getNgaycap(),
                    baohiem.getNgayhethan()
                      
                });
            }


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Thembh = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        MaBhf = new javax.swing.JTextField();
        MaNvf = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableBaohiem = new javax.swing.JTable();
        Ngaycapf = new javax.swing.JTextField();
        Ngayhethanf = new javax.swing.JTextField();
        Loaibhf = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        TenNvf = new javax.swing.JTextField();

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Bảo hiểm nhân viên");
        jLabel39.setToolTipText("");
        jLabel39.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Mã Nhân Viên");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Loại Bảo Hiểm");

        Thembh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Thembh.setForeground(new java.awt.Color(255, 51, 51));
        Thembh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/add.png"))); // NOI18N
        Thembh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThembhActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Mã bảo hiểm");

        MaBhf.setEditable(false);
        MaBhf.setBackground(new java.awt.Color(255, 255, 255));
        MaBhf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MaBhf.setForeground(new java.awt.Color(0, 0, 0));
        MaBhf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        MaBhf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaBhfActionPerformed(evt);
            }
        });

        MaNvf.setEditable(false);
        MaNvf.setBackground(new java.awt.Color(255, 255, 255));
        MaNvf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MaNvf.setForeground(new java.awt.Color(0, 0, 0));
        MaNvf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        MaNvf.setToolTipText("");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Thêm");

        jButton22.setIcon(new javax.swing.ImageIcon("W:\\Java\\Java_QLNS\\src\\Picture\\Double-J-Design-Origami-Colored-Pencil-Blue-document-cross.32.png")); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Hủy Bỏ");

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/edit.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 0, 0));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/remove.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Sửa");

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Xóa");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Ngày cấp");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Ngày hết hạn");

        tableBaohiem.setBackground(new java.awt.Color(255, 255, 255));
        tableBaohiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableBaohiem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableBaohiem.setForeground(new java.awt.Color(0, 0, 0));
        tableBaohiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Mã nhân viên", "Loại bảo hiểm", "Ngày Cấp", "Ngày hết hạn"
            }
        ));
        tableBaohiem.setRowHeight(30);
        tableBaohiem.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tableBaohiem);

        Ngaycapf.setBackground(new java.awt.Color(255, 255, 255));
        Ngaycapf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ngaycapf.setForeground(new java.awt.Color(0, 0, 0));
        Ngaycapf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Ngaycapf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgaycapfActionPerformed(evt);
            }
        });

        Ngayhethanf.setBackground(new java.awt.Color(255, 255, 255));
        Ngayhethanf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ngayhethanf.setForeground(new java.awt.Color(0, 0, 0));
        Ngayhethanf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Loaibhf.setBackground(new java.awt.Color(255, 255, 255));
        Loaibhf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Loaibhf.setForeground(new java.awt.Color(0, 0, 0));
        Loaibhf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Tên Nhân Viên");

        TenNvf.setEditable(false);
        TenNvf.setBackground(new java.awt.Color(255, 255, 255));
        TenNvf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TenNvf.setForeground(new java.awt.Color(0, 0, 0));
        TenNvf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MaNvf, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(MaBhf))
                                .addGap(82, 82, 82)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TenNvf)
                                .addGap(82, 82, 82)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Loaibhf, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaycapf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngayhethanf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thembh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MaBhf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Loaibhf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Thembh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNvf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngaycapf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngayhethanf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenNvf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel46))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThembhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThembhActionPerformed
        // TODO add your handling code here:


                JOptionPane.showMessageDialog(this, 
                    "Bạn Phải Thêm Nhân Viên Mới !!!", "Lỗi", 
                    JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_ThembhActionPerformed

    private void MaBhfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaBhfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaBhfActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void NgaycapfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgaycapfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgaycapfActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        
        MaBhf.setText("");
        MaNvf.setText("");
        TenNvf.setText("");
        Loaibhf.setText("");
        Ngaycapf.setText("");
        Ngayhethanf.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Loaibhf;
    private javax.swing.JTextField MaBhf;
    private javax.swing.JTextField MaNvf;
    private javax.swing.JTextField Ngaycapf;
    private javax.swing.JTextField Ngayhethanf;
    private javax.swing.JTextField TenNvf;
    private javax.swing.JButton Thembh;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tableBaohiem;
    // End of variables declaration//GEN-END:variables
}
