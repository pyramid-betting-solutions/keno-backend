package com.exatech.bettingplatform.betting.service;

import org.springframework.stereotype.Service;
import com.exatech.bettingplatform.betting.model.Bet;

@Service
public class BetService {
    public Bet placeBet(Bet bet) {
        // TODO: Validate bets, check draw state, persist via repository
        bet.setStatus("ACCEPTED");
        return bet;
    }
}
