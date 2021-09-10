package com.microservices.rating.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="tbl_rating")
public class RatingEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer ratingId;

    @Column
    private Date ratingTime;

    @Column
    private Integer customerId;

    @Column
    private Integer stars;

    @Column
    private String message;

    @Column
    private Integer followUp;

    public RatingEntity(Date ratingTime, Integer customerId, Integer stars, String message, Integer followUp) {
        this.ratingTime = ratingTime;
        this.customerId = customerId;
        this.stars = stars;
        this.message = message;
        this.followUp = followUp;
    }
}
