import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdressBook implements Comparable<AdressBook>{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdressBook(String name) throws Exception {

            if(Pattern.compile("[A-Za-z0-9?:!_+,-]+@[a-z]+\\.[a-z]{2,3}").matcher(name).matches())
                this.name = name;
            else
                throw new Exception("ааааа");

         }


    @Override
    public int compareTo(AdressBook o) {
        return  this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "AdressBook{" +
                "name='" + name + '\'' +
                '}';
    }
}

