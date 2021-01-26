import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Please enter a whole number to count down or up from:");
    num = s.nextInt();
    System.out.println("The countdown will start from " +num);
    if (num >= 0) {
      while (num >=0){
        System.out.println(num);
        num --;
      } 
    }
      else {
        while (num <=0){
        System.out.println(num);
        num ++;
        }
      }
  
      

      
    
  
  System.out.println("Blast Off!");
  }
}