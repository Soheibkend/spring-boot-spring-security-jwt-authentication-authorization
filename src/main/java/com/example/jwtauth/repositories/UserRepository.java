package com.example.jwtauth.repositories;

import com.example.jwtauth.models.ERole;
import com.example.jwtauth.models.Role;
import com.example.jwtauth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername (String username);

    Boolean existsByUsername (String username);

    Boolean existsByEmail (String email);
}
