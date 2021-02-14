package com.company.visitormode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//对象结构：食材set
public class SetIngredients {

    private List<Ingredients> list = new ArrayList<Ingredients>();

    public String accept(Restaurant visitor) {
        Iterator<Ingredients> iterator = list.iterator();
        StringBuilder tmp = new StringBuilder();
        while (iterator.hasNext()) {
            tmp.append(((Ingredients) iterator.next()).accept(visitor));
        }
        return tmp.toString();
    }

    public void add(Ingredients ingredients) {
        list.add(ingredients);
    }

    public void remove(Ingredients ingredients) {
        list.remove(ingredients);
    }

}
