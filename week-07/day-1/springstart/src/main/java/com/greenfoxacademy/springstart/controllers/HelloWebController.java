package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong(1);
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, " +
          "Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste",
          "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao",
          "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
          "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};
  String[] colors = {"white", "grey", "black", "magenta", "pink", "red", "brown", "orange", "yellow", "green", "cyan",
          "blue", "violet"};


  @RequestMapping(value = "/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.getAndIncrement());
    model.addAttribute("hellos", hellos[(int)(Math.random() * hellos.length)]);
    model.addAttribute("colors", colors[(int)(Math.random() * colors.length)]);
    return "greeting";
  }
}
