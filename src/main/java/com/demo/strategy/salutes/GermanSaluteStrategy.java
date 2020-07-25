package com.demo.strategy.salutes;

import com.demo.strategy.SaluteStrategy;
import org.springframework.stereotype.Component;

import static com.demo.strategy.salutes.SaluteStrategyName.GERMAN;

@Component
public class GermanSaluteStrategy implements SaluteStrategy {

    @Override
    public String sayHello() {
        return "Hallo, wie geht es Ihnen?";
    }

    @Override
    public SaluteStrategyName geStrategyName() {
        return GERMAN;
    }

}
