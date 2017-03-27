abstract class ThreeDShape extends Shape{

   abstract double volume();

   public final boolean equals(ThreeDShape other){
      return this.area() == other.area();
   }
}