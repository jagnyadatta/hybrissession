/**
 *
 */
package com.arif.self.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arif.self.DiscountInformationData;
import com.arif.self.facade.DiscountDetailsFacade;


/**
 * @author jagnya
 *
 */
@RestController
@RequestMapping("/discount")
public class DiscountDetailsController
{

	private DiscountDetailsFacade discountDetailsFacade;

	public List<DiscountInformationData> getDiscounts()
	{

		return discountDetailsFacade.getDiscounts();
	}
}
