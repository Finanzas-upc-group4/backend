package com.compra.inteligente.grupo4.users.controller;

import com.compra.inteligente.grupo4.users.domain.service.UserService;
import com.compra.inteligente.grupo4.users.mapping.UserMapper;
import com.compra.inteligente.grupo4.users.resource.UserResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    private final UserService userService;
    private final UserMapper mapper;
    public UserController(UserService userService, UserMapper mapper){
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<UserResource> getAllUsers(){
        return mapper.modelListPage(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<UserResource> createUser(@RequestBody UserResource resource) {
        return new ResponseEntity<>(mapper.toResource(userService.create(mapper.toModel(resource))), HttpStatus.CREATED);
    }

    @PutMapping("{userId}")
    public UserResource updateUser(@PathVariable Long userId,
                                          @RequestBody UserResource resource) {
        return mapper.toResource(userService.update(userId, mapper.toModel(resource)));
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        return userService.delete(userId);
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<UserResource> getUserByEmail(@PathVariable String email) {
        UserResource user = mapper.toResource(userService.getByEmail(email));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
