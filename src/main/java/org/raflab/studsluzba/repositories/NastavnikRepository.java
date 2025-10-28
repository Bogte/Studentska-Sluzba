package org.raflab.studsluzba.repositories;

import java.util.List;

import org.raflab.studsluzba.model.Nastavnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface NastavnikRepository extends JpaRepository<Nastavnik, Long> {	//	nasljedjene implementacije poput findById i findByAll

	@Query("select n from Nastavnik n where"
			+ ":ime is null or lower(n.ime) like :ime and "
			+ ":prezime is null or lower(n.prezime) like :prezime")
	List<Nastavnik> findByImeAndPrezime(String ime, String prezime);

	List<Nastavnik> findByEmailIn(List<String> emails);
	
}

