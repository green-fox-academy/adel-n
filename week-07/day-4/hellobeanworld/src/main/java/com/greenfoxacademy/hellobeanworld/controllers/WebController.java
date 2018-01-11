package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
  @Autowired
  UtilityService utilityService;

  @RequestMapping(value = "/useful")
  public String usefulEndPoint(Model model) {
    return "useful";
  }

  @RequestMapping(value = "/useful/colored")
  public String coloredEndPoint(Model model) {
    utilityService.randomColor();
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @RequestMapping(value = "/useful/email")
  public String emailEndPoint() {
    
  }
}
