package com.cts.repo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.cts.model.LabelTypeEnum;
import com.cts.model.ProductModel;
import com.cts.util.ProductToProductModelConverter;
import com.cts.vo.Category;
import com.cts.vo.Product;



@Repository
public class DeductionRepoImple implements DeductionRepo {
	
	@Override
	public List<Product> getDeductionProducts(Integer categoryId) {
		RestTemplate restTemplate = new RestTemplate();
		
		String resourceUrl = "https://jl-nonprod-syst.apigee.net/v1/categories/"+categoryId+"/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
							
		ResponseEntity<Category> response
		  = restTemplate.exchange(
				    resourceUrl ,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<Category>() {});
		
		if(response.getStatusCode().is2xxSuccessful())
			System.out.println("Gotcha from api {}"+response.getBody().getProducts());
		
		
		return response.getBody().getProducts();
	}
}
