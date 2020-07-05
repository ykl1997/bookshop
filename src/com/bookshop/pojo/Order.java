package com.bookshop.pojo;

import java.math.BigDecimal;

public class Order {

	private Integer id;

	private Integer userid;

	private Integer booid;

	private String receivingaddress;

	private Integer booknum;

	private String phone;

	private BigDecimal totalprince;

	private String receiver;

	private String bookname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getBooid() {
		return booid;
	}

	public void setBooid(Integer booid) {
		this.booid = booid;
	}

	public String getReceivingaddress() {
		return receivingaddress;
	}

	public void setReceivingaddress(String receivingaddress) {
		this.receivingaddress = receivingaddress == null ? null : receivingaddress.trim();
	}

	public Integer getBooknum() {
		return booknum;
	}

	public void setBooknum(Integer booknum) {
		this.booknum = booknum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public BigDecimal getTotalprince() {
		return totalprince;
	}

	public void setTotalprince(BigDecimal totalprince) {
		this.totalprince = totalprince;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver == null ? null : receiver.trim();
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname == null ? null : bookname.trim();
	}

	public Order(Integer id, Integer userid, Integer booid, String receivingaddress, Integer booknum, String phone,
			BigDecimal totalprince, String receiver, String bookname) {
		super();
		this.id = id;
		this.userid = userid;
		this.booid = booid;
		this.receivingaddress = receivingaddress;
		this.booknum = booknum;
		this.phone = phone;
		this.totalprince = totalprince;
		this.receiver = receiver;
		this.bookname = bookname;
	}

	public Order() {
		super();
	}

}