package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tbouron on 27/07/15.
 */
public class HostComponent {

    @SerializedName("href")
    private String href;

    @SerializedName("HostRoles")
    private HostRoles hostRoles;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostRoles getHostRoles() {
        return hostRoles;
    }

    public void setHostRoles(HostRoles hostRoles) {
        this.hostRoles = hostRoles;
    }

    public class HostRoles {

        @SerializedName("cluster_name")
        private String cluster;

        @SerializedName("host_name")
        private String host;

        @SerializedName("component_name")
        private String component;

        @SerializedName("state")
        private String state;

        public String getCluster() {
            return cluster;
        }

        public void setCluster(String cluster) {
            this.cluster = cluster;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getComponent() {
            return component;
        }

        public void setComponent(String component) {
            this.component = component;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
