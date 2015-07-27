package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.HostComponent;
import com.github.tbouron.ambari.rest.domain.HostComponents;
import com.github.tbouron.ambari.rest.domain.Request;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by tbouron on 27/07/15.
 */
public interface HostEndpoint {

    @GET("/api/v1/clusters/{cluster}/hosts/{host}/host_components")
    HostComponents getHostComponents(@Path("cluster") String cluster, @Path("host") String host);

    @PUT("/api/v1/clusters/{cluster}/hosts/{host}/host_components/{component}")
    void addComponent(@Path("cluster") String cluster, @Path("host") String host, @Path("component") String component);

    @PUT("/api/v1/clusters/{cluster}/hosts/{host}/host_components/{component}")
    Request updateComponent(@Path("cluster") String cluster, @Path("host") String host, @Path("component") String component, @Body HostComponent hostComponent);
}
