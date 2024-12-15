/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.table.DefaultTableModel;

import Connect.KetNoiDB;
import ENTITY.NhanVien;
import ENTITY.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class DAO_NhanVien {
	// dao
	private DAO_TaiKhoan dao_TaiKhoan = new DAO_TaiKhoan();

	private ArrayList<NhanVien> dsNhanVien;

	//////////////////////////////////////// HÀM
	// Trả về list Nhan Vien
	public ArrayList<NhanVien> getalltbKhachHang() {
		dsNhanVien = new ArrayList<NhanVien>();
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "SELECT * FROM NhanVien";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				String maNhanVien = rs.getString("MaNhanVien");
				String tenNhanVien = rs.getString("TenNhanVien");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String soDienThoai = rs.getString("SoDienThoai");
				String gioiTinh = rs.getString("GioiTinh");
				String hinhAnh = rs.getString("HinhAnh");
				TaiKhoan maTaiKhoan = dao_TaiKhoan.getOneObjTaiKhoan(rs.getString("MaTaiKhoan"));

				NhanVien nv = new NhanVien(maNhanVien, tenNhanVien, email, diaChi, soDienThoai, gioiTinh, hinhAnh,
						maTaiKhoan);
				dsNhanVien.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsNhanVien;
	}

	// tra ve mot nhan vien
	public NhanVien getOneObjNhanVien(String maObj) {
		NhanVien nv = null;
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from NhanVien where MaNhanVien = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, maObj);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String maNhanVien = rs.getString("MaNhanVien");
				String tenNhanVien = rs.getString("TenNhanVien");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String soDienThoai = rs.getString("SoDienThoai");
				String gioiTinh = rs.getString("GioiTinh");
				String hinhAnh = rs.getString("HinhAnh");
				TaiKhoan maTaiKhoan = dao_TaiKhoan.getOneObjTaiKhoan(rs.getString("MaTaiKhoan"));

				nv = new NhanVien(maNhanVien, tenNhanVien, email, diaChi, soDienThoai, gioiTinh, hinhAnh, maTaiKhoan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}

	public NhanVien getOneObjNhanVienTheoMaTK(String maObj) {
		NhanVien nv = null;
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from NhanVien where MaTaiKhoan = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, maObj);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String maNhanVien = rs.getString("MaNhanVien");
				String tenNhanVien = rs.getString("TenNhanVien");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String soDienThoai = rs.getString("SoDienThoai");
				String gioiTinh = rs.getString("GioiTinh");
				String hinhAnh = rs.getString("HinhAnh");
				TaiKhoan maTaiKhoan = dao_TaiKhoan.getOneObjTaiKhoan(rs.getString("MaTaiKhoan"));

				nv = new NhanVien(maNhanVien, tenNhanVien, email, diaChi, soDienThoai, gioiTinh, hinhAnh, maTaiKhoan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}

	// Lấy danh sách nhân viên và hiển thị trên bảng
	public DefaultTableModel loadDataToTable() {
		// Cập nhật mảng columns để bao gồm cột "ChucVu"
		String[] columns = { "MaNhanVien", "TenNhanVien", "Email", "DiaChi", "SoDienThoai", "GioiTinh", "HinhAnh",
				"MaTaiKhoan", "ChucVu" };
		DefaultTableModel model = new DefaultTableModel(columns, 0);

		try {
			Connection conn = KetNoiDB.getConnection();
			String sql = "SELECT * FROM NhanVien"; // Câu lệnh SQL để lấy tất cả các trường, bao gồm "ChucVu"
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// Lấy dữ liệu từ ResultSet, bao gồm cột "ChucVu"
				String[] row = { rs.getString("MaNhanVien"), rs.getString("TenNhanVien"), rs.getString("Email"),
						rs.getString("DiaChi"), rs.getString("SoDienThoai"), rs.getString("GioiTinh"),
						rs.getString("HinhAnh"), rs.getString("MaTaiKhoan"), rs.getString("ChucVu") // Lấy dữ liệu từ
																									// cột "ChucVu"
				};
				model.addRow(row); // Thêm một dòng vào table model
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}

	public boolean addNhanVien(String maNV, String hoTen, String email, String diaChi, String soDienThoai,
			String gioiTinh, String imageFileName, String maTaiKhoan, String chucVu) {
		Connection conn = null;
		PreparedStatement stmtTaiKhoan = null;
		PreparedStatement stmtNhanVien = null;
		ResultSet rs = null;
		try {
// Kết nối cơ sở dữ liệu
			conn = KetNoiDB.getConnection();
			conn.setAutoCommit(false); // Bắt đầu một giao dịch (transaction)

// Kiểm tra xem MaTaiKhoan đã tồn tại trong bảng TaiKhoan chưa
			String checkTaiKhoanSQL = "SELECT COUNT(*) FROM TaiKhoan WHERE TenDangNhap = ?";
			stmtTaiKhoan = conn.prepareStatement(checkTaiKhoanSQL);
			String tenDangNhap = generateAccountCode(chucVu); // Tạo tên đăng nhập dựa trên chức vụ
			stmtTaiKhoan.setString(1, tenDangNhap);
			rs = stmtTaiKhoan.executeQuery();

// Nếu tên đăng nhập đã tồn tại, sinh lại tên đăng nhập
			while (rs.next() && rs.getInt(1) > 0) {
				tenDangNhap = generateAccountCode(chucVu); // Tạo lại tên đăng nhập mới
				stmtTaiKhoan.setString(1, tenDangNhap);
				rs = stmtTaiKhoan.executeQuery();
			}

// Kiểm tra xem MaLoai có hợp lệ trong bảng LoaiTaiKhoan không
			String checkMaLoaiSQL = "SELECT COUNT(*) FROM LoaiTaiKhoan WHERE MaLoai = ?";
			PreparedStatement stmtMaLoai = conn.prepareStatement(checkMaLoaiSQL);
			String maLoai = generateMaLoai(chucVu); // Tạo mã loại tài khoản từ chức vụ

			stmtMaLoai.setString(1, maLoai);
			ResultSet rsMaLoai = stmtMaLoai.executeQuery();

// Nếu MaLoai chưa tồn tại, chèn vào bảng LoaiTaiKhoan và thêm TenLoai
			if (rsMaLoai.next() && rsMaLoai.getInt(1) == 0) {
				String insertLoaiTaiKhoanSQL = "INSERT INTO LoaiTaiKhoan (MaLoai, TenLoai) VALUES (?, ?)";
				stmtMaLoai = conn.prepareStatement(insertLoaiTaiKhoanSQL);
				stmtMaLoai.setString(1, maLoai);
				stmtMaLoai.setString(2, chucVu); // Chức vụ làm TenLoai
				stmtMaLoai.executeUpdate();
			}

// Chèn tài khoản vào bảng TaiKhoan
			String insertTaiKhoanSQL = "INSERT INTO TaiKhoan (MaTaiKhoan, TenDangNhap, MatKhau, MaLoai) VALUES (?, ?, ?, ?)";
			stmtTaiKhoan = conn.prepareStatement(insertTaiKhoanSQL);
			stmtTaiKhoan.setString(1, maTaiKhoan);
			stmtTaiKhoan.setString(2, tenDangNhap); // Tên đăng nhập đã được tạo
			stmtTaiKhoan.setString(3, "1111"); // Mật khẩu mặc định (có thể đổi sau)
			stmtTaiKhoan.setString(4, maLoai); // Mã loại tài khoản
			stmtTaiKhoan.executeUpdate();

// Thêm bản ghi vào bảng NhanVien
			String queryNhanVien = "INSERT INTO NhanVien (MaNhanVien, TenNhanVien, Email, DiaChi, SoDienThoai, GioiTinh, HinhAnh, MaTaiKhoan, ChucVu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmtNhanVien = conn.prepareStatement(queryNhanVien);
			stmtNhanVien.setString(1, maNV);
			stmtNhanVien.setString(2, hoTen);
			stmtNhanVien.setString(3, email);
			stmtNhanVien.setString(4, diaChi);
			stmtNhanVien.setString(5, soDienThoai);
			stmtNhanVien.setString(6, gioiTinh);
			stmtNhanVien.setString(7, imageFileName);
			stmtNhanVien.setString(8, maTaiKhoan); // Mã tài khoản đã tồn tại
			stmtNhanVien.setString(9, chucVu); // Chức vụ
			stmtNhanVien.executeUpdate();

// Commit giao dịch
			conn.commit();
			return true;

		} catch (SQLException e) {
			try {
				if (conn != null) {
					conn.rollback(); // Rollback nếu có lỗi
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (stmtTaiKhoan != null)
					stmtTaiKhoan.close();
				if (stmtNhanVien != null)
					stmtNhanVien.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private String generateAccountCode(String chucVu) {
		Random rand = new Random();
		int randomNum = rand.nextInt(100); // Lấy số ngẫu nhiên trong phạm vi từ 00 đến 99
		String prefix = chucVu.equals("Nhân Viên") ? "NhanVien" : "QuanLy";
		return String.format("%s%02d", prefix, randomNum); // Định dạng lại thành "NhanVien" + 2 chữ số hoặc "QuanLy" +
															// 2 chữ số
	}

	private String generateMaLoai(String chucVu) {
		Random rand = new Random();
		int randomNum = rand.nextInt(1000); // Lấy số ngẫu nhiên trong phạm vi từ 000 đến 999
		String prefix = chucVu.equals("Nhân Viên") ? "nv" : "ql";
		return String.format("%s%03d", prefix, randomNum); // Định dạng lại thành "nv" + 3 chữ số hoặc "ql" + 3 chữ số
	}

// Cập nhật thông tin nhân viên, bao gồm cả chức vụ
	public boolean updateNhanVien(String maNhanVien, String tenNV, String email, String diaChi, String sdt,
			String gioiTinh, String hinhAnh, String chucVu) {
// Cập nhật các thông tin nhân viên bao gồm cả cột ChucVu
		String sql = "UPDATE NhanVien SET TenNhanVien = ?, Email = ?, DiaChi = ?, SoDienThoai = ?, GioiTinh = ?, HinhAnh = ?, ChucVu = ? WHERE MaNhanVien = ?";
		try {
			Connection conn = KetNoiDB.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

// Set các giá trị muốn thay đổi
			ps.setString(1, tenNV);
			ps.setString(2, email);
			ps.setString(3, diaChi);
			ps.setString(4, sdt);
			ps.setString(5, gioiTinh);
			ps.setString(6, hinhAnh);
			ps.setString(7, chucVu); // Thêm chức vụ vào câu lệnh
			ps.setString(8, maNhanVien); // Set mã nhân viên để xác định bản ghi cần cập nhật

// Thực thi câu lệnh cập nhật
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0; // Nếu có dòng bị ảnh hưởng, trả về true
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteNhanVien(String maNhanVien) {
		Connection conn = null;
		PreparedStatement psCheck = null;
		PreparedStatement psDeleteTaiKhoan = null;
		PreparedStatement psUpdateNhanVien = null;
		PreparedStatement psDeleteNhanVien = null;
		ResultSet rsTaiKhoan = null;

		try {
			conn = KetNoiDB.getConnection();
			conn.setAutoCommit(false); // Bắt đầu giao dịch

// Lấy MaTaiKhoan từ bảng NhanVien
			String getTaiKhoanQuery = "SELECT MaTaiKhoan FROM NhanVien WHERE MaNhanVien = ?";
			psCheck = conn.prepareStatement(getTaiKhoanQuery);
			psCheck.setString(1, maNhanVien);
			rsTaiKhoan = psCheck.executeQuery();

			String maTaiKhoan = null;
			if (rsTaiKhoan.next()) {
				maTaiKhoan = rsTaiKhoan.getString("MaTaiKhoan");
			}

			if (maTaiKhoan != null) {
// Cập nhật MaTaiKhoan trong bảng NhanVien thành NULL
				String updateNhanVienQuery = "UPDATE NhanVien SET MaTaiKhoan = NULL WHERE MaNhanVien = ?";
				psUpdateNhanVien = conn.prepareStatement(updateNhanVienQuery);
				psUpdateNhanVien.setString(1, maNhanVien);
				psUpdateNhanVien.executeUpdate();

// Xóa tài khoản trong bảng TaiKhoan
				String deleteTaiKhoanQuery = "DELETE FROM TaiKhoan WHERE MaTaiKhoan = ?";
				psDeleteTaiKhoan = conn.prepareStatement(deleteTaiKhoanQuery);
				psDeleteTaiKhoan.setString(1, maTaiKhoan);
				psDeleteTaiKhoan.executeUpdate();
			}

// Xóa nhân viên trong bảng NhanVien
			String deleteNhanVienQuery = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
			psDeleteNhanVien = conn.prepareStatement(deleteNhanVienQuery);
			psDeleteNhanVien.setString(1, maNhanVien);
			int rowsAffected = psDeleteNhanVien.executeUpdate();

			if (rowsAffected > 0) {
				conn.commit(); // Commit giao dịch nếu xóa thành công
				return true;
			} else {
				conn.rollback(); // Rollback nếu không xóa được nhân viên
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback(); // Rollback giao dịch nếu có lỗi
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			return false;
		} finally {
			try {
				if (psCheck != null)
					psCheck.close();
				if (psDeleteTaiKhoan != null)
					psDeleteTaiKhoan.close();
				if (psUpdateNhanVien != null)
					psUpdateNhanVien.close();
				if (psDeleteNhanVien != null)
					psDeleteNhanVien.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

// Kiểm tra xem mã nhân viên đã tồn tại trong cơ sở dữ liệu chưa
	public boolean isEmployeeExists(String maNhanVien) {
		String sql = "SELECT 1 FROM NhanVien WHERE MaNhanVien = ?";
		try {
			Connection conn = KetNoiDB.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, maNhanVien);
			ResultSet rs = ps.executeQuery();

			return rs.next(); // Nếu tìm thấy, trả về true
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
