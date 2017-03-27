class Cube extends ThreeDShape{

   private double side;
   private double height;

   public Cube(double side, double height){
      this.side = side;
      this.height = height;
   }
   
   public final double area(){
      return side*side;
   }
   
   public final double volume(){
      return side*side*height;
   }
   
   public final double surfaceArea(){
      return 6*side*side;
   }
}