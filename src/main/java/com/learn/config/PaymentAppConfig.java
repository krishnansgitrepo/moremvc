package com.learn.config;

import com.learn.formatter.CreditCardFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.learn.*")
public class PaymentAppConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/WEB-INF/view/");
        irvr.setSuffix(".jsp");
        return irvr;
    }

    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new CreditCardFormatter());
    }

}
