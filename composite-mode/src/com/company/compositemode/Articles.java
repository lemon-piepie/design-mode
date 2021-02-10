package com.company.compositemode;

import java.math.BigDecimal;

//抽象构件：物品
public interface Articles {
    public BigDecimal calculation();

    public void pack();
}
