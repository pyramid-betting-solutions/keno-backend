package com.pyramid.bettingplatform.betting.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bets")
@Data
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long drawId;
    private Long cashierId;
    private Long amount;
    private String status;
}
