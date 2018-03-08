package com.tomlongridge.pealrecords.service.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "peals")
public class Peal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pealId")
    private Long id;
    
    @Column(name = "dateRung")
    @NotNull
    private LocalDate dateRung;
    
    @ManyToOne
    @JoinColumn(name = "tower")
    private Tower tower;
    
    @Column
    @Min(1)
    @NotNull
    private Integer changes;
    
    @OneToMany(mappedBy = "peal", fetch = FetchType.LAZY)
    private List<PealMethod> methods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateRung() {
        return dateRung;
    }

    public void setDateRung(LocalDate dateRung) {
        this.dateRung = dateRung;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Integer getChanges() {
        return changes;
    }

    public void setChanges(Integer changes) {
        this.changes = changes;
    }
    
    public List<PealMethod> getMethods() {
        return methods;
    }
    
    public void setMethods(List<PealMethod> methods) {
        this.methods = methods;
    }

}
