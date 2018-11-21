package edu.agh.wfiis.designpatterns.patterns;

import edu.agh.wfiis.designpatterns.CreatableDesignPattern;
import edu.agh.wfiis.designpatterns.enums.DesignPatternType;

public class StrategyDesignPattern implements CreatableDesignPattern {

    @Override
    public DesignPattern create(CreatableDesignPattern designPattern) {
        return DesignPattern.builder()
                .withId("3")
                .withName("strategy")
                .withDescription("strategy pattern")
                .withExample(null)
                .withPatternCode(null)
                .withDesignPatternType(DesignPatternType.BEHAVIORAL)
                .build();
    }

}
