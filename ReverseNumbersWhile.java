class ReverseNumbersWhile 
{
        public static void main(String[] args)
     {
        int i = 12345; 
        int rev = 0;
        System.out.println("i " + i );
        while (i != 0)
        {
            int tem = i % 10; 
            rev  = rev * 10 + tem;
             i /= 10; 
        }
        System.out.println("i : " + rev );
        }
    }

