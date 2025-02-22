/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DAO.DAO_NhanVien;

import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class GUI_NhanVien extends javax.swing.JPanel {

	/**
	 * Creates new form GUI_NhanVien
	 */
	public GUI_NhanVien() {
		initComponents();

		// Tạo đối tượng DAO_NhanVien
		DAO_NhanVien daoNhanVien = new DAO_NhanVien();

		// Gọi phương thức loadDataToTable để load dữ liệu vào bảng
		loadDataToTable(daoNhanVien);
		init();
		// Xử lý sự kiện cho checkbox Quản lý
		jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				if (jCheckBox1.isSelected()) {
					jCheckBox2.setSelected(false); // Hủy chọn checkbox Nhân viên khi chọn checkbox Quản lý
				}
			}
		});

		// Xử lý sự kiện cho checkbox Nhân viên
		jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				if (jCheckBox2.isSelected()) {
					jCheckBox1.setSelected(false); // Hủy chọn checkbox Quản lý khi chọn checkbox Nhân viên
				}
			}
		});
		// Xử lý sự kiện cho checkbox Quản lý
		jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				if (jRadioButton1.isSelected()) {
					jRadioButton2.setSelected(false); // Hủy chọn checkbox Nhân viên khi chọn checkbox Quản lý
				}
			}
		});

		// Xử lý sự kiện cho checkbox Nhân viên
		jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				if (jRadioButton2.isSelected()) {
					jRadioButton1.setSelected(false); // Hủy chọn checkbox Quản lý khi chọn checkbox Nhân viên
				}
			}
		});

	}

	// Phương thức load dữ liệu lên bảng NV
	private void loadDataToTable(DAO_NhanVien daoNhanVien) {
		// Gọi DAO_NhanVien để lấy dữ liệu
		DefaultTableModel model = daoNhanVien.loadDataToTable();

		// Đặt model vào JTable
		NV.setModel(model);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		NV = new javax.swing.JTable();
		jLabel9 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jCheckBox2 = new javax.swing.JCheckBox();

		setLayout(new java.awt.BorderLayout());

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(21, 115, 135));
		jLabel2.setText("QUẢN LÝ NHÂN VIÊN");

		jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel1.setText("Tìm Kiếm Theo Mã Nhân Viên ");
		jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/TimKiem2.png"))); // NOI18N
		jLabel3.setMaximumSize(new java.awt.Dimension(140, 40));
		jLabel3.setMinimumSize(new java.awt.Dimension(140, 40));
		jLabel3.setPreferredSize(new java.awt.Dimension(140, 40));
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel3MouseClicked(evt);
			}
		});

		jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel4.setText("Mã Nhân Viên :");
		jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel5.setText("Họ Và Tên");
		jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel6.setText("Số Điện Thoại :");
		jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel7.setText("Email ");
		jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel8.setText("Giới Tính");
		jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		NV.setBackground(new java.awt.Color(217, 217, 217));
		NV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		NV.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Mã Nhân Viên", "Tên Nhân Viên", "Email", "Địa Chỉ", "Số Điện Thoại", "Giới Tính",
				"Mã Tài Khoản" }));
		NV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
		NV.setGridColor(new java.awt.Color(0, 0, 0));
		NV.setRowHeight(40);
		NV.setSelectionBackground(new java.awt.Color(153, 153, 153));
		NV.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				NVMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(NV);

		jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
		jLabel9.setText("Địa Chỉ");
		jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
		jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jRadioButton1.setText("Nam");

		jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
		jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jRadioButton2.setText("Nữ");

		jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		jLabel11.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
		jLabel11.setText("Avatar");

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Cập nhật1.png"))); // NOI18N
		jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel12MouseClicked(evt);
			}
		});

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Xóa 1.png"))); // NOI18N
		jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel13MouseClicked(evt);
			}
		});

		jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Thêm1.png"))); // NOI18N
		jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel14MouseClicked(evt);
			}
		});

		jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
		jLabel15.setText("Chọn ảnh");

		jButton1.setBackground(new java.awt.Color(21, 115, 135));
		jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Chọn ảnh");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
		jLabel16.setText("Chức Vụ ");

		jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jCheckBox1.setText("Nhân Viên");

		jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jCheckBox2.setText("Quản Lý");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 371,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(46, 46, 46)))
										.addGap(19, 19, 19))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
														1060, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(49, 49, 49))))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 260,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 260,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
								.addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
						.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(86, 86,
								86)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(76, 76, 76).addComponent(jLabel16)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(149, 149, 149))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 348,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 348,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jRadioButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jRadioButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 58,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(38, 38, 38).addComponent(jCheckBox1)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jCheckBox2)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel15).addGap(18, 18, 18)
																.addComponent(jButton1))
														.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE,
																169, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(105, 105, 105))))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(102, 102, 102).addComponent(jLabel14)
								.addGap(158, 158, 158).addComponent(jLabel12).addGap(183, 183, 183)
								.addComponent(jLabel13)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jLabel11).addGap(21, 21, 21)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel15).addComponent(jButton1)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(16, 16, 16)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
																30, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE, 39,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jLabel8,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 30,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel16))
														.addGap(18, 18, 18)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jRadioButton1).addComponent(jRadioButton2)
																.addComponent(jCheckBox1).addComponent(jCheckBox2)))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
																30, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE, 34,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(39, 39, 39).addComponent(jLabel9,
																javax.swing.GroupLayout.PREFERRED_SIZE, 30,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(17, 17, 17)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel13))
								.addComponent(jLabel14))
						.addGap(384, 384, 384)));

		jLabel1.getAccessibleContext().setAccessibleDescription("");

		add(jPanel1, java.awt.BorderLayout.CENTER);
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField2ActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField3ActionPerformed

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField4ActionPerformed

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField5ActionPerformed

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField6ActionPerformed

	private void NVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NVMouseClicked

	}// GEN-LAST:event_NVMouseClicked

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
		// Lấy mã nhân viên từ ô nhập liệu
		String maNhanVien = jTextField1.getText().trim();

		// Kiểm tra nếu mã nhân viên không rỗng
		if (!maNhanVien.isEmpty()) {
			// Bỏ chọn tất cả các hàng trước khi tìm kiếm
			NV.clearSelection();

			// Duyệt qua tất cả các hàng trong bảng để tìm kiếm mã nhân viên
			boolean found = false;
			for (int i = 0; i < NV.getRowCount(); i++) {
				String maNV = NV.getValueAt(i, 0).toString(); // Giả sử mã nhân viên ở cột 0

				// Nếu tìm thấy mã nhân viên, tô đậm hàng đó
				if (maNV.equals(maNhanVien)) {
					NV.setRowSelectionInterval(i, i); // Tô đậm hàng tìm thấy
					found = true;
					break; // Thoát vòng lặp ngay sau khi tìm thấy
				}
			}

			// Nếu không tìm thấy, hiển thị thông báo
			if (!found) {
				JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên!");
		}
	}

	private void jLabel3MouseClicked1(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
		// Lấy mã nhân viên từ ô nhập liệu
		String maNhanVien = jTextField1.getText().trim();

		// Kiểm tra nếu mã nhân viên không rỗng
		if (!maNhanVien.isEmpty()) {
			// Bỏ chọn tất cả các hàng trước khi tìm kiếm
			NV.clearSelection();

			// Duyệt qua tất cả các hàng trong bảng để tìm kiếm mã nhân viên
			boolean found = false;
			for (int i = 0; i < NV.getRowCount(); i++) {
				String maNV = NV.getValueAt(i, 0).toString(); // Giả sử mã nhân viên ở cột 0

				// Nếu tìm thấy mã nhân viên, tô đậm hàng đó
				if (maNV.equals(maNhanVien)) {
					NV.setRowSelectionInterval(i, i); // Tô đậm hàng tìm thấy
					found = true;
					break; // Thoát vòng lặp ngay sau khi tìm thấy
				}
			}

			// Nếu không tìm thấy, hiển thị thông báo
			if (!found) {
				JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên!");
		}
	}// GEN-LAST:event_jLabel3MouseClicked

	private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {
		// Lấy dữ liệu từ bảng vào một danh sách
		DefaultTableModel model = (DefaultTableModel) NV.getModel();
		List<Object[]> rowDataList = new ArrayList<>();

		// Duyệt qua các dòng trong bảng và thêm vào danh sách
		for (int i = 0; i < model.getRowCount(); i++) {
			Object[] rowData = new Object[model.getColumnCount()];
			for (int j = 0; j < model.getColumnCount(); j++) {
				rowData[j] = model.getValueAt(i, j);
			}
			rowDataList.add(rowData);
		}

		// Lấy thông tin từ các trường nhập liệu
		String maNV = jTextField2.getText().trim(); // Mã nhân viên
		String hoTen = jTextField3.getText().trim(); // Họ tên
		String soDienThoai = jTextField4.getText().trim(); // Số điện thoại
		String email = jTextField5.getText().trim(); // Email
		String gioiTinh = jRadioButton1.isSelected() ? "Nam" : (jRadioButton2.isSelected() ? "Nữ" : ""); // Giới tính
		String diaChi = jTextField6.getText().trim(); // Địa chỉ
		String imageName = imageFileName; // Lấy tên ảnh
		String maTaiK = "MaTaiKPlaceholder"; // Lấy mã tài khoản (thay thế bằng giá trị thực tế nếu có)

		// Lấy thông tin chức vụ từ checkbox hoặc combobox
		String chucVu = "";
		if (jCheckBox1.isSelected()) {
			chucVu = "Nhân Viên";
		} else if (jCheckBox2.isSelected()) {
			chucVu = "Quản Lý";
		}

		// Kiểm tra xem nhân viên có tồn tại trong CSDL không
		DAO_NhanVien dao = new DAO_NhanVien();
		if (!dao.isEmployeeExists(maNV)) {
			JOptionPane.showMessageDialog(this, "Mã nhân viên không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Cập nhật thông tin nhân viên trong CSDL bao gồm cả chức vụ
		boolean isUpdated = dao.updateNhanVien(maNV, hoTen, email, diaChi, soDienThoai, gioiTinh, imageName, chucVu);

		if (isUpdated) {
			// Nếu cập nhật thành công, cập nhật trực tiếp dòng trong bảng GUI
			int updatedRow = -1;
			for (int i = 0; i < model.getRowCount(); i++) {
				if (model.getValueAt(i, 0).equals(maNV)) { // Cột 0 là MaNhanVien
					updatedRow = i;
					break;
				}
			}

			// Nếu tìm thấy dòng cần cập nhật, thay đổi thông tin của nó
			if (updatedRow != -1) {
				model.setValueAt(hoTen, updatedRow, 1); // Cập nhật Họ tên
				model.setValueAt(email, updatedRow, 2); // Cập nhật Email
				model.setValueAt(diaChi, updatedRow, 3); // Cập nhật Địa chỉ
				model.setValueAt(soDienThoai, updatedRow, 4); // Cập nhật Số điện thoại
				model.setValueAt(gioiTinh, updatedRow, 5); // Cập nhật Giới tính
				model.setValueAt(imageName, updatedRow, 6); // Cập nhật Hình ảnh (hoặc cột tương ứng)
				model.setValueAt(chucVu, updatedRow, 8); // Cập nhật Chức vụ (hoặc cột tương ứng sau Mã Tài Khoản)
			}

			JOptionPane.showMessageDialog(this, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Cập nhật thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {
// Lấy chỉ số dòng được chọn từ bảng
		int selectedRow = NV.getSelectedRow();

		// Kiểm tra xem người dùng đã chọn dòng nào chưa
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(null, "Vui lòng chọn một nhân viên để xóa.", "Thông báo",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Lấy mã nhân viên từ cột "MaNhanVien" của dòng đã chọn
		String maNhanVien = NV.getValueAt(selectedRow, 0).toString(); // 0 là chỉ số cột "MaNhanVien"

		// Xác nhận hành động xóa
		int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận",
				JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			// Gọi phương thức xóa từ DAO_NhanVien
			DAO_NhanVien dao = new DAO_NhanVien();
			boolean result = dao.deleteNhanVien(maNhanVien); // Xóa nhân viên theo mã

			// Kiểm tra kết quả xóa và cập nhật lại bảng nếu thành công
			if (result) {
				// Cập nhật lại bảng sau khi xóa (loại bỏ dòng đã xóa khỏi model)
				DefaultTableModel model = (DefaultTableModel) NV.getModel();
				model.removeRow(selectedRow); // Xóa dòng khỏi bảng

				JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!", "Thông báo",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Xóa nhân viên không thành công.", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void reloadTableData() {
		// Tải lại dữ liệu từ cơ sở dữ liệu vào bảng
		DAO_NhanVien dao = new DAO_NhanVien();
		DefaultTableModel model = dao.loadDataToTable(); // Tải lại dữ liệu từ CSDL
		NV.setModel(model); // Cập nhật lại bảng
	}

	private String imageFileName = ""; // Biến toàn cục để lưu tên file ảnh

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// Tạo đối tượng JFileChooser để người dùng chọn file ảnh
		JFileChooser fileChooser = new JFileChooser();

		// Đặt thư mục gốc mặc định cho JFileChooser là thư mục IMG trong thư mục src
		File defaultDirectory = new File("src/IMG/NhanVien"); // "src/IMG" là thư mục IMG trong thư mục src
		if (!defaultDirectory.exists()) {
			defaultDirectory.mkdirs(); // Nếu thư mục IMG không tồn tại, tạo thư mục mới
		}
		fileChooser.setCurrentDirectory(defaultDirectory); // Thiết lập thư mục mặc định cho JFileChooser

		// Bộ lọc chỉ cho phép chọn file ảnh có định dạng JPEG & PNG
		fileChooser.setFileFilter(new FileNameExtensionFilter("Ảnh JPEG & PNG", "jpg", "jpeg", "png"));

		// Hiển thị hộp thoại để người dùng chọn file
		int result = fileChooser.showOpenDialog(this);

		if (result == JFileChooser.APPROVE_OPTION) {
			// Lấy đường dẫn của file ảnh đã chọn
			File selectedFile = fileChooser.getSelectedFile();

			// Tạo đường dẫn tương đối từ thư mục gốc
			String relativePath = "src/IMG/NhanVien/" + selectedFile.getName(); // Đường dẫn tương đối từ thư mục gốc

			// Lưu đường dẫn vào biến
			imageFileName = relativePath;

			// Tạo một ImageIcon từ file ảnh
			ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());

			// Thay đổi kích thước ảnh cho vừa với kích thước JLabel (jLabel10)
			Image image = imageIcon.getImage(); // Chuyển đổi từ ImageIcon thành Image
			Image scaledImage = image.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
			imageIcon = new ImageIcon(scaledImage);

			// Gán ImageIcon cho jLabel10 để hiển thị ảnh
			jLabel10.setIcon(imageIcon);

			// Hiển thị thông báo người dùng đã chọn ảnh thành công
			JOptionPane.showMessageDialog(this, "Bạn đã chọn: " + selectedFile.getName());
		}
	}

	private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {
		// Lấy dữ liệu từ các trường nhập liệu
		String maNV = jTextField2.getText().trim();
		String hoTen = jTextField3.getText().trim();
		String soDienThoai = jTextField4.getText().trim();
		String email = jTextField5.getText().trim();
		String gioiTinh = jRadioButton1.isSelected() ? "Nam" : (jRadioButton2.isSelected() ? "Nữ" : "");
		String diaChi = jTextField6.getText().trim();

		// Kiểm tra chức vụ từ các checkbox
		String chucVu = "";
		if (jCheckBox1.isSelected()) {
			chucVu += "Nhân Viên, ";
		}
		if (jCheckBox2.isSelected()) {
			chucVu += "Quản Lý, ";
		}

		// Loại bỏ dấu phẩy cuối cùng nếu có
		if (chucVu.endsWith(", ")) {
			chucVu = chucVu.substring(0, chucVu.length() - 2);
		}

		// Kiểm tra họ tên
		if (hoTen.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên!", "Thông báo", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Kiểm tra họ tên có ít nhất 2 từ
		String[] parts = hoTen.split("\\s+");
		if (parts.length < 2) {
			JOptionPane.showMessageDialog(this, "Họ tên phải có ít nhất hai từ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Kiểm tra chữ cái đầu của mỗi từ phải in hoa
		for (String part : parts) {
			if (!Character.isUpperCase(part.charAt(0))) {
				JOptionPane.showMessageDialog(this, "Chữ cái đầu của mỗi từ trong họ tên phải in hoa!", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		}

		if (!hoTen.matches("^[a-zA-Zàáạảãèéẹẻẽìíịỉĩòóọỏõùúụủũỳýỵỷỹ\\s]+$")) {
			JOptionPane.showMessageDialog(this, "Họ tên chỉ được chứa chữ cái và khoảng trắng!", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Kiểm tra số điện thoại hợp lệ
		if (soDienThoai.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!", "Thông báo",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		if (soDienThoai.length() != 10 || !soDienThoai.matches("\\d+")) {
			JOptionPane.showMessageDialog(this, "Số điện thoại phải có 10 chữ số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Kiểm tra email hợp lệ
		if (email.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập email!", "Thông báo", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
			JOptionPane.showMessageDialog(this, "Email không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Kiểm tra ảnh đã được chọn
		if (imageFileName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn ảnh cho nhân viên!", "Thông báo",
					JOptionPane.WARNING_MESSAGE);
			return; // Dừng lại nếu chưa chọn ảnh
		}

		// Tạo mã tài khoản tự động: "TK" + số ngẫu nhiên 3 chữ số
		String maTaiKhoan = generateRandomAccountCode();

		// Tạo đối tượng DAO và gọi phương thức thêm nhân viên vào CSDL
		DAO_NhanVien dao = new DAO_NhanVien();
		boolean isAdded = dao.addNhanVien(maNV, hoTen, email, diaChi, soDienThoai, gioiTinh, imageFileName, maTaiKhoan,
				chucVu);

		if (isAdded) {
			// Nếu thêm thành công, cập nhật lại bảng và thông báo cho người dùng
			DefaultTableModel model = (DefaultTableModel) NV.getModel();
			model.addRow(new Object[] { maNV, hoTen, email, diaChi, soDienThoai, gioiTinh, imageFileName, maTaiKhoan,
					chucVu });

			// Reset các trường nhập liệu
			jTextField2.setText("");
			jTextField3.setText("");
			jTextField4.setText("");
			jTextField5.setText("");
			jTextField6.setText("");
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);

			JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			// Nếu không thành công, thông báo lỗi
			JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Hàm tạo mã tài khoản ngẫu nhiên với định dạng "TK" và 3 chữ số ngẫu nhiên
	private String generateRandomAccountCode() {
		Random rand = new Random();
		int randomNum = rand.nextInt(1000); // Lấy số ngẫu nhiên trong phạm vi từ 0 đến 999
		return String.format("TK%03d", randomNum); // Định dạng lại thành "TK" + 3 chữ số (ví dụ: TK001, TK123)
	}

	private void setupTableSelectionListener() {
		// Lắng nghe sự thay đổi khi người dùng chọn một hàng
		NV.getSelectionModel().addListSelectionListener(e -> {
			// Kiểm tra nếu người dùng đã chọn một hàng hợp lệ
			if (!e.getValueIsAdjusting()) {
				int selectedRow = NV.getSelectedRow();
				if (selectedRow != -1) { // Kiểm tra nếu có dòng được chọn
					// Lấy dữ liệu từ dòng được chọn
					String maNV = NV.getValueAt(selectedRow, 0).toString();
					String hoTen = NV.getValueAt(selectedRow, 1).toString();
					String email = NV.getValueAt(selectedRow, 2).toString();
					String diaChi = NV.getValueAt(selectedRow, 3).toString();
					String soDienThoai = NV.getValueAt(selectedRow, 4).toString();
					String gioiTinh = NV.getValueAt(selectedRow, 5).toString();
					String imageName = NV.getValueAt(selectedRow, 6).toString();
					String chucVu = NV.getValueAt(selectedRow, 7).toString();

					// Cập nhật dữ liệu vào các trường nhập liệu
					jTextField2.setText(maNV); // Mã nhân viên
					jTextField3.setText(hoTen); // Họ tên
					jTextField4.setText(soDienThoai); // Số điện thoại
					jTextField5.setText(email); // Email
					jTextField6.setText(diaChi); // Địa chỉ

					// Cập nhật giới tính
					if ("Nam".equals(gioiTinh)) {
						jRadioButton1.setSelected(true);
						jRadioButton2.setSelected(false);
					} else if ("Nữ".equals(gioiTinh)) {
						jRadioButton1.setSelected(false);
						jRadioButton2.setSelected(true);
					}
					// Cập nhật Chức Vụ
					if ("Quản Lý".equals(chucVu)) {
						jCheckBox1.setSelected(true);
						jCheckBox2.setSelected(false);
					} else if ("Nhân Viên".equals(chucVu)) {
						jCheckBox1.setSelected(false);
						jCheckBox2.setSelected(true);
					}

					// Cập nhật Anh
					ImageIcon imageIcon = new ImageIcon(imageName);
					Image image = imageIcon.getImage(); // Chuyển đổi từ ImageIcon thành Image
					Image scaledImage = image.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(),
							Image.SCALE_SMOOTH);
					imageIcon = new ImageIcon(scaledImage);
					jLabel10.setIcon(imageIcon);
				}
			}
		});
	}

	// Gọi phương thức này trong phần khởi tạo hoặc constructor của form
	private void init() {
		setupTableSelectionListener();
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTable NV;
	private javax.swing.JButton jButton1;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}
