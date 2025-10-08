package com.exatech.bettingplatform.betting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exatech.bettingplatform.betting.service.BetService;
import com.exatech.bettingplatform.betting.model.Bet;

@RestController
@RequestMapping("/api/bets")
public class BetController {
    @Autowired
    private BetService betService;

    @PostMapping
    public Bet placeBet(@RequestBody Bet bet) {
        return betService.placeBet(bet);
    }
}
