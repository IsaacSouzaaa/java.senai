package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.ImagensModel;

public interface ImagensRepository extends JpaRepository<ImagensModel, Long> {
}