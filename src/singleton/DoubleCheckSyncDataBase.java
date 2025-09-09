package singleton;

public class DoubleCheckSyncDataBase {

    private static DoubleCheckSyncDataBase dataBase;

    private DoubleCheckSyncDataBase(){}

    public static DoubleCheckSyncDataBase getDataBase(){

        if(dataBase==null){
            synchronized (DoubleCheckSyncDataBase.class){
                if(dataBase==null){
                    dataBase=new DoubleCheckSyncDataBase();
                }
            }
        }
        return dataBase;
    }
}
