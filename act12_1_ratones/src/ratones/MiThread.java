
package ratones;

class MiThread implements Runnable {
Thread thread;
TicTac tictac;
int veces;
//Crear un nuevo subproceso
MiThread(String nombre, TicTac tictac, int veces) {
thread = new Thread(this, nombre);
this.tictac = tictac;
this.veces=veces;
thread.start(); //iniciar el subproceso
}
//Iniciar ejecución del nuevo subproceso
public void run() {
if (thread.getName().compareTo("TIC") == 0) {
for (int i = 0; i < veces; i++)
tictac.tic(true);
tictac.tic(false);
} else {
for (int i = 0; i < veces; i++)
tictac.tac(true);
tictac.tac(false);
}
}
}