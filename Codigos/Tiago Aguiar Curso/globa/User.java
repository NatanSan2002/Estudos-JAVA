package globa;

public class User {
private String name;
private int age;

private static int geral = 0; 
 


public void SetName(String name){
this.name = name;
}

 public void SetGeral(int geral){ /* Metodo -no-static- é alterada só  atraves de um obj */
    this.geral += geral;
    } 

    public static void SetGeral2(int i){ /* Metodo -static- é alterada pela Classe */
        geral += i;
    }

public String GetDetails(){
return this.name+" "+ this.age+" geral:"+this.geral; 
}

public String GetDetails(boolean Allinfos){
if(Allinfos){
return GetDetails();
}else {
return this.name;
}
}

public User(String name, int age ){
this.name = name;
this.age = age;
}

public String toString(){
return "{Nome: "+ this.name +" Idade: "+this.age+"}"; /* subscrevendo metodo */
}

}
