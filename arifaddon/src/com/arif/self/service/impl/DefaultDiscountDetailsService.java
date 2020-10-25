/**
 *
 */
package com.arif.self.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.arif.self.dao.DiscountDetailsDao;
import com.arif.self.model.DiscountInformationModel;
import com.arif.self.service.DiscountDetailsService;


/**
 * @author jagnya
 *
 */
public class DefaultDiscountDetailsService implements DiscountDetailsService
{
	@Resource
	private DiscountDetailsDao discountDetailsDao;

	@Override
	public List<DiscountInformationModel> getDiscounts()
	{
		return discountDetailsDao.getDiscounts();
	}
}
