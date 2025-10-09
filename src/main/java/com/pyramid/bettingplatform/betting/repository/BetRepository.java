package com.pyramid.bettingplatform.betting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pyramid.bettingplatform.betting.model.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {}
