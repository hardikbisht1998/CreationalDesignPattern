import singleton.DataBase;
import singleton.EagerDataBase;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // simple singletion (Lazy Loading)

        System.out.println(DataBase.getDatabase().hashCode());
        System.out.println(DataBase.getDatabase().hashCode());

        // EagerLoading singleton
        System.out.println(EagerDataBase.getEagerDataBase().hashCode());
        System.out.println(EagerDataBase.getEagerDataBase().hashCode());


/*               break singleton by
                    1) Reflection API
                    solution1-> if object is there -> throws exception inside constructor
                    solution2-> use enum
                    2) Serialisation and deserialisation
                    solution1-> implement readResolve() method

                    3) cloning
                    solution-> implement clone()

*/
//        DataBase dataBase=DataBase.getDatabase();
//        System.out.println(dataBase.hashCode());
//        Constructor<DataBase> constructor=DataBase.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        DataBase dataBase1=constructor.newInstance();
//        System.out.println(dataBase1.hashCode());


        DataBase dataBase=DataBase.getDatabase();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\hardi\\OneDrive\\Documents\\jj.txt"));
        oos.writeObject(dataBase);
        System.out.println(dataBase.hashCode());
        System.out.println("Serialisation Done ......");

        ObjectInputStream ois=new ObjectInputStream( new FileInputStream("C:\\Users\\hardi\\OneDrive\\Documents\\jj.txt"));
        DataBase db2=(DataBase) ois.readObject();
        System.out.println(db2.hashCode());

        DataBase db3=(DataBase)dataBase.clone();
        System.out.println(db3.hashCode());





    }
}