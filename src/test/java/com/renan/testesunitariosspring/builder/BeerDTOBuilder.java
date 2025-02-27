package com.renan.testesunitariosspring.builder;

import com.renan.testesunitariosspring.dto.BeerDTO;
import com.renan.testesunitariosspring.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(
                id,
                name,
                brand,
                max,
                quantity,
                type
        );
    }
}
