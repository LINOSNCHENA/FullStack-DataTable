package com.presly.marvin.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banklist")
public class Contact {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "office")
	private String office;
	@Column(name = "stars")
	private long stars;
	@Column(name = "createdt", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdt;

	public Contact(String name, String mobile, String office, long stars, Date createdt) // SECOND
	{
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.stars = stars;
		this.createdt = createdt;
	}

	public Contact() {
	} // THIRD

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;	// 1
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // 2
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;	// 3
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public long getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public Date getCreatedt() {
		return createdt;
	}

	public void setCreatedt(Date createdt) {
		this.createdt = createdt;
	}

}