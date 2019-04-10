package com.cts.service;

import java.util.List;
import java.util.Optional;

import com.cts.model.LabelTypeEnum;
import com.cts.model.ProductModel;



public interface DeductionService {
	List<ProductModel> getDeductionProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType);
	
}
