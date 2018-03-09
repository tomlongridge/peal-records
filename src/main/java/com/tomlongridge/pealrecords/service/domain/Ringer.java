package com.tomlongridge.pealrecords.service.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ringers")
public class Ringer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ringerId")
    private Long id;
    
    @Column
    @NotNull
    private String forename;
    
    @Column
    private String middleInitials;
    
    @Column
    @NotNull
    private String surname;
    
    @OneToMany(mappedBy = "ringer")
    private Set<PealRinger> peals;
    
    @ManyToOne
    @JoinColumn(name = "homeTower")
    private Tower homeTower;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getMiddleInitials() {
        return middleInitials;
    }

    public void setMiddleInitials(String middleInitials) {
        this.middleInitials = middleInitials;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<PealRinger> getPeals() {
        return peals;
    }

    public void setPeals(Set<PealRinger> peals) {
        this.peals = peals;
    }

    public Tower getHomeTower() {
        return homeTower;
    }

    public void setHomeTower(Tower homeTower) {
        this.homeTower = homeTower;
    }    

}
