package br.com.forum.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name="discuss")
public class Discuss extends Content {
	
	@Column(name="title", nullable=false, length=128)
	private String title;
	
	@Column(name="message", nullable=false, length=4096)
	private String message;
	
	@ManyToOne @JoinColumn(name="autor_id", nullable=false)
	private User autor;
	@ManyToOne @JoinColumn(name="topic_id", nullable=false)
	private Topic topic;
	@Column(name="date_creation", nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation = new Date();
	@Column(name="block", nullable=false)
	private boolean block = false;



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getAutor() {
		return autor;
	}
	public void setAutor(User autor) {
		this.autor = autor;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	
	
	
}
