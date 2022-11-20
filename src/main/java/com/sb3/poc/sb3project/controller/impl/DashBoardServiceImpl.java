package com.sb3.poc.sb3project.controller.impl;

import com.sb3.poc.sb3project.dto.Card;
import com.sb3.poc.sb3project.dto.CardLabel;
import com.sb3.poc.sb3project.service.DashboardService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
@Service
public class DashBoardServiceImpl implements DashboardService {

    List<Card> cardList = new ArrayList<>();

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<Card> getCardByTag(String tag) {
        return cardList.stream()
                .filter(card -> card.getTag().equals(tag))
                .collect(Collectors.toList());
    }

    @Override
    public List<Card> getAllCard() {
        return cardList;
    }

    @Override
    public void createCard(Card card) {
        cardList.add(card);
    }

    @Override
    public Object getCardByColumn(CardLabel cardLabel) {
        return cardList.stream()
                .filter(card -> card.getLabel().equals(cardLabel))
                .collect(Collectors.toList());
    }

    @Override
    public Object getCardByTime(String date) {
        LocalDate localDate = LocalDate.parse(date, formatter);
        return cardList.stream()
                .filter(card -> card.getLastUpdateDate().isAfter(localDate))
                .collect(Collectors.toList());
    }

    @Override
    public Object getCardByUser(Integer userId) {
        return cardList.stream()
                .filter(card -> card.getCreatedBy().getUserId() == userId)
                .collect(Collectors.toList());
    }
}
