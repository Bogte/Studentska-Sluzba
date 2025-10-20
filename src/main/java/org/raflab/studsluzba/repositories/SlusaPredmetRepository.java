package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.SlusaPredmet;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlusaPredmetRepository extends PagingAndSortingRepository<SlusaPredmet, Long> {
}
