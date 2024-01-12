package com.xworkz.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "SuperHero")
public class SuperHeroEntity {
   @Id
   @Column(name = "s_id")
    private int id;
   @Column(name = "s_realname ")
    private String realName;
   @Column(name = "s_frictionname")
    private String frictionName;
    @Column(name = "s_power")
    private String power;
    @Column(name = "s_country")
    private String country;
    @Column(name = "s_weakness")
    private String weakness;



}
