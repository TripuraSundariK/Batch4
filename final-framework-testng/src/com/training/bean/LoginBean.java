package com.training.bean;

public class LoginBean {
	
	private String memberUsername;
	private String memberName;
	private String amount;
	private String description;
	

	public LoginBean() {
	}

	public LoginBean(String memberUsername, String memberName, String amount, String description ) {
		super();
	//	this.userName = userName;
	
		this.memberUsername=memberUsername;
		this.memberName=memberName;
		this.amount=amount;
		this.description=description;
		
	}

		
	public String getmemberUsername() {
		return memberUsername;
		}
	
	public void setmemberUsername(String memberUsername) {
		this.memberUsername=memberUsername;
		}

	public String getmemberName() {
		return memberName;
		}
	
	public void setmemberName(String memberName) {
		this.memberName=memberName;
		}

	public String getamount() {
		return amount;
		}
	
	public void setamount(String amount) {
		this.amount=amount;
		}
	
	public String getdescription() {
		return description;
		}
	
	public void setdescription(String description) {
		this.description=description;
		}

	
	@Override
	public String toString() {
		return "LoginBean [memberUsername=" + memberUsername  + ", memberName=" + memberName + ", amount=" + amount + ", description=" + description + "]";
	}

}
