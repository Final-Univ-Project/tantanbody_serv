package com.app.tantanbody.service;

import com.app.tantanbody.dto.DietDto;

import java.util.List;
import java.util.Map;

public interface DietService {

    public List<Map<String, Object>> getDiets(String userEmail);

    //List<Map<String, Object>> getRecentFoods(String userEmail);
    String[] getRecentFoods(String userEmail);

    public List<Map<String, Object>> searchFoodList(String sFoodName);

    //void saveSearchFood(DietDto dietDto);

    public void saveDiet(DietDto dietDto);


}
