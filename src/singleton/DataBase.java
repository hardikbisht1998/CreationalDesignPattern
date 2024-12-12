package singleton;

import java.io.Serializable;

public class DataBase implements Serializable ,Cloneable{

    private static DataBase db;
    private DataBase(){

        if(db!=null){
            throw new RuntimeException("You are trying to break singleton Pattern");
        }

    }

// lazy initialisation
    public static DataBase getDatabase(){

        if(db==null){
            db= new DataBase();
            return db;
        }
        return db;
    }



    public Object readResolve(){
        return db;
    }

//    @Override
    public Object clone() throws CloneNotSupportedException {
        return db;
    }
}





/*

 1 constructor should be private

 2 make a public method to access /entry point
   but without object it can be acceses ,so it should be static

 3 before creating instance of object check if its already there

 4 make a private reference of the object for checking

 5 Instance should be static cause cant be acces by static block



*/