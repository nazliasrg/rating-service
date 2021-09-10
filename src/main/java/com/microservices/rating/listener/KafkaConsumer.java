package com.microservices.rating.listener;

import com.microservices.rating.model.dto.StatusMessageDto;
import com.microservices.rating.repository.RatingRepository;
import com.microservices.rating.service.RatingService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    private RatingService ratingService;

    @Autowired
    private RatingRepository ratingRepository;

    @KafkaListener(topics = "PoorRatingTopic", groupId = "group_poor_rating")
    public void consumePoorRating(String poorRating) {
        StatusMessageDto result = new StatusMessageDto<>();
        JSONObject poorratingJson = new JSONObject(poorRating);

    }
}
