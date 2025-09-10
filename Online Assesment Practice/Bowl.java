import java.util.*;
public class Bowl
{
    public static void main(String[] args)
    {
        int[] nums={2,5,3,1,4};
        findBowls(nums);
    }

    static void findBowls(int[] nums)
    {
        //findPrevGreater
        int n=nums.length;
        int[] prev=new int[n];
        int[] next=new int[n];

        Deque<Integer> s=new ArrayDeque<>();
        Arrays.fill(prev,-1);
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && nums[s.peek()]<nums[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                prev[i]=-1;
            }
            else
            {
                prev[i]=s.peek();
            }
            s.push(i);
        }

        System.out.println(Arrays.toString(prev));
    }
}