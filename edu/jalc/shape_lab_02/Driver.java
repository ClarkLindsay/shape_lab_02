public class Driver{

   public static void main(String[] args){
   
   Shape cube1 = new Cube(4, 5);
   ThreeDShape cube2 = new Cube(5, 6);
   Cube cube3 = new Cube(6, 7);
   
   Shape sphere1 = new Sphere(1);
   ThreeDShape sphere2 = new Sphere(2);
   Sphere sphere3 = new Sphere(3);
   
   System.out.println(cube1.area());
   
   System.out.println(cube2.volume());
   
   System.out.println(cube3.surfaceArea());
   
   System.out.println(sphere1.area());
   
   System.out.println(sphere2.volume());
   
   System.out.println(sphere3.surfaceArea());
   }
}