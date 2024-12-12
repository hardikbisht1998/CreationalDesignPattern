package singleton;

public class EagerDataBase {

    private static EagerDataBase eagerDataBase=new EagerDataBase();

    public static EagerDataBase getEagerDataBase(){
        return eagerDataBase;
    }

/*

1 static variable wiil initialise object at time of class loading


 */
}
