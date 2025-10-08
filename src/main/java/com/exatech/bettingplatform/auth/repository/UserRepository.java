package com.exatech.bettingplatform.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exatech.bettingplatform.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
