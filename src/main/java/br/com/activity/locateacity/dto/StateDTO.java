package br.com.activity.locateacity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StateDTO {
    private int id;

    private String stateName;

    private String abbreviations;

    private String capital;
}
