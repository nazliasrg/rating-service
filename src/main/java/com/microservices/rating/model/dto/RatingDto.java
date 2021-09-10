package com.microservices.rating.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingDto {
    private Date ratingTime;
    private Integer customerId;
    private Integer stars;
    private String message;
    private Integer followUp;

}
