package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {


  @RequestMapping(value = "/show")
  public String firstEndPoint(Model model) {
    BankAccount firstAccount = new BankAccount("Simba", 2000, "lion", "Zebra", "good");
    model.addAttribute("firstAccount", firstAccount);
    return "show";
  }

  @RequestMapping(value = "/show/text")
  public String secondEndPoint(Model model) {
    String toShow = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("toshow", toShow);
    return "text";
  }

  @RequestMapping(value = "/show/multiple")
  public String thirdEndPoint(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    BankAccount firstAccount = new BankAccount("Simba", 2000, "lion", "Zebra", "good");
    BankAccount secondAccount = new BankAccount("Scar", 1000000, "darklion", "Zebra", "bad");
    BankAccount thirdAccount = new BankAccount("Rafiki", 300, "monkey", "Zebra", "good");
    BankAccount fourthAccount = new BankAccount("Timon", 100, "meerkat", "Bug", "good");
    BankAccount fifthAccount = new BankAccount("Pumba", 100, "warthog", "Bug", "good");
    BankAccount sixthAccount = new BankAccount("Shenzi", 0, "hyena", "Zebra", "bad");
    accounts.add(firstAccount);
    accounts.add(secondAccount);
    accounts.add(thirdAccount);
    accounts.add(fourthAccount);
    accounts.add(fifthAccount);
    accounts.add(sixthAccount);
    model.addAttribute("multiple", accounts);
    return "multiple";
  }
}
