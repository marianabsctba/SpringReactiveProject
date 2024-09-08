package infnet.edu.springreactiveproject.service;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    public Mono<WeatherResponse> getWeather(String city) {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=1f8932b1875e7f42df96f7d79e36fb07&units=metric";

        return webClient.get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }
}


