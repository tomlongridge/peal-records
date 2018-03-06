package com.tomlongridge.pealrecords.domain;

import java.util.Date;
import java.util.Set;

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
    private Date dateRung;
    
    @ManyToOne
    @JoinColumn(name = "tower")
    private Tower tower;
    
    @Column
    @Min(1)
    @NotNull
    private int changes;
    
    @OneToMany(mappedBy = "peal", fetch = FetchType.LAZY)
    private Set<PealMethod> methods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateRung() {
        return dateRung;
    }

    public void setDateRung(Date dateRung) {
        this.dateRung = dateRung;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }
    
    public Set<PealMethod> getMethods() {
        return methods;
    }
    
    public void setMethods(Set<PealMethod> methods) {
        this.methods = methods;
    }

}
