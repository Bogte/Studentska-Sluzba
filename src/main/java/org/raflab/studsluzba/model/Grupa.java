package org.raflab.studsluzba.model;

import lombok.Data;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
public class Grupa {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private StudijskiProgram studijskiProgram;

	@ManyToMany
	private List<Predmet> predmeti;
}
