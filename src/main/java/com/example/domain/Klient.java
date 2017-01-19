package com.example.domain;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="KLIENT")
public class Klient {
	//private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="Imie", length=45)
	private String imie;
	
	@Column(name="Nazwisko", length=45)
	private String nazwisko;
	
	public String getNazwisko(){
		return nazwisko;
	}
	
}





