package com.bni.bookstoreconsumer.listener;

import com.bni.bookstoreconsumer.model.Email;
import com.bni.bookstoreconsumer.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {
    @Autowired
    EmailService emailService;

    @KafkaListener(id = "foo", topics = "book-store")
    public void listener(String foo) {
        System.out.println(foo);
        Email email = new Email("062018107066@mhs.itats.ac.id", "tugasgameitats@gmail.com", "[Enigma]Congrats Book Purchased!!", foo);
        emailService.sendEmail(email);
    }
}
