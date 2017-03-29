package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.example.services.BarService;
import org.springframework.beans.factory.annotation.Autowired;

public class BarResource {

	@Autowired
	private BarService barService;

	@GET
	@Path("/bar")
	public String getMessage() {
		return barService.getMessage("Bar");
	}
}
