package com.example.springbootproductseller.service;

import com.example.springbootproductseller.model.Purchase;
import com.example.springbootproductseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}