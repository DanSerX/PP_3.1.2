package spring_boot_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring_boot_security")
public class SpringBSDApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBSDApplication.class, args);
    }
}