import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{
   private ArrayList <Point2D.Double> myPolygon = new ArrayList <Point2D.Double>();
   private SketchPad myPaper;
   private DrawingTool myPen;
   // constructors
   public IrregularPolygon() 
   {
       myPolygon.add((new Point2D.Double(2.0, 1.0)));
       myPolygon.add((new Point2D.Double(50.0, 1.0)));
       myPaper = new SketchPad(500,500);
       myPen = new DrawingTool(myPaper);
       //        Point2D.Double from = new Point2D.Double(70, 20);
       //        Point2D.Double from = new Point2D.Double(50, 50);
       //        Point2D.Double from = new Point2D.Double(0, 40);
   }

   // public methods
   public void add(Point2D.Double aPoint) 
   {
       myPolygon.add(aPoint);
   }

   public void draw() 
   {
       myPen.up();
       myPen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
       myPen.down();
 
       for(int i = 1; i < myPolygon.size(); i++)
       {
           myPen.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
       }
   }

   public double perimeter() 
   {
       double perim = 0;
       for(int i = 0; i < myPolygon.size() - 1; i++)
       {
           perim += ((Point2D.Double)myPolygon.get(i)).distance((Point2D.Double)myPolygon.get(i + 1));
       }
       return perim;
    }

   public double area() 
   {
       return 0.0;
    
   }
}