package com.yeBaburavKaStyleHain.jpademoS1;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int cardNo;

//    private String name;

    private String dob;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn
    User user;
    public Card(){

    }

    public Card(int cardNo, String dob, Status status) {
        this.cardNo = cardNo;
//        this.name = name;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
