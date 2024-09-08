package infnet.edu.springreactiveproject.controller;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import infnet.edu.springreactiveproject.service.WeatherService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.Product;
import infnet.edu.springreactiveproject.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import infnet.edu.springreactiveproject.model.WeatherResponse;
import infnet.edu.springreactiveproject.service.WeatherService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public Mono<WeatherResponse> getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}


