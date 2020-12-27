package com.digitalplanet.evaluation.alptekintalan.modelDto;

public class CarDto {
    private Long cardtoid;
    private String cardtoname;

    public Long getCardtoid() {
        return cardtoid;
    }

    public void setCardtoid(Long cardtoid) {
        this.cardtoid = cardtoid;
    }

    public String getCardtoname() {
        return cardtoname;
    }

    public void setCardtoname(String cardtoname) {
        this.cardtoname = cardtoname;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "cardtoid=" + cardtoid +
                ", cardtoname='" + cardtoname + '\'' +
                '}';
    }
}
