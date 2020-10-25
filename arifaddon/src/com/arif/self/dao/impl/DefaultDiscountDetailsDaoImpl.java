/**
 *
 */
package com.arif.self.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import com.arif.self.dao.DiscountDetailsDao;
import com.arif.self.model.DiscountInformationModel;


/**
 * @author jagnya
 *
 */
public class DefaultDiscountDetailsDaoImpl extends DefaultGenericDao<DiscountInformationModel> implements DiscountDetailsDao
{
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	/**
	 * @param typecode
	 */
	public DefaultDiscountDetailsDaoImpl(final String typecode)
	{
		super(DiscountInformationModel._TYPECODE);
		// XXX Auto-generated constructor stub
	}



	@Override
	public List<DiscountInformationModel> getDiscounts()
	{

		return super.find();
	}

}
