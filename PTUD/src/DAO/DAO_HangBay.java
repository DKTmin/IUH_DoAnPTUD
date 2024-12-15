package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connect.KetNoiDB;
import ENTITY.HangBay;

public class DAO_HangBay {
	private ArrayList<HangBay> dsHangBay;

	// Trả về hết một danh sách hãng bay
	public ArrayList<HangBay> getalltbHangBay() {
		dsHangBay = new ArrayList<HangBay>();
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from HangBay";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				
				String maHangBay = rs.getString("MaHangBay");
				String tenHangBay = rs.getString("TenHangBay");
				String quocGia = rs.getString("QuocGia"); 
				String hinhAnh = rs.getString("HinhAnh");
			
				HangBay hb = new HangBay(maHangBay, tenHangBay, quocGia, hinhAnh); 
				dsHangBay.add(hb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsHangBay;
	}
	
	// Trả về một đối tượng theo mã 
	public HangBay getOneObjHangBay(String maObj) { 
		HangBay hangBay = null;
	    try {
	        KetNoiDB.getInstance();
	        Connection con = KetNoiDB.getConnection();
	        String sql = "Select * from HangBay where MaHangBay = ?";
	        PreparedStatement preparedStatement = con.prepareStatement(sql);
	        preparedStatement.setString(1, maObj);
	        ResultSet rs = preparedStatement.executeQuery();
	        if (rs.next()) {
	            String maHangBay = rs.getString("MaHangBay");
	            String tenHangBay = rs.getString("TenHangBay");
	            String quocGia = rs.getString("QuocGia");
	            String hinhAnh = rs.getString("HinhAnh");

	            hangBay = new HangBay(maHangBay, tenHangBay, quocGia, hinhAnh);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return hangBay;
	}
	
	public boolean themHangBay(HangBay hb) {
		KetNoiDB.getInstance();
		Connection con = KetNoiDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("Insert into HangBay (MaHangBay,TenHangBay,QuocGia)" + " values(?,?,?)");
			stmt.setString(1, hb.getMaHangBay());
			stmt.setString(2, hb.getTenHangBay());
			stmt.setString(3, hb.getQuocGia());
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n > 0;
	}

	public boolean xoaHangBay(String maHangBay) {
		Connection con = KetNoiDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			// SQL để xóa hbách hàng theo mã hbách hàng
			String sql = "DELETE FROM HangBay WHERE MaHangBay = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, maHangBay);

			// Thực thi câu lệnh SQL
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return n > 0;
	}

	public boolean updateHangBay(HangBay hb) {
		// Lấy kết nối từ lớp KetNoiDB
		Connection con = KetNoiDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;

		try {
			// SQL để cập nhật thông tin HangBay
			String sql = "UPDATE HangBay SET TenHangBay = ?, QuocGia = ? WHERE MaHangBay = ?";
			stmt = con.prepareStatement(sql);

			// Gán giá trị từ đối tượng HangBay vào câu lệnh SQL
			stmt.setString(1, hb.getTenHangBay()); // Cột TenHangBay
			stmt.setString(2, hb.getQuocGia()); // Cột QuocGia
			stmt.setString(3, hb.getMaHangBay()); // Điều kiện MaHangBay

			// Thực thi câu lệnh SQL
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return n > 0; // Trả về true nếu có ít nhất một dòng được cập nhật
	}

	public String in() {
		return dsHangBay.toString();
	}
}
