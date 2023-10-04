import java.util.Arrays;

public class Prenchendo_Arrays {
    
public static void main(String[] args){

String[] names = new String[10];

System.out.println(Arrays.toString(names));

Arrays.fill(names,"Texto");

System.out.println(Arrays.toString(names));

}
}
