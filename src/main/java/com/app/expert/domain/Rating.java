package com.app.expert.domain;

import javax.persistence.*;

@Entity
@Table(name="rates")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private double REL;
    private double VAL;
    private double PER;
    private double KSM;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getREL() {
        return REL;
    }

    public void setREL(double REL) {
        this.REL = REL;
    }

    public double getVAL() {
        return VAL;
    }

    public void setVAL(double VAL) {
        this.VAL = VAL;
    }

    public double getPER() {
        return PER;
    }

    public void setPER(double PER) {
        this.PER = PER;
    }

    public double getKSM() {
        return KSM;
    }

    public void setKSM(double KSM) {
        this.KSM = KSM;
    }
}
