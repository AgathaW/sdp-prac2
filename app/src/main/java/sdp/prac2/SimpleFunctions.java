package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public static int Task1(List<Integer> a, List<Integer> b) {
        List<Integer> newList = new ArrayList();
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            int indexb = b.indexOf(i);
            if (a.contains(indexb)) {
                newList.add(indexb);
                for (int j = 0; j < newList.size(); j++) {
                    sum += j;
                    System.out.println(sum);
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ListA = Arrays.asList(1, 2, 3, 4);
        List<Integer> ListB = Arrays.asList(4, 5, 6, 8);
        // Task1();
        Task1(ListA, ListB);

    }

}
