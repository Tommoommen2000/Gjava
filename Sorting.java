import java.util.*;

public class Sorting
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of string you want to enter:");
        n = s.nextInt();
        String words[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        for(int i = 0; i < n; i++)
        {
            words[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (words[i].compareTo(words[j])>0) 
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.print("Sorted Order:\n");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(words[i]);
        }
        System.out.println(words[n - 1]);
    }
}