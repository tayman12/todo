package org.learning.service;

import org.learning.model.ToDo;
import org.learning.model.User;
import org.learning.repository.ToDoRepository;
import org.learning.repository.UserRepository;
import org.learning.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SecurityUtil securityUtil;

    @Transactional
    public ToDo save(ToDo toDo) {
        String username = securityUtil.getCurrentUserName();

        Optional<User> user = userRepository.findById(username);

        toDo.setUser(user.get());

        return toDoRepository.save(toDo);
    }
}
