package com.bidapp.demo.sender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
@PropertySource("classpath:/application.properties")
public class ActiavationMailSender {

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private Integer port;

    public void send(String to, String subject, String message) {

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
            /*mailSender.setPort(465);
            mailSender.setUsername("bsifer@yandex.ru");
            mailSender.setPassword("altair2006@");
            mailSender.setHost("smtp.yandex.ru");*/
            mailSender.setPort(port);
            mailSender.setUsername(username);
            mailSender.setPassword(password);
            mailSender.setHost(host);

        Properties properties = mailSender.getJavaMailProperties();
            properties.setProperty("mail.transport.protocol", "smtps");
            properties.setProperty("mail.debug", "true");



        SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(to);
            mailMessage.setFrom(username);
            mailMessage.setSubject(subject);
            mailMessage.setText(message);

        mailSender.send(mailMessage);
    }
}
