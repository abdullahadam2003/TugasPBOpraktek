/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequentialsearch;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author windows
 */
public class Bublesort {
    public static void main(String[] args) {
        int [] data;
        int n,i,x,temp,j;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Banya data = ");
        n = in.nextInt();
        data = new int[n];
        //mengisi array 
        System.out.println("===isi array senelum di urutkan===");
        int enter =0;
        for(i=0;i<n;i++)
        {
            data[i]=rand.nextInt(100)+1;
             //int enter ==i%10;
            System.out.println(data[i]+"\t");
            
        }
        //bublesort
        for(i=0;i<n;i++)
        { 
            for(j=n-1;j>=i+1;j--)
            {
                if(data[j]<data[j-1])//tukar
                {temp=data[j];
                data[j] = data[j-1];
                data[j-1] =temp;
                }       
            }
           
        }
          System.out.println("===isi array setelah di urutkan===");
   
        for(i=0;i<n;i++)
        {
           
            System.out.println(data[i]+"\t");
            
        }
    }
    
}
