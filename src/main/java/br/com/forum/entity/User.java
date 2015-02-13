package br.com.forum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name="user")
public class User extends Content {
	
	@Column(name="login", length=64, unique=true, nullable=false)
	private String login;
	@Column(name="email", length=128, unique=true, nullable=false)
	private String email;
	@Column(name="active", nullable=false)
	private boolean active = true;
	@Column(name="sync", nullable=false)
	private boolean sync = false;
	@Column(name="exp", nullable=false)
	private boolean exp = false;
	@Column(name="date_creation", nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation = new Date();
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isSync() {
		return sync;
	}
	public void setSync(boolean sync) {
		this.sync = sync;
	}
	public boolean isExp() {
		return exp;
	}
	public void setExp(boolean exp) {
		this.exp = exp;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	
	
	
}
