package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Game Of Life");

        int size = 300; //THE ONLY SIZE VARIABLE.
        CellBoard CellBoard = new CellBoard(size);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setGridLinesVisible(true);

        Random rand = new Random();
        int randX;
        int randY;

        ArrayList<Cell> CellList=new ArrayList<Cell>();

        //Make empty cells to fit in the board
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                EmptyCell makeCell = new EmptyCell(i,j,3,3,Color.WHITE);
                CellBoard.setCellOnGrid(makeCell,makeCell.getPosX(),makeCell.getPosY());
                grid.add(CellBoard.getCellFromGrid(i,j),i,j);
            }
        }

        int numOfBlackDots;//always less the size*size
        for (numOfBlackDots =200; numOfBlackDots != 0; numOfBlackDots--){
            randX =  rand.nextInt((size-1) + 1) ; //[0..size-1]
            randY =  rand.nextInt((size-1) + 1);
            if (CellBoard.isEmptyCell(randX,randY)) {
                Cell makeCell = new Cell(randX, randY, 3, 3, Color.BLACK);
                System.out.print(makeCell.getPosX() + "," + makeCell.getPosY() + "\n");
                CellBoard.setCellOnGrid(makeCell,makeCell.getPosX(),makeCell.getPosY());
                grid.add(CellBoard.getCellFromGrid(makeCell.getPosX(),makeCell.getPosY()),makeCell.getPosX(),makeCell.getPosY());
                CellList.add(makeCell);
            }
            else {System.out.println("Repeated!"); ;numOfBlackDots +=1;};
        }







        //---------------------------------------------------
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
