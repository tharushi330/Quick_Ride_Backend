package edu.icet.rental.controller;

import edu.icet.rental.dto.Review;
import edu.icet.rental.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/review")
@CrossOrigin
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/add")
    public void add(@RequestBody Review review) {
        reviewService.add(review);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id")  Long id) {
        reviewService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Review review) {
        reviewService.update(review);
    }

    @GetMapping("/get-all")
    public List<Review> getAll() {
        return reviewService.getAll();
    }
}
