package br.com.activity.locateacity.repository;

import br.com.activity.locateacity.model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityModel, Integer> {
}
