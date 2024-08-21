package com.markersharks.suppliersearch.repository;

import com.markersharks.suppliersearch.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location,
            Supplier.NatureOfBusiness natureOfBusiness,
            Supplier.ManufacturingProcess manufacturingProcess
    );
}
