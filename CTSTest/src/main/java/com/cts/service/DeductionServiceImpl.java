package com.cts.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.LabelTypeEnum;
import com.cts.model.ProductModel;
import com.cts.repo.DeductionRepo;
import com.cts.util.ProductToProductModelConverter;




@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private DeductionRepo deductRepo;

	

	@Override
	public List<ProductModel> getDeductionProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType) {
		// converter
		ProductToProductModelConverter productConverter = new ProductToProductModelConverter();
		
	
		List<ProductModel> productModels = deductRepo.getDeductionProducts(categoryId).stream().map(product ->
								{ return productConverter.convert(product, priceLabelType);}
						).collect(Collectors.toList());
		
		return productModels;
	}
}
