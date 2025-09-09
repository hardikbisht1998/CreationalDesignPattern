package singleton;

public class EagerDataBase {

    private EagerDataBase(){}
    //    Eager Loading
    private static EagerDataBase dataBase = new EagerDataBase();

    public static EagerDataBase getDatabase() {
        return dataBase;

    }
}
