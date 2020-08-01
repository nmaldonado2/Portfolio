import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Region;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.*;
import javafx.geometry.Orientation;
import javafx.scene.text.*;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.paint.Color;
import java.util.Random;
import java.io.*;

public class BlockChallenge extends Application{
  Image image1;
  Image image2;
  Image image3;
  
  ImageView block100Num1;
  ImageView block100Num2;
  ImageView block100Num3;
  ImageView block100Num4;
  ImageView block100Num5;
  ImageView block100Num6;
  ImageView block100Num7;
  ImageView block100Num8;
  ImageView block100Num9;
  ImageView block100Num10;
  
  ImageView block10Num1;
  ImageView block10Num2;
  ImageView block10Num3;
  ImageView block10Num4;
  ImageView block10Num5;
  ImageView block10Num6;
  ImageView block10Num7;
  ImageView block10Num8;
  ImageView block10Num9;
  ImageView block10Num10;
  
  ImageView block1Num1;
  ImageView block1Num2;
  ImageView block1Num3;
  ImageView block1Num4;
  ImageView block1Num5;
  ImageView block1Num6;
  ImageView block1Num7;
  ImageView block1Num8;
  ImageView block1Num9;
  ImageView block1Num10;
  
  int counter100Block = 0;
  int counter10Block = 0;
  int counter1Block = 0;
  TextField updatingCounter;
  int currentNum = 0;
  
