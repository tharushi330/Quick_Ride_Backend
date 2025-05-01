package edu.icet.rental.controller;

import edu.icet.rental.dto.Message;
import edu.icet.rental.service.MassageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/message") //API URL path eka map karanawa
@CrossOrigin
public class MassageController {
    final MassageService massageService;

    @PostMapping("/add")
    public void add(@RequestBody Message message) {
        massageService.add(message);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        massageService.delete(id);
    }

    @GetMapping("/get-all")
    public List<Message> getAll() {
        return massageService.getAll();
    }

}
