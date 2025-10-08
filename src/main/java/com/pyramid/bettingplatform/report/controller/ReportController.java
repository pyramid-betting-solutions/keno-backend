package com.pyramid.bettingplatform.report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @GetMapping("/summary")
    public Map<String,Object> summary() {
        return Map.of("totalBets", 123, "totalPayout", 456);
    }
}
