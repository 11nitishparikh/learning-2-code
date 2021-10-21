package learn;

public class testingbalance {
    public static int solve(int[] arr){
        int mid = arr.length/2;
        int sumLeft=0;
        int sumRight=0;
        int index = -1;
        boolean flagLeft= false;
        boolean flagRight= false;
        for(int i=0;isumRight &amp;&amp; !flagLeft){
                sumRight+=arr[mid];
                sumLeft-=arr[mid-1];
                mid--;
                flagRight=true;
            }
            else if(sumLeft==sumRight){
                index=mid;
                break;
            }
            else{
                return -1;
            }
        }
        return index;
    }

    public static void main(String args[]){
        int [] temp = {9,5,4,1,3,10,5};
        int t = solve(temp);
        System.out.println("Index: "+t); //Output the index
    }
}