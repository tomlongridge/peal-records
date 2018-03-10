package com.tomlongridge.pealrecords.web.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmbeddedResource extends ResourceSupport {

    private Map<String, ResourceSupport> resources = new HashMap<String, ResourceSupport>();
    
    public void embed(final String name, final ResourceSupport resource) {
        getResources().put(name, resource);
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("_embedded")
    public Map<String, ResourceSupport> getResources() {
        return resources;
    }
    
}
