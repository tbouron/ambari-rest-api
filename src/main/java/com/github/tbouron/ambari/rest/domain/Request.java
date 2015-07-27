package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tbouron on 27/07/15.
 */
public class Request {

    @SerializedName("href")
    private String href;

    @SerializedName("Requests")
    private RequestInfo requestInfo;

    public String getHref() {
        return href;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public class RequestInfo {

        @SerializedName("cluster_name")
        private String cluster;

        @SerializedName("request_context")
        private String context;

        @SerializedName("request_status")
        private String status;

        @SerializedName("id")
        private int id;

        public String getCluster() {
            return cluster;
        }

        public String getContext() {
            return context;
        }

        public String getStatus() {
            return status;
        }

        public int getId() {
            return id;
        }
    }
}
