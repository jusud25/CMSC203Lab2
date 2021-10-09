package application;
	import javafx.application.Application;

	import javafx.collections.ObservableList;

	import javafx.event.ActionEvent;

	import javafx.event.EventHandler;

	import javafx.geometry.Insets;

	import javafx.geometry.Pos;

	import javafx.scene.Node;

	import javafx.scene.Scene;

	import javafx.scene.control.Button;

	import javafx.scene.control.Label;

	import javafx.scene.control.TextField;

	import javafx.stage.Stage;

	import javafx.scene.layout.VBox;

	import javafx.scene.layout.HBox;

	public class FXMainPane extends VBox

	{

	     public void start(Stage stage)

	     {     

	         

	          HBox h1=new HBox();

	          HBox h2=new HBox();    

	//create object for the class DataManager

	          DataManager Dobject=new DataManager();

	          //textField create

	          TextField textFields = new TextField();     

	          //label creation

	          Label labelVal = new Label("FeedBack:");

	          // hello button

	          Button bt1 = new Button("Hello");

	          //implement the button bb1

	          bt1.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {        

	                    textFields.setText(Dobject.getHello());    

	              }

	          });

	          // howdy button

	          Button bt2 = new Button("Howdy");

	          //implement the button bb2

	          bt2.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {        

	              textFields.setText(Dobject.getHowdy());

	              }

	          });

	          // chinese button

	          Button bt3 = new Button("Chinese");

	          //implement the button bb3

	          bt3.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {

	              textFields.setText(Dobject.getChinese());

	              }

	          });
	          
	          // New Language button

	          Button bt4 = new Button("Kpelleh");

	          //implement the button bt4

	          bt4.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {

	              textFields.setText(Dobject.getKpelleh());

	              }

	          });
	          
	          
	          
	          

	          // clear button    

	          Button bt5 = new Button("Clear");

	          //implement the button bb4

	          bt5.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {

	              textFields.setText(" ");

	              }

	          });

	          // exit button     

	          Button bt6 = new Button("Exit");

	          //implement the button bb5

	          bt6.setOnAction(new EventHandler<ActionEvent>()

	          {

	              @Override public void handle(ActionEvent e)

	              {

	             

	              System.exit(0);

	              }

	          });

	          //Instantiating the HBox class

	          VBox vBox =new VBox(60);

	          vBox.setAlignment(Pos.CENTER);

	          Insets inset=new Insets(25, 25, 25, 25);

	          //set the spacing

	          vBox.setSpacing(20);

	          //sets the margin of nodes

	          VBox.setMargin(textFields, new Insets(25, 25, 25, 25));

	          //sets the b1

	          VBox.setMargin(bt1, new Insets(25, 25, 25, 25));

	          //sets the b2

	          VBox.setMargin(bt2, new Insets(25, 25, 25,25));

	          //sets the b3

	          VBox.setMargin(bt3, new Insets(25, 25, 25, 25));

	          //sets the b4

	          VBox.setMargin(bt4, new Insets(25, 25, 25, 25));

	          //set the b5

	          VBox.setMargin(bt5, new Insets(25, 25, 25, 25));

	          h1.setAlignment(Pos.CENTER);

	          h1.getChildren().addAll(labelVal,textFields,h2);

	         

	          //vBox retrieval list

	          ObservableList<Node> listVal = vBox.getChildren();

	          //includes the additional list

	          listVal.addAll(textFields, bt1,bt2,bt3,bt4,bt5,bt6,h1);     

	    

	          //scene object

	          Scene scenes = new Scene(vBox);

	          //set the scenes

	          stage.setScene(scenes);

	          //Stage contents

	          stage.show();

	     }

	}  
