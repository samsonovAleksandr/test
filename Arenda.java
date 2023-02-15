import java.util.*;

public class Arenda {

    Map<Integer, Boolean> arenda = new HashMap<>();
    public List<Samosval> samosvalList = new ArrayList<>();
    Random random = new Random();


    void createSamosval() {
        for (int i = 0; i < 300; i++) {
            boolean rnd = random.nextBoolean();
            int rnd1 = random.nextInt(100);
            Samosval samosval = new Samosval(rnd, rnd, rnd1);
            samosvalList.add(samosval);
            arenda.put(samosval.id, random.nextBoolean());
        }
    }


    public String print(Samosval samosval) {
        String str = "";
        for (Samosval sam : samosvalList) {
            if (sam.condicioner == samosval.condicioner && sam.radio == samosval.radio &&
                    !(arenda.get(sam.id).booleanValue())) {
                    str = "Есть доступная для аренды машина";
                    break;

            }else {
                str = "Нет доступных машин";
            }
        }
        return str;
    }
}
