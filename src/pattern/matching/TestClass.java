package pattern.matching;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        TestClass t = new TestClass();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sting = br.readLine();
        sting = sting.replace(" ","");
        for(int a=0;a<sting.length();a++)
        {
            if(sting.charAt(a)>=0 || sting.charAt(a)<=9)
            {

            }
            else
            {
                System.out.println(1+"");
            }
        }
        try{
            if(sting.equals(null))
        {
            
        }
        }
        catch(NullPointerException e)
        {
         System.out.println(1+"");
        }
        int number = Integer.parseInt(sting);
        if(number<0 && number>10)
        {
         System.out.println(1+"");
         return;
        }
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String input = br1.readLine();
        try
        {
         if(input.equals(null))
         {
             
         }
        }
        catch(NullPointerException n)
        {
           System.out.println(1+"");
           return;
        }
        String s[] = input.split(" "); 
        if(number>s.length || number<s.length)
        {
           System.out.println(1+"");
        }
        int[] arr = new int[s.length];
        for(int i=0;i<arr.length;i++)
        {
         arr[i] = Integer.parseInt(s[i]);
         if(arr[i]>100 || arr[i]<0)
         {
           System.out.println(1+"");
           return;
         }
        }
        int min = arr[0];
        for(int j=1;j<arr.length;j++)
        {
          if(min>arr[j])
          {
              min = arr[j];
          }
        }
        System.out.println(min+"");
    }}

