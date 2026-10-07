package com.tecnm.merida.marketbackendv2263.persistence.mapper;


import com.tecnm.merida.marketbackendv2263.domain.Category;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Categoria;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Category toCategory(Category category);
}
