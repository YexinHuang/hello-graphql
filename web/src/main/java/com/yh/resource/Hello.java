package com.yh.resource;

import com.yh.domain.TestObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by yhuang on 11/21/16.
 */
@Component("HelloResource")
@Path("/v1")
public class Hello {
    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @GET
    @Path (value = "/say-hello")
    @Produces(MediaType.APPLICATION_JSON)
    public TestObject getHello() {
        return new TestObject();
    }
}
