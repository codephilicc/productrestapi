package com.learn.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.learn.springweb.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	public String baseURL;

	private RestTemplate restTemplate;

	@Test
	void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL + "1", Product.class);
		assertNotNull(product);
		assertEquals("Samsung Galaxy", product.getName());
	}

	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Samsung Mobile");
		product.setPrice(2000);
		Product newProduct = restTemplate.postForObject(baseURL, product,
				Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Samsung Mobile", newProduct.getName());

	}

//	void testUpdateProduct() {
//
//		RestTemplate restTemplate = new RestTemplate();
//		Product product = restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
//		product.setPrice(1400);
//		restTemplate.put("http://localhost:8080/productapi/products/1", product);
//	}

}
