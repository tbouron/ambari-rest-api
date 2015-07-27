package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tbouron on 27/07/15.
 */
public class ServiceComponents {

    @SerializedName("href")
    private String href;

    @SerializedName("ServiceInfo")
    private Service.ServiceInfo service;

    @SerializedName("components")
    private List<ServiceComponent> components;

    public String getHref() {
        return href;
    }

    public Service.ServiceInfo getService() {
        return service;
    }

    public List<ServiceComponent> getComponents() {
        return components;
    }
}
