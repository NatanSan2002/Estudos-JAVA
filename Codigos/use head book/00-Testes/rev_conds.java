public class rev_conds {
 
public static void main(String[] args){

int x = Integer.parseInt(args[1]);
int y = Integer.parseInt(args[2]);

if(args[0].equals("Soma")){
System.out.println(Soma(x,y));
}else if (args[0].equals("Subtracao")){
    System.out.println(Subtracao(x,y)); 
}else if (args[0].equals("Vezes")){
    System.out.println(Vezes(x,y)); 
}else if (args[0].equals("Div")){
    System.out.println(Div(x,y));
}else {
System.out.println("Dont Operation has selecet."+" "+args[0]);

}
}


static int Soma(int x, int y){
return x + y;
}

static int Subtracao(int x, int y){
return x - y;
}

static int Vezes(int x, int y){
return x * y;
}

static int Div(int x, int y){
return x / y;
}
}
