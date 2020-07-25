package com.demo.strategy.salutes;

import com.demo.strategy.SaluteStrategy;
import org.springframework.stereotype.Component;

import static com.demo.strategy.salutes.SaluteStrategyName.SPANISH;


@Component
public class SpanishSaluteStrategy implements SaluteStrategy {

    @Override
    public String sayHello() {
        return "Hola, ¿como estás?";
    }

    @Override
    public SaluteStrategyName geStrategyName() {
        return SPANISH;
    }

}
