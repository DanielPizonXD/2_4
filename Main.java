import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner d = new Scanner(System.in);
    while(true){
    System.out.println("************  KALKULATOR *****************");
    System.out.println("Wybierz: ");
    System.out.println("1-Suma");
    System.out.println("2-Różnica");
    System.out.println("3-Iloczyn");
    System.out.println("4-iloraz");
    int liczba = d.nextInt();
    

    if(liczba<1 || liczba>4){
        System.out.println("Podaj liczbę od 1 do 4 ");
    }
      else{
    System.out.println("Podaj liczbe a:");
    float a = d.nextFloat();
    System.out.println("Podaj liczbe b:");
    float b = d.nextFloat();
      
    switch(liczba){
      case 1:
        System.out.println("Wynik to : " + (a + b));
        break;
      case 2:
        System.out.println("Wynik to : " + (a - b));
        break;
      case 3:
        System.out.println("Wynik to : " + (a * b));
        break;
      case 4:
        if(b==0){
          System.out.println("Nie można dzielić przez 0-sprobuj ponownie ");
        }
        System.out.println("Wynik to : " + (a / b));
        break;
        }
      }
    }  
  }
}