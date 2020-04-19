package cn.smt666.ssm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private Integer id;
	private String name;
	// 标识格式的注解（9999-12-31）
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
