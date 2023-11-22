package com.compra.inteligente.grupo4.users.service;

import com.compra.inteligente.grupo4.shared.exception.ResourceNotFoundException;
import com.compra.inteligente.grupo4.shared.exception.ResourceValidationException;
import com.compra.inteligente.grupo4.users.domain.entity.User;
import com.compra.inteligente.grupo4.users.domain.persistence.UserRepository;
import com.compra.inteligente.grupo4.users.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private static final String Entity = "User";
    private final UserRepository userRepository;
    private final Validator validator;

    public UserServiceImpl(UserRepository userRepository, Validator validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(Entity, userId));
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User create(User user) {
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        if (!violations.isEmpty()) {
            throw new ResourceValidationException(Entity,violations);
        }
        return userRepository.save(user);
    }

    @Override
    public User update(Long userId, User request) {
        Set<ConstraintViolation<User>> violations = validator.validate(request);
        if (!violations.isEmpty())
            throw new ResourceValidationException(Entity, violations);

        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(Entity, userId));
    }

    @Override
    public ResponseEntity<?> delete(Long userId) {
        return userRepository.findById(userId).map(user -> {
            userRepository.delete(user);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(Entity, userId));
    }
}
