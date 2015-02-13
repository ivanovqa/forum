package br.com.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Content implements java.io.Serializable {
	@Id @Column(name="id") @GeneratedValue(generator="autoincrement")
	@GenericGenerator(name="autoincrement", strategy="increment")
	private long id;
	
	public long getId() {return id;}
	
	public void setId(long valor) {id = valor;}
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		return obj != null &&
			   obj.getClass().equals(getClass()) &&
			   getId() == ((Content) obj).getId();
	}
	
	public int hashCode() {
		return (getClass().getName() + "-" + getId()).hashCode();
	}
	
	public String toString() {
		return getClass().getName() + " - " + getId();
	}
	
}
