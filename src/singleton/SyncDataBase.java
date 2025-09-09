package singleton;

public class SyncDataBase {

    private static SyncDataBase syncDataBase;

    private SyncDataBase() {
    }


    public static synchronized SyncDataBase getDatabase() {
        if(syncDataBase==null){


            syncDataBase = new SyncDataBase();//only this has to be syncronised
        }

        return syncDataBase;
    }


}
