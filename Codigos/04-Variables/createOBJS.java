class createOBJS{

public static void main(String[] args){

RefOBJS b = new RefOBJS();
RefOBJS c = new RefOBJS();
RefOBJS d = c;

b.ObjNum(1);
d.ObjNum(2);
c = null;
System.out.println(c);


}
}