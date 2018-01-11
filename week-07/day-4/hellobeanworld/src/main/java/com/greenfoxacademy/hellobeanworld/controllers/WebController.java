package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class WebController {
  @Autowired
  UtilityService utilityService;

  String[] colors = {"white", "grey", "black", "magenta", "pink", "red", "brown", "orange", "yellow", "green", "cyan",
          "blue", "violet", "indianred", "crimson", "purple", "midnightblue", "royalblue", "deepskyblue", "aquamarine",
          "darkgreen"};


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
}
