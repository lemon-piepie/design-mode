package com.company.strategymode;

//环境类：厨房
public class Kitchen {
    private CookEggs strategy;

    public void setStrategy(CookEggs strategy) {
        this.strategy = strategy;
    }

    public CookEggs getStrategy() {
        return strategy;
    }

    public void CookEggsMethod() {
        strategy.CookingMethod();
    }
}
