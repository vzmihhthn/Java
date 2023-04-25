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
import java.text.DateFormat;
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
public class BNhanvien extends javax.swing.JPanel {

    /**
     * Creates new form BNhanvien
     */
    NhanvienBUS nhanvienbus;
    NhanvienDTO nhanviendto;
    PhongBanBUS phongbanbus;
    PhongBanDTO phongbandto;
    DefaultTableModel defaultTableModel;
    public BNhanvien() {
        initComponents();
        nhanvienbus = new NhanvienBUS();
        nhanviendto = new NhanvienDTO();
        phongbanbus = new PhongBanBUS();
        setdatacombophban();
        defaultTableModel = new DefaultTableModel()
                { @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
                };
        tablenhvien.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã Nhân Viên");
        defaultTableModel.addColumn("Tên Nhân Viên");
        defaultTableModel.addColumn("Giới Tính");
        defaultTableModel.addColumn("Ngày Sinh");
        defaultTableModel.addColumn("Địa Chỉ");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Số Điện Thoại");
        defaultTableModel.addColumn("Ngày Vào Làm");
        defaultTableModel.addColumn("Số CMND");
        defaultTableModel.addColumn("Tên Chức Vụ");
        defaultTableModel.addColumn("Tên Phòng Ban");
        defaultTableModel.addColumn("Tên Dự Án");
        
        setnhanvienData(nhanvienbus.getNhanvien());
        
        
        tablenhvien.addMouseListener(new MouseAdapter()
        {
                public void mouseClicked(MouseEvent e) 
        {
            int row = tablenhvien.getSelectedRow();
            if (row >= 0) 
            {
                
                String MaNv = "";
                String TenNv = "";
                String Gioitinh = "";
                String ngaysinh = "";
                String Diachi = "";
                String Email = "";
                String sdt = "";
                String socmnd = "";
                String TenCv = "";
                String TenPB = "";
                String TenDA = "";
                
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                if (tablenhvien.getValueAt(row, 0) != null) {
                    MaNv = tablenhvien.getValueAt(row, 0).toString();
                }
                if (tablenhvien.getValueAt(row, 1) != null) {
                    TenNv = tablenhvien.getValueAt(row, 1).toString();
                }
                if (tablenhvien.getValueAt(row, 2) != null) {
                    Gioitinh = tablenhvien.getValueAt(row, 2).toString();
                   
                }

                Object ngaysinhObj = tablenhvien.getValueAt(row, 3);
                if (ngaysinhObj != null) {
                    ngaysinh = dateFormat.format((Date) ngaysinhObj);
                }
                if (tablenhvien.getValueAt(row, 4) != null) {
                    Diachi = tablenhvien.getValueAt(row, 4).toString();
                }
                if (tablenhvien.getValueAt(row, 5) != null) {
                    Email = tablenhvien.getValueAt(row, 5).toString();
                }
                if (tablenhvien.getValueAt(row, 6) != null) {
                    sdt = tablenhvien.getValueAt(row, 6).toString();
                }
                String ngayvaolam = "";
                
                Object ngayvaolamObj = tablenhvien.getValueAt(row, 7);
                if (ngayvaolamObj != null) {
                    ngayvaolam = dateFormat.format((Date) ngayvaolamObj);
                }
                
                if (tablenhvien.getValueAt(row, 8) != null) {
                    socmnd = tablenhvien.getValueAt(row, 8).toString();
                }
                if (tablenhvien.getValueAt(row, 9) != null) {
                    TenCv = tablenhvien.getValueAt(row, 9).toString();
                }
                
                if (tablenhvien.getValueAt(row, 10) != null) {
                    TenPB = tablenhvien.getValueAt(row, 10).toString();
                }
                
                if (tablenhvien.getValueAt(row, 11) != null) {
                    TenDA = tablenhvien.getValueAt(row, 11).toString();
                }


                manvf.setText(MaNv);
                tennvf.setText(TenNv);
                 if (Gioitinh.equals("Nam")) {
                        jradionam.setSelected(true);
                            } else {
                     jradionu.setSelected(true);
                            }
                ngaysinhf.setText(ngaysinh);
                diachif.setText(Diachi);
                emailf.setText(Email);
                sdtf.setText(sdt);
                nvaolamf.setText(ngayvaolam);
                socmndf.setText(socmnd);
                pbanbox.setSelectedItem(TenPB);
                
                
            }
}

            });
        
        
    }
    
    public void setnhanvienData(ArrayList<NhanvienDTO> nhvlist)
     {
            for (NhanvienDTO nhv : nhvlist) 
            {
                defaultTableModel.addRow(new Object[]
                {
                    nhv.getMaNv(),
                    nhv.getTenNv(),
                    nhv.getGioitinh(),
                    nhv.getNgaysinh(),
                    nhv.getDiachi(),
                    nhv.getEmail(),
                    nhv.getSodienthoai(),
                    nhv.getNgayvaolam(),
                    nhv.getSoCMND(),
                    nhv.getTenCvnv(),
                    nhv.getTenPbnv(),
                    nhv.getTendanv(),
                });
            }
     }
    public  void setdatacombophban()
            
