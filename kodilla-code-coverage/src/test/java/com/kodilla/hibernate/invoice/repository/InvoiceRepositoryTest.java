package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTest {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Item item = new Item(new BigDecimal("90.1234"), new BigDecimal("23.1245"), 3);
        Item item2 = new Item(new BigDecimal("153.1111"), new BigDecimal("222.1"), 7);
        Item item3 = new Item(new BigDecimal("333.55"), new BigDecimal("111.19"), 4);

        Product product = new Product("Table");
        Product product2 = new Product("Radio");

        product.getItems().add(item);
        product.getItems().add(item2);
        product.getItems().add(item3);
        product2.getItems().add(item2);

        Invoice invoice = new Invoice("FVAT/06/2020");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceRepository.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceRepository.deleteById(id);
    }
}
