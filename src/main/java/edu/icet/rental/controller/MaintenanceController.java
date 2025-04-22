package edu.icet.rental.controller;

import edu.icet.rental.dto.Maintenance;
import edu.icet.rental.service.MaintetanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/maintenance")
@CrossOrigin
public class MaintenanceController {
    final MaintetanceService maintetanceService;

    @PostMapping("/add")
    public void add(@RequestBody Maintenance maintenance) {
        maintetanceService.add(maintenance);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id")  Long id) {
        maintetanceService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Maintenance maintenance) {
        maintetanceService.update(maintenance);
    }

    @GetMapping("/get-all")
    public List<Maintenance> getAll() {
        return maintetanceService.getAll();
    }

}
