package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.StudijskiProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudijskiProgramRepository extends JpaRepository<StudijskiProgram, Long> {
}
