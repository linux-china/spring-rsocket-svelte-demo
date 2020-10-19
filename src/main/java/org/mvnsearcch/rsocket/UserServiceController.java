package org.mvnsearcch.rsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * UserService RSocket Controller
 *
 * @author linux_china
 */
@Controller
@MessageMapping("UserService")
public class UserServiceController {

    @MessageMapping("findById")
    public Mono<User> findById(Integer id) {
        return Mono.just(new User(1, "linux_china"));
    }

    @MessageMapping("findAllUsers")
    public Flux<User> findAllUsers(Integer type) {
        return Flux.just(new User(1, "linux_china"), new User(2, "leijuan"));
    }

    @MessageMapping("onlineUserCount")
    public Flux<Integer> onlineUserCount() {
        return Flux.just(1, 2, 3, 3).delaySequence(Duration.ofSeconds(2));
    }
}
