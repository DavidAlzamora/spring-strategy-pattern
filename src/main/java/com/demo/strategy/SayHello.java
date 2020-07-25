package com.demo.strategy;

import com.demo.strategy.salutes.SaluteStrategyName;
import org.springframework.stereotype.Service;

@Service
public class SayHello {

    private final StrategyFactory factory;

    public SayHello(StrategyFactory factory) {
        this.factory = factory;
    }

    public String salute(String pattern) {
        SaluteStrategyName saluteStrategyName = SaluteStrategyName.valueOf(pattern.toUpperCase());
        SaluteStrategy strategy = factory.findStrategy(saluteStrategyName);
        return strategy.sayHello();
    }

}
