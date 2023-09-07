import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    String numList1 = "";
    String operator = "";
    String numList2 = "";

    TextField calculatorDisplay;
    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnAdd;
    Button btnSubtract;
    Button btnDivide;
    Button btnMultiply;
    Button btnSquare;
    Button btnSquareRoot;
    Button btnEquals;
    ToggleButton btnToggleDecimal;
    ToggleButton btnToggleQuat;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Quaternary Calculator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Create components
        calculatorDisplay = new TextField();
        btnZero = new Button("0");
        btnZero.setMinWidth(70);
        btnOne = new Button("1");
        btnOne.setMinWidth(70);
        btnTwo = new Button("2");
        btnTwo.setMinWidth(70);
        btnThree = new Button("3");
        btnThree.setMinWidth(70);
        btnAdd = new Button("+");
        btnAdd.setMinWidth(70);
        btnSubtract = new Button("-");
        btnSubtract.setMinWidth(70);
        btnDivide = new Button("/");
        btnDivide.setMinWidth(70);
        btnMultiply = new Button("*");
        btnMultiply.setMinWidth(70);
        btnSquare = new Button("Square");
        btnSquare.setMinWidth(70);
        btnSquareRoot = new Button("Sq. Root");
        btnSquareRoot.setMinWidth(70);
        btnEquals = new Button("=");
        btnEquals.setMinWidth(150);
        btnToggleDecimal = new ToggleButton("Decimal");
        btnToggleDecimal.setMinWidth(70);
        btnToggleQuat = new ToggleButton("Quaternary");
        btnToggleQuat.setMinWidth(70);
        ToggleGroup group = new ToggleGroup();
        btnToggleDecimal.setToggleGroup(group);
        btnToggleQuat.setToggleGroup(group);
        btnToggleDecimal.setSelected(true);

        //Add components
        grid.add(calculatorDisplay, 0, 0, 4, 2);
        grid.add(btnZero, 0, 2, 2, 1);
        grid.add(btnOne, 0, 3, 2, 1);
        grid.add(btnTwo, 0, 4, 2, 1);
        grid.add(btnThree, 0, 5, 2, 1);
        grid.add(btnAdd, 2, 2, 2, 1);
        grid.add(btnSubtract, 2, 3, 2, 1);
        grid.add(btnDivide, 2, 4, 2, 1);
        grid.add(btnMultiply, 2, 5, 2, 1);
        grid.add(btnSquare, 0, 6, 2, 1);
        grid.add(btnSquareRoot, 2, 6, 2, 1);
        grid.add(btnEquals, 0, 7, 4, 1);
        grid.add(btnToggleDecimal, 0, 8, 2, 1);
        grid.add(btnToggleQuat, 2, 8, 2, 1);

        btnZero.setOnAction(event);
        btnOne.setOnAction(event);
        btnTwo.setOnAction(event);
        btnThree.setOnAction(event);
        btnAdd.setOnAction(event);
        btnSubtract.setOnAction(event);
        btnMultiply.setOnAction(event);
        btnDivide.setOnAction(event);
        btnSquare.setOnAction(event1);
        btnSquareRoot.setOnAction(event1);
        btnEquals.setOnAction(event1);


        //Create and display scene
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleEqualButtonClick() {
        //TODO: Need to add functionality

    }

    private void handleNumberClick() {
        //TODO: Need to add functionality

    }


    EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event1) {
            double results = 0;
            Operations operations = new Operations();
            DeciToQuart deciToQuart  =new DeciToQuart();
            QuartToDeci.quartToDeci(numList1);
            Button clickedButton = (Button) event1.getSource();
            String buttonText = clickedButton.getText();
            if (buttonText == "="){
                int num1 = QuartToDeci.quartToDeci(numList1);
                int num2 = QuartToDeci.quartToDeci(numList2);
                if (operator == "+"){

                   results = operations.Addition(num1, num2);
                }
                if (operator == "-"){
                    results = operations.subtraction(QuartToDeci.quartToDeci(numList1), QuartToDeci.quartToDeci(numList2));
                }
                if (operator == "*"){
                    results = operations.multiple(QuartToDeci.quartToDeci(numList1), QuartToDeci.quartToDeci(numList2));
                }
            }
            String finalResult = String.valueOf(deciToQuart.toQuart((int) results));
            calculatorDisplay.setText(finalResult);
            }
        };

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            //calculatorDisplay.setText("hi");
            Button clickedButton = (Button) event.getSource();
            String buttonText = clickedButton.getText();
            boolean b = Objects.equals(buttonText, "0") || Objects.equals(buttonText, "1") ||
                    Objects.equals(buttonText, "2") || Objects.equals(buttonText, "3");
            if (b && Objects.equals(operator, "")) {
                numList1 += buttonText;
                calculatorDisplay.setText(numList1);
            }
            if(Objects.equals(buttonText, "+") || Objects.equals(buttonText, "-") ||
                    Objects.equals(buttonText, "*") || Objects.equals(buttonText, "/")) {
                operator = buttonText;
                calculatorDisplay.setText(numList1 + operator);
            }
            if(b && !Objects.equals(operator, "")) {
                numList2 += buttonText;
                calculatorDisplay.setText(numList1 + operator + numList2);
            }
        }
    };

    public static void main(String[] args) {
        launch();
    }
}
