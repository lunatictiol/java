public class LearnGenerics {

    public static void main(String[] args) {
     Student<String> std1 = new Student<>("ssssss");
    Student<Integer> std2 = new Student<>(1222222);
    Student<Float>   std3 = new Student<>(2.22222f);
        System.out.println(std1.id.getClass() +" "+ std1.getId());
        System.out.println(std2.id.getClass() +" "+ std2.getId());
        System.out.println(std3.id.getClass() +" "+ std3.getId());
     getData("sssss");
     getData(122222);
     getData(1.2);
     getData(2.4f);
     getData(std1);
     bounded(2);
     bounded(2.2);
     bounded(1.2f);
     //not acceptable
     //bounded("1111");
    }

  //generic methods
   static <E> void getData(E data){
       System.out.println(data);
   }
   static <T extends Number> void bounded(T num1){
       System.out.println(num1.getClass());
   }

}


//generic entity
class Student<T>{
    T id;
    public Student(T id){
        this.id = id;
    }

    T getId(){
        return id;
    }
}
