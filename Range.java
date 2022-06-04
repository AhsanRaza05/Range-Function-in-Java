
import java.util.*;

class Range{

	static int[] range(int firstValue, int lastValue){


        int elementQty = Math.abs(lastValue - firstValue);

        // TEST CASES / Input Possibilities

        // 3-1     =  2 (1,2)         [Increasing Order]
        // 3-(-1)  =  4 (-1,0,1,2)    [Increasing Order]

        // -3-1    = -4 (1,0,-1,-2)   [Decreasing Order] {Invalid case}
        // -5-(-1) = -4 (-1,-2,-3,-4) [Decreasing Order]

        int arr[] = new int[elementQty];

        // For Increasing order
        if(firstValue > 0 && lastValue >0 || firstValue < 0 && lastValue > 0){
            
            for(int i = firstValue, x = 0; x < elementQty; i++, x++){

                arr[x] = i;

            }
        }
        else{

            for(int i = firstValue, x = 0; x < elementQty; i--, x++){

                arr[x] = i;

            }
        }

        return arr;
		
	}
	
	public static void main(String args[]){
		
        // Test Case # 1
		int arr[] = range(1,10);
		System.out.println("" + Arrays.toString(arr));

        // Test Case # 2
        arr = range(-1,3);
		System.out.println("" + Arrays.toString(arr));

        // Test Case # 3
        arr = range(1,-3);
		System.out.println("" + Arrays.toString(arr));

        // Test Case # 4
        arr = range(-1,-5);
		System.out.println("" + Arrays.toString(arr));
	}

}