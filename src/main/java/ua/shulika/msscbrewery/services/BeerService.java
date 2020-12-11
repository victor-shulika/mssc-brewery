package ua.shulika.msscbrewery.services;

import ua.shulika.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beer);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
