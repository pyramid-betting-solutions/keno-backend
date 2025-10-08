package com.pyramid.bettingplatform.draw.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class DrawScheduler {
    // Simple scheduled job - runs every minute in this sample
    @Scheduled(fixedDelayString = "${draw.scheduler.delay:60000}")
    public void runDrawCycle() {
        System.out.println("[DrawScheduler] Tick at " + LocalDateTime.now());
        // TODO: implement draw lifecycle (open, lock, compute, notify)
    }
}
