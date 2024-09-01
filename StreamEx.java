import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,1,6,4,7);
        Stream<Integer> st = list.stream();
        st.forEach(n -> System.out.println(n));
        //Agar hum kisi data par operation karna chahte hain aur
        // hum nahi chahte ki original data change ho, toh hum us
        // data ko lekar ek separate stream ya copy banate hain.
        // Is tarah se, agar hum operation karte hain,
        // toh original value par koi asar nahi padta hai, sirf copy ya
        // stream ke upar operation hota hai.

        Stream<Integer> FirstData = list.stream().
         filter(n->n%2==0)
                 .sorted()
                         .map(n->n*2);
        FirstData.forEach(n-> System.out.println(n));




        //st.forEach(n -> System.out.println(n)); Error
        //because Agar aap ek stream pe kaam kar chuke hain, to usi stream pe dubara
        // kaam nahi kar sakte. Stream ko ek baar consume karne ke baad,
        // wo exhausted ho jata hai, aur aapko nayi stream create karni padti hai
        // agar aap fir se operations perform karna chahte hain.



    }
}
