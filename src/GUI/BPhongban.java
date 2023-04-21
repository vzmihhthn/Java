/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.PhongBanBUS;
import Connect.Connect;
import DTO.PhongBanDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
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
public class BPhongban extends javax.swing.JPanel {
    

    PhongBanBUS phongBanBus;
    PhongBanDTO phongBanDTO;
    DefaultTableModel defaultTableModel;
    public static void main(String[] args)
    {

    }
    public BPhongban()
    {
        initComponents();
       phongBanBus = new PhongBanBUS();
        phongBanDTO = new PhongBanDTO();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablePhongban.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã phòng ban");
        defaultTableModel.addColumn("Tên phòng ban");
        defaultTableModel.addColumn("Số điện thoại");
        setPBData(phongBanBus.getPhongBan());
        
        tablePhongban.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) 
        {
            int row = tablePhongban.getSelectedRow();
            if (row >= 0) {
                String maPB = tablePhongban.getValueAt(row, 0).toString();
                String tenPB = tablePhongban.getValueAt(row, 1).toString();
                String sdt = tablePhongban.getValueAt(row, 2).toString();
                MaPB.setText(maPB);
                TenPB.setText(tenPB);
                SoDT.setText(sdt);
            }
        }
            });
    }
    
     public void setPBData(ArrayList<PhongBanDTO> departments)
     {
            for (PhongBanDTO department : departments) {
                defaultTableModel.addRow(new Object[]
                {
                    department.getMaPB(),
                    department.getTenPB(),
                    department.getSoDienThoai()
                });
            }


    }



                                    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BangPhongban = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        MaPB = new javax.swing.JTextField();
        TenPB = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        SoDT = new javax.swing.JTextField();
        Deletebt = new javax.swing.JButton();
        Savebt = new javax.swing.JButton();
        Thembt = new javax.swing.JButton();
        TimKiembt = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablePhongban = new javax.swing.JTable();

        BangPhongban.setBackground(new java.awt.Color(255, 255, 255));
        BangPhongban.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BangPhongban.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PHÒNG BAN");
        jLabel23.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Mã Phòng Ban");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tên Phòng Ban");

        MaPB.setBackground(new java.awt.Color(255, 255, 255));
        MaPB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        MaPB.setForeground(new java.awt.Color(0, 0, 0));
        MaPB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        TenPB.setBackground(new java.awt.Color(255, 255, 255));
        TenPB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TenPB.setForeground(new java.awt.Color(0, 0, 0));
        TenPB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Số Điện Thoại");

        SoDT.setBackground(new java.awt.Color(255, 255, 255));
        SoDT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SoDT.setForeground(new java.awt.Color(0, 0, 0));
        SoDT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoDTActionPerformed(evt);
            }
        });

        Deletebt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Deletebt.setForeground(new java.awt.Color(255, 0, 0));
        Deletebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/remove.png"))); // NOI18N
        Deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtActionPerformed(evt);
            }
        });

        Savebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/edit.png"))); // NOI18N
        Savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtActionPerformed(evt);
            }
        });

        Thembt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Thembt.setForeground(new java.awt.Color(255, 51, 51));
        Thembt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/add.png"))); // NOI18N
        Thembt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThembtActionPerformed(evt);
            }
        });

        TimKiembt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/save.png"))); // NOI18N
        TimKiembt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiembtActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Thêm");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Sửa");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Lưu");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Xóa");

        tablePhongban.setBackground(new java.awt.Color(255, 255, 255));
        tablePhongban.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePhongban.setForeground(new java.awt.Color(0, 0, 0));
        tablePhongban.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng Ban", "Tên Phòng Ban", "Số Điện Thoại", "Số Nhân Viên"
            }
        ));
        tablePhongban.setRowHeight(30);
        tablePhongban.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tablePhongban);

        javax.swing.GroupLayout BangPhongbanLayout = new javax.swing.GroupLayout(BangPhongban);
        BangPhongban.setLayout(BangPhongbanLayout);
        BangPhongbanLayout.setHorizontalGroup(
            BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BangPhongbanLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BangPhongbanLayout.createSequentialGroup()
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenPB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BangPhongbanLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BangPhongbanLayout.createSequentialGroup()
                                .addComponent(Thembt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Savebt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimKiembt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BangPhongbanLayout.createSequentialGroup()
                        .addComponent(MaPB, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BangPhongbanLayout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(560, 560, 560))
            .addGroup(BangPhongbanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        BangPhongbanLayout.setVerticalGroup(
            BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BangPhongbanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BangPhongbanLayout.createSequentialGroup()
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaPB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenPB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BangPhongbanLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BangPhongbanLayout.createSequentialGroup()
                                .addComponent(Deletebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30))
                            .addGroup(BangPhongbanLayout.createSequentialGroup()
                                .addComponent(TimKiembt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addGroup(BangPhongbanLayout.createSequentialGroup()
                                .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Thembt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Savebt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BangPhongbanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1259, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BangPhongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BangPhongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoDTActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_SoDTActionPerformed

    private void DeletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtActionPerformed
    int row = tablePhongban.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban cần xóa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không ?");

            if (confirm == JOptionPane.YES_OPTION) {
                String departmentTableCode = String.valueOf(tablePhongban.getValueAt(row, 0));

                phongBanBus.deletePhongBan(departmentTableCode);
                defaultTableModel.setRowCount(0);
                setPBData(phongBanBus.getPhongBan());
            }
        }
        MaPB.setText("");
        TenPB.setText("");
        SoDT.setText("");
    }//GEN-LAST:event_DeletebtActionPerformed
    


    private void SavebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtActionPerformed
        // TODO add your handling code here:
    int row = tablePhongban.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng ban cần sửa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            PhongBanDTO phongBanDTO = new PhongBanDTO();
            phongBanDTO.setMaPB(MaPB.getText());
            phongBanDTO.setTenPB(TenPB.getText());
            phongBanDTO.setSoDienThoai(SoDT.getText());
            phongBanBus.updatePhongBan(phongBanDTO);
            
            JOptionPane.showMessageDialog(this, "Sửa phòng ban thành công !!!");
            defaultTableModel.setRowCount(0);
            setPBData(phongBanBus.getPhongBan());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_SavebtActionPerformed

    private void ThembtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThembtActionPerformed
        if ("".equals(MaPB.getText()) ||
                "".trim().equals(TenPB.getText())) {
                JOptionPane.showMessageDialog(this, 
                        "Không được bỏ trống dữ liệu nhập vào !!!", "Lỗi", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                phongBanDTO.setMaPB(MaPB.getText());
                phongBanDTO.setTenPB(TenPB.getText());
                phongBanDTO.setSoDienThoai(SoDT.getText());
                phongBanBus.addPhongBan(phongBanDTO);
                JOptionPane.showMessageDialog(this, "Thêm phòng ban thành công !!!");
                defaultTableModel.setRowCount(0);
                setPBData(phongBanBus.getPhongBan());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
        
    }//GEN-LAST:event_ThembtActionPerformed

    private void TimKiembtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiembtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiembtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BangPhongban;
    private javax.swing.JButton Deletebt;
    private javax.swing.JTextField MaPB;
    private javax.swing.JButton Savebt;
    private javax.swing.JTextField SoDT;
    private javax.swing.JTextField TenPB;
    private javax.swing.JButton Thembt;
    private javax.swing.JButton TimKiembt;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablePhongban;
    // End of variables declaration//GEN-END:variables
}
