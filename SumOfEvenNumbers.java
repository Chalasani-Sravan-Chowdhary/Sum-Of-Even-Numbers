public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int i= 2;
        int sum = 0;
        while(i<=100){
            
                sum = sum + i;
                i+=2;
        }
            System.out.println("The sum of all even numbers from 1 to 1000 is "+sum);
        
    }
}

