package com.moviefix.auth.repositories;

import com.moviefix.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
