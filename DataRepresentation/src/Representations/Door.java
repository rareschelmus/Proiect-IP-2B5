/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Representations;

/**
 *
 * @author Procop Vladimir
 */
public class Door extends Wall{
    private boolean exitWay = false;
    
    public Door(boolean exit){/**Construct door which is or isn't an exit-way*/
        super();
        this.exitWay = exit;
    }
    
    public Door(Point lpoint, Point rpoint, boolean exit){/**Construct door with points*/
        super(lpoint, rpoint);
        this.exitWay = exit;
    }
    
    public Door(Door toCopy, boolean exit){/**Construct door which is a deep copy of another door*/
        super(toCopy);
        this.exitWay = exit;
    }
    
    public boolean isExit(){/**True if the door is an exit way, false otherwise*/
        return this.exitWay;
    }
}
