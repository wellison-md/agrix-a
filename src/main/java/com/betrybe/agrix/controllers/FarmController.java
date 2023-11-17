package com.betrybe.agrix.controllers;

import com.betrybe.agrix.dtos.DtoConverter;
import com.betrybe.agrix.dtos.FarmDto;
import com.betrybe.agrix.entities.Farm;
import com.betrybe.agrix.services.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Farm controller.
 */
@RestController
@RequestMapping("/farms")
public class FarmController {

  private FarmService farmService;

  /**
   * Instantiates a new Farm controller.
   *
   * @param farmService the farm service
   */
  @Autowired
  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Create farm response entity.
   *
   * @param newFarm the new farm
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<Farm> createFarm(@RequestBody FarmDto newFarm) {
    Farm farm = DtoConverter.dtoToModel(newFarm);

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(farmService.insertFarm(newFarm.toFarm()));
  }

}
