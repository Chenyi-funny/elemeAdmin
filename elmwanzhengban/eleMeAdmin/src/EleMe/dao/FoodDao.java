package EleMe.dao;

import EleMe.domain.Food;

import java.util.List;

public interface FoodDao {
    // 列出food食品
    List<Food> foodList(int businessId);

}
