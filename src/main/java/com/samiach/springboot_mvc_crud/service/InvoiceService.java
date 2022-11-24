package com.samiach.springboot_mvc_crud.service;

import com.samiach.springboot_mvc_crud.model.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice saveInvice(Invoice invoice);

    public List<Invoice> getAllInvoices();

    public Invoice getInvoiceById(Long id);

    public void deleteInvoiceById(Long id);

    public void updateInvoice(Invoice invoice);

}
