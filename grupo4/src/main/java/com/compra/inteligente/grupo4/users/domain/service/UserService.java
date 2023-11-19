package com.compra.inteligente.grupo4.users.domain.service;

import com.compra.inteligente.grupo4.users.domain.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long userId);
    User getByEmail(String email);
    User create(User user);
    User update(Long userId, User request);
    ResponseEntity<?> delete(Long userId);
}
