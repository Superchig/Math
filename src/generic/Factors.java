package generic;

import java.util.ArrayList;
import java.util.List;


public class Factors {

    public static int getGCF(int input1, int input2) {

        List input1Factors = getFactors(input1);
        System.out.println("input1Factors are: " + input1Factors);
        List input2Factors = getFactors(input2);
        System.out.println("input2Factors are: " + input2Factors);
        List<Integer> commonFactors = new ArrayList<>(input1Factors);
        System.out.println("commonFactors are: " + commonFactors);

        commonFactors.retainAll(input2Factors);
        System.out.println("commonFactors are: " + commonFactors);

        int output = greatestInt(commonFactors);

        return output;
    }

    public static List<Integer> getFactors(int input) {

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= input; i++) {

            if (input % i == 0) {
                factors.add(i);
            }

        }

        return factors;

    }

    private static int greatestInt(List<Integer> inputList) {

        int greatestInt = 1;

        for (int i : inputList) {

            if (i > greatestInt) {

                greatestInt = i;

            }

        }

        return greatestInt;

    }

    public static void main(String[] args) {

        System.out.println("test");
        System.out.println(Factors.getFactors(30));
        System.out.println(Factors.getFactors(25));
        getGCF(10, 250);


    }
}
