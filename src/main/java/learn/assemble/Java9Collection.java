package learn.assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9Collection {
    public static void main(String[] args) {
        Set set= Set.of("Java","Kotlin","Go");
        List list= List.of(34,-25);
        Map map= Map.of("语文",11,"数学",82);
        Map map2=Map.ofEntries(Map.entry("语文",89),Map.entry("数学",19),Map.entry("英语",89));
    }
}
