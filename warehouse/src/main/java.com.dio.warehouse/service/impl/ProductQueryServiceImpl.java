package br.com.dio.warehouse.service.impl;

import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.mapper.IProductMapper;
import br.com.dio.warehouse.repository.ProductRepository;
import br.com.dio.warehouse.service.IProductQueryService;
import br.com.dio.warehouse.service.IStockService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.UUID;

@AllArgsConstructor
@Service
public class ProductQueryServiceImpl implements IProductQueryService {

    private final ProductRepository repository;
    private final IStockService stockService;
    private final RestClient storefrontClient;
    private final IProductMapper mapper;

    @Override
    public ProductEntity findById(UUID id) {
        return repository.findById(id).orElseThrow();
    }

    }
