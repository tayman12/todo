package org.learning.controller;

import org.learning.model.Frequency;
import org.learning.model.ToDo;
import org.learning.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String displayDefaultToDo(Model model) {
        ToDo toDo = new ToDo();
        toDo.setFrequency(Frequency.ONCE);
        model.addAttribute("todo", toDo);

        return "todo";
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "/todo", method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute("todo") ToDo toDo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        } else {
            toDoService.save(toDo);
            return "redirect:index.html";
        }
    }
}
