import java.util.*;
public class Specialnumber {
    public void special(int n)
    {
        boolean flag = false;
        double fmincost = 9999;
        double bmincost = -9999;
        outer:
         for(int i=1; i<=3; i++)
         {
             for(int j=2; j<10; j++)
             {
                double num1 , num2 , sum , diff; 
                 if(j==2||j==3||j==5||j==7)
                 {
                  num1 = Math.pow(j,i);
                   for(int k=2; k<10; k++)
                  {
                 if(k==2||k==3||k==5||k==7)
                 {
                     if(j>k){
                  num2 = Math.pow(k,i); 
                  sum = num1+num2;
                  diff = sum-n;
                  if(diff == 0)
                  {
                      flag = true;
                      break outer;
                      
                  }
                  else if(diff>0)
                  {
                    if(fmincost>diff)
                  {
                      fmincost = diff;
                  }}
                   else{
                    if(bmincost<diff)
                   {
                      bmincost = diff;
                   }
                }
                 }
                }
                  }  
                 }
             }
             
         }    
  if(flag)
           {
               System.out.println("Special Number");
               
           }
           else{
           System.out.println(fmincost);
           System.out.println(-(bmincost));
           }
    }
    public static void main(String[] args) {
        Specialnumber s = new Specialnumber();
        s.special(31);
    }
        }
        
 
