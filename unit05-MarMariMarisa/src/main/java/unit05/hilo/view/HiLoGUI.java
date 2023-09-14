package unit05.hilo.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import unit05.hilo.model.HiLo;
import unit05.hilo.model.HiLoObserver;

public class HiLoGUI extends Application{
    private TextField text;
    private Label hint;
    private Label availableGuesses;

    private HiLo hilo;
    
    @Override
    public void start(Stage stage){
        hilo = new HiLo();
        VBox vbox = new VBox();
        
        text = new TextField("Enter a number 1-100.");  
        text.setOnAction(new TextFieldObserver(hilo, text));
        
        hilo.register(new GUIupdater(this));

        hint = makeLabel("Game has not started yet.");
        availableGuesses = makeLabel(HiLo.MAX_TRIES + " guesses left.");
        vbox.getChildren().addAll(text, hint, availableGuesses);
        vbox.setPrefWidth(200);

        stage.setScene(new Scene(vbox));
        stage.setTitle("High Low Game");
        stage.show();
    }

    public Label getHint(){
        return this.hint;
    }
    public Label getAvailableGuesses(){
        return this.availableGuesses;
    }
    public TextField getText(){
        return this.text;
    }

    private Label makeLabel(String msg){
        Label label = new Label(msg);
        label.setMaxWidth(Integer.MAX_VALUE);
        label.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
        CornerRadii.EMPTY, BorderStroke.THIN)));
        return label;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
class TextFieldObserver implements EventHandler<ActionEvent> {
    private HiLo hilo;
    private TextField textField;

    public TextFieldObserver(HiLo hilo, TextField textField) {
        this.hilo = hilo;
        this.textField = textField;
    }

    @Override
    public void handle(ActionEvent event) { // called by subject whenever the update button is pressed
        // name lable should be updated to the user's name in textField
        
        //call hilo make guess
        hilo.makeGuess(Integer.parseInt(textField.getText()));

    }
}
class GUIupdater implements HiLoObserver{
    private HiLoGUI gui;
    public GUIupdater(HiLoGUI gui) {
        this.gui = gui;
    }
    @Override
    public void update(HiLo hilo){
            gui.getHint().setText(hilo.getHint());
            gui.getAvailableGuesses().setText("You Have " +  String.valueOf(hilo.getAvailableGuesses() - 1) + " Guesses Left");
    }

}






