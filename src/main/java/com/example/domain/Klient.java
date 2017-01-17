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
	@Column(unique=true, nullable=false)
	private int id;
	
	@Column
	private String imie;
	
	@Column
	private String nazwisko;
	
	public String getNazwisko(){
		return nazwisko;
	}
	
}





