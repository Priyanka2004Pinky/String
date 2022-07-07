import java.util.*;
class StringOccur {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String S1 = sc.nextLine();
    System.out.println("Enter the SubString to be found");
    int a = S1.lastIndexOf(sc.nextLine());
    if(a == -1)
    {
        System.out.println("SubString not found");
    }
    else
    {
        System.out.println("SubString index is : " + a);
    }
 }
}

