/**
 *
 */
package com.arif.self.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arif.self.facade.DiscountDetailsFacade;
import com.arif.self.model.DiscountInformationModel;


/**
 * @author jagnya
 *
 */
@RestController
@RequestMapping("/discount")
public class DiscountDetailsController
{

	private DiscountDetailsFacade discountDetailsFacade;

	public List<DiscountInformationModel> getDiscounts()
	{

		return discountDetailsFacade.getDiscounts();
	}
}
