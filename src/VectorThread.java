

import java.util.Arrays;
import java.util.Random;

public class VectorThread extends Thread {

    //Creamos el Vector
    public int[] vector;

    public VectorThread(int[] vector) {
        this.vector = vector;
    }


    //Metodo para llenar el vector con 10000 numero aleatorios
    public void run() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000) + 1;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        // inicializamos el tamaño del Vector
        int tamañoVector =10000;

        //Cda Hilo es Asignado un tamaño
        int[] vector1 = new int[tamañoVector];
        int[] vector2 = new int[tamañoVector];
        int[] vector3 = new int[tamañoVector];
        int[] vector4 = new int[tamañoVector];

        //le asigamos a cada hilo su Matriz

        System.out.println("Isaac Quezada");

        VectorThread hilo1 = new VectorThread(vector1);
        VectorThread hilo2 = new VectorThread(vector2);
        VectorThread hilo3 = new VectorThread(vector3);
        VectorThread hilo4 = new VectorThread(vector4);
        //nomnbres
        System.out.println("Gilbert Solano");
        hilo1.start();
        Thread.sleep(1000);
        hilo2.start();
        Thread.sleep(1000);
        hilo3.start();
        Thread.sleep(1000);
        hilo4.start();
// Imprimir los vectores
        System.out.println("Vector 1: " + Arrays.toString(vector1));
        System.out.println("Vector 2: " + Arrays.toString(vector2));
        System.out.println("Vector 3: " + Arrays.toString(vector3));
        System.out.println("Vector 4: " + Arrays.toString(vector4));
    }
}
