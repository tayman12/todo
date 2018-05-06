package org.learning.controller;

import org.learning.model.Frequency;
import org.learning.model.ToDo;
import org.learning.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String displayDefaultToDo(Model model) {
        ToDo toDo = new ToDo();
        toDo.setFrequency(Frequency.ONCE);
        model.addAttribute("todo", toDo);

        return "todo";
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String save(@ModelAttribute("todo") ToDo toDo) {
        toDoService.save(toDo);
        return "redirect:index.html";
    }
}
