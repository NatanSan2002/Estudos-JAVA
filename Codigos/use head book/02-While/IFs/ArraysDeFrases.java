public class ArraysDeFrases{
public static void main(String[] args){

// Criando Listas com Palavras aleatorias

String[] word_ListOne = {"roleta","atlético","SP","Jorge","Pintor","Tucano","Baixo","DIOO",
"Street Figther","Joshua","Barqui","Legacy","Kain"};

String[] word_ListTwo = {"Ken","Masters","Cammy","Ryu","Goku","Seiya","Gon","Marvel","Deuteronomio","Revelations","Goetcha","Cabala","Talmud","Link","Past","Awekining","Randomic"};

String[] word_ListTres = {"Alpha","Two","3","Zero","Super","Zeto","PartII","Part1","LevelE","HxH","Neon","Genesis","Evangelion","Carpiter","X","Megaman","Alucard","Bison","Vega"};

// Descobrindo quantas palavras há em cada uma

int list1 = word_ListOne.length;
int list2 = word_ListTwo.length;
int list3 = word_ListTres.length;

int random1 = (int) (Math.random() * list1);
int random2 = (int) (Math.random() * list2);
int random3 = (int) (Math.random() * list3);

String frase = word_ListOne[random1]+" "+word_ListTwo[random2]+" "+word_ListTres[random3];

System.out.print(frase);

}
}