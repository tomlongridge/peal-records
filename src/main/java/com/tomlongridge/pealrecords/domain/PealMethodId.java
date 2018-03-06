package com.tomlongridge.pealrecords.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PealMethodId implements Serializable {
    
    private static final long serialVersionUID = 161899408498943380L;

    @Column(name = "peal")
    private Long pealId;
    
    @Column(name = "method")
    private Long methodId;
    
    public PealMethodId() {
    }
    
    public PealMethodId(Long pealId, Long methodId) {
        this.pealId = pealId;
        this.methodId = methodId;
    }
    
    public Long getPealId() {
        return pealId;
    }
    
    public Long getMethodId() {
        return methodId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PealMethodId)) return false;
        PealMethodId that = (PealMethodId) o;
        return Objects.equals(getPealId(), that.getPealId()) &&
                Objects.equals(getMethodId(), that.getMethodId());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getPealId(), getMethodId());
    }
}
