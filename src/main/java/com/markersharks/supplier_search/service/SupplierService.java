package com.markersharks.suppliersearch.service;

import com.markersharks.suppliersearch.model.Supplier;
import com.markersharks.suppliersearch.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findSuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness,
                                        Supplier.ManufacturingProcess manufacturingProcess, int limit) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcess);
    }
}
