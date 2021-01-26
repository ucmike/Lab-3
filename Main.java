import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Please enter a whole number to count down or up from:");
    num = s.nextInt(); //initializing the countdown number
    System.out.println("The countdown will start from " +num);
    if (num > 0) { //this sets the rules for the number greater than 0
      while (num >=0){ //this is the countdown
        System.out.println(num);
        num --;
      } 
    }
      else if (num<0) { //for values less than 0
        while (num <=0){ //this is the count up
        System.out.println(num);
        num ++;
        }
      }
      else {
        System.out.println("This is a short countdown! \n" + num);
      }
  
  System.out.println("Blast Off!");
  }
}