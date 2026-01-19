package org.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = "org.cs")
@EntityScan("org.cs.entity")
public class CheatShieldApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheatShieldApplication.class, args);
    }
}