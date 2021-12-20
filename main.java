

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;  
import javafx.geometry.Pos;  
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight;

public class main extends Application {
    String num1 ="";
    String num2 ="";
    String op ;
    double result= 0;
    boolean oldop =false ;
	//-----------
    public void start(Stage stage) throws Exception {
		stage.setTitle("JavaFX Calculator");
		//Making required buttons-----------
		//---
		Button zero = new Button("0");
		zero.setStyle("-fx-background-color: tan");
		//---
        Button one = new Button("1");
		one.setStyle("-fx-background-color: tan");
		//---
        Button two = new Button("2");
		two.setStyle("-fx-background-color: tan");
		//---
		Button three = new Button("3");
		three.setStyle("-fx-background-color: tan");
		//---
		Button four = new Button("4");
		four.setStyle("-fx-background-color: tan");
		//---
		Button five = new Button("5");
		five.setStyle("-fx-background-color: tan");
		//---
		Button six = new Button("6");
		six.setStyle("-fx-background-color: tan");
		//---
		Button seven = new Button("7");
		seven.setStyle("-fx-background-color: tan");
		//---
		Button eight = new Button("8");
		eight.setStyle("-fx-background-color: tan");
		//---
		Button nine = new Button("9");
		nine.setStyle("-fx-background-color: tan");
		//----------
        Button pls = new Button("+");
		pls.setStyle("-fx-background-color: yellow");
		//---
		Button sub = new Button("-");
		sub.setStyle("-fx-background-color: yellow");
		//---
		Button mul = new Button("*");
		mul.setStyle("-fx-background-color: yellow");
		//---
		Button div = new Button("/");
		div.setStyle("-fx-background-color: yellow");
		//---
        Button eql = new Button("=");
		eql.setStyle("-fx-background-color: lime");
		//------------
        Button c = new Button("C");
		c.setStyle("-fx-background-color: khaki");
		//----------------------------------
		//---------
        TextField tf = new TextField();
		tf.setStyle("-fx-background-color: LightBlue");
		tf.setMaxSize(125,40);
		//---------
		Label err = new Label("Error");
		VBox vb=new VBox(15);
		GridPane gp=new GridPane();
		gp.setVgap(13); 
        gp.setHgap(7);
		//---------------------
		//Setting positions for buttons in GridPane
		//---1st row--------
		gp.add(seven, 0, 0);		
        gp.add(eight, 1, 0);
		gp.add(nine,2,0);
        gp.add(pls, 3, 0);
		//----2nd row--------
		gp.add(four, 0, 1);		
        gp.add(five, 1, 1);
		gp.add(six,2,1);
        gp.add(sub, 3, 1);
		//----3rd row--------
		gp.add(one, 0, 2);		
        gp.add(two, 1, 2);
		gp.add(three,2,2);
        gp.add(mul, 3, 2);
		//----4th row--------
		gp.add(c, 0, 3);		
        gp.add(zero, 1, 3);
		gp.add(eql,2,3);
        gp.add(div, 3, 3);
		//---------------------
		vb.getChildren().addAll(tf,gp);
		vb.setPadding(new Insets(10, 10, 10, 10));
		vb.setTranslateX(0);
		vb.setTranslateY(0);
		vb.setStyle("-fx-background-color: Lavender");
        //----------------------------
        Scene scene = new Scene(vb,150,220);
        stage.setScene(scene);
        stage.show();
		//-----------------------------------
        // The Actions on buttons
		//------For 0 button------
        zero.setOnAction(e ->
        {
            if(!oldop){
                num1+='0';
                tf.setText(num1);}
            else {
                num2+='0';
                tf.setText(num2);
		}});
        //-----For 1 button--------
        one.setOnAction(e ->
            {
            if(!oldop){
                num1+='1';
            tf.setText(num1);}
            else {
                num2+='1';
                tf.setText(num2);
		}});
        //------For 2 button-------
        two.setOnAction(e ->
        {
            if(!oldop){
                num1+='2';
                tf.setText(num1);}
            else {
                num2+='2';
                tf.setText(num2);
		}});
        //------For 3 button-------
		three.setOnAction(e ->
        {
            if(!oldop){
                num1+='3';
                tf.setText(num1);}
            else {
                num2+='3';
                tf.setText(num2);
		}});
		//------For 4 button-------
		four.setOnAction(e ->
        {
            if(!oldop){
                num1+='4';
                tf.setText(num1);}
            else {
                num2+='4';
                tf.setText(num2);
		}});
		//------For 5 button-------
		five.setOnAction(e ->
        {
            if(!oldop){
                num1+='5';
                tf.setText(num1);}
            else {
                num2+='5';
                tf.setText(num2);
		}});
		//------For 6 button-------
		six.setOnAction(e ->
        {
            if(!oldop){
                num1+='6';
                tf.setText(num1);}
            else {
                num2+='6';
                tf.setText(num2);
		}});
		//------For 7 button-------
		seven.setOnAction(e ->
        {
            if(!oldop){
                num1+='7';
                tf.setText(num1);}
            else {
                num2+='7';
                tf.setText(num2);
		}});
		//------For 8 button-------
		eight.setOnAction(e ->
        {
            if(!oldop){
                num1+='8';
                tf.setText(num1);}
            else {
                num2+='8';
                tf.setText(num2);
		}});
		//-------For 9 button------
		nine.setOnAction(e ->
        {
            if(!oldop){
                num1+='9';
                tf.setText(num1);}
            else {
                num2+='9';
                tf.setText(num2);
		}});		
		//----------For + button----------
        pls.setOnAction(e -> {
            if(!oldop){
                oldop = true;
                op="+";
                tf.setText(op);}
            else {
                result=calc(num1 , num2 ,op);
                num1=String.valueOf(result);
                num2="";
                op="+";
                tf.setText(num1+op);
                oldop = true;
		}});
        //------For - button-------
		sub.setOnAction(e -> {
            if(!oldop){
                oldop = true;
                op="-";
                tf.setText(op);}
            else {
                result=calc(num1 , num2 ,op);
                num1=String.valueOf(result);
                num2="";
                op="-";
                tf.setText(num1+op);
                oldop = true;
		}});
		//------For / button-------
		div.setOnAction(e -> {
            if(!oldop){
                oldop = true;
                op="/";
                tf.setText(op);}
            else {
                result=calc(num1 , num2 ,op);
                num1=String.valueOf(result);
                num2="";
                op="/";
                tf.setText(num1+op);
                oldop = true;
		}});
		//------For * button-------
		mul.setOnAction(e -> {
            if(!oldop){
                oldop = true;
                op="*";
                tf.setText(op);}
            else {
                result=calc(num1 , num2 ,op);
                num1=String.valueOf(result);
                num2="";
                op="*";
                tf.setText(num1+op);
			    oldop = true;
		}});
		//-------------------------
		//------For = button-------
        eql.setOnAction(e ->{
            if(oldop){
                result=calc(num1 , num2 , op);
				if(result==-1){
					tf.setText("Error");
				}
				else{	
                tf.setText(String.valueOf(result));
				}
                oldop=false;
                num2="";}
            else 
                return;
		});
        //------For C button-------
        c.setOnAction(e -> {
            num1="";
            num2="";
            result=0;
			tf.setText("");
            oldop=false;
		});
		//-------------------------------
    }
    // The calculation method
    public int calc (String n1 , String n2 , String op){
        switch (op) {
        case "+" :
            return Integer.parseInt(n1) + Integer.parseInt(n2);
        case "-" :
            return Integer.parseInt(n1) - Integer.parseInt(n2);
        case "*" :
            return Integer.parseInt(n1) * Integer.parseInt(n2);
        case "/" :
		    if(Integer.parseInt(n2)==0){
				return -1;
			}
			else{
            return Integer.parseInt(n1) / Integer.parseInt(n2);
			}
        default :
            return 0;
       }
    }

public static void main(String[] args) {
    Application.launch(args);
}
}

//javac --module-path "D:\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml main.java


//java --module-path "D:\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml main