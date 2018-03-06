package com.tomlongridge.pealrecords.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "peal_methods")
public class PealMethod implements Serializable {

    private static final long serialVersionUID = 2397559735976738115L;

    @Id
    @ManyToOne
    @JoinColumn(name = "peal")
    private Peal peal;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "method")
    private Method method;
    
    @Column
    @Min(1)
    private int changes;
    
    public Method getMethod() {
        return method;
    }
    
    public void setMethod(Method method) {
        this.method = method;
    }
    
    public Peal getPeal() {
        return peal;
    }
    
    public void setPeal(Peal peal) {
        this.peal = peal;
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PealMethod)) return false;
        PealMethod that = (PealMethod) o;
        return Objects.equals(getPeal(), that.getPeal()) &&
                Objects.equals(getMethod(), that.getMethod());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getPeal(), getMethod());
    }
}
