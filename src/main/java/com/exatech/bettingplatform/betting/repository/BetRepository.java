package com.exatech.bettingplatform.betting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exatech.bettingplatform.betting.model.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {}
