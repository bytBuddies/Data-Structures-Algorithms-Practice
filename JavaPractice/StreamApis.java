package JavaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApis {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,58,4,3,0,11,31,9);
        List<String> strList = Arrays.asList("arshad khan","sahil","gunjan","virat","naveen");

        System.out.println("Event Odd Response :: "+ findEvenOddFromList(list));
        System.out.println("Sum Of All Integers In the List :: "+findSumOfAllIntegers(list));
        System.out.println("Convert String lower case to upper case :: "+convertLowerCaseToUpperCaseList(strList));
        System.out.println("Find Elements greater then 10 :: "+findTheCountOfElementGreaterThenTen(list));

        System.out.println("Remove Duplicates :: "+removeDuplicatesAndReturn(list));
        System.out.println("Get Largest String From Given List :: "+findLongestStringInGivenList(strList));
        System.out.println("Get Second Largest Number From Given List :: "+findSecondLargestNumberInList(list));

    }

    /**
     * Find Even Odd Number From Given List 
     * @param list a ArrayList
     * @return List
     */
    public static List<Integer> findEvenOddFromList(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    /**
     * Get Sum of List based using Map method where Map use for transformation of data in stream APIs
     * @param list
     * @return
     */
    public static int findSumOfAllIntegers(List<Integer> list) {
        int result = list.stream().mapToInt(Integer::intValue).sum();
        return result;
    }

    /**
     * Convert All lower case string into upper case...
     * @param list
     * @return
     */
    public static List<String> convertLowerCaseToUpperCaseList(List<String> list) {
        return list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    /**
     * Find The Count of element Greater Then Ten by using filter and count method in stream API
     * @param list 
     * @return
     */
    public static long findTheCountOfElementGreaterThenTen(List<Integer> list) {
        return list.stream().filter(x -> x > 10).count();
    }

    /**
     * Remove duplicate elements from list suing distinct method in stream apis.
     * @param list
     * @return
     */
    public static List<Integer> removeDuplicatesAndReturn(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Get List in Descending Order using sorted method and comparator.reverseOrder() method in Stream API.
     * @param list
     * @return
     */
    public static  List<Integer> getListInDescendingOrder(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Find Longest String In Given List using filter and mapToInt method in Stream API.
     * @param list
     * @return
     */
    public static List<String> findLongestStringInGivenList(List<String> list) {
        return list.stream().filter(x -> x.length() == list.stream().mapToInt(String::length).max().orElse(0)).collect(Collectors.toList());
    }

    /**
     * Find Second Largest Number In Given List using distinct, sorted, skip method in Stream API.
     * @param list
     * @return
     */
    public static int findSecondLargestNumberInList(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }


}
