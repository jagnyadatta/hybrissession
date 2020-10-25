/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.arif.self.product.service;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.impl.DefaultProductService;


/**
 *
 */
public class ArifProductServiceImpl extends DefaultProductService implements ArifProductService
{

	@Override
	public ProductModel getProductForCode(final String code)
	{

		System.out.println("Custom Hybris Code ");
		return super.getProductForCode(code);
	}

}
