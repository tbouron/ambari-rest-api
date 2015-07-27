package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tbouron on 27/07/15.
 */
public class ClusterConfiguration {

    @SerializedName("Clusters")
    private DesiredConfiguration cluster;

    public DesiredConfiguration getCluster() {
        return cluster;
    }

    public void setCluster(DesiredConfiguration cluster) {
        this.cluster = cluster;
    }

    public class DesiredConfiguration {

        @SerializedName("desired_config")
        private Configuration configuration;

        public Configuration getConfiguration() {
            return configuration;
        }

        public void setConfiguration(Configuration configuration) {
            this.configuration = configuration;
        }
    }
}
