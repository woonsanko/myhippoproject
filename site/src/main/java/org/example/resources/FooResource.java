package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.example.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;

public class FooResource {

	@Autowired
	private FooService fooService;

	@GET
	@Path("/foo")
	public String getMessage() {
		return fooService.getMessage("Foo");
	}
}
