package Lesson8.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {

    private static Marketing delete(Marketing marketing,  List<Marketing> marketingList) {
        int pos = 0;
        if(marketing == null) return null;
        for(int i = 0; i < marketingList.size(); i++) {

            marketingList.get(i).equals(marketing);
            pos = i;
            System.out.println(marketingList.get(i).equals(marketing));
        }
        Marketing deletedMarketing = marketingList.get(pos);
        marketingList.remove(pos);
        return deletedMarketing;
    }

    public static Marketing retrieve(int index, List<Marketing> marketingList) {
        if(index < 0 || index > marketingList.size()) return null;
        System.out.println(marketingList.get(index));
        return marketingList.get(index);
    }


    public static void main(String[] args) {

        Marketing m1 = new Marketing("Remond Shelley","TV", 5000.0);
        Marketing m2 = new Marketing("Al Hassane Camara","Car", 8000.0);
        Marketing m3 = new Marketing("Usman Ahmet","Shoes", 80.0);
        Marketing m4 = new Marketing("Pabin Luitel","Boots", 5000.0);
        Marketing m5 = new Marketing("Sushil Kakri","Charger", 30.0);
        Marketing m6 = new Marketing("Ritesh","Laptop", 1000.0);
        Marketing m7 = new Marketing("Al Hassane camara","Laptop", 2000.0);

        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(m1);
        marketingList.add(m2);
        marketingList.add(m3);
        marketingList.add(m4);
        marketingList.add(m5);
        marketingList.add(m6);
        marketingList.add(m7);
        System.out.println(marketingList.size());
        /*
           Delete a Marketing from list of Marketing
         */
//      delete(m1, marketingList);
//      System.out.println(marketingList.size());

//      System.out.println(marketingList.size());
        /*
        Retrieve Marketing Objet by given index
        */
//      retrieve(4, marketingList);
//      System.out.println(retrieve(4, marketingList));


         /*
           Sort marketing lists by  employee name
         */
//       List<Marketing> list = listMoreThan1000(marketingList);
//       Collections.sort(list, new TestClass.ComparareByEmployeeName());
//       System.out.println(list);

         /*
           Sort marketing list with employee having more than 1000 salary amout by salary amount
         */
//        Collections.sort(marketingList, new TestClass.ComparareBySalesAmount());
//        System.out.println(marketingList);


    }

    public static class ComparareByEmployeeName implements Comparator<Marketing> {
        public int compare(Marketing m1, Marketing m2) {
            if(m1.getEmployeename().compareTo(m2.getEmployeename()) != 0)
                return m1.getEmployeename().compareTo(m2.getEmployeename());
            if(Double.compare(m1.getSalesamount(), m2.getSalesamount()) != 0)
                return Double.compare(m1.getSalesamount(), m2.getSalesamount());
            return m1.getProductname().compareTo(m2.getProductname());

        }
    }

    public static class ComparareBySalesAmount implements Comparator<Marketing> {
        public int compare(Marketing m1, Marketing m2) {
            if(Double.compare(m1.getSalesamount(), m2.getSalesamount()) != 0)
              return Double.compare(m1.getSalesamount(), m2.getSalesamount());
            if(m1.getEmployeename().compareTo(m2.getEmployeename()) != 0)
                return m1.getEmployeename().compareTo(m2.getEmployeename());
              return m1.getProductname().compareTo(m2.getProductname());

        }
    }

    public static List<Marketing>  listMoreThan1000(List<Marketing> list){
        List<Marketing> result = new ArrayList<>();
        for(Marketing m : list) {
            if(m.getSalesamount() > 1000.0)
                result.add(m);
        }

        return result;
    }

}
