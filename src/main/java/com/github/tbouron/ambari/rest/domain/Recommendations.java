package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public class Recommendations {

    @SerializedName("href")
    private String href;

    @SerializedName("resources")
    private List<Recommendation> recommendations;

    public String getHref() {
        return href;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }
}
