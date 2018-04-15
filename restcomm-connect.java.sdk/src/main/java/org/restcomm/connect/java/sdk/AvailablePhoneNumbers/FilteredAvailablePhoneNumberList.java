/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.restcomm.connect.java.sdk.AvailablePhoneNumbers;

import java.io.IOException;
import org.restcomm.connect.java.sdk.http.*;

import org.restcomm.connect.java.sdk.Restcomm;
import org.apache.http.ProtocolException;
import org.restcomm.connect.java.sdk.Exceptions.*;
import org.apache.http.ParseException;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import org.restcomm.connect.java.sdk.ListUtil;

import org.apache.http.ParseException;
import com.google.gson.annotations.SerializedName;
import java.net.MalformedURLException;

public class FilteredAvailablePhoneNumberList extends AvailablePhoneNumberList {
	
	private static String BASE_URL;
	private static Request request;
	
	public FilteredAvailablePhoneNumberList(final String BASE_URL)
	{
		this.BASE_URL = BASE_URL;
		request = new Request(HttpMethod.GET,BASE_URL);
	}
/*	public FilteredAvailablePhoneNumberList Page(String value) throws MalformedURLException
	{
		request.addGetParameters("Page", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList NumPages(String value) 
	{
		request.addGetParameters("NumPages", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList PageSize(String value) 
	{
		request.addGetParameters("PageSize", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList Total(String value) 
	{
		request.addGetParameters("Total", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList Start(String value) 
	{
		request.addGetParameters("Start", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList End(String value) 
	{
		request.addGetParameters("End", value);
		return this;
	}*/
	public FilteredAvailablePhoneNumberList AreaCode(String value) 
	{
		request.addGetParameters("AreaCode", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList Contains(String value) 
	{
		request.addGetParameters("Contains", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList SmsEnabled(String value) 
	{
		request.addGetParameters("SmsEnabled", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList MmsEnabled(String value) 
	{
		request.addGetParameters("MmsEnabled", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList VoiceEnabled(String value) 
	{
		request.addGetParameters("VoiceEnabled", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList ExcludeAllAddressRequired(String value) 
	{
		request.addGetParameters("ExcludeAllAddressRequired", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList ExcludeLocalAddressRequired(String value) 
	{
		request.addGetParameters("ExcludeLocalAddressRequired", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList ExcludeForeignAddressRequired(String value) 
	{
		request.addGetParameters("ExcludeForeignAddressRequired", value);
		return this;
	}
	public FilteredAvailablePhoneNumberList Beta(String value) 
	{
		request.addGetParameters("Beta", value);
		return this;
	}
	public AvailablePhoneNumberList Filter() 
	{
		Restcomm.sendRequest(request);
		Gson gson = new Gson();
		return gson.fromJson(Restcomm.getJSONResponse(),AvailablePhoneNumberList.class);
	}

    
}
