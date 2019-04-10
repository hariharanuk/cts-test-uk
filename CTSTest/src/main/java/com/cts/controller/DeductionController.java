package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.LabelTypeEnum;
import com.cts.model.ProductModel;
import com.cts.service.DeductionService;


@RestController
@RequestMapping(value = "/deduction")
public class DeductionController {
	
	@Autowired
	private DeductionService deductionService;
	

	 @GetMapping(value = "/catId/{categoryId}")
		public List<ProductModel> getDiscountedProductsByCAtegoryId(@PathVariable(required = true) Integer categoryId, @RequestParam(required = false) LabelTypeEnum priceLabelType){
			
			Optional<LabelTypeEnum> labelType = Optional.ofNullable(priceLabelType);
			
			return deductionService.getDeductionProducts(categoryId, labelType);
		}
	

}
