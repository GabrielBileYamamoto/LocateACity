package br.com.activity.locateacity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "States")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StateModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "state_name", length = 50, nullable = false)
    private String stateName;
    @Column(length = 2, nullable = false)
    private String abbreviations;
    @Column(name = "capital", length = 50, nullable = false)
    private String capital;

}
