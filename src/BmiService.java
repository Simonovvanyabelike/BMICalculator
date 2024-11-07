public class BmiService {
    public int calculate(double height, double weight) {
        // Расчет ИМТ: вес / (рост * рост)
        double index = weight / (height * height);
        return (int) index; // Приведение к целому типу
    }
}