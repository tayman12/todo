package org.learning.controller;

import org.learning.model.Frequency;
import org.learning.model.ToDo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ToDoController {

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String displayDefaultToDo(Model model) {
        ToDo toDo = new ToDo();
        toDo.setFrequency(Frequency.ONCE);
        model.addAttribute("todo", toDo);

        return "todo";
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String displayDefaultToDo(@ModelAttribute("todo") ToDo toDo) {
        System.out.println("New todo to be created");
        return "redirect:index.html";
    }
}
