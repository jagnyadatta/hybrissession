/**
 *
 */
package com.arif.self.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import javax.annotation.Resource;

import com.arif.self.DiscountInformationData;
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
	@Resource
	private Converter<DiscountInformationModel, DiscountInformationData> arifdiscountInfoConverter;

	@Override
	public List<DiscountInformationData> getDiscounts()
	{

		final List<DiscountInformationModel> model = discountDetailsService.getDiscounts();
		// for single object  discountInfoConverter.convert(model)
		return arifdiscountInfoConverter.convertAll(model);

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
