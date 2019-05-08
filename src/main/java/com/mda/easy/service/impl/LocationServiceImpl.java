package com.mda.easy.service.impl;

import com.mda.easy.dao.LocationRepository;
import com.mda.easy.model.Location;
import com.mda.easy.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocation(Integer id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public Location addLocation(Location location) {
        return null;
    }

    @Override
    public Location updateLocation(Integer id, Location location) throws Exception {
        if (!locationRepository.existsById(id)) throw new Exception("Location with id " + id + " not exist");
        location.setId(id);
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }

    @Override
    public void deleteAllLocation() {
        locationRepository.deleteAll();
    }

    @Override
    public Location findByName(final String name) {
        return locationRepository.findByName(name);
    }
}
