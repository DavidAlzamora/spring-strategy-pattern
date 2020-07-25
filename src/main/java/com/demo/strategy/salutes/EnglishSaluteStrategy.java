package com.demo.strategy.salutes;

import com.demo.strategy.SaluteStrategy;
import org.springframework.stereotype.Component;

import static com.demo.strategy.salutes.SaluteStrategyName.ENGLISH;

@Component
public class EnglishSaluteStrategy implements SaluteStrategy {

    @Override
    public String sayHello() {
        return "Hello, how are you?";
    }

    @Override
    public SaluteStrategyName geStrategyName() {
        return ENGLISH;
    }

}
