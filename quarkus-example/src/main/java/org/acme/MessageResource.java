package org.acme;

import javax.validation.constraints.NotBlank;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MessageResource {

    private MessageService messageService;

    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @GET
    @Path("/hello/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@NotBlank @PathParam("name") String name) {
        return messageService.sayHello(name);
    }
}