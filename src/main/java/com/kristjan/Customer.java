package com.kristjan;

import lombok.*;
import org.springframework.data.annotation.Id;


/**
 * Created by kristjantalvar on 04/04/16.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    private String id;
    private String eesnimi;
    private String perenimi;

    Customer(String eesnimi, String perenimi){
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
    }
}
