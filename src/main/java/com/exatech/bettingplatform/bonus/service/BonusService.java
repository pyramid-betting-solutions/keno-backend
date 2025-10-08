package com.exatech.bettingplatform.bonus.service;

import org.springframework.stereotype.Service;

@Service
public class BonusService {
    public long applyBonus(long currentBonus, long betAmount, double percentage) {
        long inc = Math.round(betAmount * percentage);
        return currentBonus + inc;
    }
}
