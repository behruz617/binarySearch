public class Main {
    public static void main(String[] args) {
        int []num1={1,4,10,9};
        int target1=6;
        System.out.println(searchInsert(num1,target1));


    }
    public static int searchInsert(int []num,int target){
        int left=0;
        int right= num.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;
            if (num[mid]==target)
                return mid;
            else if (num[mid]<target)
                return left=mid+1;
            else {
                right=mid-1;
            }
        }

        return left;
    }
}
