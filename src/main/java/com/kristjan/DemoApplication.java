package com.kristjan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

  @Autowired
  private CustomerRepository customerRepository;



  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  CommandLineRunner runner() {
    return args -> {
   //   customerRepository.deleteAll();

//      Customer c = new Customer();
//      c.setEesnimi("Mati");
//      c.setPerenimi("Tamm");
//      customerRepository.save(c);

      customerRepository.findAll().forEach(System.out::println);
    };
  }

  ;

}
