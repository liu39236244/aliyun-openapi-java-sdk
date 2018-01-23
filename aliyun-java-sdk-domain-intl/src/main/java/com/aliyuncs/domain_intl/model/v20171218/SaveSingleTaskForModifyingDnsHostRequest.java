/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForModifyingDnsHostRequest extends RpcAcsRequest<SaveSingleTaskForModifyingDnsHostResponse> {
	
	public SaveSingleTaskForModifyingDnsHostRequest() {
		super("Domain-intl", "2017-12-18", "SaveSingleTaskForModifyingDnsHost", "domain");
	}

	private String instanceId;

	private List<String> ips;

	private String dnsName;

	private String lang;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getIps() {
		return this.ips;
	}

	public void setIps(List<String> ips) {
		this.ips = ips;	
		if (ips != null) {
			for (int i = 0; i < ips.size(); i++) {
				putQueryParameter("Ip." + (i + 1) , ips.get(i));
			}
		}	
	}

	public String getDnsName() {
		return this.dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
		if(dnsName != null){
			putQueryParameter("DnsName", dnsName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<SaveSingleTaskForModifyingDnsHostResponse> getResponseClass() {
		return SaveSingleTaskForModifyingDnsHostResponse.class;
	}

}