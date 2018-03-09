package com.tomlongridge.pealrecords.web.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Peal {
    
    private Long id;
    
    private LocalDate dateRung;
    
    private Integer changes;
    
    private Long duration;
    
    private Tower tower;
    
    private List<PealMethod> methods;
    
    private List<PealRinger> ringers;
    
    private List<String> footnotes;
    
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

    public Integer getChanges() {
        return changes;
    }

    public void setChanges(Integer changes) {
        this.changes = changes;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
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

    public List<PealRinger> getRingers() {
        if (ringers == null) {
            ringers = new ArrayList<PealRinger>();
        }
        return ringers;
    }

    public void setRingers(List<PealRinger> ringers) {
        this.ringers = ringers;
    }

    public List<String> getFootnotes() {
        if (footnotes == null) {
            footnotes = new ArrayList<String>();
        }
        return footnotes;
    }

    public void setFootnotes(List<String> footnotes) {
        this.footnotes = footnotes;
    }

}
