package com.sb3.poc.sb3project.controller;

import com.sb3.poc.sb3project.dto.Card;
import com.sb3.poc.sb3project.dto.CardLabel;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
public class DashBoardControllerTest extends AbstractTest {

    private DashBoardController dashBoardController;

    @Test
    public void createCard() throws Exception {
        String uri = "/dashboard/v1";
        Card card = new Card();
        card.setId(1);
        card.setLabel(CardLabel.CREATED);
        String inputJson = super.mapToJson(card);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Card is created successfully");
    }

}
