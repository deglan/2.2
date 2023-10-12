package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Market {

    String name;
    List<Country> countries;
}
