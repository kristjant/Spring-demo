package com.kristjan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

  @Autowired
  private CustomerRepository customerRepository;

  @Test
  public void contextLoads() {
  }

  @Test
  public void saveCustomer() {
    Customer c = new Customer();
    c.setEesnimi("Mati");
    c.setPerenimi("Tamm");
    customerRepository.save(c);
  }

  @Test
  public void findByEesnimi() {
    assertEquals("Mati", customerRepository.findByEesnimi("Mati").getEesnimi());
  }

  @Test
  public void findByEesnimiWithQuery() {
    assertEquals("Mati", customerRepository.findByEesnimi("Mati").getEesnimi());
  }


}
