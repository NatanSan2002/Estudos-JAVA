class Dotcom1{
public static void main(String [] args){

 int [] location_cells;
 location_cells = new int[6];
 location_cells[(int) (Math.random() * location_cells.length )] = true; 

 /*Criar outro array com 3 numeros random e colocar seus valores nos vetores do location cells */
int hits;


for(int i = 0; i<location_cells.length; ++i){
 CheckShot( Integer.toString((int) (Math.random() * location_cells.length )));
}

}

static String CheckShot(String gue){

int guess = Integer.parseInt(gue);

return "abc";
}

//void SetLocationCells(int[] loc){}


}