package singleton;

public class SyncDataBase {

    private static SyncDataBase syncDataBase=new SyncDataBase();

    private SyncDataBase(){

    }
//    can put synchronized keyword at get method to make it safe thread method but what thic method conatain loot of line
//    so instead of that we only make synchronized block where initialisation of method has been done
//    public static synchronized SyncDataBase getSyncDataBase()
    public static  SyncDataBase getSyncDataBase(){

        //lot of logic

        if(syncDataBase==null){

            //synchronized block
            synchronized (SyncDataBase.class){
                if(syncDataBase==null){
                    return new SyncDataBase();
                }
            }
        }
        return syncDataBase;
    }
}
