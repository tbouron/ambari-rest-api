package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tbouron on 27/07/15.
 */
public class Service {

    @SerializedName("href")
    private String href;

    @SerializedName("ServiceInfo")
    private ServiceInfo serviceInfo;

    public String getHref() {
        return href;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public class ServiceInfo {

        @SerializedName("cluster_name")
        private String cluster;

        @SerializedName("service_name")
        private String service;

        public String getCluster() {
            return cluster;
        }

        public String getService() {
            return service;
        }
    }
}
