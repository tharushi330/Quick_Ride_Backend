package edu.icet.rental.controller;

import edu.icet.rental.dto.Massage;
import edu.icet.rental.service.MassageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/massage")
@CrossOrigin
public class MassageController {
    final MassageService massageService;

    @PostMapping("/add")
    public void add(@RequestBody Massage massage) {
        massageService.add(massage);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        massageService.delete(id);
    }

    @GetMapping("/get-all")
    public List<Massage> getAll() {
        return massageService.getAll();
    }

}
