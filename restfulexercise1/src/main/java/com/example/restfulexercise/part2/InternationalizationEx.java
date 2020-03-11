package com.example.restfulexercise.part2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InternationalizationEx {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/greeting")
    public String greet(String username) {
        return messageSource.getMessage("greeting.message" ,  null,
                LocaleContextHolder.getLocale());
    }

    @GetMapping("/greeting-username")
    public String greetWithUsername(@RequestParam("username") String username) {
        return messageSource.getMessage("greeting.message" ,  null,
                LocaleContextHolder.getLocale()) + " " + username;
    }
}
