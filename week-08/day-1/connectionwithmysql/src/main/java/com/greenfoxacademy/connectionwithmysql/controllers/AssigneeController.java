package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.factories.AssigneeFactory;
import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AssigneeController {

  @Autowired
  AssigneeService assigneeService;
  @Autowired
  AssigneeFactory assigneeFactory;

  @GetMapping("/assigneelist")
  public String assigneeList(Model model) {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeService.getAllAssignees().forEach(assigneeList::add);
    model.addAttribute("assigneeList", assigneeList);
    return "assigneelist";
  }

  @GetMapping("/addassignee")
  public String addAssignee(Model model) {
    Assignee assignee = new Assignee();
    model.addAttribute("assignee", assignee);
    return "addassignee";
  }

  @PostMapping("/addassignee")
  public String add(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/assigneelist";
  }

  @GetMapping("/editassignee/{id}")
  public String edit(@PathVariable Integer id, Model model) {
    Assignee assignee = assigneeService.getAssignee(id);
    model.addAttribute("assignee", assignee);
    return "editassignee";
  }

  @PostMapping("/editassignee/{id}")
  public String editAssignee(@PathVariable Integer id, @ModelAttribute Assignee assignee) {
    assignee.setId(id);
    assigneeService.modifyAssignee(assignee);
    return "redirect:/assigneelist";
  }

  @PostMapping("/deleteassignee/{id}")
  public String deleteAssignee(@PathVariable Integer id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/assigneelist";
  }
}
