package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.NastavnikZvanje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OneToOne;

@Repository
public interface NastavnikZvanjeRepository extends JpaRepository<NastavnikZvanje, Integer> {
}
