package com.example.testtp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class TestTp2Application {

    public static void main(String[] args) {
        SpringApplication.run(TestTp2Application.class, args);

        System.out.println("Ceci est un premier message.");
    }



}
