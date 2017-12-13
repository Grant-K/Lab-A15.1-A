import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon{
   private ArrayList <Point2D.Double> myPolygon = new ArrayList <Point2D.Double>();
   // constructors
   public IrregularPolygon() 
   {
   }

   // public methods
   public void add(Point2D.Double aPoint) 
   {
        myPolygon.add(new Point2D.Double(aPoint.getX(),  aPoint.getY()));
   }

   public void draw() 
   {
       SketchPad myPaper = new SketchPad(500, 500);
       DrawingTool myPencil = new DrawingTool(myPaper);
       myPencil.down();
       myPencil.move((myPolygon.get(0)).getX(),(myPolygon.get(0)).getY());
       for(int i = 0; i < myPolygon.size(); i++)
       {
           myPencil.down();
           myPencil.move((myPolygon.get(i)).getX(),(myPolygon.get(i)).getY());
       }
       myPencil.move((myPolygon.get(0)).getX(),(myPolygon.get(0)).getY());
   }

   public double perimeter() 
   {
       double perm = 0;
        for(int i = 1; i < myPolygon.size(); i++)
       {
           perm += myPolygon.get(i).distance(myPolygon.get(i-1));
       }
       perm += myPolygon.get(0).distance(myPolygon.get(myPolygon.size()-1));
       return perm;
   }

   public double area() 
   {
       return 0.0;
   }
   
   public String getName() 
   {
       return "Grant Klees";
   }
}