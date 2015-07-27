package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.ClusterConfiguration;
import com.github.tbouron.ambari.rest.domain.Configurations;
import retrofit.http.*;

/**
 * Created by tbouron on 27/07/15.
 */
public interface ConfigurationEnpoint {

    @GET("/api/v1/clusters/{cluster}/configurations")
    Configurations getClusterConfiguration(@Path("cluster") String cluster, @Query("type") String type, @Query("tag") String tag);

    @PUT("/api/v1/clusters/{cluster}")
    void setClusterConfiguration(@Path("cluster") String cluster, @Body ClusterConfiguration clusterConfiguration);
}
