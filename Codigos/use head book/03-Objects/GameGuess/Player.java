public class Player{
int number = 0; // Numero de Chute

public void guess(){ // Método de Chute aleatorio
number = (int) (Math.random() * 10); 
System.out.println("Estou pensando no numero: "+number);


}
}