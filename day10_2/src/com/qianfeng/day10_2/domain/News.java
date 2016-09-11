package com.qianfeng.day10_2.domain;

import java.io.Serializable;
/**
 * 实体类
 * @author Administrator
 *
 */
public class News implements Serializable {
	private String subject;
	private String sumarry;
	private String conver;
	private String changed;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSumarry() {
		return sumarry;
	}
	public void setSumarry(String sumarry) {
		this.sumarry = sumarry;
	}
	public String getConver() {
		return conver;
	}
	public void setConver(String conver) {
		this.conver = conver;
	}
	public String getChanged() {
		return changed;
	}
	public void setChanged(String changed) {
		this.changed = changed;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(String subject, String sumarry, String conver, String changed) {
		super();
		this.subject = subject;
		this.sumarry = sumarry;
		this.conver = conver;
		this.changed = changed;
	}
}
