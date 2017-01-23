import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class threeSum {
	public List<List<Integer>> ThreeSum(int[] nums) 
	{
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length < 3)
        {
        	return list;
        }
        else 
        {
        	int j = 0;
        	int k , l;
        	while(j<=nums.length - 3)
        	{
        	    k = j + 1;
            	l = nums.length - 1;
        		while(k<l)
        		{
        			if(nums[j] + nums[k] + nums[l] == 0)
            		{
            			List<Integer> al = new ArrayList<Integer>();
        				al.add(nums[j]);
        	        	al.add(nums[k]);
        	        	al.add(nums[l]);
        	        	list.add(al);
        	        	k++;
        	        	l--;
        	        	while((nums[l]==nums[l+1])&(l>k))
            			{
            				l--;
            			}
            			while((nums[k]==nums[k-1])&(k<l))
            			{
            				k++;
            			}
            		}
            		else if(nums[j] + nums[k] + nums[l] > 0)
            		{
            			l--;
            		}
            		else
            		{
            			k++;
            		}
        		}
        		j++;
        		while((nums[j]==nums[j-1])&(j<nums.length-1))
    			{
    				j++;
    			}
        	}	
        	return list;
        }
    }
	public static void main(String[] args) 
	{
//		String str;
//        Scanner in = new Scanner(System.in);
//        str = in.nextLine();   //读取一行字符串
//        in.close();
//        String strArr[] = str.split(" ");     //按空格分割，将字符串转为字符串数组
//        int nums[] = new int[strArr.length];  
//        for(int i = 0;i<strArr.length;i++)
//        {
//        	nums[i] = Integer.parseInt(strArr[i]); //类型转为int型
//        }
		int nums[] = {-1,0,1};
        threeSum list = new threeSum();
        System.out.print(list.ThreeSum(nums));
        return;
	}

}
