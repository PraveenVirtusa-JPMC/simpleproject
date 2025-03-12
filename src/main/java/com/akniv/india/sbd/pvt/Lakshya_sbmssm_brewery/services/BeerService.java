package com.akniv.india.sbd.pvt.Lakshya_sbmssm_brewery.services;

import com.akniv.india.sbd.pvt.Lakshya_sbmssm_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
