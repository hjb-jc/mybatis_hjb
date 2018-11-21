package com.nf2.sss.dao;

import com.nf2.sss.invoice_entity.Customer;
import com.nf2.sss.invoice_entity.Invoice;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class InvoiceMapperDaoTest {
    static SqlSessionFactory factory;
    static SqlSession session;

    @Test
    public void getInvoiceById() {
        InvoiceMapperDao mapper = session.getMapper(InvoiceMapperDao.class);
        Invoice invoiceById = mapper.getInvoiceById(1);
        Invoice invoiceById1 = mapper.getInvoiceById(2);
        System.out.println(invoiceById);
        System.out.println(invoiceById1);
        //System.out.println(mapper.getbillingInfoById(1));
    }

    @Test
    public void getCustomerById() {
        InvoiceMapperDao mapper = session.getMapper(InvoiceMapperDao.class);
        Customer customerById = mapper.getCustomerById(1);
        System.out.println(customerById);
    }

    @BeforeClass
    public static void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatisThree-config.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        //隔离级别
        session = factory.openSession(TransactionIsolationLevel.READ_COMMITTED);
    }

    @AfterClass
    public static void destroy(){
        session.close();
    }
}