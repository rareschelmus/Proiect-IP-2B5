/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Representations;

import CustomExceptions.DataNotValidException;
import java.util.ArrayList;

/**
 *
 * @author Procop Vladimir
 */
public class Stairs extends Element {
    private int[] floors = new int[2];
    private ArrayList<Wall> walls = new ArrayList<>();
    
    public Stairs(){/**Construct stairs withou fl*/
    }
    public Stairs(int bottomFloor, int topFloor) throws DataNotValidException{/**Construct stairs from bottom floor to top floor*/
        if(bottomFloor>=topFloor) throw new DataNotValidException("Bottom-floor must be lower than top-floor");
        this.floors[0] = bottomFloor;
        this.floors[1] = topFloor;
    }
    
   
    public void addWall(Wall w) throws DataNotValidException{/**Add a wall to the stairs' walls*/
        //...
    }
    
    public void deleteWall()throws DataNotValidException{/**Delete a wall from stairs' walls*/
        //...
    }

    public int[] getFloors() {/**Returns bottom and top floors*/
        return floors;
    }

    public void setFloors(int bottomFloor, int topFloor) throws DataNotValidException {/**Sets this*/
        if(bottomFloor>=topFloor) throw new DataNotValidException("Bottom-floor must be lower than top-floor");
        this.floors[0] = bottomFloor;
        this.floors[1] = topFloor;
    }

    public ArrayList<Wall> getWalls() {/**Returns the walls of the stairs*/
        return walls;
    }

    public void setWalls(ArrayList<Wall> walls) {/**Sets walls to the stairs*/
        //...
        this.walls = walls;
    }
    
    
}
