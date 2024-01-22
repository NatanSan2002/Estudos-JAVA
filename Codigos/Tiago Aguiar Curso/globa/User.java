package globa;

public class User {
private String name;
private int age;

public String GetDetails(){
return this.name+" "+ this.age; 
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
