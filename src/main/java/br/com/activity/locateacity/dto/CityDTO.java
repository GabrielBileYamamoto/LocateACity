package br.com.activity.locateacity.dto;

import br.com.activity.locateacity.model.StateModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CityDTO {
    private int id;
    private String cityName;
    private int population;
    private StateDTO state;
}
