package org.raflab.studsluzba.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class NastavnikZvanje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datumIzbora;
    private String naucnaOblast;
    private String uzaNaucnaOblast;
    private String zvanje;
    private boolean aktivno;
    @ManyToOne
    private Nastavnik nastavnik;
}
