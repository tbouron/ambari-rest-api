package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.Request;
import com.github.tbouron.ambari.rest.domain.Requests;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by tbouron on 27/07/15.
 */
public interface RequestEndpoint {

    @GET("/api/v1/cluster/{cluster}/requests")
    Requests getRequests(@Path("cluster") String cluster);

    @GET("/api/v1/cluster/{cluster}/requests/{id}")
    Request getRequest(@Path("cluster") String cluster, @Path("id") int id);
}
