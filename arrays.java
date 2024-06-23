
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

//array of objects 
 Student s1 = new Student(0, "john");
 Student s2 = new Student(1, "xqc");
 Student s3 = new Student(2, "kai");

 Student []students=new Student[3];

 students[0]=s1;
 students[1]=s2;
 students[2]=s3;

for(Student std:students){
    System.out.println(std.name);
}



}    

}

class Student{
    int rollno;
    String name;
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}