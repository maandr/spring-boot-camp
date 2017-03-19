package com.cinematourist.domain.movie;

import com.cinematourist.database.AbstractEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "title", "year", "director" })
@Entity
@Table(name = "MOVIE")
public class Movie extends AbstractEntity {

    @Column(name = "TITLE", columnDefinition = "VARCHAR(180) NOT NULL")
    private String title;

    @Column(name = "YEAR", columnDefinition = "INT(4) NOT NULL")
    private Integer year;

    @Column(name = "GENRE", columnDefinition = "VARCHAR(90)")
    private String genre;

    @Column(name = "COUNTY", columnDefinition = "VARCHAR(90)")
    private String country;

    @Column(name = "DIRECTOR", columnDefinition = "VARCHAR(180) NOT NULL")
    private String director;

    @Column(name = "WRITER", columnDefinition = "VARCHAR(180)")
    private String writer;

    @Column(name = "CAST", columnDefinition = "VARCHAR(250)")
    private String cast;

    @Column(name = "AWARDS", columnDefinition = "VARCHAR(250)")
    private String awards;

    @Column(name = "PLOT", columnDefinition = "TEXT")
    private String plot;
}