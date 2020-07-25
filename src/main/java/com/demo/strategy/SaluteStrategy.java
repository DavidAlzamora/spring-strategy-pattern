package com.demo.strategy;

import com.demo.strategy.salutes.SaluteStrategyName;

public interface SaluteStrategy {

    String sayHello();

    SaluteStrategyName geStrategyName();
}
