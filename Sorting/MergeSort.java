public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr={38,27,43,3,9,82,10};
        mergeSort(arr,0,arr.length-1);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

    static void mergeSort(int[] nums,int left,int right)
    {
        if(left < right)
        {
            int mid=left+(right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    static void merge(int[] nums,int left,int mid,int right)
    {
        int i=left;
        int j=mid+1;
        int idx=0;
        int[] mix=new int[right-left+1];

        while(i<=mid && j<=right)
        {
            if(nums[i] < nums[j])
            {
                mix[idx++]=nums[i++];
            }
            else
            {
                mix[idx++]=nums[j++];
            }
        }

        while(i<=mid)
        {
            mix[idx++]=nums[i++];
        }

        while(j<=right)
        {
            mix[idx++]=nums[j++];
        }

        for(int a=left;a<=right;a++)
        {
            nums[a]=mix[a-left];
        }
    }
}