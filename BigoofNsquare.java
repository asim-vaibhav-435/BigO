public class BigoofNsquare {
    public static int addition(int x, int y){
       return (x+y); //O(1)
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};//O(1)
        for(int i = 0; i < arr1.length; i++){    //O(n)
            for(int j = 0; j < arr1.length; j++){     //O(n)
                System.out.print(" "+ addition(arr1[i],arr1[j]));
            }
        }
    }
}

//As O(n*n) is the BigO of the used function
// This condition is observed when nested loops are present in an function
