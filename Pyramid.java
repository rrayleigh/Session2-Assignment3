package test;
public class Pyramid {
 
        public static void main(String[] args) {
               
                for(int i=1; i<= 5 ;i++){
                       
                        for(int j=1; j <= i; j++){
                                System.out.print(j);
                        }
                       
                        //generate a new line
                        System.out.println("");
                }
               
                //create second half of pyramid
                for(int i=5; i>0 ;i--){
                       
                        for(int j=1; j < i; j++){
                                System.out.print(j);
                        }
                       
                        //generate a new line
                        System.out.println("");
                }
 
        }
}