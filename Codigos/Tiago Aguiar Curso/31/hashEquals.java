import globa.User;


public class hashEquals{

public static void main(String[] args){
User userA = new User("Hebert",32);
User userB = userA;

System.out.println(userA.equals(userB));
}

}