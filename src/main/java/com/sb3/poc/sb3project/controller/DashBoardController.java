package com.sb3.poc.sb3project.controller;

import com.sb3.poc.sb3project.dto.Card;
import jakarta.websocket.server.PathParam;
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
public class DashBoardController {

    private final DashboardService dashboardService;

    Map<Integer, Card> cardMap = new HashMap<>();


    @GetMapping()
    public ResponseEntity getDashBoard() {
        return ResponseEntity.ok(cardMap);
    }

    @PostMapping("/card")
    public ResponseEntity createCard(@RequestBody Card card) {
        cardMap.put(card.getId(), card);
        return ResponseEntity.ok("Card is created successfully");

    }

    @GetMapping
    ResponseEntity getAllCardWithTag() {
        return null;
    }

    @GetMapping
    ResponseEntity getAllCardWithVColumn() {
        return null;
    }

    @GetMapping("/{time}")
    ResponseEntity getAllCardWithTimeStamp(@RequestParam String time) {
        return null;
    }

    @GetMapping("/{userId}")
    ResponseEntity getAllCardWithUser(@PathVariable String userId) {
        return null;
    }

}
