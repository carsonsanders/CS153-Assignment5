public class TestCase
{
    private static java.util.Scanner _sysin = new java.util.Scanner(System.in);

    private static int i;
    private static int j;
    private static int even;
    private static int odd;
    private static int prime;
    private static char ch;
    private static char str;

    public static void main(String[] args)
    {
        java.time.Instant _start = java.time.Instant.now();


        i = 3;
        ch = 'b';
        even = -990;
        odd = -999;
        prime = 0;
        switch(i + 1){case 1:j = i;
case -8:j = 8*i;
case 5,7,4:j = 574*i;
case :}
        System.out.printf("j = %d\n", j);
        switch(ch){case 'c','b':str = 'p';
case 'a':str = 'q';
}
        System.out.printf("str = '%c'\n", str);
        for(i = -5; i < 15; i++){
                switch(i){case 2:prime = i;
case -4,-2,0,4,6,8,10,12:even = i;
case -3,-1,1,3,5,7,9,11:switch(i){case -3,-1,1,9:odd = i;
case 2,3,5,7,11:prime = i;
case :}}
                System.out.printf("i = %d, even = %d, odd = %d, prime = %d\n", 
                                  i, even, odd, prime);
            }

        java.time.Instant _end = java.time.Instant.now();
        long _elapsed = java.time.Duration.between(_start, _end).toMillis();
        System.out.printf("\n[%,d milliseconds execution time.]\n", _elapsed);
    }
}
