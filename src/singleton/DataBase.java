package singleton;


public class DataBase {
    //  Lazy Loading
    private static DataBase database;


    private DataBase(){

    }

    public static DataBase getDatabase() {
        if (database == null) {
            database = new DataBase();
        }
        return database;

    }

}




