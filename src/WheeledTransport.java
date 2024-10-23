public abstract class WheeledTransport implements Transport { // создали абстрактный класс
    public final String modelName;  // final, поля не нужно менять, сеттеры не нужны
    public final int wheelsCount;  // final

    //конструктор
    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    //геттеры
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() { //Перенесли сюда, убрали дубликаты из классов
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre(); // замена покрышки для каждого колеса
        }
    }
}