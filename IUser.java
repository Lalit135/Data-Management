package Ecom_Project;

import java.util.List;

public interface IUser {

	boolean registerAdmin (User user);
	boolean registerCustomer (User user);
	boolean updateUser (User user);
	boolean deleteUser (int userId);
	List<User> getUserList();
	User getProfile (int userId); 
	
}
