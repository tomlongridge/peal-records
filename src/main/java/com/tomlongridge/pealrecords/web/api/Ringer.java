package com.tomlongridge.pealrecords.web.api;

public class Ringer {
    
    private Long id;
    
    private String forename;
    
    private String middleInitials;
    
    private String surname;
    
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

    public Tower getHomeTower() {
        return homeTower;
    }

    public void setHomeTower(Tower homeTower) {
        this.homeTower = homeTower;
    }   

}
