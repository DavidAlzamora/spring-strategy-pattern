package com.demo.strategy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {

    private final SayHello sayHello;

    public StrategyController(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestParam("strategy") String strategyName){
        String salute = sayHello.salute(strategyName);
        return ResponseEntity.ok(salute);
    }
}
