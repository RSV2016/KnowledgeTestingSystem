package com.KTS.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

   // @Autowired
    private UserDao userDao;

    @GetMapping
    public Iterable<User> getAll() {
        return userDao.findAll();
    }

    @GetMapping("{userId}")
    public User getOne(@PathVariable Integer userId) {
        return userDao.findOne(userId);
    }

    @PostMapping
    public void getOne(@RequestBody
                       @Valid
                               User user
    )

    {
        userDao.save(user);
    }
}
