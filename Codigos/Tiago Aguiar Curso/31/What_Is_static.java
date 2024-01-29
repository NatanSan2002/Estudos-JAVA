import globa.User;

public class What_Is_static {
    
public static void main(String[] args){
User userA = new User("Conde",32); 
User userB = new User("Tiburcio",25);

userA.SetName("Loppeux"); /*prop name -no static-: pertence só a seu proprio OBJ */

userA.SetGeral(5); /*prop geral -static-: pertence a todo OBJ da Classe, um mudando o valor dela todos mudam */
userB.SetGeral(2);


System.out.println(userA.GetDetails());
System.out.println(userB.GetDetails());

userA.SetGeral(3);

User.SetGeral2(1); /* Método -static- da classe, a propria Classe o chama */

System.out.println(userA.GetDetails());
System.out.println(userB.GetDetails());
}
}
