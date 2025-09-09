package test;

import java.util.List;
import java.util.Map;

public class Task2 {

    private static final String
            NAME_COLUMN = "Имя",
            AGE_COLUMN = "Возраст",
            POSITION_COLUMN = "Должность",
            SALARY_COLUMN = "зарплата";

    public static void showYoungEmployeesNames(List<Map<String, String>> table) {
        table.stream()
                .filter(map -> Integer.parseInt(map.get(AGE_COLUMN)) < 30)
                .forEach(map -> System.out.println(map.get(NAME_COLUMN)));
    }

    public static void showRubleSalaryEmployeesNames(List<Map<String, String>> table) {
        table.stream()
                .filter(map -> {
                    String salary = map.get(SALARY_COLUMN);
                    return salary.charAt(salary.length() - 1) == '₽';
                })
                .forEach(map -> System.out.println(map.get(NAME_COLUMN)));
    }

    public static void showEmployeesAvgAge(List<Map<String, String>> table) {
        System.out.println(
                table.stream()
                        .mapToInt(map -> Integer.parseInt(map.get(AGE_COLUMN)))
                        .average().orElseThrow(() -> new RuntimeException("Таблица пуста"))
        );
    }
}
