package web;

import java.util.*;

public class Task2 {

    private static final String
            NAME_COLUMN = "Имя",
            AGE_COLUMN = "Возраст",
            POSITION_COLUMN = "Должность",
            SALARY_COLUMN = "зарплата";

    public static void showAvgAge(List<Map<String, String>> table) {
        System.out.println(
                table.isEmpty() ? "Таблица пуста" : table.stream()
                        .mapToInt(map -> Integer.parseInt(map.get(AGE_COLUMN)))
                        .average().orElseThrow()
        );
    }

    public static void showYoungEmployeesNames(List<Map<String, String>> table) {
        table.forEach(map -> {
            if (Integer.parseInt(map.get(AGE_COLUMN)) < 30) {
                System.out.println(map.get(NAME_COLUMN));
            }
        });
    }

    public static void showRublesSalaryEmployeesNames(List<Map<String, String>> table) {
        table.forEach(map -> {
            String salary = map.get(SALARY_COLUMN);
            if (salary.charAt(salary.length() - 1) == '₽') {
                System.out.println(map.get(NAME_COLUMN));
            }
        });
    }
}
