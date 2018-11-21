package com.nf2.sss.invoice_entity;

import java.util.Date;

/*发票*/
public class Invoice {
    private int invoiceId;
    private Date invoiceDate;
    private long total;

    private Customer customer;
    private BillingInfo billingInfo;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", invoiceDate=" + invoiceDate +
                ", total=" + total +
                ", customer=" + customer +
                ", billingInfo=" + billingInfo +
                '}';
    }
}
