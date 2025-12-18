public class PalindromNumberFinder {
    public static void main(String[] args) {
        int x = 112;
        if(x < 0) {
            System.out.println("Nagative Number");
        }

        int tempNum = x;
        int rev = 0;
        
        while(tempNum > 0) {
            int temp = tempNum%10;
            rev = rev * 10 + temp;
            tempNum = tempNum/10;
        }

        if(x == rev)
            System.out.println("Palindrom Number");
        else
            System.out.println("Not A Palindrom Number");
           
    }
}
