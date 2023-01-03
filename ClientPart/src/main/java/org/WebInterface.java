package org;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.File;

public class WebInterface extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 720, 480);

        //create items
        Button buttonChoose = new Button("Choose file");
        Button sendButton = new Button("Get hash sum");
        Label chooseFile = new Label("Not choosen!");
        Label resultLable = new Label("");
        //set function to set File Path
        buttonChoose.setOnAction(event -> {
            FileChooser chooser = new FileChooser();
            File file = chooser.showOpenDialog(stage);
            if (file != null) {
                String fileAsString = file.toString();
                chooseFile.setText(fileAsString);
            } else {
                chooseFile.setText("Not choosen!");
            }
        });
        //set function to get Hash Sum from remote server (localhost)
        sendButton.setOnAction(event -> {
            if(!chooseFile.getText().equals("Not choosen!")){
                try{
                    HashCodeSender coder = new HashCodeSender(chooseFile.getText());
                    String resultFromServer = coder.sendDataToServer();
                    resultLable.setText(resultFromServer);
                    resultLable.setTextFill(Color.color(0,1,0));
                }
                catch (Exception ex){
                    resultLable.setText("Server does not answer");
                }


            }
            else {
                resultLable.setText("File path must be choose!");
            }

        });

        resultLable.setTextFill(Color.color(1,0,0));
        //set position of elements and add it
        root.add(buttonChoose,0,0);
        root.add(sendButton,0,1);
        root.add(chooseFile,1,0);
        root.add(resultLable,1,1);

        //set position of grid and settings
        root.setVgap(15);
        root.setHgap(25);
        root.setAlignment(Pos.CENTER);


        stage.setTitle("Client part (Test)");
        stage.setScene(scene);
        stage.show();
    }
}
