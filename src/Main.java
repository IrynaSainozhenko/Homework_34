public class Main {
    public static void main(String[] args) {
        System.out.println(returnSeason(Month.SEPTEMBER));
        Month.JANUARY.getRuNameAndNumber();
        /*
        Задание 1
Реализуйте enum Month с перечислением всех месяцев.
Реализуйте enum Season с названием сезонов (WINTER, SPRING, SUMMER, AUTUMN)
Напишите метод, который принимает Month, а соответствующий возвращает Season
         */
    }

    public static Season returnSeason (Month month) {
        switch (month) {

            case DECEMBER, JANUARY, FEBRUARY:
                return Season.WINTER;

            case MARCH, APRIL, MAY:
                return Season.SPRING;

            case JUNE, JULY, AUGUST:
                return Season.SUMMER;
            default:
                return Season.AUTUMN;
        }
    }
}