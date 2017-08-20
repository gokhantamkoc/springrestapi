package com.gokhantamkoc.springboot.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Gokhan Tamkoc on 19.08.2017.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
    private long id;
    private String name;
}
