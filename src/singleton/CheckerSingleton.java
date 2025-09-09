package singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CheckerSingleton {

    public void check() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        DataBase dataBase=DataBase.getDatabase();
        System.out.println(dataBase.hashCode());
        DataBase dataBase1=DataBase.getDatabase();
        if(dataBase1.hashCode()==dataBase.hashCode())System.out.println("Bothe has same hashcode");
        else System.out.println("both has diff hashcode");



        // break through reflection api
        Constructor<UnbreakableDatabase> constructor=UnbreakableDatabase.class.getDeclaredConstructor();
        constructor.setAccessible(true);
//        UnbreakableDatabase unbreakableDatabase1=UnbreakableDatabase.getDatabase();
        UnbreakableDatabase unbreakableDatabase=constructor.newInstance();
//        if(unbreakableDatabase.hashCode()==unbreakableDatabase1.hashCode())System.out.println("Bothe has same hashcode");
//        else System.out.println("both has diff hashcode"+unbreakableDatabase1.hashCode()+" "+unbreakableDatabase.hashCode());

       // through serialization and deserialization

        UnbreakableDatabase unbreakableDatabase2=UnbreakableDatabase.getDatabase();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ss"));
        oos.writeObject(unbreakableDatabase2);
        System.out.println("Serialization Done.....");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ss"));
        UnbreakableDatabase unbreakableDatabase3=(UnbreakableDatabase) ois.readObject();
        if(unbreakableDatabase3.hashCode()==unbreakableDatabase2.hashCode())System.out.println("Bothe has same hashcode");
        else System.out.println("both has diff hashcode"+unbreakableDatabase2.hashCode()+" "+unbreakableDatabase3.hashCode());


        UnbreakableDatabase unbreakableDatabase4=(UnbreakableDatabase) unbreakableDatabase3.clone();

        if(unbreakableDatabase3.hashCode()==unbreakableDatabase4.hashCode())System.out.println("Bothe has same hashcode");
        else System.out.println("both has diff hashcode"+unbreakableDatabase4.hashCode()+" "+unbreakableDatabase3.hashCode());


    }
}
