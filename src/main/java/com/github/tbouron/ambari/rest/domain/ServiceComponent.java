package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tbouron on 27/07/15.
 */
public class ServiceComponent {

    @SerializedName("href")
    private String href;

    @SerializedName("ServiceComponentInfo")
    private ServiceComponentInfo componentInfo;

    public String getHref() {
        return href;
    }

    public ServiceComponentInfo getComponentInfo() {
        return componentInfo;
    }

    public class ServiceComponentInfo {

        @SerializedName("cluster_name")
        private String cluster;

        @SerializedName("service_name")
        private String service;

        @SerializedName("component_name")
        private String component;

        public String getCluster() {
            return cluster;
        }

        public String getService() {
            return service;
        }

        public String getComponent() {
            return component;
        }
    }
}
