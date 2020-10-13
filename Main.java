import java.util.Scanner;
 public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  
    System.out.println("Hello! welcome to my site whats your name?");
    String name = scan.next();

    System.out.println("What is your age?");
    int age = scan.nextInt();

    System.out.println("Why are you needing help today?");
    String today = scan.next();
    today = today + scan.nextLine();

    System.out.println("Thank you " + name + " you are " + age + " years old" );
    System.out.println("and your problem today is " + today);

    System.out.print("we will get with you as soon as possible");

    






    
    

  }
}
