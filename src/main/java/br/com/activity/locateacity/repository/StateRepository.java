package br.com.activity.locateacity.repository;

import br.com.activity.locateacity.model.StateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<StateModel, Integer> {
}
