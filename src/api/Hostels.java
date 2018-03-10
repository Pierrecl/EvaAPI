package api;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hostels")
public class Hostels {
	//GET method, should return the list of all hostels as JSON
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String displayHostelsJSON(@QueryParam("name") String name){
		if(!name.isEmpty()){
			
		}
		String resource = null;
		return resource;
	}
	//GET simple method to catch HTML access
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String displayHostelsHTML(@QueryParam("name") String name){
		String resource = "";
		if(!name.isEmpty()){
			
		 resource = "<h3>hostels "+ name +"<h3>";

		}
		return resource;
	}
	
}
