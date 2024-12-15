/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAO.DAO_HangBay;
import ENTITY.HangBay;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class GUI_HangBay extends javax.swing.JPanel {

	// bien table
	String headCollum[] = new String[] { "Mã hãng bay", "Tên hãng bay", "Quốc gia" };
	private DefaultTableModel modelHB = new DefaultTableModel(headCollum, 0);

	// dao
	private DAO_HangBay dao_hb = new DAO_HangBay();

	// list
	private ArrayList<HangBay> listHangBay;

	/**
	 * Creates new form GUI_HangBay
	 */
	public GUI_HangBay() {
		listHangBay = dao_hb.getalltbHangBay();

		initComponents();
		duaDuLieuVaoModule();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jpBang = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        maHB = new javax.swing.JLabel();
        txtMaHB = new javax.swing.JTextField();
        tenHB = new javax.swing.JLabel();
        txtTenHB = new javax.swing.JTextField();
        timKiem = new javax.swing.JLabel();
        quocGia = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        txtQuocGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jtableBang = new javax.swing.JScrollPane();
        bangHB = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        qLyHB = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jpBang.setLayout(new java.awt.BorderLayout());

        btnMoi.setBackground(new java.awt.Color(25, 145, 166));
        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnMoi.setText("Mới");
        btnMoi.setPreferredSize(new java.awt.Dimension(100, 40));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        maHB.setText("Mã hãng bay");

        txtMaHB.setEnabled(false);
        txtMaHB.setPreferredSize(new java.awt.Dimension(64, 40));

        tenHB.setText("Tên hãng bay");

        txtTenHB.setPreferredSize(new java.awt.Dimension(64, 40));

        timKiem.setText("Tìm kiếm hãng bay theo tên hãng");

        quocGia.setText("Quốc gia");

        txtTimKiem.setPreferredSize(new java.awt.Dimension(64, 40));

        txtQuocGia.setPreferredSize(new java.awt.Dimension(64, 40));

        btnThem.setBackground(new java.awt.Color(25, 145, 166));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(100, 40));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(25, 145, 166));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(25, 145, 166));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 40));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(25, 145, 166));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setPreferredSize(new java.awt.Dimension(100, 40));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        bangHB.setModel(modelHB);
        bangHB.setRowHeight(30);
        bangHB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bangHBAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtableBang.setViewportView(bangHB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 352, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtableBang)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQuocGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaHB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maHB)
                            .addComponent(quocGia))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenHB)
                            .addComponent(txtTenHB, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timKiem)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maHB)
                            .addComponent(tenHB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenHB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(quocGia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtableBang, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jpBang, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(jpBang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        qLyHB.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        qLyHB.setForeground(new java.awt.Color(21, 115, 135));
        qLyHB.setText("QUẢN LÝ HÃNG BAY");
        jPanel2.add(qLyHB, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

	private void bangHBAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_bangHBAncestorAdded
		// TODO add your handling code here:
		bangHB.getSelectionModel().addListSelectionListener(e -> {
			// Kiểm tra xem có dòng nào được chọn không
			int selectedRow = bangHB.getSelectedRow();
			if (selectedRow != -1) {
				// Lấy dữ liệu từ dòng được chọn
				String maHB = bangHB.getValueAt(selectedRow, 0).toString();
				String tenHB = bangHB.getValueAt(selectedRow, 1).toString();
				String quocGia = bangHB.getValueAt(selectedRow, 2).toString();

				// Gán dữ liệu vào các JTextField
				txtMaHB.setText(maHB);
				txtTenHB.setText(tenHB);
				txtQuocGia.setText(quocGia);
			}
		});
	}// GEN-LAST:event_bangHBAncestorAdded

	private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTimKiemActionPerformed
		// TODO add your handling code here:
		String tenHBTimKiem = txtTimKiem.getText().trim();

		// Xóa dữ liệu cũ trên model
		modelHB.setRowCount(0);

		// Lọc danh sách khách hàng
		for (HangBay hangBay : listHangBay) {
			if (hangBay.getTenHangBay().equals(tenHBTimKiem)) {
				// Thêm khách hàng khớp vào model
				modelHB.addRow(new Object[] { hangBay.getMaHangBay(), hangBay.getTenHangBay(), hangBay.getQuocGia() });
			}
		}

		// Kiểm tra nếu không tìm thấy kết quả
		if (modelHB.getRowCount() == 0) {
			JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng với số điện thoại: " + tenHBTimKiem,
					"Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}
	}// GEN-LAST:event_txtTimKiemActionPerformed

	private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCapNhatActionPerformed
		// TODO add your handling code here:
		String maHB = txtMaHB.getText().trim();
		String tenHB = txtTenHB.getText().trim();
		String quocGia = txtQuocGia.getText().trim();

		// Kiểm tra xem các trường có rỗng không
		if (maHB.isEmpty() || tenHB.isEmpty() || quocGia.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}
		// Kiểm tra trùng lặp tên hãng bay
		for (HangBay hb : listHangBay) {
			if (hb.getTenHangBay().equalsIgnoreCase(tenHB)) {
				JOptionPane.showMessageDialog(this, "Tên Hãng Bay đã tồn tại, vui lòng nhập tên khác!");
				return;
			}
		}
		// Tạo đối tượng KhachHang từ các giá trị lấy được từ JTextField
		HangBay hb = new HangBay(maHB, tenHB, quocGia);

		DAO_HangBay daohb = new DAO_HangBay();
		boolean isUpdated = daohb.updateHangBay(hb);

		// Thông báo cho người dùng về kết quả cập nhật
		if (isUpdated) {
			modelHB.setRowCount(0);
			listHangBay = dao_hb.getalltbHangBay();
			duaDuLieuVaoModule();
			JOptionPane.showMessageDialog(this, "Cập nhật thông tin hãng bay thành công!", "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin hãng bay!", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
		}

	}// GEN-LAST:event_btnCapNhatActionPerformed

	private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMoiActionPerformed
		txtMaHB.setText("");
		txtTenHB.setText("");
		txtQuocGia.setText("");
		txtTimKiem.setText("");
		duaDuLieuVaoModule();
	}// GEN-LAST:event_btnMoiActionPerformed

	public String phatSinhMaHangBay() {
		int maxMaHB = 0;

		// Duyệt qua danh sách để tìm mã lớn nhất
		for (HangBay hb : listHangBay) {
			String mahb = hb.getMaHangBay(); // Ví dụ: HB001
			int sohb = Integer.parseInt(mahb.substring(2)); // Lấy số 001 và chuyển sang số nguyên
			if (sohb > maxMaHB) {
				maxMaHB = sohb;
			}
		}

		// Tăng số lớn nhất lên 1 và tạo mã mới
		int maHBMoi = maxMaHB + 1;
		return String.format("HB%03d", maHBMoi);
	}

	private void luuHangBayMoi() {

		String maHB = txtMaHB.getText().trim();
		String tenHB = txtTenHB.getText().trim();
		String quocGia = txtQuocGia.getText().trim();

		// Kiểm tra dữ liệu đầu vào
		if (maHB.isEmpty() || tenHB.isEmpty() || quocGia.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
			return;
		}

		// Kiểm tra trùng lặp tên hãng bay
		for (HangBay hb : listHangBay) {
			if (hb.getTenHangBay().equalsIgnoreCase(tenHB)) {
				JOptionPane.showMessageDialog(this, "Tên Hãng Bay đã tồn tại, vui lòng nhập tên khác!");
				return;
			}
		}

		// Tạo đối tượng HangBay
		HangBay hangBay = new HangBay(maHB, tenHB, quocGia);

		// Thêm vào cơ sở dữ liệu
		if (dao_hb.themHangBay(hangBay)) {
			// Hiển thị thông báo và cập nhật giao diện nếu thành công
			JOptionPane.showMessageDialog(this, "Thêm Hãng Bay thành công!");
			listHangBay.add(hangBay); // Thêm vào danh sách
			modelHB.addRow(new Object[] { maHB, tenHB, quocGia }); // Cập nhật bảng
			duaDuLieuVaoModule(); // Cập nhật dữ liệu lên JTable
		} else {
			JOptionPane.showMessageDialog(this, "Thêm Hãng Bay thất bại!");
		}

	}

	private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
		// TODO add your handling code here:
		String maHBMoi = phatSinhMaHangBay();
		txtMaHB.setText(maHBMoi);
		luuHangBayMoi();
	}// GEN-LAST:event_btnThemActionPerformed

	private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
		// TODO add your handling code here:
		int selectedRow = bangHB.getSelectedRow(); // Lấy chỉ mục dòng đã chọn
		if (selectedRow != -1) {
			// Lấy mã khách hàng từ cột trong JTable, giả sử mã khách hàng ở cột 0
			String maHB = bangHB.getValueAt(selectedRow, 0).toString();
			// Gọi phương thức xóa khách hàng khỏi cơ sở dữ liệu
			boolean result = dao_hb.xoaHangBay(maHB);
			if (result) {
				listHangBay = dao_hb.getalltbHangBay();
				// Nếu xóa thành công, xóa khách hàng khỏi bảng (model)
				DefaultTableModel modelHB = (DefaultTableModel) bangHB.getModel();
				modelHB.removeRow(selectedRow); // Xóa dòng khỏi bảng

				JOptionPane.showMessageDialog(null, "Hãng Bay đã được xóa thành công!");
			} else {
				JOptionPane.showMessageDialog(null, "Không thể xóa Hãng Bay.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Vui lòng chọn một Hãng Bay để xóa.");
		}
	}// GEN-LAST:event_btnXoaActionPerformed

	public void duaDuLieuVaoModule() {
		modelHB.setRowCount(0);
		for (HangBay hangBay : listHangBay) {
			modelHB.addRow(new Object[] { hangBay.getMaHangBay(), hangBay.getTenHangBay(), hangBay.getQuocGia() });
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangHB;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpBang;
    private javax.swing.JScrollPane jtableBang;
    private javax.swing.JLabel maHB;
    private javax.swing.JLabel qLyHB;
    private javax.swing.JLabel quocGia;
    private javax.swing.JLabel tenHB;
    private javax.swing.JLabel timKiem;
    private javax.swing.JTextField txtMaHB;
    private javax.swing.JTextField txtQuocGia;
    private javax.swing.JTextField txtTenHB;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
