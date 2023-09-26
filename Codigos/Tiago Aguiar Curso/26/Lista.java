

import java.util.ArrayList;
import java.util.List;



import globa.User;


public class Lista{

    public static void main (String [] args){

    List<User> users = new ArrayList<>();
    
    for(int i = 0; i<10; ++i){
    User actual = new User("Generic "+i,20+i);
    users.add(actual);
    System.out.println(users.get(i).GetDetails());
    }

    User aditional = new User("Aditional",100);

    users.add(aditional);

    System.out.println(users.get(10).GetDetails());

   

    }
}