package com.nf2.sss.dao;

import com.nf2.sss.invoice_entity.BillingInfo;
import com.nf2.sss.invoice_entity.Customer;
import com.nf2.sss.invoice_entity.Invoice;

public interface InvoiceMapperDao {
    Invoice getInvoiceById(int id);
    Customer getCustomerById(int id);
    BillingInfo getbillingInfoById(int id);
}
