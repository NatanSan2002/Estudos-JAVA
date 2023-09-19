 class Char {

private String name;
private int age; 
private int level;


public Char(String name,int age, int level){
this.name = name;
this.age = age;
this.level = level;

Infos();
}

public void Infos(){
System.out.println(" Details: "+this.name + " "+this.age+" "+this.level);
}

}
