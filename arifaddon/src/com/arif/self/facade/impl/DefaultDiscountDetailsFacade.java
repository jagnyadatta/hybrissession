/**
 *
 */
package com.arif.self.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import com.arif.self.facade.DiscountDetailsFacade;
import com.arif.self.model.DiscountInformationModel;
import com.arif.self.service.DiscountDetailsService;


/**
 * @author jagnya
 *
 */
public class DefaultDiscountDetailsFacade implements DiscountDetailsFacade
{
	@Resource
	private DiscountDetailsService discountDetailsService;

	@Override
	public List<DiscountInformationModel> getDiscounts()
	{

		return discountDetailsService.getDiscounts();
	}

	/**
	 * @return the discountDetailsService
	 */
	public DiscountDetailsService getDiscountDetailsService()
	{
		return discountDetailsService;
	}

	/**
	 * @param discountDetailsService
	 *           the discountDetailsService to set
	 */

	public void setDiscountDetailsService(final DiscountDetailsService discountDetailsService)
	{
		this.discountDetailsService = discountDetailsService;
	}

}
