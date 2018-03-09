package com.tomlongridge.pealrecords.service.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "peal_ringers")
public class PealRinger implements Serializable {

    private static final long serialVersionUID = 4415740371003870568L;

    @Id
    @ManyToOne
    @JoinColumn(name = "peal")
    private Peal peal;
    
    @Id
    @Column
    private Short bell;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "ringer")
    private Ringer ringer;
    
    public Peal getPeal() {
        return peal;
    }
    
    public void setPeal(Peal peal) {
        this.peal = peal;
    }

    public Short getBell() {
        return bell;
    }

    public void setBell(Short bell) {
        this.bell = bell;
    }
    
    public Ringer getRinger() {
        return ringer;
    }
    
    public void setRinger(Ringer ringer) {
        this.ringer = ringer;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PealRinger)) return false;
        PealRinger that = (PealRinger) o;
        return Objects.equals(getPeal(), that.getPeal()) &&
               Objects.equals(getRinger(), that.getRinger()) &&
               Objects.equals(getBell(), that.getBell());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getPeal(), getRinger());
    }
}
