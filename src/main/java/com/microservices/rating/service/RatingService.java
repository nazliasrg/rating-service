package com.microservices.rating.service;

import com.microservices.rating.model.dto.RatingDto;
import org.springframework.http.ResponseEntity;

public interface RatingService {
    ResponseEntity<?> addRating(RatingDto ratingDto);
}
