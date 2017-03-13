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

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Path("/qrcode")
public class MyQRCode {
	
	@Path("img/{code}")
	@GET
	@Produces("application/image")
	public Response getImage(@PathParam("code") String qrCode) {
		
		StreamingOutput stream = new StreamingOutput() {
			
			@Override
			public void write(OutputStream output) throws IOException, WebApplicationException {
				QRCodeWriter qrWriter = new QRCodeWriter();
				try {
					String code = qrCode != null ? qrCode : "1234";
					
					BitMatrix bits = qrWriter.encode(code, BarcodeFormat.QR_CODE, 200, 200);
					MatrixToImageWriter.writeToStream(bits, "png", output);
				} catch (WriterException e) {
					// TODO Auto-generated catch block
					throw new WebApplicationException(e);
				}
			}
		};
		
		return Response.ok(stream).build();
				
	}
	
	
}
