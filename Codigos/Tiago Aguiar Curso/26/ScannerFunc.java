import java.util.Scanner;

public class ScannerFunc {
    
public static void main (String[] args){


Scanner input = new Scanner(System.in);

int n1 = 1;
int n2 = 2;

int sum = 0;;

System.out.println("Digite o Limite das somas");

int limite_sum = input.nextInt();

for(int i = sum; i < limite_sum; i = sum){
sum = n1 + n2;

System.out.println(n1+"+"+n2+ "= "+ sum);
n1 = n2;
n2 = sum;


}



}

}
