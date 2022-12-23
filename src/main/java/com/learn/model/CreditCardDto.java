package com.learn.model;

public class CreditCardDto {

    private Integer firstFour;
    private Integer secondFour;
    private Integer thirdFour;
    private Integer fourthFour;

    public Integer getFirstFour() {
        return firstFour;
    }

    public void setFirstFour(Integer firstFour) {
        this.firstFour = firstFour;
    }

    public Integer getSecondFour() {
        return secondFour;
    }

    public void setSecondFour(Integer secondFour) {
        this.secondFour = secondFour;
    }

    public Integer getThirdFour() {
        return thirdFour;
    }

    public void setThirdFour(Integer thirdFour) {
        this.thirdFour = thirdFour;
    }

    public Integer getFourthFour() {
        return fourthFour;
    }

    public void setFourthFour(Integer fourthFour) {
        this.fourthFour = fourthFour;
    }

    public String toString() {
        return getFirstFour()+"-"+getSecondFour()+"-"+getThirdFour()+"-"+getFourthFour();
    }
}
