/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Nov-2020, 3:13:29 PM                     ---
 * ----------------------------------------------------------------
 */
package com.arif.self;

import com.arif.self.constants.ArifaddonConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.arif.self.DiscountInformationCronJob DiscountInformationCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDiscountInformationCronJob extends CronJob
{
	/** Qualifier of the <code>DiscountInformationCronJob.required</code> attribute **/
	public static final String REQUIRED = "required";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REQUIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountInformationCronJob.required</code> attribute.
	 * @return the required
	 */
	public Boolean isRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountInformationCronJob.required</code> attribute.
	 * @return the required
	 */
	public Boolean isRequired()
	{
		return isRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @return the required
	 */
	public boolean isRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @return the required
	 */
	public boolean isRequiredAsPrimitive()
	{
		return isRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @param value the required
	 */
	public void setRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @param value the required
	 */
	public void setRequired(final Boolean value)
	{
		setRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @param value the required
	 */
	public void setRequired(final SessionContext ctx, final boolean value)
	{
		setRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountInformationCronJob.required</code> attribute. 
	 * @param value the required
	 */
	public void setRequired(final boolean value)
	{
		setRequired( getSession().getSessionContext(), value );
	}
	
}
