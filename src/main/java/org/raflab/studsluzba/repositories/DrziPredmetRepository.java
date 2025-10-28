package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.DrziPredmet;
import org.raflab.studsluzba.model.Predmet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.OneToOne;
import java.util.List;

@Repository
public interface DrziPredmetRepository extends JpaRepository<DrziPredmet, Long> {
    @Query("select dp.predmet from DrziPredmet dp where dp.nastavnik.id = :idNastavnika")
    List<Predmet> getPredmetiZaNastavnikaUAktivnojSkolskojGodini(Long idNastavnika);

    @Query("select dp from DrziPredmet dp where dp.nastavnik.id = : idNastavnika and dp.predmet.id = idPredmeta")
    DrziPredmet getDrziPredmetNastavnikPredmet(Long idNastavnika, Long idPredmeta);
}
