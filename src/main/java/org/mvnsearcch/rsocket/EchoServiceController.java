package org.mvnsearcch.rsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

/**
 * Echo Service controller
 *
 * @author linux_china
 */
@Controller
public class EchoServiceController {
    @MessageMapping("echo.service")
    public Mono<String> echo(String name) {
        System.out.println("received: " + name);
        return Mono.just("Pong");
    }

}
