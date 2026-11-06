import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(17);
        numeros.add(3);
        numeros.add(1);
        System.out.println(numeros);
        System.out.println(numeros.get(2));
        System.out.println(numeros.indexOf(1));
        numeros.remove(2);
        System.out.println(numeros.indexOf(3));
        System.out.println(numeros);
        numeros.clear();
        System.out.println(numeros);

    }
}