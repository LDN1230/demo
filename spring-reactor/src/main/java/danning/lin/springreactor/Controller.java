package danning.lin.springreactor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class Controller {


    private static WebClient webClient = WebClient.create("http://localhost:2001");
    private Mono<String> getString(Integer id){
        return webClient
                .get()
                .uri("/user/"+id)
                .retrieve()
                .bodyToMono(String.class);

    }
    @RequestMapping("/1")
    @ResponseBody
    public String getUser(){
        return "user1";
    }

    @RequestMapping("/2")
    @ResponseBody
    public String getUser(){
        return "user2";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        Mono<String> result = getString(1);
        return result.toString();
    }
}