  int randNum1 = 0;
  int randNum2 = 0;
  String operator = "";
  Text questionText;
  Text answerText;
  Button btnNext;
  Button btnSubmit;
  Button btnClear;
  
  
  public void importImages(){
    try{
    FileInputStream input = new FileInputStream("images/100sBlock.png");
    image1 = new Image(input);
      
    FileInputStream input2 = new FileInputStream("images/10sBlock.png");
    image2 = new Image(input2);
    
    FileInputStream input3 = new FileInputStream("images/1sBlock.png");
    image3 = new Image(input3);
    }
    catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
  
  
  public VBox addLeftVBox(){
    ImageView image100Block = new ImageView(image1);

    image100Block.setPreserveRatio(true);
    image100Block.setFitHeight(100);

    Text text100Block = new Text("100s Block");
    text100Block.setFont(Font.font("Arial", FontWeight.BOLD, 18));

    Button btnAdd100 = new Button("Add");
    Button btnRemove100 = new Button("Remove");
    
    btnAdd100.setOnAction(e -> btnAddClicked(100));
    btnRemove100.setOnAction(e -> btnRemoveClicked(100));
    
    ImageView image10Block = new ImageView(image2);
    
    image10Block.setPreserveRatio(true);
    image10Block.setFitHeight(100);
    
    Text text10Block = new Text("10s Block");
    text10Block.setFont(Font.font("Arial", FontWeight.BOLD, 18));
    
    Button btnAdd10 = new Button("Add");
    Button btnRemove10 = new Button("Remove");
    
    btnAdd10.setOnAction(e -> btnAddClicked(10));
    btnRemove10.setOnAction(e -> btnRemoveClicked(10));
    
    ImageView image1Block = new ImageView(image3);
    
    image1Block.setPreserveRatio(true);
    image1Block.setFitHeight(70);
    
    Text text1Block = new Text("1s Block");
    text1Block.setFont(Font.font("Arial", FontWeight.BOLD, 18));
    
    Button btnAdd1 = new Button("Add");
    Button btnRemove1 = new Button("Remove");
    
    btnAdd1.setOnAction(e -> btnAddClicked(1));
    btnRemove1.setOnAction(e -> btnRemoveClicked(1));
    
    Region spacer1 = new Region();
    VBox.setVgrow(spacer1, Priority.ALWAYS);
    
    Region spacer2 = new Region();
    VBox.setVgrow(spacer2, Priority.ALWAYS);
    
    Region spacer3 = new Region();
    VBox.setVgrow(spacer3, Priority.ALWAYS);
    
    Region spacer4 = new Region();
    VBox.setVgrow(spacer4, Priority.ALWAYS);
    
    VBox blockPane = new VBox(10, spacer1, image100Block, text100Block, btnAdd100, btnRemove100, spacer2, image10Block, text10Block, btnAdd10, btnRemove10, spacer3, image1Block, text1Block, btnAdd1, btnRemove1, spacer4);
    
    blockPane.setPadding(new Insets(0, 20, 0, 20));
    blockPane.setAlignment(Pos.CENTER);
    blockPane.setBackground(new Background(new BackgroundFill(Color.rgb(183,247,243), CornerRadii.EMPTY, Insets.EMPTY)));
    
    //Insets(UP, RIGHT, BOTTOM, LEFT)
    return blockPane;
  }
  
  public void btnAddClicked(int btnNum){
    if(btnNum == 100){
 
      if(counter100Block < 10){
        counter100Block++;
    
        switch(counter100Block){
          case 1:
            block100Num1.setVisible(true);
            break;
          case 2:
            block100Num2.setVisible(true);
            break;
          case 3:
            block100Num3.setVisible(true);
            break;
          case 4:
            block100Num4.setVisible(true);
            break;
          case 5:
            block100Num5.setVisible(true);
            break;
          case 6:
            block100Num6.setVisible(true);
            break;
          case 7:
            block100Num7.setVisible(true);
            break;
          case 8:
            block100Num8.setVisible(true);
            break;
          case 9:
            block100Num9.setVisible(true);
            break;
          case 10:
            block100Num10.setVisible(true);
            break;
        }
        currentNum += 100;
      }
    }
    else if(btnNum == 10){
  
      if(counter10Block < 10){
        counter10Block++;

        switch(counter10Block){
          case 1:
            block10Num1.setVisible(true);
            break;
          case 2:
            block10Num2.setVisible(true);
            break;
          case 3:
            block10Num3.setVisible(true);
            break;
          case 4:
            block10Num4.setVisible(true);
            break;
          case 5:
            block10Num5.setVisible(true);
            break;
          case 6:
            block10Num6.setVisible(true);
            break;
          case 7:
            block10Num7.setVisible(true);
            break;
          case 8:
            block10Num8.setVisible(true);
            break;
          case 9:
            block10Num9.setVisible(true);
            break;
          case 10:
            block10Num10.setVisible(true);
            break;
        }
        currentNum += 10;
      }
    }
    else if(btnNum == 1){
  
      if(counter1Block < 10){
        counter1Block++;
      
        switch(counter1Block){
          case 1:
            block1Num1.setVisible(true);
            break;
          case 2:
            block1Num2.setVisible(true);
            break;
          case 3:
            block1Num3.setVisible(true);
            break;
          case 4:
            block1Num4.setVisible(true);
            break;
          case 5:
            block1Num5.setVisible(true);
            break;
          case 6:
            block1Num6.setVisible(true);
            break;
          case 7:
            block1Num7.setVisible(true);
            break;
          case 8:
            block1Num8.setVisible(true);
            break;
          case 9:
            block1Num9.setVisible(true);
            break;
          case 10:
            block1Num10.setVisible(true);
            break;
        }
        currentNum += 1;
      }
    }
    updatingCounter.setText(Integer.toString(currentNum));
  }
  
  public void btnRemoveClicked(int btnNum){
    if(btnNum == 100){
      
      if(counter100Block > 0){
        switch(counter100Block){
          case 1:
            block100Num1.setVisible(false);
            break;
          case 2:
            block100Num2.setVisible(false);
            break;
          case 3:
            block100Num3.setVisible(false);
            break;
          case 4:
            block100Num4.setVisible(false);
            break;
          case 5:
            block100Num5.setVisible(false);
            break;
          case 6:
            block100Num6.setVisible(false);
            break;
          case 7:
            block100Num7.setVisible(false);
            break;
          case 8:
            block100Num8.setVisible(false);
            break;
          case 9:
            block100Num9.setVisible(false);
            break;
          case 10:
            block100Num10.setVisible(false);
            break;
          default:
        }
        counter100Block--;
        currentNum -= 100;
      }
    }
    else if(btnNum == 10){
      
      if(counter10Block > 0){
        switch(counter10Block){
          case 1:
            block10Num1.setVisible(false);
            break;
          case 2:
            block10Num2.setVisible(false);
            break;
          case 3:
            block10Num3.setVisible(false);
            break;
          case 4:
            block10Num4.setVisible(false);
            break;
          case 5:
            block10Num5.setVisible(false);
            break;
          case 6:
            block10Num6.setVisible(false);
            break;
          case 7:
            block10Num7.setVisible(false);
            break;
          case 8:
            block10Num8.setVisible(false);
            break;
          case 9:
            block10Num9.setVisible(false);
            break;
          case 10:
            block10Num10.setVisible(false);
            break;
          default:
        }
        counter10Block--;
        currentNum -= 10;
      }
    }
    else if(btnNum == 1){
      
      if(counter1Block > 0){
        switch(counter1Block){
          case 1:
            block1Num1.setVisible(false);
            break;
          case 2:
            block1Num2.setVisible(false);
            break;
          case 3:
            block1Num3.setVisible(false);
            break;
          case 4:
            block1Num4.setVisible(false);
            break;
          case 5:
            block1Num5.setVisible(false);
            break;
          case 6:
            block1Num6.setVisible(false);
            break;
          case 7:
            block1Num7.setVisible(false);
            break;
          case 8:
            block1Num8.setVisible(false);
            break;
          case 9:
            block1Num9.setVisible(false);
            break;
          case 10:
            block1Num10.setVisible(false);
            break;
          default:
        }
        counter1Block--;
        currentNum -= 1;
      }
    }
    updatingCounter.setText(Integer.toString(currentNum));
  }
  
  public void add100BlockFlowPane(GridPane mainGridPane){    
    block100Num1 = new ImageView(image1);
    block100Num2 = new ImageView(image1);
    block100Num3 = new ImageView(image1);
    block100Num4 = new ImageView(image1);
    block100Num5 = new ImageView(image1);
    block100Num6 = new ImageView(image1);
    block100Num7 = new ImageView(image1);
    block100Num8 = new ImageView(image1);
    block100Num9 = new ImageView(image1);
    block100Num10 = new ImageView(image1);
    
    block100Num1.setPreserveRatio(true);
    block100Num2.setPreserveRatio(true);
    block100Num3.setPreserveRatio(true);
    block100Num4.setPreserveRatio(true);
    block100Num5.setPreserveRatio(true);
    block100Num6.setPreserveRatio(true);
    block100Num7.setPreserveRatio(true);
    block100Num8.setPreserveRatio(true);
    block100Num9.setPreserveRatio(true);
    block100Num10.setPreserveRatio(true);
    
    block100Num1.setFitHeight(100);
    block100Num2.setFitHeight(100);
    block100Num3.setFitHeight(100);
    block100Num4.setFitHeight(100);
    block100Num5.setFitHeight(100);
    block100Num6.setFitHeight(100);
    block100Num7.setFitHeight(100);
    block100Num8.setFitHeight(100);
    block100Num9.setFitHeight(100);
    block100Num10.setFitHeight(100);
    
    block100Num1.setVisible(false);
    block100Num2.setVisible(false);
    block100Num3.setVisible(false);
    block100Num4.setVisible(false);
    block100Num5.setVisible(false);
    block100Num6.setVisible(false);
    block100Num7.setVisible(false);
    block100Num8.setVisible(false);
    block100Num9.setVisible(false);
    block100Num10.setVisible(false);
    
    FlowPane pane100Block = new FlowPane(Orientation.HORIZONTAL, block100Num1, block100Num2, block100Num3, block100Num4, block100Num5, block100Num6, block100Num7, block100Num8, block100Num9, block100Num10);
    
    pane100Block.setHgap(10);
    pane100Block.setVgap(10);

    pane100Block.setAlignment(Pos.CENTER_LEFT);
    
    mainGridPane.add(pane100Block, 0, 0);
  }
  
  public void add10BlockFlowPane(GridPane secondaryGridPane){
    
    block10Num1 = new ImageView(image2);
    block10Num2 = new ImageView(image2);
    block10Num3 = new ImageView(image2);
    block10Num4 = new ImageView(image2);
    block10Num5 = new ImageView(image2);
    block10Num6 = new ImageView(image2);
    block10Num7 = new ImageView(image2);
    block10Num8 = new ImageView(image2);
    block10Num9 = new ImageView(image2);
    block10Num10 = new ImageView(image2);
    
    block10Num1.setPreserveRatio(true);
    block10Num2.setPreserveRatio(true);
    block10Num3.setPreserveRatio(true);
    block10Num4.setPreserveRatio(true);
    block10Num5.setPreserveRatio(true);
    block10Num6.setPreserveRatio(true);
    block10Num7.setPreserveRatio(true);
    block10Num8.setPreserveRatio(true);
    block10Num9.setPreserveRatio(true);
    block10Num10.setPreserveRatio(true);
    
    block10Num1.setFitHeight(140);
    block10Num2.setFitHeight(140);
    block10Num3.setFitHeight(140);
    block10Num4.setFitHeight(140);
    block10Num5.setFitHeight(140);
    block10Num6.setFitHeight(140);
    block10Num7.setFitHeight(140);
    block10Num8.setFitHeight(140);
    block10Num9.setFitHeight(140);
    block10Num10.setFitHeight(140);
    
    block10Num1.setVisible(false);
    block10Num2.setVisible(false);
    block10Num3.setVisible(false);
    block10Num4.setVisible(false);
    block10Num5.setVisible(false);
    block10Num6.setVisible(false);
    block10Num7.setVisible(false);
    block10Num8.setVisible(false);
    block10Num9.setVisible(false);
    block10Num10.setVisible(false);
    
    
    FlowPane pane10Block = new FlowPane(Orientation.HORIZONTAL, block10Num1, block10Num2, block10Num3, block10Num4, block10Num5, block10Num6, block10Num7, block10Num8, block10Num9, block10Num10);
    
    pane10Block.setVgap(10);
    pane10Block.setHgap(10);
    
    pane10Block.setAlignment(Pos.CENTER_LEFT);
    
    secondaryGridPane.add(pane10Block, 0, 0);
  }
  
  public void add1BlockFlowPane(GridPane secondaryGridPane){
    
    block1Num1 = new ImageView(image3);
    block1Num2 = new ImageView(image3);
    block1Num3 = new ImageView(image3);
    block1Num4 = new ImageView(image3);
    block1Num5 = new ImageView(image3);
    block1Num6 = new ImageView(image3);
    block1Num7 = new ImageView(image3);
    block1Num8 = new ImageView(image3);
    block1Num9 = new ImageView(image3);
    block1Num10 = new ImageView(image3);
    
    block1Num1.setPreserveRatio(true);
    block1Num2.setPreserveRatio(true);
    block1Num3.setPreserveRatio(true);
    block1Num4.setPreserveRatio(true);
    block1Num5.setPreserveRatio(true);
    block1Num6.setPreserveRatio(true);
    block1Num7.setPreserveRatio(true);
    block1Num8.setPreserveRatio(true);
    block1Num9.setPreserveRatio(true);
    block1Num10.setPreserveRatio(true);
    
    block1Num1.setFitHeight(50);
    block1Num2.setFitHeight(50);
    block1Num3.setFitHeight(50);
    block1Num4.setFitHeight(50);
    block1Num5.setFitHeight(50);
    block1Num6.setFitHeight(50);
    block1Num7.setFitHeight(50);
    block1Num8.setFitHeight(50);
    block1Num9.setFitHeight(50);
    block1Num10.setFitHeight(50);
    
    block1Num1.setVisible(false);
    block1Num2.setVisible(false);
    block1Num3.setVisible(false);
    block1Num4.setVisible(false);
    block1Num5.setVisible(false);
    block1Num6.setVisible(false);
    block1Num7.setVisible(false);
    block1Num8.setVisible(false);
    block1Num9.setVisible(false);
    block1Num10.setVisible(false);
    
    FlowPane pane1Block = new FlowPane(Orientation.HORIZONTAL, block1Num1, block1Num2, block1Num3, block1Num4, block1Num5, block1Num6, block1Num7, block1Num8, block1Num9, block1Num10);
    
    pane1Block.setVgap(10);
    pane1Block.setHgap(10);
    pane1Block.setPrefWrapLength(320);
    
    pane1Block.setAlignment(Pos.CENTER_LEFT);
    
    secondaryGridPane.add(pane1Block, 1, 0);
  }
  
  public void generateRandNums(Random randGen){
    boolean hasCorrectNums = false;
    while(!hasCorrectNums){
      randNum1 = randGen.nextInt(1001);
      randNum2 = randGen.nextInt(1001);
      
      if(randNum1 - randNum2 >= 0){
        operator = " - ";
        hasCorrectNums = true;
      }
      else if(randNum1 + randNum2 <= 1000){
        operator = " + ";
        hasCorrectNums = true;
      }
    } 
  }
  
  public VBox addRightVBox(Random randGen){
    generateRandNums(randGen);
    
    questionText = new Text("What is " + randNum1 + operator + randNum2 + " equal to?");
    questionText.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    
    answerText = new Text("");
    answerText.setFont(Font.font("Arial", FontWeight.BOLD, 18));
    answerText.setFill(Color.RED);
    
    Text counterText = new Text("Counter");
    counterText.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    
    updatingCounter = new TextField(Integer.toString(currentNum));
    updatingCounter.setMinWidth(75);
    updatingCounter.setPrefWidth(80);
    updatingCounter.setMaxWidth(90);
    updatingCounter.setEditable(false);
    updatingCounter.setAlignment(Pos.CENTER);
    
    btnNext = new Button("Next Question");
    btnNext.setVisible(false);
    
    btnSubmit = new Button("Submit");
    btnClear = new Button("Clear");
    
    btnClear.setOnAction(e -> btnClearClicked());
    btnSubmit.setOnAction(e -> btnSubmitClicked(randGen));
    btnNext.setOnAction(e -> btnNextClicked(randGen));
    
    Region spacer1 = new Region();
    VBox.setVgrow(spacer1, Priority.ALWAYS);
    
    Region spacer2 = new Region();
    VBox.setVgrow(spacer2, Priority.ALWAYS);
    
    Region spacer3 = new Region();
    VBox.setVgrow(spacer3, Priority.ALWAYS);
    
    Region spacer4 = new Region();
    VBox.setVgrow(spacer4, Priority.ALWAYS);
    
    FlowPane questionFlowPane = new FlowPane(Orientation.HORIZONTAL, questionText);
        
    questionFlowPane.setVgap(10);
    questionFlowPane.setHgap(10);
    questionFlowPane.setPrefWrapLength(50);
    questionFlowPane.setAlignment(Pos.CENTER);
      
    VBox rightVBox = new VBox(10, spacer1, questionFlowPane, answerText, spacer2, btnNext, btnSubmit, btnClear, spacer3, counterText, updatingCounter, spacer4);
    
    rightVBox.setPadding(new Insets(0, 20, 0, 20));
    rightVBox.setAlignment(Pos.CENTER);
    rightVBox.setBackground(new Background(new BackgroundFill(Color.rgb(183,247,243), CornerRadii.EMPTY, Insets.EMPTY)));
    
    rightVBox.setMinWidth(200);
    
    return rightVBox;
  }
  
  public void btnClearClicked(){
    block100Num1.setVisible(false);
    block100Num2.setVisible(false);
    block100Num3.setVisible(false);
    block100Num4.setVisible(false);
    block100Num5.setVisible(false);
    block100Num6.setVisible(false);
    block100Num7.setVisible(false);
    block100Num8.setVisible(false);
    block100Num9.setVisible(false);
    block100Num10.setVisible(false);
    
    block10Num1.setVisible(false);
    block10Num2.setVisible(false);
    block10Num3.setVisible(false);
    block10Num4.setVisible(false);
    block10Num5.setVisible(false);
    block10Num6.setVisible(false);
    block10Num7.setVisible(false);
    block10Num8.setVisible(false);
    block10Num9.setVisible(false);
    block10Num10.setVisible(false);
    
    block1Num1.setVisible(false);
    block1Num2.setVisible(false);
    block1Num3.setVisible(false);
    block1Num4.setVisible(false);
    block1Num5.setVisible(false);
    block1Num6.setVisible(false);
    block1Num7.setVisible(false);
    block1Num8.setVisible(false);
    block1Num9.setVisible(false);
    block1Num10.setVisible(false);
    
    counter100Block = 0;
    counter10Block = 0;
    counter1Block = 0;
    
    answerText.setText("");
    currentNum = 0;
    updatingCounter.setText(Integer.toString(currentNum));
  }
  
  public void btnSubmitClicked(Random randGen){
    
    System.out.println("CurrentNum: " + currentNum);
    System.out.println("randNum1: " + randNum1);
    System.out.println("randNum2: " + randNum2);
    System.out.println("operator: " + operator);
    if(operator.equals(" + ")){
      if(randNum1 + randNum2 == currentNum){  
        questionText.setText("Correct!");
        btnSubmit.setVisible(false);
        btnClear.setVisible(false);
        btnNext.setVisible(true);
        
        
      }
      else{
        answerText.setText("Incorrect. Try again.");
      }
      
      
      
    }
    else if(operator.equals(" - ")){
      if(randNum1 - randNum2 == currentNum){
        questionText.setText("Correct!");
        btnSubmit.setVisible(false);
        btnClear.setVisible(false);
        btnNext.setVisible(true);
      }
      else{
        answerText.setText("Incorrect. Try again.");
      }
    }
  }
  
  public void btnNextClicked(Random randGen){
    btnSubmit.setVisible(true);
    btnClear.setVisible(true);
    btnNext.setVisible(false);
    
    btnClearClicked();
       
    generateRandNums(randGen);
    questionText.setText("What is " + randNum1 + operator + randNum2 + " equal to?");
  }
  
  
  public static void main(String[] args){
    launch(args);
  }
  

  @Override
  public void start(Stage primaryStage){
    importImages();
    
    Random randGen = new Random();

    //Create a pane
    BorderPane pane = new BorderPane();
    
    
    GridPane mainGridPane = new GridPane();
    
    GridPane secondaryGridPane = new GridPane();
    
    mainGridPane.add(secondaryGridPane,0,1);
    secondaryGridPane.setAlignment(Pos.CENTER_LEFT);
    
    
    RowConstraints row0 = new RowConstraints();
    RowConstraints row1 = new RowConstraints();
    ColumnConstraints col0 = new ColumnConstraints();
    row0.setPercentHeight(50);
    row1.setPercentHeight(50);
    col0.setPercentWidth(100);
    
    mainGridPane.getRowConstraints().addAll(row0, row1);
    mainGridPane.getColumnConstraints().add(col0);
    
    add10BlockFlowPane(secondaryGridPane);
    add1BlockFlowPane(secondaryGridPane);
    add100BlockFlowPane(mainGridPane);
  
    VBox leftVBox = addLeftVBox();
    
    pane.setCenter(mainGridPane);
    pane.setLeft(leftVBox);
    pane.setRight(addRightVBox(randGen));
    
    mainGridPane.setPadding(new Insets(25, 50, 25, 50));
    
//    mainGridPane.setGridLinesVisible(true);
    
    //Create the scene
    Scene scene = new Scene(pane);
    
    //Set the scene and show the stage.
    primaryStage.setScene(scene);
    primaryStage.setResizable(true);
    primaryStage.setMinHeight(680);
    primaryStage.setMinWidth(1200);
    primaryStage.setTitle("Block Challenge");
    primaryStage.show();
    
  }
}