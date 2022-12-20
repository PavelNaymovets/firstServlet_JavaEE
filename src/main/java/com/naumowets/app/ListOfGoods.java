package com.naumowets.app;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoods {
    public List<Good> goodList = new ArrayList<>();

    public void addGood(Good good) {
        goodList.add(good);
    }

}
