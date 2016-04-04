package com.kristjan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kristjantalvar on 04/04/16.
 */
@RestController
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @RequestMapping("/hi")
  public String home() {
    return "Hello Worldss!";
  }

  @RequestMapping("/add")
  public Customer addCustomer(@RequestParam String eesnimi, @RequestParam String perenimi) {
    System.out.println("Adding new customer: " + eesnimi + " " + perenimi);
    return customerRepository.save(new Customer(eesnimi, perenimi));
  }

  @RequestMapping(value = "/findAll")
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

  @RequestMapping("/findByEesnimi")
  public Customer findByEesnimi(@RequestParam String eesnimi) {
    return customerRepository.findByEesnimi(eesnimi);
  }

  @RequestMapping("/findByPerenimi")
  public List<Customer> findByPerenimi(@RequestParam String perenimi) {
    return customerRepository.findByPerenimi(perenimi);
  }


}
