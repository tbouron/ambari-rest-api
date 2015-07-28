package com.github.tbouron.ambari.rest.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public class Blueprint {

    @SerializedName("href")
    private String href;

    @SerializedName("configurations")
    private List<Configuration> configurations;

    @SerializedName("host_groups")
    private List<HostGroup> hostGroups;

    @SerializedName("Blueprints")
    private BlueprintInfo blueprintInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<Configuration> getConfigurations() {
        return configurations;
    }

    public Blueprint withConfigurations(List<Configuration> configurations) {
        this.configurations = configurations;
        return this;
    }

    public List<HostGroup> getHostGroups() {
        return hostGroups;
    }

    public Blueprint withHostGroups(List<HostGroup> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }

    public BlueprintInfo getBlueprintInfo() {
        return blueprintInfo;
    }

    public Blueprint withBlueprintInfo(BlueprintInfo blueprintInfo) {
        this.blueprintInfo = blueprintInfo;
        return this;
    }

    public class HostGroup {

        @SerializedName("name")
        private String name;

        @SerializedName("configuration")
        private List<Configuration> configurations;

        @SerializedName("components")
        private List<Map<String, String>> components;


        @SerializedName("hosts")
        private List<Map<String, String>> hosts;

        public String getName() {
            return name;
        }

        public HostGroup withName(String name) {
            this.name = name;
            return this;
        }

        public List<Configuration> getConfigurations() {
            return configurations;
        }

        public HostGroup withConfigurations(List<Configuration> configurations) {
            this.configurations = configurations;
            return this;
        }

        public List<Map<String, String>> getComponents() {
            return components;
        }

        public HostGroup withComponents(List<Map<String, String>> components) {
            this.components = components;
            return this;
        }

        public List<Map<String, String>> getHosts() {
            return hosts;
        }

        public HostGroup withHosts(List<Map<String, String>> hosts) {
            this.hosts = hosts;
            return this;
        }
    }

    public class BlueprintInfo {

        @SerializedName("blueprint_name")
        private String name;

        @SerializedName("stack_name")
        private String stackName;

        @SerializedName("stack_version")
        private String stackVersion;

        public String getName() {
            return name;
        }

        public BlueprintInfo withName(String name) {
            this.name = name;
            return this;
        }

        public String getStackName() {
            return stackName;
        }

        public BlueprintInfo witjhStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        public String getStackVersion() {
            return stackVersion;
        }

        public BlueprintInfo withStackVersion(String stackVersion) {
            this.stackVersion = stackVersion;
            return this;
        }
    }
}
