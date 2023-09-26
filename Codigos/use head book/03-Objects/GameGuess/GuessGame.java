public class GuessGame{
Player p1;
Player p2;
Player p3;

public void StartGame(){
p1 = new Player();
p2 = new Player();
p3 = new Player();

int guess_p1 = 0;
int guess_p2 = 0;
int guess_p3 = 0;

boolean p1isRight = false;
boolean p2isRight = false;
boolean p3isRight = false;

int target_number = (int) (Math.random() * 10);

System.out.println("Estoun Pensando em um numero entre 0 e 9...");

while(true){
System.out.println("O numero a advinhar é "+ target_number);

p1.guess();
p2.guess();
p3.guess();

guess_p1 = p1.number;
System.out.println("o Jogador 1 disse o palpite: "+guess_p1);
guess_p2 = p2.number;
System.out.println("o Jogador 2 disse o palpite: "+guess_p2);
guess_p3 = p3.number;
System.out.println("o Jogador 3 disse o palpite: "+guess_p3);

if(guess_p1 == target_number){
p1isRight = true;
}
if(guess_p2 == target_number){
p2isRight = true;
}
if(guess_p3 == target_number){
p3isRight = true;
}

if(p1isRight || p2isRight || p3isRight){
System.out.println("Temos um Vencedor!");
System.out.println("O Player 1 Acertou? "+p1isRight);
System.out.println("O Player 2 Acertou? "+p2isRight);
System.out.println("O Player 3 Acertou? "+p3isRight);
System.out.println("Game Over");
break;
}else{
System.out.println("Os Jogadores tentaram novamente!");

}


}

}
}