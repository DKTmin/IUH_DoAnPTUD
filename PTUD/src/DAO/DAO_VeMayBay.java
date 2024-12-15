package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Connect.KetNoiDB;
import ENTITY.HangBay;
import ENTITY.HangVe;
import ENTITY.LichBay;
import ENTITY.VeMayBay;

public class DAO_VeMayBay {
	// list
	private ArrayList<VeMayBay> dsVeMayBay;

	// Dao
	private DAO_HangBay dao_hb = new DAO_HangBay();
	private DAO_LichBay dao_lb = new DAO_LichBay();
	private DAO_HangVe dao_hv = new DAO_HangVe();

	//////////////////////////////////////////////////// HÀM SỬ LÝ
	// Trả về hết danh sách
	public ArrayList<VeMayBay> getalltbVeMayBay() {
		dsVeMayBay = new ArrayList<VeMayBay>();
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from VeMayBay";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String maVe = rs.getString("MaVe");
				HangBay hangBay = dao_hb.getOneObjHangBay(rs.getString("MaHangBay"));
				HangVe hangVe = dao_hv.getOneObjHangVe(rs.getString("MaHangVe"));
				LichBay lichBay = dao_lb.getOneObjLichBay(rs.getString("MaLichBay"));
				double gia = rs.getDouble("Gia");

				VeMayBay vmb = new VeMayBay(maVe, hangBay, hangVe, lichBay, gia);
				dsVeMayBay.add(vmb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsVeMayBay;
	}

	// Trả về một đối tượng theo mã
	public VeMayBay getOneObjVeMayBay(String maObj) {
		VeMayBay veMayBay = null;
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from VeMayBay where MaVe = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, maObj);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String maVe = rs.getString("MaVe");
				HangBay hangBay = dao_hb.getOneObjHangBay(rs.getString("MaHangBay"));
				HangVe hangVe = dao_hv.getOneObjHangVe(rs.getString("MaHangVe"));
				LichBay lichBay = dao_lb.getOneObjLichBay(rs.getString("MaLichBay"));
				double gia = rs.getDouble("Gia");

				veMayBay = new VeMayBay(maVe, hangBay, hangVe, lichBay, gia);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veMayBay;
	}

