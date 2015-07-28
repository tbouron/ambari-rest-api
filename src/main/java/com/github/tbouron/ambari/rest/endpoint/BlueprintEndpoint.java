package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.Blueprint;
import com.github.tbouron.ambari.rest.domain.Blueprints;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public interface BlueprintEndpoint {

    @GET("/api/v1/blueprints")
    Blueprints getBlueprints();

    @GET("/api/v1/blueprints/{blueprint}")
    Blueprint getBlueprint(@Path("blueprint") String blueprint);

    @POST("/api/v1/blueprints/{blueprint}")
    void addBlueprint(@Path("blueprint") String blueprint, @Body Blueprint body);
}
