package com.demo.strategy.salutes;

import com.demo.strategy.SaluteStrategy;
import org.springframework.stereotype.Component;

@Component
public class MallorquinSaluteStrategy implements SaluteStrategy {

    @Override
    public String sayHello() {
        return "UEP com anam?";
    }

    @Override
    public SaluteStrategyName geStrategyName() {
        return SaluteStrategyName.MALLORQUIN;
    }

}
