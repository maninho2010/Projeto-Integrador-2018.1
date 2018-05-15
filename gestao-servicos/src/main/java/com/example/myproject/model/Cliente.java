package com.example.myproject.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Cliente extends Usuario{

	private static final long serialVersionUID = 1L;
		
}
