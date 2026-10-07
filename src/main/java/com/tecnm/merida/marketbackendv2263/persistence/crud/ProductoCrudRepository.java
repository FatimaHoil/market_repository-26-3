package com.tecnm.merida.marketbackendv2263.persistence.crud;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Producto;
import org.hibernate.internal.util.Optional;
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
    Optional<List<Producto>> findByCantidadStockLessThanLessThenAndEstado(int cantidadStock, boolean estado);
}
