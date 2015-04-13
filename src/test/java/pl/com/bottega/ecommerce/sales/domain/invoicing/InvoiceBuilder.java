package pl.com.bottega.ecommerce.sales.domain.invoicing;

import GeneralUseBuilders.ClientDataBuilder;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sales.domain.invoicing.Invoice;

public class InvoiceBuilder {
	private Id id;
	private ClientData client;

	public InvoiceBuilder() {
		id = Id.generate();
		client = new ClientDataBuilder().build();
	}

	public InvoiceBuilder withId(Id id) {
		this.id = id;
		return this;
	}
	
	public InvoiceBuilder withClient(ClientData client) {
		this.client = client;
		return this;
	}

	public Invoice build() {
		return new Invoice(id, client);
	}
}
