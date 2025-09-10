public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr={38,27,43,3,9,82,10};
        quickSort(arr,0,arr.length-1);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

    static void quickSort(int[] nums,int low,int high)
    {
        if(low < high)
        {
            int pivotIdx=partition(nums,low,high);
            quickSort(nums,low,pivotIdx-1);
            quickSort(nums,pivotIdx+1,high);
        }
    }

    static int partition(int[] nums,int low,int high)
    {
        int pivot=nums[low];
        int left=low+1;
        int right=high;

        while(left <= right)
        {
            while(left<=high && nums[left] <=  pivot)
            {
                left++;
            }

            while(right>low && nums[right] > pivot)
            {
                right--;
            }

            if(left < right)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        int temp=nums[low];
        nums[low]=nums[right];
        nums[right]=temp;
        return right;
    }
}