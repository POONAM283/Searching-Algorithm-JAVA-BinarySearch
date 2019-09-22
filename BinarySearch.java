
class BinarySearching
{
    int serching( int array[] , int start ,int end , int x )
    {
        int mid = (start+end)/2;
        if ( array[mid] == x ) {
            return mid;
        }else if (array[mid] <= x ){
            serching( array , mid+1 , end , x );
        }else if(array[mid] >= x){
            serching(array , start , mid-1 , x );   
        }
        return -1;
    }
}

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9};

        BinarySearching b1 = new BinarySearching();

        int index = b1.serching(array, 0, 9, 5);

        System.out.println(index+1);

    }
}