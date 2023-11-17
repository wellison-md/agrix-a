package com.betrybe.agrix.services;

import com.betrybe.agrix.entities.Farm;
import com.betrybe.agrix.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Farm service.
 */
@Service
public class FarmService {

  private FarmRepository farmRepository;

  /**
   * Instantiates a new Farm service.
   *
   * @param farmRepository the farm repository
   */
  @Autowired
  public FarmService(FarmRepository farmRepository) {
    this.farmRepository = farmRepository;
  }

  /**
   * Insert farm entity farm.
   *
   * @param farm the farm
   * @return the entity farm
   */
  public Farm insertFarm(Farm farm) {
    return farmRepository.save(farm);
  }
}
