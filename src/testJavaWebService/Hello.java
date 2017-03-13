package testJavaWebService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello()
	{
		return "<html><body><h1> Hello Jersey </h1></body></html>";
	}
}
