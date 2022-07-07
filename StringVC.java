import java.util.*;
class StringVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String S1 = sc.nextLine();
        int VowelCount = 0, ConsonentCount=0;
        for(int i=0; i<=S1.length()-1; i++)
        {
        if(S1.charAt(i)=='a'||S1.charAt(i)=='e'||S1.charAt(i)=='i'||S1.charAt(i)=='o'||S1.charAt(i)=='u'||
           S1.charAt(i)=='A'||S1.charAt(i)=='E'||S1.charAt(i)=='I'||S1.charAt(i)=='O'||S1.charAt(i)=='U')
        {
            VowelCount++;
        }
        else
        {
            ConsonentCount++;
        }
        }
        sc.close();
        System.out.println("Total Vowel = " + VowelCount);
        System.out.println("Total Consonent = " + ConsonentCount);
    }
}
