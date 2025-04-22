package edu.icet.rental.controller;

import edu.icet.rental.dto.Booking;
import edu.icet.rental.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/booking")
@CrossOrigin
public class BookingController {
    final BookingService bookingService;

    @PostMapping("/add")
    public void add(@RequestBody Booking booking) {
        bookingService.add(booking);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        bookingService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Booking booking) {
        bookingService.update(booking);
    }

    @GetMapping("/get-all")
    public List<Booking> getAll() {
        return bookingService.getAll();
    }
}
