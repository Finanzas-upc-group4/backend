package com.compra.inteligente.grupo4.users.domain.persistence;

import com.compra.inteligente.grupo4.data.domain.entity.Register;
import com.compra.inteligente.grupo4.users.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 User findUserByEmail(String email);
}
