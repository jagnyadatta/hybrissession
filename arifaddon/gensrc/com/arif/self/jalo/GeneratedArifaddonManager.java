/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Nov-2020, 3:13:29 PM                     ---
 * ----------------------------------------------------------------
 */
package com.arif.self.jalo;

import com.arif.self.DiscountInformationCronJob;
import com.arif.self.constants.ArifaddonConstants;
import com.arif.self.jalo.DiscountInformation;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ArifaddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedArifaddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public DiscountInformation createDiscountInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ArifaddonConstants.TC.DISCOUNTINFORMATION );
			return (DiscountInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DiscountInformation : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountInformation createDiscountInformation(final Map attributeValues)
	{
		return createDiscountInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountInformationCronJob createDiscountInformationCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ArifaddonConstants.TC.DISCOUNTINFORMATIONCRONJOB );
			return (DiscountInformationCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DiscountInformationCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountInformationCronJob createDiscountInformationCronJob(final Map attributeValues)
	{
		return createDiscountInformationCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ArifaddonConstants.EXTENSIONNAME;
	}
	
}
