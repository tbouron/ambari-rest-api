package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public class Recommendation {

    @SerializedName("href")
    private String href;

    @SerializedName("hosts")
    private List<String> hosts;

    @SerializedName("services")
    private List<String> services;

    @SerializedName("recommendations")
    private Recommendations recommendations;

    @SerializedName("blueprint_cluster_binding")
    private Bindings bindings;

    @SerializedName("recommend")
    private String recommend;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public Recommendations getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Recommendations recommendations) {
        this.recommendations = recommendations;
    }

    public Bindings getBindings() {
        return bindings;
    }

    public void setBindings(Bindings bindings) {
        this.bindings = bindings;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public class Recommendations {

        @SerializedName("blueprint")
        private Blueprint blueprint;

        public Blueprint getBlueprint() {
            return blueprint;
        }

        public void setBlueprint(Blueprint blueprint) {
            this.blueprint = blueprint;
        }
    }

    public class Bindings {

        @SerializedName("host_groups")
        private List<Blueprint.HostGroup> hostGroups;

        public List<Blueprint.HostGroup> getHostGroups() {
            return hostGroups;
        }

        public void setHostGroups(List<Blueprint.HostGroup> hostGroups) {
            this.hostGroups = hostGroups;
        }
    }
}
