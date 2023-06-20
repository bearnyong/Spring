package com.greedy.section01.xmlconfig;

public class MemberDTO {
	
	private int code;
	private String name;
	private String gender;
	private String phone;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(int memberCode, String name, String gender, String phone) {
		super();
		this.code = memberCode;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}

	public int getMemberCode() {
		return code;
	}

	public void setMemberCode(int memberCode) {
		this.code = memberCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberCode=" + code + ", name=" + name + ", gender=" + gender + ", phone=" + phone
				+ "]";
	}

}
