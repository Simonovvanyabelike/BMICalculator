public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // Рост в метрах
        double weight = 98; // Вес в килограммах
        int bmi = service.calculate(height, weight); // Расчет ИМТ
        System.out.println(bmi); // Вывод результата на экран
    }
}