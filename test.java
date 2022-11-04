public class test {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        System.out.print(miCoche.puertas);
    }
}

class Coche {
    public int puertas = 0;
    public void IncrementarPuertas(){
        this.puertas++;       
    }    
}