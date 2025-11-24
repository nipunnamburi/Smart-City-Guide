package com.smartcity.smartcity_guide.repository;

import com.smartcity.smartcity_guide.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
    List<Place> findByType(String type);
    List<Place> findByCity(String city);
}

