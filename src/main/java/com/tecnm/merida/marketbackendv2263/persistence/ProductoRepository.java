package com.tecnm.merida.marketbackendv2263.persistence;
import com.tecnm.merida.marketbackendv2263.persistence.crud.ProductoCrudRepository;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;

import java.util.List;


public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;


    //select*FROM
    public List<Producto> getALL(){
        //vamos a castear
        return (List<Producto>)productoCrudRepository.findAll();
    }
}
