package danning.lin.springreactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringReactorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactorApplication.class, args);
        Mono<String> hh = Mono.just("haha");
        hh.subscribe(System.out::println);
    }

}

