package br.com.forum.entity;

import javax.persistence.*;
import java.util.Date;

@Entity @Table(name="responce")
public class Response extends Content {
	@ManyToOne @JoinColumn(name="discuss_id", nullable=false)
	private Discuss discuss;
	@Column(name="message", length=4096, nullable=false)
	private String message;
	@ManyToOne @JoinColumn(name="autor_id", nullable=false)
	private User user;
	@Column(name="date_creation", nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation = new Date();
	public Discuss getDiscuss() {
		return discuss;
	}
	public void setDiscuss(Discuss discuss) {
		this.discuss = discuss;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String mensagem) {
		this.message = mensagem;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	
}
