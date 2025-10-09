package com.pyramid.bettingplatform.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pyramid.bettingplatform.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
