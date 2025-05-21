package com.hojeonde.hoje.repositories;
import java.util.Optional;
import java.util.UUID;

import com.hojeonde.hoje.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
     Optional<User> findByEmail(String email);

     Optional<User> findById(UUID id);
}
