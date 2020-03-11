package com.example.restfulexercise.part2.StaticFiltering;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StaticFilteringService {
    private static List<StaticFilteringUser>  sampleModelList = new ArrayList<>();

    public StaticFilteringUser addUser(StaticFilteringUser sampleModel) {
        sampleModelList.add(sampleModel);
        return sampleModel;
    }
}