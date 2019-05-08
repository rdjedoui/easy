package com.mda.easy.resource;

import com.mda.easy.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationResource {

    private static final Logger logger = LoggerFactory.getLogger(LocationResource.class);

    @Autowired
    LocationResource locationResource;

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public List<Location> getAllLocation() {
        return locationResource.getAllLocation();
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.GET)
    public Location getLocation(@PathVariable Integer id) {
        return locationResource.getLocation(id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public Location addLocation(@RequestBody Location Location) {
        return locationResource.addLocation(Location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable Integer id) {
        locationResource.deleteLocation(id);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public Location updateLocation(@PathVariable Integer id, @RequestBody Location Location) throws Exception {
        return locationResource.updateLocation(id, Location);
    }

}
