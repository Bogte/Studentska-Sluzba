package org.raflab.studsluzba.repositories;

import org.raflab.studsluzba.model.SlusaPredmet;
import org.raflab.studsluzba.model.StudentIndeks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlusaPredmetRepository extends PagingAndSortingRepository<SlusaPredmet, Long> {

    @Query("select sp from SlusaPredmet sp where sp.studentIndeks.id = :indeksId1")
    List<SlusaPredmet> getSlusaPredmetForIndeksAktivnaGodina(Long indeksId);

    @Query("select sp.studentIndeks from SlusaPredmet sp where sp.drziPredmet.predmet.id = :idPredmeta "
            + "and sp.drziPredmet.nastavnik.id = :idNastavnika")
    List<StudentIndeks> getStudnetiSlusaPredmetAktivnaGodina(Long idPredmeta, Long idNastavnika);

    @Query("select sp.studentIndeks from SlusaPredmet sp where sp.drziPredmet.id = :idDrziPredmet")
    List<StudentIndeks> getStudnetiSlusaPredmetZaDrziPredmet(Long idDrziPredmet);

    @Query("select si from StudentIndeks si where not exists "
            + "(select sp from SlusaPredmet sp where sp.studentIndeks = si and sp.drziPredmet.id = :idDrziPredmet)")
    List<StudentIndeks> getStudentiNeSlusajuDrziPredmet(Long idDrziPredmet);

    /*
     * TODO dodati slicne operacije koje vracaju sve studente za stud program/ godinu studija koje ne slusaju predmet
     */
}
