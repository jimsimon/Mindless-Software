package com.mindless;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class RESTTest {

	@GET
	@Path("/")
	@Produces("text/plain")
	public String test()
	{
		return "JAX-RS is working!";
	}
	
}
