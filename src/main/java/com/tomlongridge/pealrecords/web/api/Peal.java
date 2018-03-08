package com.tomlongridge.pealrecords.web.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Peal {
    
    private Long id;
    
    private LocalDate dateRung;
    
    private Tower tower;
    
    private Integer changes;
    
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
        if (methods == null) {
            methods = new ArrayList<PealMethod>();
        }
        return methods;
    }
    
    public void setMethods(List<PealMethod> methods) {
        this.methods = methods;
    }

}
