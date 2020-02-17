package com.training.bean;

public class LoginBean {
	private String memberUsername;
	private String Amount;
	private String Description;

	public LoginBean() {
	}

	public LoginBean( String memberUsername,String Amount,String Description) {
		super();
		this.memberUsername =memberUsername;
		this.Amount = Amount;
		this.Description=Description;
	}
	public String getmemberUsername() {
		return memberUsername;
	}

	public void setmemberUsername(String memberUsername) {
		this.memberUsername =memberUsername;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String Amount) {
		this.Amount = Amount;
	}

	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description =Description;
	}
	@Override
	public String toString() {
		return "LoginBean [memberUsername="+memberUsername+" , Amount=" + Amount + ", Description="+Description+"]";
	}

}