	///////////////////////////////// THÀNH
	public DefaultTableModel searchByPhone(String phoneNumber) {
		// Cập nhật mảng columns để bao gồm cột "TenKhacHang" và "SoDienThoai"
		String[] columns = { "MaVe", "MaHangBay", "MaLichBay", "MaHangVe", "Gia", "TenKhacHang", "SoDienThoai" };
		DefaultTableModel model = new DefaultTableModel(columns, 0);

		String sql = "SELECT V.MaVe, V.MaHangBay, V.MaLichBay, V.MaHangVe, V.Gia, " + "KH.TenKhachHang, KH.SoDienThoai "
				+ "FROM VeMayBay V " + "JOIN ChiTietHoaDon CTHD ON V.MaVe = CTHD.MaVe "
				+ "JOIN HoaDon HD ON CTHD.MaHoaDon = HD.MaHoaDon "
				+ "JOIN KhachHang KH ON HD.MaKhachHang = KH.MaKhachHang " + "WHERE KH.SoDienThoai LIKE ?"; // Sử dụng
																											// LIKE để
																											// tìm kiếm
																											// theo số
																											// điện
																											// thoại

		try {
			Connection conn = KetNoiDB.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, "%" + phoneNumber + "%"); // Thêm ký tự "%" vào đầu và cuối để tìm kiếm theo dạng chuỗi

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					String[] row = { rs.getString("MaVe"), rs.getString("MaHangBay"), rs.getString("MaLichBay"),
							rs.getString("MaHangVe"), rs.getString("Gia"), rs.getString("TenKhachHang"),
							rs.getString("SoDienThoai") };
					model.addRow(row); // Thêm một dòng vào table model
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return model;
	}

//	public DefaultTableModel loadDataToTable() {
//	    // Cập nhật mảng columns để bao gồm cột "TenKhacHang" và "SoDienThoai"
//	    String[] columns = {"MaVe", "MaHangBay", "MaLichBay", "MaHangVe", "Gia", "TenKhachHang", "SoDienThoai"};
//	    DefaultTableModel model = new DefaultTableModel(columns, 0);
//
//	    String sql = "SELECT " +
//	                    "V.MaVe, V.MaHangBay, V.MaLichBay, V.MaHangVe, V.Gia, " +
//	                    "KH.TenKhachHang, KH.SoDienThoai " +
//	                 "FROM VeMayBay V " +
//	                 "JOIN ChiTietHoaDon CTHD ON V.MaVe = CTHD.MaVe " +
//	                 "JOIN HoaDon HD ON CTHD.MaHoaDon = HD.MaHoaDon " +
//	                 "JOIN KhachHang KH ON HD.MaKhachHang = KH.MaKhachHang";
//
//	    try  {
//	    	Connection conn = KetNoiDB.getConnection();
//	         PreparedStatement ps = conn.prepareStatement(sql);
//	         ResultSet rs = ps.executeQuery();
//
//	        while (rs.next()) {
//	            // Lấy dữ liệu từ ResultSet và thêm vào bảng
//	            String[] row = {
//	                rs.getString("MaVe"),
//	                rs.getString("MaHangBay"),
//	                rs.getString("MaLichBay"),
//	                rs.getString("MaHangVe"),
//	                rs.getString("Gia"),
//	                rs.getString("TenKhachHang"),
//	                rs.getString("SoDienThoai")
//	            };
//	            model.addRow(row); // Thêm một dòng vào table model
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	    return model;
//	}

//	public boolean cancelTicket(String ticketId) {
//		// Câu lệnh SQL để xóa vé trong bảng VeMayBay, ChiTietHoaDon và HoaDon
//		String sqlDeleteTicket = "DELETE FROM VeMayBay WHERE MaVe = ?";
//		String sqlDeleteDetails = "DELETE FROM ChiTietHoaDon WHERE MaVe = ?";
//		String sqlDeleteInvoice = "DELETE FROM HoaDon WHERE MaHoaDon IN (SELECT MaHoaDon FROM ChiTietHoaDon WHERE MaVe = ?)";
//
//		Connection conn = null;
//		PreparedStatement psTicket = null;
//		PreparedStatement psDetails = null;
//		PreparedStatement psInvoice = null;
//
//		try {
//			// Kết nối đến cơ sở dữ liệu
//			conn = KetNoiDB.getConnection();
//			conn.setAutoCommit(false); // Bắt đầu một giao dịch để thực hiện tất cả các thao tác trong một lần commit
//
//			// Xóa dữ liệu trong bảng ChiTietHoaDon
//			psDetails = conn.prepareStatement(sqlDeleteDetails);
//			psDetails.setString(1, ticketId);
//			psDetails.executeUpdate();
//
//			// Xóa dữ liệu trong bảng HoaDon
//			psInvoice = conn.prepareStatement(sqlDeleteInvoice);
//			psInvoice.setString(1, ticketId);
//			psInvoice.executeUpdate();
//
//			// Xóa vé trong bảng VeMayBay
//			psTicket = conn.prepareStatement(sqlDeleteTicket);
//			psTicket.setString(1, ticketId);
//			int rowsAffected = psTicket.executeUpdate();
//
//			if (rowsAffected > 0) {
//				conn.commit(); // Nếu tất cả thao tác thành công, commit giao dịch
//				return true; // Vé đã được hủy thành công
//			} else {
//				conn.rollback(); // Nếu có lỗi, rollback lại toàn bộ giao dịch
//				return false; // Hủy vé thất bại
//			}
//		} catch (SQLException e) {
//			try {
//				if (conn != null) {
//					conn.rollback(); // Rollback khi có lỗi
//				}
//			} catch (SQLException ex) {
//				ex.printStackTrace();
//			}
//			e.printStackTrace();
//			return false; // Xử lý lỗi và trả về false
//		}
////	    finally {
////	        // Đảm bảo đóng các đối tượng PreparedStatement và Connection
////	        try {
////	            if (psTicket != null) psTicket.close();
////	            if (psDetails != null) psDetails.close();
////	            if (psInvoice != null) psInvoice.close();
////	            if (conn != null) conn.close();
////	        } catch (SQLException e) {
////	            e.printStackTrace();
////	        }
////	    }
//	}

