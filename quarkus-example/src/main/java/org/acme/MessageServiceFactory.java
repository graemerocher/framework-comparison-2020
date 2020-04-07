package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@Singleton
public class MessageServiceFactory {

    private final String message;

    public MessageServiceFactory(
            @ConfigProperty(name="hello.message", defaultValue = "Hello")
                    String message) {
        this.message = message;
    }

    @Singleton
    @Produces
    MessageService messageService() {
        return new MessageService(message);
    }
}
