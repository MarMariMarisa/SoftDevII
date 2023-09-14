package unit05.mcf;

import java.util.Iterator;

public class ForEach {
    public static void forEachArrau(){
        String[] strings = {"A","B","C"};
        for(String elt : strings){
            System.out.println(elt);
        }
    }
    public static void forEachArrayList(){
        unit05.mcf.ArrayList<Integer> list = new unit05.mcf.ArrayList<>();
        list.append(10);
        list.append(20);
        list.append(30);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer elt = itr.next();
            System.out.println(elt);
        }
        for(int elt : list){
            System.out.println(elt);
        }
    }
}
