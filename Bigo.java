import java.util.Arrays;


public class Bigo{

    // This program consist of how BIG O is used and how to find time complexity of a particular function to perform
    // each process is counted as O(1)
    //For 'n' number of process BIG O(n)


    public static void otpt(){
        int arr[] = new int[1000]; // O(1)

        Arrays.fill(arr, 50 );// O(1)

        Arrays.fill(arr, 500, 600, 100 );// O(1)

        

        for(int i = 0; i < arr.length ; i++ ){

            if (arr[i] == 50) {
                System.out.println("Found 50!");
            }
            else{
                System.out.println("Not Found 50!");
            }
        } //O(n)

       // Total= 1+1+1+n
       //Big O(3+n) i.e. Big O(n)



    }

    


    public static void main(String[] args) {


        long start2 = System.currentTimeMillis();
        
        otpt();

        long end2 = System.currentTimeMillis();

        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));


    }
    
}