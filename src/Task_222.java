import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task_222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 💡 Ввести с консоли дату в формате: 31.12.2020, сохранить ее в переменной класса LocalDate
        System.out.println("Введите первую дату в формате dd.MM.yyyy: ");
        String inputDate1 = scanner.nextLine();
        LocalDate date1 = parseDate(inputDate1);

        if (date1 == null) {
            System.out.println("Ошибка: Неверный формат даты.");
            return;
        }

        // 💡 Увеличить дату на 45 дней и вывести на экран
        LocalDate dateAfter45Days = date1.plusDays(45);
        System.out.println("Дата после увеличения на 45 дней: " + formatDate(dateAfter45Days));

        // 💡 Сдвинуть дату на начало года и вывести на экран
        LocalDate startOfYear = date1.withDayOfYear(1);
        System.out.println("Дата после сдвига на начало года: " + formatDate(startOfYear));

        // 💡 Увеличить дату на 10 рабочих дней (субботы и воскресенья - выходные) и вывести на экран
        LocalDate dateAfter10WorkDays = addWorkDays(date1, 10);
        System.out.println("Дата после увеличения на 10 рабочих дней: " + formatDate(dateAfter10WorkDays));

        // 💡 Ввести с консоли вторую дату в том же формате и сохранить ее в другой переменной класса LocalDate
        System.out.println("Введите вторую дату в формате dd.MM.yyyy: ");
        String inputDate2 = scanner.nextLine();
        LocalDate date2 = parseDate(inputDate2);

        if (date2 == null) {
            System.out.println("Ошибка: Неверный формат даты.");
            return;
        }

        // 💡 Посчитать количество рабочих дней между первой и второй датами и вывести на экран
        if (date1.isBefore(date2)) {
                int workDaysCount = countWorkDays(date1, date2);
                System.out.println("Количество рабочих дней между введенными датами: " + (workDaysCount - 1));
        }
        else {
            int workDaysCount = countWorkDays(date2, date1);
            System.out.println("Количество рабочих дней между введенными датами: " + (workDaysCount - 1));
        }
        scanner.close();
    }

    // Метод для парсинга строки в LocalDate
    private static LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    // Метод для форматирования LocalDate в строку
    private static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(formatter);
    }

    // Метод для добавления рабочих дней (исключая субботы и воскресенья)
    private static LocalDate addWorkDays(LocalDate date, int workDays) {
        LocalDate result = date;
        int addedDays = 0;
        while (addedDays < workDays) {
            result = result.plusDays(1);
            if (result.getDayOfWeek() != DayOfWeek.SATURDAY && result.getDayOfWeek() != DayOfWeek.SUNDAY) {
                addedDays++;
            }
        }
        return result;
    }

    // Метод для подсчета рабочих дней между двумя датами
    private static int countWorkDays(LocalDate startDate, LocalDate endDate) {
        int workDays = 0;
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workDays;
    }
}