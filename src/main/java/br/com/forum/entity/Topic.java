package br.com.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name="topic")
public class Topic extends Content {
	@Column(name="name", unique=true, length=128, nullable=false)
	private String name;
	@Column(name="desc", nullable=true, length=255)
	private String desc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
