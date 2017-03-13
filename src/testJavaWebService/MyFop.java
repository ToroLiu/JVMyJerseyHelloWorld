package testJavaWebService;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;

@Path("/fop")
public class MyFop {

	@Path("Download/{code}")
	@GET
	@Produces("application/pdf")
	public Response getPDF(@PathParam("code") String qrCode) 
	{
		StreamingOutput stream = new StreamingOutput() {
			
			@Override
			public void write(OutputStream output) throws IOException, WebApplicationException {
				
				
				
				
			}
		};
		
		return Response.ok(stream).build();
	}
	
}
