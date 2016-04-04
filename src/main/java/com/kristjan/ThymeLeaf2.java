package com.kristjan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kristjantalvar on 04/04/16.
 */
@Controller
public class ThymeLeaf2 {

  @Autowired
  private CustomerRepository customerController;

  @RequestMapping("/th2")
  public String th2(Model model) {
    model.addAttribute("customers", customerController.findAll());
    return "th2";
  }

}
