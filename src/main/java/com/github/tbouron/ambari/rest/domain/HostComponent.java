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

    public HostComponent withHostRoles(HostRoles hostRoles) {
        this.hostRoles = hostRoles;
        return this;
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

        public HostRoles withCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        public String getHost() {
            return host;
        }

        public HostRoles withHost(String host) {
            this.host = host;
            return this;
        }

        public String getComponent() {
            return component;
        }

        public HostRoles withComponent(String component) {
            this.component = component;
            return this;
        }

        public String getState() {
            return state;
        }

        public HostRoles withState(String state) {
            this.state = state;
            return this;
        }
    }
}
