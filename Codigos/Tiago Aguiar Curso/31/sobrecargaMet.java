import globa.User;


public class sobrecargaMet {

public static void main(String[] args){

User rodolfo = new User("Rodolfo",32);


System.out.println(rodolfo.GetDetails(false)); // Aqui pela é a mesma função só que alterada pelo valor

System.out.println(rodolfo.GetDetails());

}

}
