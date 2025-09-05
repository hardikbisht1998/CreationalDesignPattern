import factory.Reviewer;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int i=1;
        if(i==1){
            Reviewer reviewer=new Reviewer();
            reviewer.execute();
        }else{
            System.out.println("Try Again");
        }

    }
}