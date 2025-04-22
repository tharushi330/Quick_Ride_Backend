package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Booking;
import edu.icet.rental.entity.BookingEntity;
import edu.icet.rental.repository.BookingRepository;
import edu.icet.rental.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository repository;
    private final ModelMapper mapper;

    @Override
    public void add(Booking booking) {
        BookingEntity bookingEntity = mapper.map(booking, BookingEntity.class);
        bookingEntity.setBookingDateTime(new Date());

//        if (booking.getStartDate() != null && booking.getEndDate() != null) {
//            long days = ChronoUnit.DAYS.between(booking.getStartDate(), booking.getEndDate());
//            double tot = days*booking
//            bookingEntity.setTotalPrice();
//        }
        repository.save(bookingEntity);

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Booking booking) {
        repository.save(mapper.map(booking, BookingEntity.class));
    }

    @Override
    public Optional<BookingEntity> searchById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Booking> getAll() {
        List<BookingEntity> entity = repository.findAll();
        List<Booking> arrayList = new ArrayList<>();
        entity.forEach(e -> arrayList.add(mapper.map(e, Booking.class)));
        return arrayList;

    }
}
