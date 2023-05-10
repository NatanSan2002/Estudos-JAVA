public class InsideMet{
public static void main(String[] args){
int num = 5;
String texto = "Palavra";
num = num * 5;
int i = 10;
i += num;


System.out.println("num = "+num+" i = "+i);
double d = Math.random();
System.out.println(d+" ");
// This is a comment in Java :)



int cond = 3;
int cond2 = 7;

// Looping

for(int y = 0;y<10; ++y){
if(y <= cond ){
System.out.print("Y é menor ou igual a: "+cond+" ");
}else if(y <= cond2){
System.out.print("Y é menor ou igual a: "+cond2+" ");
}else{
System.out.print("Y é maior que: "+cond+"e "+cond2+" ");
}
System.out.println("y = "+y+" ");

}


if(cond < 10 && cond2 < 10){
System.out.println("Ambas as condições são menores que 10");
}
}

}