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
public class Room extends Element{
    private ArrayList<Wall> walls = new ArrayList<>();
    String name;
    public Room(String name){/**Construct a room with a name*/
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Room)) return false;
        Room r = (Room)o; 
        if(r.getWalls().size()!=this.getWalls().size()) return false;
        
        for(Wall thisWall : this.getWalls()){
            boolean flag = false;
            for(Wall otherWall : r.getWalls()){
                if(thisWall.equals(otherWall)) flag = true;
            }
            if(flag == false) return false;
        }
        
        return true;
    }
    
    public void addWall(Wall w) throws DataNotValidException{/**Add a wall to this room*/
        //...
    }
    
    public void deleteWall()throws DataNotValidException{/**Delete a wall from this room*/
        //...
    }
    
    @Override
    public String toString(){
        String ans = "Room " + this.name + " : ";
        for(int i = 0; i < walls.size()-1; i++){
            ans = ans + walls.get(i).toString() + " , ";
        }
        ans = ans + walls.get(walls.size()-1).toString();
        return ans;
    }
    
    public ArrayList<Wall> getWalls() {/**Returns the room's walls*/
        return walls;
    }

    public void setWalls(ArrayList<Wall> walls) {// Nu stiu daca ar avea sens asta..... camera poate fi facuta 
                                                        // doar cu addWall() de mai multe ori
        this.walls = walls;
    }
    
    static boolean validate(Room room){/**True if argument is a valid room, false otherwise*/
        return false;
    }
    
}