    {
        pbanbox.removeAllItems();
        ArrayList<PhongBanDTO> pblist = new ArrayList();
        pblist = phongbanbus.getPhongBan();
        for (PhongBanDTO pb : pblist )
        {
            pbanbox.addItem(pb.getTenPB());
        }
    }
    public  void setdatacombocvu()
    {
//        chucvubox.removeAllItems();
//        ArrayList<PhongBanDTO> pblist = new ArrayList();
//        pblist = phongbanbus.getPhongBan();
//        for (PhongBanDTO pb : pblist )
//        {
//            pbanbox.addItem(pb.getTenPB());
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        manvf = new javax.swing.JTextField();
        tennvf = new javax.swing.JTextField();
        sdtf = new javax.swing.JTextField();
        jradionam = new javax.swing.JRadioButton();
        jradionu = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        diachif = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        socmndf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablenhvien = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailf = new javax.swing.JTextField();
        ngaysinhf = new javax.swing.JTextField();
        nvaolamf = new javax.swing.JTextField();
        pbanbox = new javax.swing.JComboBox<>();
        chucvubox = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("THÔNG TIN NHÂN VIÊN");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Mã Nhân Viên");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Tên Nhân Viên");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Giới Tính");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Số Điện Thoại");

        manvf.setBackground(new java.awt.Color(255, 255, 255));
        manvf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manvf.setForeground(new java.awt.Color(0, 0, 0));
        manvf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tennvf.setBackground(new java.awt.Color(255, 255, 255));
        tennvf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tennvf.setForeground(new java.awt.Color(0, 0, 0));
        tennvf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tennvf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tennvfActionPerformed(evt);
            }
        });

        sdtf.setBackground(new java.awt.Color(255, 255, 255));
        sdtf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sdtf.setForeground(new java.awt.Color(0, 0, 0));
        sdtf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sdtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdtfActionPerformed(evt);
            }
        });

        jradionam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jradionam);
        jradionam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jradionam.setText("Nam");

        jradionu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jradionu);
        jradionu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jradionu.setText("Nữ");
        jradionu.setBorder(null);
        jradionu.setIconTextGap(5);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Địa Chỉ");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Chức Vụ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Số CMND");

        diachif.setBackground(new java.awt.Color(255, 255, 255));
        diachif.setColumns(15);
        diachif.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diachif.setForeground(new java.awt.Color(0, 0, 0));
        diachif.setRows(3);
        diachif.setTabSize(6);
        jScrollPane3.setViewportView(diachif);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Ngày Vào Làm");

        socmndf.setBackground(new java.awt.Color(255, 255, 255));
        socmndf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        socmndf.setForeground(new java.awt.Color(0, 0, 0));
        socmndf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        socmndf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socmndfActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Ngày Sinh");

        tablenhvien.setAutoCreateRowSorter(true);
        tablenhvien.setBackground(new java.awt.Color(255, 255, 255));
        tablenhvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablenhvien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablenhvien.setForeground(new java.awt.Color(0, 0, 0));
        tablenhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Email", "Số Điện Thoại", "Chức Vụ", "Phòng Ban", "Số Căn Cước CD", "Ngày Vào Làm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablenhvien.setRowHeight(30);
        tablenhvien.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablenhvien.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablenhvien);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/add.png"))); // NOI18N
        jButton5.setText("THÊM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/edit.png"))); // NOI18N
        jButton6.setText("SỬA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("W:\\Java\\Java_QLNS\\src\\Picture\\Saki-NuoveXT-2-Actions-document-find.32.png")); // NOI18N
        jButton7.setText("Tìm Kiếm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/remove.png"))); // NOI18N
        jButton8.setText("XÓA");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Phòng Ban");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email");

        emailf.setBackground(new java.awt.Color(255, 255, 255));
        emailf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailf.setForeground(new java.awt.Color(0, 0, 0));
        emailf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        ngaysinhf.setBackground(new java.awt.Color(255, 255, 255));
        ngaysinhf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ngaysinhf.setForeground(new java.awt.Color(0, 0, 0));
        ngaysinhf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        nvaolamf.setBackground(new java.awt.Color(255, 255, 255));
        nvaolamf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nvaolamf.setForeground(new java.awt.Color(0, 0, 0));
        nvaolamf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pbanbox.setBackground(new java.awt.Color(255, 255, 255));
        pbanbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pbanbox.setForeground(new java.awt.Color(0, 0, 0));

        chucvubox.setBackground(new java.awt.Color(255, 255, 255));
        chucvubox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chucvubox.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manvf, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(tennvf)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jradionam)
                                .addGap(43, 43, 43)
                                .addComponent(jradionu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sdtf)
                            .addComponent(ngaysinhf)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(socmndf)))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel12)
                        .addContainerGap(498, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(emailf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(nvaolamf, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(chucvubox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pbanbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 153, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manvf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbanbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tennvf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chucvubox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jradionam)
                                .addComponent(jradionu))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(nvaolamf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ngaysinhf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sdtf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(socmndf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tennvfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tennvfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tennvfActionPerformed

    private void sdtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdtfActionPerformed

    private void socmndfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socmndfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socmndfActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> chucvubox;
    private javax.swing.JTextArea diachif;
    private javax.swing.JTextField emailf;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton jradionam;
    private javax.swing.JRadioButton jradionu;
    private javax.swing.JTextField manvf;
    private javax.swing.JTextField ngaysinhf;
    private javax.swing.JTextField nvaolamf;
    private javax.swing.JComboBox<String> pbanbox;
    private javax.swing.JTextField sdtf;
    private javax.swing.JTextField socmndf;
    private javax.swing.JTable tablenhvien;
    private javax.swing.JTextField tennvf;
    // End of variables declaration//GEN-END:variables
}
