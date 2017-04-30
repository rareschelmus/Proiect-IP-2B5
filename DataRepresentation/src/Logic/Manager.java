/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Representations.Element;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author Procop Vladimir
 */
public class Manager {
    private Path dataFile;
    private ArrayList<Element> allElements = new ArrayList<>();
    // DBConnection , depinde ce baza de date folosim...
   
    public void addElement(Element newElement){
        //...
    }
    public void deleteElement(Element newElement){
        //...
    }
    public void saveCurrentState(){
        //...
    }
    public ArrayList<Element> getLastState(){
        //...
        return null;
    }
    public void buildFile(){
        //...
    }
    public void parseFile(){
        //...
    }

    public Path getDataFile() {
        return dataFile;
    }

    public void setDataFile(Path dataFile) {
        this.dataFile = dataFile;
    }
    
    
}

