public abstract class Transport {
int id = 0;

protected static final int PRICE = 100;



boolean condicioner;

boolean radio;

double time0100;

    public Transport(boolean condicioner, boolean radio, double time0100) {
        this.id = generatorId();
        this.condicioner = condicioner;
        this.radio = radio;
        this.time0100 = time0100;
    }

    private int generatorId(){
        return ++id;
    }
}

 class Samosval extends Transport{



     public Samosval(boolean condicioner, boolean radio, double time0100) {
         super(condicioner, radio, time0100);
     }
 }

class Bus extends Transport{
    public Bus(boolean condicioner, boolean radio, double time0100) {
        super(condicioner, radio, time0100);
    }
}

class MicroBus extends Transport{

    public MicroBus(boolean condicioner, boolean radio, double time0100) {
        super(condicioner, radio, time0100);
    }
}

