package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {
  @Autowired
  UtilityService utilityService;

  @GetMapping(value = "/useful")
  public String usefulEndPoint(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    model.addAttribute("input", utilityService.getEmail());
    model.addAttribute("valid", utilityService.isValid());
    model.addAttribute("ctext", utilityService.getCeasarText());
    model.addAttribute("cnum", utilityService.getNumber());
    model.addAttribute("coded", utilityService.getCoded());
    return "useful";
  }

  @RequestMapping(value = "/useful/colored", method = POST)
  public String coloredEndPoint(Model model) {
    utilityService.randomColor();
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @RequestMapping(value = "/useful/email", method = POST)
  public ModelAndView emailEndPoint(@ModelAttribute(value = "input") String input, Model model) {
    utilityService.validateEmail(input);
    return new ModelAndView("redirect:/useful");
  }

  @RequestMapping (value = "/useful/encoding", method = POST)
  public ModelAndView encode(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model){
    model.addAttribute("coded", utilityService.caesarTranslate(text, number));
    return new ModelAndView("redirect:/useful");
  }

  @RequestMapping(value = "/useful/decoding", method = POST)
  public ModelAndView decode(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model){
    model.addAttribute("coded", utilityService.caesarTranslate(text, -number));
    return new ModelAndView("redirect:/useful");
  }
}
