package com.example.jwtauth.repositories;

import com.example.jwtauth.models.ERole;
import com.example.jwtauth.models.Role;
import com.example.jwtauth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName (ERole name);
}
