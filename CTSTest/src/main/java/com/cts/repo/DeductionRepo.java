package com.cts.repo;

import java.util.List;

import com.cts.vo.Product;


public interface DeductionRepo {
	List<Product> getDeductionProducts(Integer categoryId);
}
