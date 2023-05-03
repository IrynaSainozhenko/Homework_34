/*
Задание 2
Добавьте в enum Month поле, с названием месяца по-русски, и поле номер месяца.
Сделайте соответствующий конструктор.
Реализуйте метод, который распечатает все месяцы строками вида „Месяц 1 – январь”, „Месяц 2 – февраль” ……
*/
public enum Month {
    JANUARY("Январь", 1),
    FEBRUARY("Февраль", 2),
    MARCH("Март", 3),
    APRIL("Апрель", 4),
    MAY("Май", 5),
    JUNE("Июнь", 6),
    JULY("Июль", 7),
    AUGUST("Август", 8),
    SEPTEMBER("Сентябрь", 9),
    OCTOBER("Октябрь", 10),
    NOVEMBER("Ноябрь", 11),
    DECEMBER("Декабрь", 12);
    final String ruName;
    final int number;
    Month(String ruName, int number){
        this.ruName = ruName;
        this.number = number;
    }
    public void getRuNameAndNumber(){
        System.out.println("Месяц " + number + " - это " + ruName);
    }
}
