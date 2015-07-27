package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tbouron on 27/07/15.
 */
public class Requests {

    @SerializedName("href")
    private String href;

    @SerializedName("items")
    private List<Request> requests;

    public String getHref() {
        return href;
    }

    public List<Request> getRequests() {
        return requests;
    }
}
