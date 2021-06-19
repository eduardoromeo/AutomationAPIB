package clientApi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * @autor: Eduardo M.T
 **/
public abstract class RequestClient {
    Client client = ClientBuilder.newBuilder().build();
    public abstract ResponseInformation send(RequestInformation request);
}
