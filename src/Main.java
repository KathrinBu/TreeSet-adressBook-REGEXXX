import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        TreeSet<AdressBook> treeSet = new TreeSet<>();
        /*reeSet.add(new AdressBook("mas@mail.ru"));
        treeSet.add(new AdressBook("gffr"));
        treeSet.add(new AdressBook("gftr@lkjfre.gr"));
        treeSet.add(new AdressBook("bheeer@mail.su"));*/
        //by alkaz07:
        putAdress(treeSet, "mas@mail.ru");
        putAdress(treeSet, "gffr");
        putAdress(treeSet, "gftr@lkjfre.gr");
        putAdress(treeSet, "bheeer@mail.su");
        System.out.println(treeSet);

    }

    static void putAdress(TreeSet<AdressBook> treeSet, String adr)
    {
        try{
            treeSet.add(new AdressBook(adr));
        } catch (Exception e) {
            System.out.println("ой-ой "+e.getMessage());
        }
    }
}

