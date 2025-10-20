package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.StudentPodaci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPodaciRepository extends JpaRepository<StudentPodaci, String> {
}
