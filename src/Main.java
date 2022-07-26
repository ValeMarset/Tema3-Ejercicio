public class Main {
    public static void main(String[] args) {

        // Llamada a la función Sumar pasandole tres parámetros.
        Sumar(10,20,35);

        // Creación del objeto "miCoche"
        Coche miCoche = new Coche();

        // Llamada a la función IncrementarPuertas() desde el objeto "miCoche"
        miCoche.IncrementarPuertas();

        //Impresión en consola de la cantidad de puertas que tiene el objeto "miCoche" (1)
        System.out.println(miCoche.numPuertas);

    }


 // Función que suma tres números:
    public static int Sumar (int a, int b, int c){

        return (a + b + c);

    }


}

//Creación de la clase Coche
class Coche {

    //Declaración e inicialización de la variable numPuertas
    public int numPuertas = 0;

    //Definición de la función IncrementarPuertas()
    public void IncrementarPuertas(){


        this.numPuertas ++;

    }

}






