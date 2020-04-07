package org.acme;

public class MessageService {
    private final String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String sayHello(String name) {
        return message + " " + name;
    }
}
