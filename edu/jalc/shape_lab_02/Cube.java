class Cube extends ThreeDShape{

   private double radius;
   private double height;

   public Cube(double radius, double height){
      this.radius = radius;
      this.height = height;
   }
   
   public final double area(){
      return radius*radius;
   }
   
   public final double volume(){
      return radius*radius*height;
   }
   
   public final double surfaceArea(){
      return 6*radius*radius;
   }
}