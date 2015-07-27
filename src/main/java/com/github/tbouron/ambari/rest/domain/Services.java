package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tbouron on 27/07/15.
 */
public class Services {

    @SerializedName("href")
    private String href;

    @SerializedName("items")
    private List<Service> services;

    public String getHref() {
        return href;
    }

    public List<Service> getServices() {
        return services;
    }
}
