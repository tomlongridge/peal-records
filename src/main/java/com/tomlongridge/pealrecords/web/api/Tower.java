package com.tomlongridge.pealrecords.web.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tower extends EmbeddedResource {
    
    private Long id;
    
    private String dedication;
    
    private String area;
    
    private String town;
    
    private County county;
    
    public Long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(Long id) {
        this.id = id;
    }

    public String getDedication() {
        return dedication;
    }

    public void setDedication(String dedication) {
        this.dedication = dedication;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @JsonIgnore
    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        super.embed("county", county);
    }

}
