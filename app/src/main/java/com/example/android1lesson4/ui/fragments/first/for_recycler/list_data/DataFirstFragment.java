package com.example.android1lesson4.ui.fragments.first.for_recycler.list_data;

import com.example.android1lesson4.ui.fragments.first.for_recycler.model.ModelFirstFragment;

import java.util.ArrayList;

public class DataFirstFragment {

    private static ArrayList<ModelFirstFragment> firstNames = new ArrayList<>();

    public static ArrayList<ModelFirstFragment> getFirstNames() {
        firstNames.add(new ModelFirstFragment("Алтынбек"));
        firstNames.add(new ModelFirstFragment("Екатерина"));
        firstNames.add(new ModelFirstFragment("Игорь"));
        firstNames.add(new ModelFirstFragment("Фёдор"));
        firstNames.add(new ModelFirstFragment("Дмитрий"));
        firstNames.add(new ModelFirstFragment("Андрей"));
        firstNames.add(new ModelFirstFragment("Эржан"));
        firstNames.add(new ModelFirstFragment("Владислав"));
        firstNames.add(new ModelFirstFragment("Курманбек"));
        firstNames.add(new ModelFirstFragment("Садыр"));
        firstNames.add(new ModelFirstFragment("Жапар"));
        firstNames.add(new ModelFirstFragment("Муса"));
        firstNames.add(new ModelFirstFragment("Петя"));
        firstNames.add(new ModelFirstFragment("Вова"));
        firstNames.add(new ModelFirstFragment("Григорий"));
        firstNames.add(new ModelFirstFragment("Егор"));
        firstNames.add(new ModelFirstFragment("Енокентий"));
        firstNames.add(new ModelFirstFragment("Сергей"));
        return firstNames;
    }
}
