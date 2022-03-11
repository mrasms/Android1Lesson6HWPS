package com.example.android1lesson4.ui.fragments.second.for_recycler.list_data;

import com.example.android1lesson4.ui.fragments.second.for_recycler.model.ModelSecondFragment;

import java.util.ArrayList;

public class DataSecondFragment {

    private static ArrayList<ModelSecondFragment> family = new ArrayList<>();

    public static ArrayList<ModelSecondFragment> getFamily() {
        family.add(new ModelSecondFragment("Иванов"));
        family.add(new ModelSecondFragment("Петров"));
        family.add(new ModelSecondFragment("Игорьев"));
        family.add(new ModelSecondFragment("Фёдоров"));
        family.add(new ModelSecondFragment("Дмитриев"));
        family.add(new ModelSecondFragment("Андреев"));
        family.add(new ModelSecondFragment("Кулалиев"));
        family.add(new ModelSecondFragment("Калмыков"));
        family.add(new ModelSecondFragment("Шаршеналиев"));
        family.add(new ModelSecondFragment("Садыров"));
        family.add(new ModelSecondFragment("Жапаров"));
        family.add(new ModelSecondFragment("Мусаев"));
        family.add(new ModelSecondFragment("Не пей пиво"));
        family.add(new ModelSecondFragment("Вованов"));
        family.add(new ModelSecondFragment("Григорьев"));
        family.add(new ModelSecondFragment("Егоров"));
        family.add(new ModelSecondFragment("Енокентьев"));
        family.add(new ModelSecondFragment("Сергеев"));
        return family;
    }
}
