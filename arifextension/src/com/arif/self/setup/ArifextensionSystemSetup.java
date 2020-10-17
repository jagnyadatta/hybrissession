/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.arif.self.setup;

import static com.arif.self.constants.ArifextensionConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.arif.self.constants.ArifextensionConstants;
import com.arif.self.service.ArifextensionService;


@SystemSetup(extension = ArifextensionConstants.EXTENSIONNAME)
public class ArifextensionSystemSetup
{
	private final ArifextensionService arifextensionService;

	public ArifextensionSystemSetup(final ArifextensionService arifextensionService)
	{
		this.arifextensionService = arifextensionService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		arifextensionService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ArifextensionSystemSetup.class.getResourceAsStream("/arifextension/sap-hybris-platform.png");
	}
}
