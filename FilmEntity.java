package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "Film")
public class FilmEntity {
    @Id
    @Column(name = "FilmID")
    private int id;
    @Column(name = "Title")
    private String Title;

    @Column(name = "ReleaseYear")
    private String year;
    @Column(name = "Genre")
    private String film_genre;
    @Column(name = "Director")
    private String film_director;

}
