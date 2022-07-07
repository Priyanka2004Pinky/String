import java.util.*;
class StringRev {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S1 = sc.nextLine();
    String rev = "";
    int len = S1.length();
    for(int i = len-1; i>=0; i--)
    {
        rev = rev + S1.charAt(i);
    }
    System.out.println(rev);
    if(rev.contentEquals(S1))
    {
        System.out.println("S1 is palindrom");
    }
    else
    {
        System.out.println("S1 is not palindrom");
    }
    sc.close();
 }   
}
