package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public class Blueprints {

    @SerializedName("href")
    private String href;

    @SerializedName("items")
    private List<Blueprint> blueprints;

    public String getHref() {
        return href;
    }

    public List<Blueprint> getBlueprints() {
        return blueprints;
    }
}
