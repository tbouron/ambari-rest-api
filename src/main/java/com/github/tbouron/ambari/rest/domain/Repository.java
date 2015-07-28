package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public class Repository {

    @SerializedName("base_url")
    private String baseUrl;

    @SerializedName("verify_base_url")
    private boolean verifyBaseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public Repository withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public boolean isVerifyBaseUrl() {
        return verifyBaseUrl;
    }

    public Repository withVerifyBaseUrl(boolean verifyBaseUrl) {
        this.verifyBaseUrl = verifyBaseUrl;
        return this;
    }
}
