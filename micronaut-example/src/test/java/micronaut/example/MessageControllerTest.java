package micronaut.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class MessageControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void testMessage() {
        HttpResponse<String> response = client.toBlocking().exchange(
                "/hello/John",
                String.class
        );

        Assertions.assertEquals(
                HttpStatus.OK,
                response.status()
        );

        Assertions.assertEquals(
                "Hello John",
                response.body()
        );
    }

}
