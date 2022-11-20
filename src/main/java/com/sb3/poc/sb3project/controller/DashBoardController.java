package com.sb3.poc.sb3project.controller;

import com.sb3.poc.sb3project.dto.Card;
import com.sb3.poc.sb3project.dto.CardLabel;
import com.sb3.poc.sb3project.service.DashboardService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
@RestController
@RequestMapping("/dashboard/v1")
@AllArgsConstructor
public class DashBoardController {

    private final DashboardService dashboardService;

    @GetMapping()
    public ResponseEntity getDashBoard() {
        return ResponseEntity.ok(dashboardService.getAllCard());
    }

    @PostMapping("/card")
    public ResponseEntity createCard(@RequestBody Card card) {
        dashboardService.createCard(card);
        return ResponseEntity.ok("Card is created successfully");

    }

    @GetMapping("/card/tag")
    ResponseEntity getAllCardWithTag(@RequestParam String tag) {
        return ResponseEntity.ok(dashboardService.getCardByTag(tag));
    }

    @GetMapping("/card/column")
    ResponseEntity getAllCardWithColumn(CardLabel cardLabel) {
        return ResponseEntity.ok(dashboardService.getCardByColumn(cardLabel));
    }

    @GetMapping("/card/{time}")
    ResponseEntity getAllCardWithTimeStamp(@RequestParam String time) {
        return ResponseEntity.ok(dashboardService.getCardByTime(time));
    }

    @GetMapping("/card/{userId}")
    ResponseEntity getAllCardWithUser(@PathVariable Integer userId) {
        return ResponseEntity.ok(dashboardService.getCardByUser(userId));
    }

}
