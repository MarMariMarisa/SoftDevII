package practicum2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FibonacciGUI extends Application {
    Label label = new Label("0,1");
    FibonacciModel fibModel = new FibonacciModel();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("next");
        button.setOnAction(new FibonacciObserver(fibModel));
        fibModel.register(new FibonacciEventHandler(this));

        label.setMinWidth(200);
        label.setPadding(new Insets(2));
        HBox hbox = new HBox();
        hbox.getChildren().addAll(button, label);
        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fibonacci");
        primaryStage.show();
    }

    public Label getLabel() {
        return label;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class FibonacciObserver implements EventHandler<ActionEvent>{
    private FibonacciModel fib;
    public FibonacciObserver(FibonacciModel fib){
        this.fib = fib;
    }
    @Override
    public void handle(ActionEvent event){
        fib.setNext();
    }
}

class FibonacciEventHandler implements Observer{
    private FibonacciGUI gui;
    public FibonacciEventHandler(FibonacciGUI gui){
        this.gui = gui;

    }
    @Override
    public void update(FibonacciModel fib){
        
        gui.getLabel().setText(gui.getLabel().getText() + "," + fib.getNext() );
    }

}
