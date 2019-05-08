package com.mda.easy.service;

import com.mda.easy.model.Location;

import java.util.List;

public interface LocationService {

    public List<Location> getAllLocation();

    public Location getLocation(final Integer id);

    public Location addLocation(final Location location);

    public Location updateLocation(Integer id, Location location) throws Exception;

    public void deleteLocation(final Integer id);

    public void deleteAllLocation();

    public Location findByName(final String name);
}
