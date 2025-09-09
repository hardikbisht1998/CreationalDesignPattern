package singleton;

import java.io.Serializable;

public class UnbreakableDatabase implements Serializable, Cloneable {

    private static UnbreakableDatabase database;

    //reflection api willl go through private
    private UnbreakableDatabase() {
        if (database != null) {
            throw new RuntimeException("Breaking Singleton Pattern");
        }

    }

    public static UnbreakableDatabase getDatabase() {
        if (database == null) {
            database = new UnbreakableDatabase();
        }
        return database;

    }


    public Object readResolve() {
        return database;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
//        return super.clone();

        return database;
    }
}
