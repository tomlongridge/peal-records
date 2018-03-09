package com.tomlongridge.pealrecords.service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "peal_footnotes")
public class PealFootnote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "footnoteId")
    private Long id;
    
    @Column
    @NotNull
    private String text;
    
    @ManyToOne
    @JoinColumn(name = "peal")
    private Peal peal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Peal getPeal() {
        return peal;
    }

    public void setPeal(Peal peal) {
        this.peal = peal;
    }

}
