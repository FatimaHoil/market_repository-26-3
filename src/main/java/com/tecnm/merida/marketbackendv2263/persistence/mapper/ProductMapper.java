package com.tecnm.merida.marketbackendv2263.persistence.mapper;


import com.tecnm.merida.marketbackendv2263.domain.Product;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productoId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category")
    })
    Product toProduct (Product product);
    List<Product> toProducts (List<Product> products);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto (Producto producto);
}
