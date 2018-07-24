package teams;


import javax.ws.rs.*;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

@Path("/")
public class MsgResource {

    private static String msg = "Hello World";

    @GET
    @Produces("text/plain")
    public String read() {
        return msg;
    }

    @GET
    @Produces("text/plain")
    @Path("{extra}")
    public String personalizedRead(@PathParam("extra") String cus) {
        return String.format("%s %s", msg, cus);
    }

    @POST
    @Produces("text/xml")
    public String create(@FormParam("msg") String newMsg) {
        msg = newMsg;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        XMLEncoder encoder = new XMLEncoder(byteArrayOutputStream);
        encoder.writeObject(newMsg);
        encoder.close();
        return new String(byteArrayOutputStream.toByteArray());
    }

    @DELETE
    @Produces("text/plain")
    public String delete() {
        msg = "";
        return "Message deleted";
    }
}
