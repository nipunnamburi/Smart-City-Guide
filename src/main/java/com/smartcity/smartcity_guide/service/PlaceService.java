package com.smartcity.smartcity_guide.service;

import com.smartcity.smartcity_guide.model.Place;
import com.smartcity.smartcity_guide.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository repo;

    public List<Place> getAllPlaces() {
        return repo.findAll();
    }

    public List<Place> getByType(String type) {
        return repo.findByType(type);
    }
}

