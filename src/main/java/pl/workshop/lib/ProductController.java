package pl.workshop.lib;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;

@Named
@SessionScoped
public class ProductController implements Serializable {

	private static final long serialVersionUID = -5753334735020095311L;

	private Product product;
	private List<Product> productList;

	@PostConstruct
	public void init() {
		productList = new ArrayList<>();
		productList.add(new Product(1, "AA", "Pendrive 16GB", new BigDecimal("32.40"), new Date()));
		productList.add(new Product(2, "BB", "S�uchawki", new BigDecimal("55.47"), new Date()));
		productList.add(new Product(3, "CC", "Pendrive 32GB", new BigDecimal("87.20"), new Date()));
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
