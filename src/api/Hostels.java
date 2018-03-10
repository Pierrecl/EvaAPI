package api;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hostels")
public class Hostels {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String displayHostelsJSON(){
		String resource = null;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String displayHostelsHTML(){
		String resource = "<h1>hostels<h1>";
		return resource;
	}
	
}
