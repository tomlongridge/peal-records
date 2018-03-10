package com.tomlongridge.pealrecords.web.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Method extends EmbeddedResource {
    
    private Long id;
    
    private String name;

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
    
}
