package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Connect.KetNoiDB;
import ENTITY.LoaiTaiKhoan;
import ENTITY.TaiKhoan;

public class DAO_TaiKhoan {
	
	//dao 
	private DAO_LoaiTaiKhoan dao_LoaiTaiKhoan = new DAO_LoaiTaiKhoan(); 
	
	
	private ArrayList<TaiKhoan> dsTaiKhoan;

	// tra ve mot list tai khoan 
	public ArrayList<TaiKhoan> getalltbLoaiTaiKhoan() {
		dsTaiKhoan = new ArrayList<TaiKhoan>();
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from TaiKhoan";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String maTaiKhoan = rs.getString("MaTaiKhoan");
				String tenDangNhap = rs.getString("TenDangNhap");
				String matKhau = rs.getString("MatKhau");
				LoaiTaiKhoan maLoai = dao_LoaiTaiKhoan.getOneObjLoaiTaiKhoan(rs.getString("MaLoai")) ;

				TaiKhoan tk = new TaiKhoan(maTaiKhoan, tenDangNhap, matKhau, maLoai); 

				dsTaiKhoan.add(tk);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsTaiKhoan;
	}
	/// tra ve mot tai khoan 
	public TaiKhoan getOneObjTaiKhoan(String maObj) {
		TaiKhoan taiKhoan = null;
		try {
			KetNoiDB.getInstance();
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from TaiKhoan where MaTaiKhoan = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, maObj);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String maTaiKhoan = rs.getString("MaTaiKhoan");
				String tenDangNhap = rs.getString("TenDangNhap");
				String matKhau = rs.getString("MatKhau");
				LoaiTaiKhoan maLoai = dao_LoaiTaiKhoan.getOneObjLoaiTaiKhoan(rs.getString("MaLoai")) ;

				taiKhoan = new TaiKhoan(maTaiKhoan, tenDangNhap, matKhau, maLoai); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return taiKhoan;
	}
	
	public TaiKhoan getOneObjTaiKhoanTheoTKMK(String taiKhoan, String matKhau) {
		TaiKhoan resultTaiKhoan = null; // Tên biến đổi để tránh nhầm lẫn
	    try {
	        KetNoiDB.getInstance();
	        Connection con = KetNoiDB.getConnection();
	        
	        // Thêm cả điều kiện kiểm tra mật khẩu
	        String sql = "SELECT * FROM TaiKhoan WHERE TenDangNhap = ? AND MatKhau = ?";
	        PreparedStatement preparedStatement = con.prepareStatement(sql);
	        preparedStatement.setString(1, taiKhoan);
	        preparedStatement.setString(2, matKhau);
	        
	        ResultSet rs = preparedStatement.executeQuery();
	        if (rs.next()) {
	            String maTaiKhoan = rs.getString("MaTaiKhoan");
	            String tenDangNhap = rs.getString("TenDangNhap");
	            String matKhauDB = rs.getString("MatKhau"); // Dùng nếu cần kiểm tra thêm
	            
	            LoaiTaiKhoan maLoai = dao_LoaiTaiKhoan.getOneObjLoaiTaiKhoan(rs.getString("MaLoai"));

	            // Gán vào đối tượng kết quả
	            resultTaiKhoan = new TaiKhoan(maTaiKhoan, tenDangNhap, matKhauDB, maLoai);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return resultTaiKhoan;
	}


	public String in() {
		return dsTaiKhoan.toString();
	}
}
