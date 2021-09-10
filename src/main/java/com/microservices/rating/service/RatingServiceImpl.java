package com.microservices.rating.service;

import com.microservices.rating.model.dto.RatingDto;
import com.microservices.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public ResponseEntity<?> addRating(RatingDto ratingDto) {
        return null;
    }
}
