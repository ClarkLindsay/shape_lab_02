class Sphere extends ThreeDShape{

   private double radius;

   public Sphere(double radius){
      this.radius = radius;
   }
   
   public final double area(){
      return radius*radius*Math.PI;
   }
   
   public final double volume(){
      return 4*Math.pow(radius,3)*Math.PI/3;
   }
   
   public final double surfaceArea(){
      return 4*radius*radius*Math.PI;
   }
}