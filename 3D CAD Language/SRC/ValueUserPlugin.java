import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.scene.shape.Shape3D;
import java.util.HashMap;

import javafx.scene.paint.Material;


public class ValueUserPlugin implements ValueUserPluginInterface {


  int nextFreeHandle = 1;
  HashMap<Shape3D, Integer> objectToHandle  = new HashMap<Shape3D, Integer>();
  HashMap<Integer, Shape3D> handleToObject  = new HashMap<Integer, Shape3D>();




  public void addMap(Shape3D shape) {

    objectToHandle.put(shape, nextFreeHandle);
    handleToObject.put(nextFreeHandle, shape);
    nextFreeHandle++;
    
  }


  @Override
  public String name() {
      return "3CAD";
  }

  @Override
  public Value user(Value... args) throws ARTException {

    final int windowX = 800;
    final int windowY = 600;  


    Stage stage = new Stage();

    Group root = new Group();  
    





    switch((int) args[0].value()){

      case 1: // create a sphere object

        Sphere sphere = new Sphere();  
        sphere.setRadius((int) args[1].value());   
        sphere.setTranslateX(-300); 
        sphere.setTranslateY(-200); 
        addMap(sphere);

        return new __int32(objectToHandle.get(sphere));


      case 2: // create a cuboid object   

        Box box = new Box(); 
        box.setWidth((int) args[1].value());
        box.setHeight((int) args[2].value()); 
        box.setDepth((int) args[3].value()); 
        box.setTranslateX(-300); 
        box.setTranslateY(-200); 
        addMap(box);

        return new __int32(objectToHandle.get(box));

      case 3: // create a cylinder object  
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius((int) args[1].value());
        cylinder.setHeight((int) args[2].value()); 
        cylinder.setTranslateX(-300); 
        cylinder.setTranslateY(-200); 

        addMap(cylinder);
        return new __int32(objectToHandle.get(cylinder));





      case 4: // display the current objects  

      stage.setTitle(String.valueOf("3CAD example"));

      // Create camera and move it away from the origin
      PerspectiveCamera camera = new PerspectiveCamera(false);
      camera.setTranslateX(-0.25 * windowX);
      camera.setTranslateY(-1 * windowY);
      
  
      for(int i = 1; i <= nextFreeHandle - 1; i++){
        
        root.getChildren().addAll(handleToObject.get(i));
        
        }
  
        Scene scene = new Scene(root, 1000, 1000, true); 
        scene.setCamera(camera); // Put the camera into the s  cene
   
        stage.setScene(scene); 
        stage.show(); 

        nextFreeHandle = 1;
        objectToHandle  = new HashMap<Shape3D, Integer>();
        handleToObject  = new HashMap<Integer, Shape3D>();



        return new __done();

      case 5: // Translate a shape 

        

        double oldXCoordinate= handleToObject.get((int) args[1].value()).getTranslateX();
        double oldYCoordinate = handleToObject.get((int) args[1].value()).getTranslateY();

        handleToObject.get((int) args[1].value()).setTranslateX(((int) args[2].value()) + oldXCoordinate);
        handleToObject.get((int) args[1].value()).setTranslateY(((int) args[3].value())+ oldYCoordinate);
        

        return new __done();  

            
        
      
  
      case 6: // Change the colour of a shape

        final PhongMaterial material = new PhongMaterial();


        Color color = Color.rgb((int) args[2].value(), (int) args[3].value(), (int) args[4].value(), (int) args[5].value());



        material.setDiffuseColor(color);
        material.setSpecularColor(color);

        
        handleToObject.get((int) args[1].value()).setMaterial(material);


        return new __done(); 


        
         
         
        case 7: // Scale an objects dimensions

        Object newShape = (Object) handleToObject.get((int) args[1].value());


        if(newShape instanceof Sphere){     

        Sphere tempShape = (Sphere) newShape;

        double oldRadius = tempShape.getRadius();

        tempShape.setRadius(((int) args[2].value())*oldRadius);

          }
  
        if(newShape instanceof Box){  

        Box tempShape = (Box) newShape;
        double oldHeight = tempShape.getHeight();
        double oldWidth = tempShape.getWidth();
        double oldDepth = tempShape.getDepth();

        tempShape.setHeight(((int) args[2].value())*oldHeight);
        tempShape.setWidth(((int) args[2].value())*oldWidth);
        tempShape.setDepth(((int) args[2].value())*oldDepth);

          }
  
        if(newShape instanceof Cylinder){
            
        Cylinder tempShape = (Cylinder) newShape;
        double oldHeight = tempShape.getHeight();
        double oldRadius = tempShape.getRadius();

        tempShape.setHeight(((int) args[2].value())*oldHeight);
        tempShape.setRadius(((int) args[2].value())*oldRadius);


          }
        
        return new __done();  

          
        case 8: //duplicate and object

        newShape = (Object) handleToObject.get((int) args[1].value());

          
        if(newShape instanceof Sphere){     

          Sphere tempSphere = (Sphere) newShape;

          double radius = tempSphere.getRadius();

          double oldX = tempSphere.getTranslateX();
          double oldY = tempSphere.getTranslateY();
          Material oldMaterial = tempSphere.getMaterial();


          tempSphere = new Sphere(radius);
          tempSphere.setTranslateX(oldX);
          tempSphere.setTranslateY(oldY);
          tempSphere.setMaterial(oldMaterial);
          



          addMap(tempSphere);



          }

          
          if(newShape instanceof Cylinder){ 
              




            Cylinder tempCylinder = (Cylinder) newShape;

            double side = tempCylinder.getHeight();
            double radius = tempCylinder.getRadius();

            double oldX = tempCylinder.getTranslateX();
            double oldY = tempCylinder.getTranslateY();
            Material oldMaterial = tempCylinder.getMaterial();
            
            tempCylinder = new Cylinder(radius, side);
            tempCylinder.setTranslateX(oldX);
            tempCylinder.setTranslateY(oldY);
            tempCylinder.setMaterial(oldMaterial);
    
            addMap(tempCylinder);
    
    
    
          }

          if(newShape instanceof Box){     

            Box tempBox = (Box) newShape;
  
            double side1 = tempBox.getHeight();
            double side2 = tempBox.getWidth();
            double side3 = tempBox.getDepth();

            
            double oldX = tempBox.getTranslateX();
            double oldY = tempBox.getTranslateY();
            Material oldMaterial = tempBox.getMaterial();

            tempBox = new Box(side1, side2, side3);
            tempBox.setTranslateX(oldX);
            tempBox.setTranslateY(oldY);
            tempBox.setMaterial(oldMaterial);
  
            addMap(tempBox);
  
  
  
            }

          return new __done();

          


        



              
          
  }




 


  return new __done();
}








}
