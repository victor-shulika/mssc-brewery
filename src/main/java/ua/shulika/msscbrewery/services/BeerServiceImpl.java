package ua.shulika.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ua.shulika.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Name")
                .beerStyle("Style")
                .upc(4L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
