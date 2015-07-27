package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.ServiceComponents;
import com.github.tbouron.ambari.rest.domain.Services;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by tbouron on 27/07/15.
 */
public interface ServiceEndpoint {

    @GET("/api/v1/clusters/{cluster}")
    Services getServices(@Path("cluster") String cluster);

    @GET("/api/v1/clusters/{cluster}/services/{service}")
    ServiceComponents getServiceComponents(@Path("cluster") String cluster, @Path("service") String service);

    @POST("/api/v1/clusters/{cluster}/services/{service}")
    void createService(@Path("cluster") String cluster, @Path("service") String service);

    @POST("/api/v1/clusters/{cluster}/services/{service}/components/{component}")
    void createComponent(@Path("cluster") String cluster, @Path("service") String service, @Path("component") String component);
}
