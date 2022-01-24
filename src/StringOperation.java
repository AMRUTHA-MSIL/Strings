import java.util.*;
class StringOperation
{
    public static void main(String[] args)
    {
        String first="",second="";
        Scanner sc=new Scanner(System.in);
        System.out.println("String Operation");
        System.out.println();
        System.out.print("Enter the first Sting: ");
        first=sc.nextLine();
        System.out.print("Enter the second Sting: ");
        second=sc.nextLine();
        System.out.println("The strings are: "+first+" , "+second);
        System.out.println("The length of the first string is :"+first.length());
        System.out.println("The length of the second string is :"+second.length());
        String whiteremove=first.replaceAll("\\s", "");
        System.out.println("fist string after removing whitespace is:-"+whiteremove);
        System.out.println("The concatenation of first and second string is :"+first.concat(" "+second));
        System.out.println("The first character of " +first+" is: "+first.charAt(0));
        System.out.println("The uppercase of " +first+" is: "+first.toUpperCase());
        System.out.println("The lowercase of " +first+" is: "+first.toLowerCase());
        System.out.print("Enter the occurance of a character in "+first+" : ");
        String str=sc.next();
        char c=str.charAt(0);
        System.out.println("The "+c+" occurs at position " + first.indexOf(c)+ " in " + first);
      //  System.out.println("The substring of "+first+" starting from index 3 and ending at 6 is: " + first.substring(3,7));
        System.out.println("Replacing 'a' with 'o' in "+first+" is: "+first.replace('a','o'));
        boolean check=first.equals(second);
        if(!check)
            System.out.println(first + " and " + second + " are not same.");
        else
            System.out.println(first + " and " + second + " are same.");
    }
}
