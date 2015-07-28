package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Created by tbouron on 27/07/15.
 */
public class Configuration {

    @SerializedName("type")
    private String type;

    @SerializedName("tag")
    private String tag;

    @SerializedName("properties")
    private Map<String, String> properties;

    public String getType() {
        return type;
    }

    public Configuration withType(String type) {
        this.type = type;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public Configuration withTag(String tag) {
        this.tag = tag;
        return this;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public Configuration withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
}
