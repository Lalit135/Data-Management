package Ecom_Project;

public class User {
	
	private int userId;
	private String userFullName;
	private String userPassword;
	private String userEmail;
	private String userAdd;
	private String userType;
	
	private User() {
		
	}
	
	public User (int userId) {
		super();
		this.userId = userId;
	}

	public User(int userId, String userFullName, String userPassword, String userEmail, String userAdd) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userAdd = userAdd;
	}
	
	public User(String userFullName, String userPassword, String userEmail, String userAdd) {
		super();
		this.userFullName = userFullName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userAdd = userAdd;
	}

	public User(int userId, String userFullName, String userPassword, String userEmail, String userAdd,
			String userType) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userAdd = userAdd;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAdd() {
		return userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFullName=" + userFullName + ", userPassword=" + userPassword
				+ ", userEmail=" + userEmail + ", userAdd=" + userAdd + ", userType=" + userType + "]";
	}
	
	
}
