package com.markersharks.suppliersearch.controller;
import com.markersharks.suppliersearch.model.Supplier;
import com.markersharks.suppliersearch.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public List<Supplier> querySuppliers(
            @RequestParam String location,
            @RequestParam Supplier.NatureOfBusiness natureOfBusiness,
            @RequestParam Supplier.ManufacturingProcess manufacturingProcess,
            @RequestParam(defaultValue = "10") int limit
    ) {
        return supplierService.findSuppliers(location, natureOfBusiness, manufacturingProcess, limit);
    }
}
