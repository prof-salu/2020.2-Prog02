package corrida;

public class CorridaMaluca {
    public static void main(String[] args) throws InterruptedException {
        int tamanhoCircuito = 50;
        
        Piloto p1 = new Piloto("Carlos", 1.1, tamanhoCircuito);
        Piloto p2 = new Piloto("Pedro", 1.2, tamanhoCircuito);
        Piloto p3 = new Piloto("Ferdinando", 1.2, tamanhoCircuito);
        Piloto p4 = new Piloto("Lucia", 1.3, tamanhoCircuito);
        Piloto p5 = new Piloto("Ana", 1.1, tamanhoCircuito);
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
