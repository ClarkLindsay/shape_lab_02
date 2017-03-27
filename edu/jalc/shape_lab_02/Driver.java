public class Driver{

   public static void main(String[] args){
   
   Shape cube1 = new Cube(4, 5);
   ThreeDShape cube2 = new Cube(5, 6);
   Cube cube3 = new Cube(6, 7);
   
   System.out.println(cube1.area());
   
   System.out.println(cube2.volume());
   
   System.out.println(cube3.surfaceArea());
   }
}