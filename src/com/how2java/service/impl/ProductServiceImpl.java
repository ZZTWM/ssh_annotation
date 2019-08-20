package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import com.how2java.util.UtilTools;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO productDAO;
	UtilTools utilTools;
	
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	public UtilTools getUtilTools() {
		return utilTools;
	}
	public void setUtilTools(UtilTools utilTools) {
		this.utilTools = utilTools;
	}
	
	/**
	 * 
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public List<Product> list() {
		List<Product> products = productDAO.list();
		if(products.isEmpty()){
			for (int i = 0; i <= 100; i++) {
				Product p = new Product();
				p.setName("iphone" + utilTools.getRandomName());
				p.setPrice(utilTools.getRandomPrice());
				productDAO.add(p);
				products.add(p);
			}
		}
		return products;
	}
	
}
