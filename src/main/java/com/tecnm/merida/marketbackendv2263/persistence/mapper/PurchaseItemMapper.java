package com.tecnm.merida.marketbackendv2263.persistence.mapper;

import com.tecnm.merida.marketbackendv2263.domain.PurchaseItem;
import com.tecnm.merida.marketbackendv2263.persistence.entity.CompraProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper (componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {


    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active"),
    })
    PurchaseItem toPurchaseItem(CompraProducto compra);
    @Mappings({
            @Mapping(target = "id.idCompra", ignore = true),
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true)
    })
    CompraProducto toCompraProducto(PurchaseItem item);

}
