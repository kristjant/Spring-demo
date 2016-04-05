package com.kristjan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeLeaf {

  @RequestMapping("/th")
  public String greeting(@RequestParam(value = "name", required = false, defaultValue = "123") String name
      , Model model) {
    model.addAttribute("name", name);
    return "th";
  }

}
