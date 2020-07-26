package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Game Of Life");
        GridPane grid = new GridPane();
        //---------------------------------------------------
        // Create visual objects.
        // Squares, etc...
        // Configure those objects.
        ArrayList<Cell> CellList=new ArrayList<Cell>();

        Random rand = new Random();
        int randX =  rand.nextInt(21);
        int randY =  rand.nextInt(21);
        for (int i = 0; i < 5; i++){
            Cell makeCell = new Cell(randX,randY,5,5);
            System.out.print(makeCell.getPosX()+ "," + makeCell.getPosY()+"\n");
            CellList.add(makeCell);
        }


        //---------------------------------------------------
        //Create layout (grid)
        //20*20 grid

        for (int i = 0; i < 5; i++){
           grid.add(CellList.get(i),CellList.get(i).posX,CellList.get(i).posY);
        }




        //---------------------------------------------------
        Scene scene = new Scene(grid,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
