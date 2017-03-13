package testJavaWebService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/fop")
public class Fop {

	@Path("Download/{code}")
	@GET
	@Produces("application/pdf")
	public Response getPDF(@PathParam("code") String qrCode) 
	{
		
		return null;
	}
	
}
