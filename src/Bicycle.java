public class Bicycle extends WheeledTransport {
    public Bicycle(String modelName) { //конструктор с установленным количеством колес
        super(modelName, 2);
    }

    public Bicycle(String modelName, int wheelsCount) { //можем поменять количество колес
        super(modelName, wheelsCount);
    }
}
