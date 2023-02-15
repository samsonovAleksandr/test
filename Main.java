import java.security.Provider;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Arenda arenda = new Arenda();
        arenda.createSamosval();
        Random random = new Random();
        boolean cond = random.nextBoolean();

        boolean rad = random.nextBoolean();

        Samosval samosval = new Samosval(cond, rad, 50);

        System.out.println(arenda.print(samosval));
    }
}