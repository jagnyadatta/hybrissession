/**
 *
 */
package com.arif.self.dao;

import java.util.List;

import com.arif.self.model.DiscountInformationModel;


/**
 * @author jagnya
 *
 */
public interface DiscountDetailsDao
{
	public List<DiscountInformationModel> getDiscounts();
}
