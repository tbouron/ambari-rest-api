package com.github.tbouron.ambari.rest.endpoint;

import com.github.tbouron.ambari.rest.domain.Recommendation;
import com.github.tbouron.ambari.rest.domain.Recommendations;
import com.github.tbouron.ambari.rest.domain.Repository;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by thomasbouron on 28/07/2015.
 */
public interface StackEndpoint {

    @POST("/api/v1/stacks/{stack}/versions/{version}/recommendations")
    Recommendations getRecommendations(@Path("stack") String stack, @Path("version") String version, @Body Recommendation recommendation);

    @PUT("/api/v1/stacks/{stack}/versions/{version}/operating_systems/{os}/repositories/{repository}")
    void updateStackRepository(@Path("stack") String stack, @Path("version") String version, @Path("os") String os, @Path("repository") String repository, @Body Repository body);
}
