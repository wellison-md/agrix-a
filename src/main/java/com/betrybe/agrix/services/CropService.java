package com.betrybe.agrix.services;

import com.betrybe.agrix.entities.Crop;
import com.betrybe.agrix.repositories.CropRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Crop service.
 */
@Service
public class CropService {

  private CropRepository cropRepository;

  /**
   * Instantiates a new Crop service.
   *
   * @param cropRepository the crop repository
   */
  @Autowired
  public CropService(CropRepository cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * Gets all crops.
   *
   * @return the all crops
   */
  public List<Crop> getAllCrops() {
    return cropRepository.findAll();
  }
}
