package br.com.dio.storefront.mapper;

import br.com.dio.storefront.controller.request.ProductSaveRequest;
import br.com.dio.storefront.controller.response.ProductAvailableResponse;
import br.com.dio.storefront.controller.response.ProductDetailResponse;
import br.com.dio.storefront.controller.response.ProductSavedResponse;
import br.com.dio.storefront.dto.ProductInfoDTO;
import br.com.dio.storefront.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-29T17:59:36-0300",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class IProductMapperImpl implements IProductMapper {

    @Override
    public ProductInfoDTO toDTO(ProductEntity entity, BigDecimal price) {
        if ( entity == null && price == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        if ( entity != null ) {
            id = entity.getId();
            name = entity.getName();
        }
        BigDecimal price1 = null;
        price1 = price;

        ProductInfoDTO productInfoDTO = new ProductInfoDTO( id, name, price1 );

        return productInfoDTO;
    }

    @Override
    public ProductEntity toEntity(ProductSaveRequest request) {
        if ( request == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( request.id() );
        productEntity.setName( request.name() );

        productEntity.setActive( false );

        return productEntity;
    }

    @Override
    public ProductSavedResponse toResponse(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        Boolean active = null;

        id = entity.getId();
        name = entity.getName();
        active = entity.getActive();

        ProductSavedResponse productSavedResponse = new ProductSavedResponse( id, name, active );

        return productSavedResponse;
    }

    @Override
    public List<ProductAvailableResponse> toResponse(List<ProductEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProductAvailableResponse> list = new ArrayList<ProductAvailableResponse>( entities.size() );
        for ( ProductEntity productEntity : entities ) {
            list.add( productEntityToProductAvailableResponse( productEntity ) );
        }

        return list;
    }

    @Override
    public ProductDetailResponse toResponse(ProductInfoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UUID id = null;
        String name = null;
        BigDecimal price = null;

        id = dto.id();
        name = dto.name();
        price = dto.price();

        ProductDetailResponse productDetailResponse = new ProductDetailResponse( id, name, price );

        return productDetailResponse;
    }

    protected ProductAvailableResponse productEntityToProductAvailableResponse(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = productEntity.getId();
        name = productEntity.getName();

        ProductAvailableResponse productAvailableResponse = new ProductAvailableResponse( id, name );

        return productAvailableResponse;
    }
}