	public DefaultTableModel loadDataToTable() {
		// Cập nhật mảng columns để bao gồm cột "TrangThai"
		String[] columns = { "MaVe", "MaHangBay", "MaLichBay", "MaHangVe", "Gia", "TenKhachHang", "SoDienThoai",
				"TrangThai","NgayLapHoaDon" };
		DefaultTableModel model = new DefaultTableModel(columns, 0);

		// Cập nhật câu SQL để lấy thêm cột TrangThai từ bảng HoaDon
		String sql = "SELECT " + "V.MaVe, V.MaHangBay, V.MaLichBay, V.MaHangVe, V.Gia, "
				+ "KH.TenKhachHang, KH.SoDienThoai, HD.TrangThai,CTHD.NgayLapHoaDon " + // Lấy cột TrangThai từ HoaDon
				"FROM VeMayBay V " + "JOIN ChiTietHoaDon CTHD ON V.MaVe = CTHD.MaVe "
				+ "JOIN HoaDon HD ON CTHD.MaHoaDon = HD.MaHoaDon " + // Kết nối bảng HoaDon với bảng ChiTietHoaDon
				"JOIN KhachHang KH ON HD.MaKhachHang = KH.MaKhachHang"// Kết nối với bảng KhachHang

		;

		try {
			Connection conn = KetNoiDB.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// Lấy dữ liệu từ ResultSet
				String trangThai = rs.getInt("TrangThai") == 1 ? "true" : "false"; // Kiểm tra và chuyển 1 thành "true",
				 String ngayLapHoaDon = rs.getString("NgayLapHoaDon"); // Lấy cột NgayLapHoaDon																	// 0 thành "false"

				String[] row = { rs.getString("MaVe"), rs.getString("MaHangBay"), rs.getString("MaLichBay"),
						rs.getString("MaHangVe"), rs.getString("Gia"), rs.getString("TenKhachHang"),
						rs.getString("SoDienThoai"), trangThai,ngayLapHoaDon // Thêm NgayLapHoaDon // Thêm TrangThai vào bảng
				};
				model.addRow(row); // Thêm một dòng vào table model
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}

	public boolean cancelTicket(String ticketId) {
		Connection conn = null;
		PreparedStatement psLichBay = null;
		PreparedStatement psTrangThaiGhe = null;
		PreparedStatement psHoaDon = null;

		try {
			// Kết nối đến cơ sở dữ liệu
			conn = KetNoiDB.getConnection();
			conn.setAutoCommit(false); // Bắt đầu giao dịch

			// 1. Lấy thông tin thời gian chuyến bay
			String sqlLichBay = "SELECT ThoiGianDi FROM LichBay WHERE MaLichBay = (SELECT MaLichBay FROM VeMayBay WHERE MaVe = ?)";
			psLichBay = conn.prepareStatement(sqlLichBay);
			psLichBay.setString(1, ticketId);
			ResultSet rs = psLichBay.executeQuery();

			if (rs.next()) {
				// Lấy ThoiGianDi từ bảng LichBay
				String thoiGianDiStr = rs.getString("ThoiGianDi");

				// Remove ".0" if it exists
				thoiGianDiStr = thoiGianDiStr.replaceAll("\\.0$", "");

				// Chuyển đổi ThoiGianDi sang LocalDateTime
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				LocalDateTime thoiGianDi = LocalDateTime.parse(thoiGianDiStr, formatter);

				// Lấy thời gian hiện tại
				LocalDateTime now = LocalDateTime.now();

				// So sánh thời gian hiện tại với ThoiGianDi, nếu còn dưới 12 giờ thì không cho
				// phép hủy
				if (now.plusHours(12).isAfter(thoiGianDi)) {
					return false; // Vé không đủ điều kiện hủy
				}
			} else {
				return false; // Vé không tồn tại
			}

			// 2. Cập nhật trạng thái trong bảng TrangThaiGhe
			String sqlUpdateTrangThaiGhe = "UPDATE TrangThaiGhe SET TrangThai = FALSE WHERE MaGhe IN (SELECT MaGhe FROM VeMayBay WHERE MaVe = ?)";
			psTrangThaiGhe = conn.prepareStatement(sqlUpdateTrangThaiGhe);
			psTrangThaiGhe.setString(1, ticketId);
			psTrangThaiGhe.executeUpdate();

			// 3. Cập nhật trạng thái trong bảng HoaDon
			String sqlUpdateHoaDon = "UPDATE HoaDon SET TrangThai = FALSE WHERE MaHoaDon IN (SELECT MaHoaDon FROM ChiTietHoaDon WHERE MaVe = ?)";
			psHoaDon = conn.prepareStatement(sqlUpdateHoaDon);
			psHoaDon.setString(1, ticketId);
			psHoaDon.executeUpdate();

			// 4. Cập nhật trạng thái vé trong bảng VeMayBay
			String sqlUpdateVeMayBay = "UPDATE VeMayBay SET TrangThai = FALSE WHERE MaVe = ?";
			PreparedStatement psVeMayBay = conn.prepareStatement(sqlUpdateVeMayBay);
			psVeMayBay.setString(1, ticketId);
			psVeMayBay.executeUpdate();

			// 5. Commit giao dịch nếu mọi thứ thành công
			conn.commit();

			return true; // Hủy vé thành công
		} catch (SQLException e) {
			try {
				if (conn != null) {
					conn.rollback(); // Rollback giao dịch nếu có lỗi
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
			return false; // Hủy vé thất bại
		} 
//		finally {
//			// Đảm bảo đóng các đối tượng PreparedStatement và Connection
//			try {
//				if (psLichBay != null)
//					psLichBay.close();
//				if (psTrangThaiGhe != null)
//					psTrangThaiGhe.close();
//				if (psHoaDon != null)
//					psHoaDon.close();
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}

	public String in() {
		return dsVeMayBay.toString();
	}
}
