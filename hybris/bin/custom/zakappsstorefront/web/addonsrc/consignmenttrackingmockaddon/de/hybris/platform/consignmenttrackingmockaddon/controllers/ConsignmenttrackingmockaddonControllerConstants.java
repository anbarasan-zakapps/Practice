/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.consignmenttrackingmockaddon.controllers;

public interface ConsignmenttrackingmockaddonControllerConstants
{
	String ADDON_PREFIX = "addon:/consignmenttrackingmockaddon";

	interface Pages
	{
		String ConsignmentMockPage = ADDON_PREFIX + "/pages/consignment/mockTrackingPage";

		String MockCarrierPage = ADDON_PREFIX + "/pages/carrier/mockCarrierPage";
	}
}
