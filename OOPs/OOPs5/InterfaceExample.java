interface Engine {
    void start();

    // methods are abstract and public by default
    // variables are static and final by default.
    int variable = 90000;

    void stop();

    void acc();

    static void staticMethod() {
        // static method must contain a body.

    }

    // public Engine(){} there are no constructors in interfaces as they are not
    // classes.
}

interface Media {
    void start();

    void pause();

    void stop();
}

// Separate Classes inn Same Interface (PowerEngine and ElectricEngine)
class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("POwer Engine Accelerate");
    }
}

class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Electric Engine Accelerate");
    }
}

class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Music Player Start");
    }

    @Override
    public void pause() {
        System.out.println("Music Player Pause");
    }

    @Override
    public void stop() {
        System.out.println("Music Player Stop");
    }

}

class MyNewCar {
    private Engine engine;
    private Media player;

    MyNewCar(Engine engine, Media player) {
        this.engine = engine;
        this.player = player;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.acc();
    }

    public void startMusic() {
        player.start();
    }

    public void pauseMusic() {
        player.pause();
    }

    public void stopMusic() {
        player.stop();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MyNewCar myCar = new MyNewCar(new PowerEngine(), new CDPlayer());
        myCar.start();
        myCar.startMusic();

    }

}