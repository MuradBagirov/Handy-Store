package com.onlinestore.onlinestore.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    String date;

    UUID imageId;


    @OneToOne
    @JoinColumn(name = "category_Id")
    Category category;


}
