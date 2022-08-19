public class Main {
    public static void main(String[] args) {
        //primera parte de practica
        int resultado = 0;
        resultado = suma(2,3,5);
        System.out.println(resultado);

        //segunda parte de practica
        coche miCoche = new coche();
        miCoche.addPuerta();
        miCoche.addPuerta();
        System.out.println(miCoche.num_puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class coche{
    public int num_puertas = 0;

    public void addPuerta() {
        this.num_puertas ++;
    }
}