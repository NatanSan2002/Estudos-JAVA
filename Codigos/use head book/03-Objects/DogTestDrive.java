class Dog {
String name;
int size;
String race;


void Latir(){
System.out.print("AU! AU!"+" "+this.size);
}
}

class DogTestDrive{
public static void main(String[] args){
Dog d = new Dog();

d.size = 40;

d.Latir();
}
}

