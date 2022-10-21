package com.musala.dronesManagement.services;

import java.util.List;
import java.util.Optional;

import com.musala.dronesManagement.dto.CreateChargingItemDTO;
import com.musala.dronesManagement.dto.DroneChargingDTO;
import com.musala.dronesManagement.dto.MedicationDTO;

public interface IDroneChargingService {

	public Optional<DroneChargingDTO> create(DroneChargingDTO droneChargingDTO);

    public Optional<DroneChargingDTO>  uploadForDroneMedication(long id, List<CreateChargingItemDTO> items);

    public List<MedicationDTO> getMedicationsByDroneId(long droneId);



}
