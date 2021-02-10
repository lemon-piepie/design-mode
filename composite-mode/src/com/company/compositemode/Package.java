package com.company.compositemode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;

//树枝构件：打包袋子
public class Package implements Articles {
    private String name;
    private List<Articles> packages = new ArrayList<Articles>();

    public Package(String name) {
        this.name = name;
    }

    public void add(Articles articles) {
        packages.add(articles);
    }

    public void remove(Articles articles) {
        packages.remove(articles);
    }

    public Articles getChild(int index) {
        return packages.get(index);
    }

    @Override
    public BigDecimal calculation() {
        return packages.stream().map(Articles::calculation).reduce(ZERO,BigDecimal::add);
    }

    @Override
    public void pack() {
        packages.forEach(Articles::pack);
    }
}
