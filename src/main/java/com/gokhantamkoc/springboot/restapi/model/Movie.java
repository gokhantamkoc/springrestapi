package com.gokhantamkoc.springboot.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Gokhan Tamkoc on 20.08.2017.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private long id;
    private String title;
}
