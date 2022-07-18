package com.renan.testesunitariosspring.mapper;

import com.renan.testesunitariosspring.dto.BeerDTO;
import com.renan.testesunitariosspring.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
