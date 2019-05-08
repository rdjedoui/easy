package com.mda.easy.dao;

import com.mda.easy.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    //@Query("select loc from Location loc left join fetch loc.employees left join fetch loc.roles")
    @Query("select loc from Location loc left join fetch loc.employees")
    List<Location> findAllWithEmployees();

    @Query("select loc from Location loc left join fetch loc.roles")
    List<Location> findAllWithRoles();

    @Query("select loc from Location loc left join fetch loc.roles where loc.name = :locationName")
    Location findByName(@Param("locationName") String locationName);
}
