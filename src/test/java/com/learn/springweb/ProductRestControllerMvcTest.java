//package com.learn.springweb;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.learn.springweb.entities.Product;
//import com.learn.springweb.entities.repos.ProductRepositry;
//
//class ProductRestControllerMvcTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private ProductRepositry repositry;
//
//	@Test
//	void testFindAll() throws Exception {
//
//		Product product = new Product();
//		product.setId(1);
//		product.setDescription("Its awesome");
//		product.setName("Macbook");
//		product.setPrice(1000);
//		List<Product> products = Arrays.asList(product);
//		when(repositry.findAll()).thenReturn(products);
//
//		mockMvc.perform(get("/productapi/products").contextPath("/productapi")).andExpect(status().isOk());
//
//	}
//
//}
