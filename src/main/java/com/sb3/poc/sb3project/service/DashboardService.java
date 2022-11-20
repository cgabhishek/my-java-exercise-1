package com.sb3.poc.sb3project.service;

import com.sb3.poc.sb3project.dto.Card;
import com.sb3.poc.sb3project.dto.CardLabel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
public interface DashboardService {

    public List<Card> getCardByTag(String tag);

    Object getAllCard();

    void createCard(Card card);

    Object getCardByColumn(CardLabel cardLabel);

    Object getCardByTime(String time);

    Object getCardByUser(Integer userId);
}
