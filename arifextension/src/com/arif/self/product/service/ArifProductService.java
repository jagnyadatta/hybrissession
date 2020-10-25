/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.arif.self.product.service;

import de.hybris.platform.core.model.product.ProductModel;


/**
 *
 */
public interface ArifProductService
{
	ProductModel getProductForCode(final String code);


}
