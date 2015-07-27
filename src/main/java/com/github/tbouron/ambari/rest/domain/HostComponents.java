package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tbouron on 27/07/15.
 */
public class HostComponents {

    @SerializedName("href")
    private String href;

    @SerializedName("items")
    private List<HostComponent> components;

    public String getHref() {
        return href;
    }

    public List<HostComponent> getComponents() {
        return components;
    }
}
