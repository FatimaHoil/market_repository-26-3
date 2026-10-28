package com.tecnm.merida.marketbackendv2263.persistence;


import com.tecnm.merida.marketbackendv2263.domain.Purchase;
import com.tecnm.merida.marketbackendv2263.domain.repository.PurchaseRepository;
import com.tecnm.merida.marketbackendv2263.persistence.crud.CompraCrudRepository;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Compra;
import com.tecnm.merida.marketbackendv2263.persistence.mapper.PurchaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private PurchaseMapper mapper;

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases(
                (List<Compra>) compraCrudRepository.findAll()
        );
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clienteId) {
        return compraCrudRepository.findByIdCliente(clienteId)
                .map(mapper::toPurchases);
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);

        compra.getProductos().forEach(
                product -> product.setCompra(compra)
        );

        return mapper.toPurchase(
                compraCrudRepository.save(compra)
        );
    }
}