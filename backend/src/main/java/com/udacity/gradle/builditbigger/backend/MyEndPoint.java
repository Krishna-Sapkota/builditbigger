package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.project.krishna.javajokelib.MyJokes;

/** An endpoint class we are exposing */

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath=""
        )
)
public class MyEndPoint {

    @ApiMethod(name = "getRandomJoke")
    public MyBean getRandomJoke() {
        return new MyBean(MyJokes.getJoke());
    }

}
