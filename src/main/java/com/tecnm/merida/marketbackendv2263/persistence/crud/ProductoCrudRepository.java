package com.tecnm.merida.marketbackendv2263.persistence.crud;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//Metodos abstractos que despues se implementaran
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


    /*SQL Query
    SELECT *
    FROM Productos
    WHERE id_categoria = 10?
    ORDER BY nombre ASC
     */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Cantidad stock
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
