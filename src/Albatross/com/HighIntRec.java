package Albatross.com;

public class HighIntRec {

	public static void main(String[] args) {
	
		        int[] array1 = {-1, 3, 5, 6, 99, 12, 2};
		        int[] array2 = {6, 7, 8};
		        
		        System.out.println("Highest integer in array1: " + findMax(array1, 0, array1.length - 1));
		        System.out.println("Highest integer in array2: " + findMax(array2, 0, array2.length - 1));
		    }
		    
		    public static int findMax(int[] arr, int start, int end) {
		        if (start == end) {
		            return arr[start];
		        }
		        
		        int mid = (start + end) / 2;
		        int maxLeft = findMax(arr, start, mid);
		        int maxRight = findMax(arr, mid + 1, end);
		        
		        return Math.max(maxLeft, maxRight);
		    }
		
	}


