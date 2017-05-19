package ratones;
import java.util.Random;
public class Ratones extends Thread {
static int plato = 100; //El plato se llena con 100
String nombre; //nombre del ratón
int comida; //cantidad de comida cada vez que come
public Ratones(String nombre, int comida) {
this.nombre = nombre;
this.comida = comida;
System.out.println(nombre +
" Preparado para comer de "+comida+ " en "+ comida);
}
public void run() {
for (int i = 0; i < new Random().nextInt(20)+1; i++)
if ((plato - comida) > 0)
comer(); //Si hay comida el ratón come
else
llenar(); //Si no el ratón llena plato
}
public synchronized void comer() {
plato = plato - comida;
System.out.println(nombre + " Ha comido y queda " +
plato + " en el plato");
}
public synchronized void llenar() {
plato = 100;
System.out.println("El plato ha sido llenado");
}
public static void main(String[] args) {
new Ratones("Raton1", new
Random().nextInt(5)+1).start();
new Ratones("Raton2", new
Random().nextInt(10)+1).start();
}
}