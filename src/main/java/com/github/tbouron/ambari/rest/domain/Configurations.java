package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tbouron on 27/07/15.
 */
public class Configurations {

    @SerializedName("href")
    private String href;

    @SerializedName("items")
    private List<Configuration> configurations;

    public String getHref() {
        return href;
    }

    public List<Configuration> getConfigurations() {
        return configurations;
    }
}
