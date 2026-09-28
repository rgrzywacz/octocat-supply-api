package pl.grzywacz.octocat_supply_api.product.domain;

import java.math.BigDecimal;

public record Product(Long id, String name, BigDecimal price) {

}
