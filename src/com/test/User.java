package com.test;

/**
 *添加作者和版本信息
 * @author phantomes
 * @version 1.0
 */
public class User {
	private Long id;
	private String name;
	private String ageS;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgeS() {
		return ageS;
	}
	public void setAgeS(String ageS) {
		this.ageS = ageS;
	}
	
	
}
