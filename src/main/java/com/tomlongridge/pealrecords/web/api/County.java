package com.tomlongridge.pealrecords.web.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class County extends EmbeddedResource {
    
    private Long id;
    
    private String name;
    
    private Country country;

    @JsonProperty("id")
    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
