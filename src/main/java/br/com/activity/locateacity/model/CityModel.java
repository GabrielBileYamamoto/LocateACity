package br.com.activity.locateacity.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cities")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CityModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "city_name", length = 50, nullable = false)
    private String cityName;
    @Column(nullable = false)
    private int population;

    @ManyToOne
    @JoinColumn(name ="state_id")
    private StateModel state;
}
