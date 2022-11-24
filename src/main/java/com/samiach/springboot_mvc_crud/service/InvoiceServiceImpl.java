package com.samiach.springboot_mvc_crud.service;

import com.samiach.springboot_mvc_crud.exceptions.InvoiceNotFoundException;
import com.samiach.springboot_mvc_crud.model.Invoice;
import com.samiach.springboot_mvc_crud.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = invoiceRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with Id : " + id + " Not Found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        invoiceRepository.delete(getInvoiceById(id));
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
}
