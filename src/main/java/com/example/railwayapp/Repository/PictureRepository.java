package com.example.railwayapp.Repository;

import com.example.railwayapp.Model.Entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long >{
    List<Picture> findAllByRailwayLine_Number(int railwayLine_number);
}
