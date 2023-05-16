public class Cao{
String name;
int size;


void Latir(int vezes){
if(size > 30 ){
for(int i = 0; i < vezes; ++i ){
System.out.println("I am "+this.name+", and I More size that: "+size+"size!!!");
}
}else {
for(int i = 0; i < vezes; ++i ){
    System.out.println("I am "+this.name+", and I small size that: "+size+"size...");
}
}
}
}