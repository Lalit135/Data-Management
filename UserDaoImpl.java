package Ecom_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUser{

	Connection con;			// store connection
	PreparedStatement ps;	// store Query
	ResultSet rs;			// store data
	String sqlQuerry;

	@Override
	public boolean registerAdmin(User user) {
		sqlQuerry = "insert into Lalit_Ecom (userFullName,userEmail,userPassword,userType,userAddress) values (?,?,?,'Admin',?)";
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			ps.setString(1, user.getUserFullName());
			ps.setString(2, user.getUserEmail());
			ps.setString(3, user.getUserPassword());
			ps.setString(4, user.getUserAdd());
			
			int i = ps.executeUpdate();
			if (i>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean registerCustomer(User user) {
	sqlQuerry = "insert into Lalit_Ecom (userFullName,userEmail,userPassword,userType,userAddress) values (?,?,?,'Customer',?)";
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			ps.setString(1, user.getUserFullName());
			ps.setString(2, user.getUserEmail());
			ps.setString(3, user.getUserPassword());
			ps.setString(4, user.getUserAdd());
			
			int i = ps.executeUpdate();
			if (i>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateUser(User user) {
	sqlQuerry = "update Lalit_Ecom set userFullname=?, userEmail=?, userPassword=?, userAddress=?, where userId=?";
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			ps.setString(1, user.getUserFullName());
			ps.setString(2, user.getUserEmail());
			ps.setString(3, user.getUserPassword());
			ps.setString(4, user.getUserAdd());
			ps.setInt(5, user.getUserId());
			
			int i = ps.executeUpdate();
			if (i>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		sqlQuerry = "delete from Lalit_Ecom where userId = ?";
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			ps.setInt(1, userId);
			
			int i = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<User> getUserList() {
		sqlQuerry = "select * from Lalit_Ecom";
		List<User> userList = new ArrayList<>();
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User (rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(3),rs.getString(6), rs.getString(5));
				userList.add(user);
			}
			return userList;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public User getProfile(int userId) {
		sqlQuerry = "select * from Lalit_Ecom where userId=?";
		
		try {
			con = DBConnection.createCon();
			ps = con.prepareStatement(sqlQuerry);
			
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	public static void main(String[] args) {
		
		UserDaoImpl UD = new UserDaoImpl();
		
		List<User> uList = UD.getUserList();
		uList.forEach(System.out::println);
		
	}

}
