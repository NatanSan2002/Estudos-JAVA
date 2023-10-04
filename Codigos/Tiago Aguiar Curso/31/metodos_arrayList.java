import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class metodos_arrayList {
    

public static void main(String[] args){


List<String> names = new ArrayList<>();

names.add("nome1");
names.add("nome2");
names.add("nome3");
names.add("nome4");



for(int i =0; i <names.size(); ++i ){
System.out.println(names.get(i));
}


System.out.println(names.indexOf("nome3"));// vetor 0,1,2


System.out.println(names.contains("nome5"));

names.clear();

System.out.println(names.isEmpty());

names.add("nome2");
names.add("nome3");
names.add("nome1");
names.add("nome4");


Collections.sort(names);

for(String texto : names){
System.out.println(texto);
}

}




}
