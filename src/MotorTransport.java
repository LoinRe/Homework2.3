public abstract class MotorTransport extends WheeledTransport { //тоже с колесами, только еще и мотор есть
    //конструктор
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() { //перенесли сюда, убрали дубликаты
        System.out.println("Проверяем двигатель");
    }

    public void service() { ///переопределенный метод родительского класса
        // сначала будет проверять колеса, затем двигатель
        super.service();
        checkEngine();
    }
}
