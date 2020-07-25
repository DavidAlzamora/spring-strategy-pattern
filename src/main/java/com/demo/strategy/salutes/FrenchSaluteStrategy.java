package com.demo.strategy.salutes;

import com.demo.strategy.SaluteStrategy;
import org.springframework.stereotype.Component;

import static com.demo.strategy.salutes.SaluteStrategyName.FRENCH;

@Component
public class FrenchSaluteStrategy implements SaluteStrategy {

    @Override
    public String sayHello() {
        return "Bonjour, comment allez-vous?";
    }

    @Override
    public SaluteStrategyName geStrategyName() {
        return FRENCH;
    }

}
