import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int liczba1, liczba2;
     int suma; 
     System.out.println("Podaj 2 liczby");
    Scanner wczytaj = new Scanner(System.in);
    liczba1= wczytaj.nextInt();
    liczba2= wczytaj.nextInt();
    suma=liczba1+liczba2;
      System.out.println("Suma podanych liczb wynosi "+ suma);
     
  }
}