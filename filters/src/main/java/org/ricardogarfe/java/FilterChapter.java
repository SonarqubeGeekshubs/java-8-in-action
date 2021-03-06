package org.ricardogarfe.java;

import java.util.List;
import java.util.Optional;

public class FilterChapter {

  public boolean checkMenuVeganFriendly(List<Dish> menu) {
    return menu.stream().anyMatch(Dish::isVegetarian);
  }

  public Boolean checkHealthyMenu(List<Dish> menu) {
    return menu.stream()
        .allMatch(d -> d.getCalories() < 1000);
  }

  public Optional<Dish> findAnyVegetarianDish(List<Dish> menu) {
    return menu.stream()
        .filter(Dish::isVegetarian)
        .findAny();
  }

  public Optional<Integer> firstSquareDivisibleByThree(List<Integer> someNumbers) {
    return someNumbers.stream()
        .map(x -> x * x)
        .filter(x -> x % 3 == 0)
        .findFirst();
  }
}
