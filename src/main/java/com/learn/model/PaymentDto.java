package com.learn.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class PaymentDto {


    @NotEmpty(message = "* cannot be empty")
    private String name;
    private CreditCardDto creditCardDto;

    private AmountDto amountDto;

    private Date date;

    public CreditCardDto getCreditCardDto() {
        return creditCardDto;
    }

    public void setCreditCardDto(CreditCardDto creditCardDto) {
        this.creditCardDto = creditCardDto;
    }

    public AmountDto getAmountDto() {
        return amountDto;
    }

    public void setAmountDto(AmountDto amountDto) {
        this.amountDto = amountDto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
