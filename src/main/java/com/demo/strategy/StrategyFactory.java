package com.demo.strategy;

import com.demo.strategy.salutes.SaluteStrategyName;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StrategyFactory {

    private final Map<SaluteStrategyName, SaluteStrategy> strategyMap = new HashMap<>();

    public StrategyFactory(Set<SaluteStrategy> strategies) {
        createStrategyMap(strategies);
    }

    public SaluteStrategy findStrategy(SaluteStrategyName strategyName){
        return strategyMap.get(strategyName);
    }

    private void createStrategyMap(Set<SaluteStrategy> strategies){
        strategies.forEach(strategy -> strategyMap.put(strategy.geStrategyName(), strategy));
    }
}
