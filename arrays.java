
/**
 * arrays
 */
public class arrays {


public static void main(String[] args) {
 //single dm array 
 int [] singleArray ={1,2,3,4};  
 for(int m:singleArray){
    System.out.println(m);
 } 

 // fixed size contineous heap memory
 // arrays are object


 int [] constArray = new int[5];
 constArray[0]=1;
 constArray[1]=3;
 constArray[2]=1;
 constArray[3]=1;
 constArray[4]=1;
 for(int i=0;i<constArray.length;i++){
    System.out.println(constArray[i]);
 }
 

 //2d array
System.out.println("2d array");
 int nums[][]= new int[3][4];
 for(int x[]:nums){
    for(int y:x){
        y = (int) (Math.random() * 100);
        System.out.print(y+" ");
    }
  System.out.println();
 }

 
 //jagged array
System.out.println("jagged array");
 int jg[][]= new int[3][];
 jg[0]=new int[3];
 jg[1]=new int[2];
 jg[2]=new int[4];
 for(int x[]:jg){
    for(int y:x){
        y = (int) (Math.random() * 100);
        System.out.print(y+" ");
    }
  System.out.println();
 }

}    

}