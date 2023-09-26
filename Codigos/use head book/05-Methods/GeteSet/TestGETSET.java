class TestGETSET{
public static void main(String[] args){
/*Cat c1 = new Cat();

c1.SETsize(20);

int s = c1.GETsize();

System.out.println(s);
*/ 

Cat [] cats;
cats = new Cat[7];

cats[0] = new Cat();


cats[0].SETsize(30);
int s = cats[0].GETsize();

System.out.println(s);

}
}