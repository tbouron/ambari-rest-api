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

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
