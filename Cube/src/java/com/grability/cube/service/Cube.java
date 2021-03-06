/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.service;

import com.grability.cube.object.TestCase;
import com.grability.cube.processor.CubeProcessor;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author listman
 */
@Path("cube")
public class Cube {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Cube
     */
    public Cube() {
    }
    /**
     * POST method for data processing 
     * @param testCases
     * @return 
     */
    @POST
    public Response procesar(List<TestCase> testCases){
        CubeProcessor processor=new CubeProcessor();
        return Response.ok(processor.procesar(testCases).toString()).build();
    }
}
