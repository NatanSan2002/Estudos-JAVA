class Dotcom1 {

    static int hits = 0;
    static int trys = 0;
    static int[] location_cells;

    public static void main(String[] args) {

        location_cells = new int[6];

        int[] sorteio = { (int) (Math.random() * location_cells.length),
                (int) (Math.random() * location_cells.length), (int) (Math.random() * location_cells.length) };

        for (int i = 0; i < 3; ++i) {
            location_cells[i] = sorteio[i];
        }

        for (int i = 0; i < 3 ; ++i) {
            CheckShot(Integer.toString((int) (Math.random() * location_cells.length)));
            System.out.println("test:"+(i+1));

        }

    }

    static void CheckShot(String gue) {

        int guess = Integer.parseInt(gue);
            
                System.out.println("O Usuario Digitou o numero: " + guess);

                boolean aceept = false;

                for(int i = 0;i<location_cells.length;++i){
                    if(guess == location_cells[i]){
                     aceept = true;
                    }
                    }

                ++trys;
                 if (aceept == true) {
                    ++hits;
                    System.out.println("ACERTOU!");
    
                    
                } else {
                    System.out.println("Errou, Tente de novo");
                }
                if (hits >= 3) {
                    System.out.println("Numero de acertos 3/3 Fim de JOGO!!!");
                } else if (trys >= 3) {
                        System.out.println("Numero de Tentativas alcançadas, You LOSE!!!");
                        System.out.println("Numero de Acertos: "+hits);
                    }
            

        

     

        

    }
}