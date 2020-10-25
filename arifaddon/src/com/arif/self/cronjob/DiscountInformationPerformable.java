/**
 *
 */
package com.arif.self.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import com.arif.self.model.DiscountInformationCronJobModel;


/**
 * @author jagnya
 *
 */
public class DiscountInformationPerformable extends AbstractJobPerformable<DiscountInformationCronJobModel>
{


	@Override
	public PerformResult perform(final DiscountInformationCronJobModel arg0)
	{

		System.out.println("***************************************");
		System.out.println("***************************************");
		System.out.println("               Hello World   First Cron job            ");
		System.out.println("***************************************");
		System.out.println("***************************************");
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

}
