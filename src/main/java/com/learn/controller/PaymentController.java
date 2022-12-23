package com.learn.controller;

import com.learn.model.CreditCardDto;
import com.learn.model.PaymentDto;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.math.BigDecimal;

@Controller
public class PaymentController {


    @RequestMapping("/showpaymentform")
    private String showPaymentForm(@ModelAttribute("paymentDto") PaymentDto paymentDto) {
        return "paymentform";
    }

    @RequestMapping("/processpayment")
    private String processPayment(@Valid @ModelAttribute("paymentDto") PaymentDto paymentDto, BindingResult bindingResult) {
        System.out.println(paymentDto);
        if(bindingResult.hasErrors()) {
            return "paymentform";
        }
        return "paymentresult";
    }

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, "name", stringTrimmerEditor);

    }


}
