import java.util.Random;
public class Main {
    public static void main(String[] args) {
    Lista lista = new Lista();

    for(int i = 0; i < 1000001; ++i){
        Random Rand = new Random();
        int x = Rand.nextInt(100001);

        lista.insertar(x);
    }

    lista.shellSort();
    lista.recorrer();

    }
}
