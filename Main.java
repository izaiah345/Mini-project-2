
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello! welcome to tech support whats your name?");
    String name = scan.next();

    System.out.println("What is your age?");
    int age = scan.nextInt();
    // I did age so someone who can be tought what they need to know 
    System.out.println("Why are you needing help today? 1-computer power on 2-computer frezze");
    int issue = scan.nextInt();
    
    issue=1;
    issue=2;
    
    System.out.println( issue == issue );
     issue = 1;

      System.out.println( issue &= issue );
      issue = 2;

      System.out.println( issue != issue );
      //this determines what is there problem
    System.out.println("Thank you " + name + " you are " + age + " years old");
    System.out.println("and your problem today is " + issue);

    System.out.println("An IT Tech will be with you as soon as possible");


    System.out.println("Can you please rate our serverices?");
    
    int count = 1;
    while (count <= 10)
    {
    System.out.println(count);
    count++;
    }
    //this determines if they would want to rate our service 




  }
}
