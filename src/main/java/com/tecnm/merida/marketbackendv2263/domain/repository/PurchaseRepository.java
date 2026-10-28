package com.tecnm.merida.marketbackendv2263.domain.repository;

import com.tecnm.merida.marketbackendv2263.domain.Purchase;
import com.tecnm.merida.marketbackendv2263.persistence.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
        Optional<List<Purchase>> getByClient(String clientId);
        Purchase save(Purchase purchase);
}
