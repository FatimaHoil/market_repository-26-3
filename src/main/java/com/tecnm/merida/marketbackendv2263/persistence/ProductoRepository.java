package com.tecnm.merida.marketbackendv2263.persistence;
import com.tecnm.merida.marketbackendv2263.persistence.crud.ProductoCrudRepository;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;


public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;


    //select*FROM
    public List<Producto> getALL(){
        //vamos a castear
        return (List<Producto>)productoCrudRepository.findAll();
    }

    public List<Producto>getByCategory(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanLessThenAndEstado(cantidad, estado:true);
    }

    public Optional<Producto> getProduct(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

        public void delete(int idProducto){
            productoCrudRepository.deleteById(idProducto);

    }
}
