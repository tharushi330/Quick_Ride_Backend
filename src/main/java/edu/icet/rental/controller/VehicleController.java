package edu.icet.rental.controller;

import edu.icet.rental.dto.Vehicle;
import edu.icet.rental.service.VehicleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vehicle")
@CrossOrigin
public class VehicleController {
    private final VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<Vehicle> add(@Valid @RequestBody Vehicle vehicle) {
        System.out.println(vehicle);
        return ResponseEntity.of(vehicleService.add(vehicle)) ;
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id")  Long id) {
        vehicleService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Vehicle vehicle) {
        vehicleService.update(vehicle);
    }

    @GetMapping("/get-all")
    public List<Vehicle> getAll() {
        return vehicleService.getAll();
    }

    @GetMapping("/search-by-brand")
    public  List<Vehicle>  searchByName(@RequestParam("brand") String brand) {
        return vehicleService.searchByName(brand);
    }
}
