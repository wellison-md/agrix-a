package com.betrybe.agrix.services;

import com.betrybe.agrix.entities.Farm;
import com.betrybe.agrix.repositories.FarmRepository;
import com.betrybe.agrix.utils.Exception;
import java.util.List;
import java.util.Optional;
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

  /**
   * Gets all farms.
   *
   * @return the all farms
   */
  public List<Farm> getAllFarms() {
    return farmRepository.findAll();
  }

  /**
   * Gets farm by id.
   *
   * @param id the id
   * @return the farm by id
   * @throws IllegalArgumentException the illegal argument exception
   */
  public Farm getFarmById(Long id) throws  IllegalArgumentException {
    Optional<Farm> farm = farmRepository.findById(id);

    if (farm.isEmpty()) {
      throw new Exception();
    }

    return farm.get();
  }

}
