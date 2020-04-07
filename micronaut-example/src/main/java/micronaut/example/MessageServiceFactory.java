package micronaut.example;

import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Property;

import javax.inject.Singleton;

@Factory
public class MessageServiceFactory {

    private final String message;

    public MessageServiceFactory(
            @Property(name="hello.message", defaultValue = "Hello")
            String message) {
        this.message = message;
    }

    @Singleton
    MessageService messageService() {
        return new MessageService(message);
    }
}
