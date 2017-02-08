/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleexercise;

/**
 *
 * @author Jonathan
 */
public class Controller {
    public Controller(){
        
    }
    
    public int calcTriangle(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return -1;
        }
        else if(a+b <= c || a+c <= b || b+c <= a){
            return -1;
        }
         else  if(a != b && a!= c && b!=c){
            return 3;
        }
         else if(a == b && b!=c || a == c && c!=b || b == c && b!=a){
             return 2;
         }
         else if(a == b && b==c){
             return 1;
         }  
        return -100;
    }
}
