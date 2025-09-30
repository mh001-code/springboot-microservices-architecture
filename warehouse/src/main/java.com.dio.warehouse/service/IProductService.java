package br.com.dio.warehouse.service;

import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.entity.StockEntity;
import br.com.dio.warehouse.entity.StockStatus;

import java.util.UUID;

public interface IProductService {

    ProductEntity save(final ProductEntity entity);

    void purchase(final UUID id);
}
