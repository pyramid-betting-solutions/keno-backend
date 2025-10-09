package com.pyramid.bettingplatform.betting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pyramid.bettingplatform.betting.service.BetService;
import com.pyramid.bettingplatform.betting.model.Bet;

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
