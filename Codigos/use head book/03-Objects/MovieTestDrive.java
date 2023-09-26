class Movie{
String title;
String genre;
int rating;

void Watch(){
System.out.print("Film has been watching...");
System.out.println("Infos: title: "+this.title+" genre: "+this.genre+" rating: "+this.rating);
}
}

 class MovieTestDrive{
public static void main(String[] args){
Movie one = new Movie();

one.title =  "Spider-Man";
one.genre = "Action";
one.rating = -2;

Movie two = new Movie();

two.title = "I Lost";
two.genre = "Fear";
two.rating = 5;

two.Watch();

Movie tres = new Movie();

tres.title = "Super Mario Bros Movie";
tres.genre = "Adventure";
tres.rating = 127;


}
}