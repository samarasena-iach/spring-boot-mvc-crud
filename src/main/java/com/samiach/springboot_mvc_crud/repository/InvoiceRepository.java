package com.samiach.springboot_mvc_crud.repository;

import com.samiach.springboot_mvc_crud.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
