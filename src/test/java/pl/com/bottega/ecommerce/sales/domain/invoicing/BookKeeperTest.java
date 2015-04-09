package pl.com.bottega.ecommerce.sales.domain.invoicing;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;
import pl.com.bottega.ecommerce.sales.domain.invoicing.InvoiceRequest;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;
import pl.com.bottega.ecommerce.sharedkernel.Money;


public class BookKeeperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testState_invoiceWithOneItem_shouldBeOneItem() {
		ClientData clientData = new ClientData(Id.generate(), "Arleta");
		Invoice invoice = new Invoice(Id.generate(), clientData);
		InvoiceRequest invoiceRequest = new InvoiceRequest(clientData);
		ProductData productData = new ProductData(Id.generate(), new Money(2), "kanapka", ProductType.FOOD, new Date());
		RequestItem item = new RequestItem(productData, 0, new Money(5));

	}

}
