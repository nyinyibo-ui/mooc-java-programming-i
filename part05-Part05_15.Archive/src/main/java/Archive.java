/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Archive {
    private String id;
    private String name;
    
    //constructor
    public Archive(String id,String name){
        this.id=id;
        this.name=name;
    }
    
    //equals method
    public boolean equals(Object compared){
        // if the objects are in the same location they are the same;
        if(this==compared){
            return true;
        }
        
        // if the object is not Archive type they are not equal
        if (!(compared instanceof Archive)){
            return false;
        }
        
        //convert the object into Archive type
        Archive comparedArchive=(Archive) compared;
        
        // if the ids are the same objects are the same;
        return this.id.equals(comparedArchive.id);
        

    }
    
    public String toString(){
        return this.id+": "+this.name;
    }
    
}
