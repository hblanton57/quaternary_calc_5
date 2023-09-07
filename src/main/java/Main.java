import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

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

    public static void main(String[] args) {
        launch();
    }
}
