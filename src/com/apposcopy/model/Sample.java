/*
 * Copyright (C) 2017 The Apposcopy and Astroid Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.apposcopy.model;

import java.util.ArrayList;
import java.util.List;

import chord.util.tuple.object.Pair;
import chord.util.tuple.object.Quad;

public class Sample {

	protected String family;

	protected String id;

	/* Activity components */
	protected List<String> activities;

	/* Service components */
	protected List<String> services;

	/* Receiver components */
	protected List<String> receivers;

	protected List<Pair<String, String>> iccg;

	protected List<Pair<String, String>> intentFilters;

	protected List<Pair<String, String>> dangerAPIs;

	protected List<String> permissions;

	protected List<Quad<String, String, String, String>> taintFlows;

    protected List<Pair<String, String>> flows;

    public Sample(){
		
		activities = new ArrayList<>();
		services = new ArrayList<>();
		receivers = new ArrayList<>();
		iccg = new ArrayList<>();
		intentFilters = new ArrayList<>();
		dangerAPIs = new ArrayList<>();
		taintFlows = new ArrayList<>();
		
	}
	
	//only for signature. denote the sources of samples
	protected List<String> samples = new ArrayList<>();

	public List<String> getSamples() {
		return samples;
	}

	public void setSamples(List<String> samples) {
		this.samples = samples;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}

	public List<String> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<String> receivers) {
		this.receivers = receivers;
	}

	public List<Pair<String, String>> getIccg() {
		return iccg;
	}

	public void setIccg(List<Pair<String, String>> iccg) {
		this.iccg = iccg;
	}

	public List<Pair<String, String>> getIntentFilters() {
		return intentFilters;
	}

	public void setIntentFilters(List<Pair<String, String>> intentFilters) {
		this.intentFilters = intentFilters;
	}

	public List<Pair<String, String>> getDangerAPIs() {
		return dangerAPIs;
	}

	public void setDangerAPIs(List<Pair<String, String>> dangerAPIs) {
		this.dangerAPIs = dangerAPIs;
	}

	public List<String> getPermissions() { return permissions; }

	public void setPermissions(List<String> perms) { this.permissions = perms; }

	public List<Quad<String, String, String, String>> getTaintFlows() {
		return taintFlows;
	}

	public void setTaintFlows(List<Quad<String, String, String, String>> taintFlows) {
		this.taintFlows = taintFlows;
	}

    public List<Pair<String, String>> getFlows() {
        return flows;
    }

    public void setFlows(List<Pair<String, String>> taintFlows) {
        this.flows = taintFlows;
    }
	
	public String toString() {
		return "flows: " + taintFlows;
	}

}