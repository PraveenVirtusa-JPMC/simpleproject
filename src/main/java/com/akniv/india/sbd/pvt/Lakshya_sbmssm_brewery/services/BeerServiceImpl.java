package com.akniv.india.sbd.pvt.Lakshya_sbmssm_brewery.services;

import com.akniv.india.sbd.pvt.Lakshya_sbmssm_brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxry")
                .beerStyle("Pale")
                .build();
        //return null;
    }
}
