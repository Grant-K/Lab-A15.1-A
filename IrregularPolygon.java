import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
// import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{
   private ArrayList <Point2D.Double> myPolygon = new ArrayList <Point2D.Double>();
   int counter;
   // constructors
   public IrregularPolygon() 
   {
       myPolygon.add((new Point2D.Double(20.0, 10.0)));
       myPolygon.add((new Point2D.Double(70.0, 20.0)));
       myPolygon.add((new Point2D.Double(50.0, 50.0)));
       myPolygon.add((new Point2D.Double(0.0, 40.0)));
       for(Point2D.Double pt : myPolygon)
       {
           counter += 1;
           System.out.println(counter + " X:" + pt.getX() + " Y:" + pt.getY());
       }
   }

   // public methods
   public void add(Point2D.Double aPoint) 
   {
   }

   public void draw() 
   {
   }

   public double perimeter() 
   {
       return 0.0;
   }

   public double area() 
   {
       return 0.0;
    
   }
}