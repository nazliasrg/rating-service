package com.microservices.rating.controller;

import com.microservices.rating.model.dto.RatingDto;
import com.microservices.rating.model.dto.StatusMessageDto;
import com.microservices.rating.model.entity.RatingEntity;
import com.microservices.rating.repository.RatingRepository;
import com.microservices.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rating")
@CrossOrigin("*")
public class RatingController {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private RatingService ratingService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        List<RatingEntity> ratingEntities = ratingRepository.findAll();
        return ResponseEntity.ok(ratingEntities);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addRating(@RequestBody RatingDto ratingDto){
        StatusMessageDto result = new StatusMessageDto<>();

        try{
            return ratingService.addRating(ratingDto);
        }
        catch (Exception e){
            result.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(result);
        }
    }
}
