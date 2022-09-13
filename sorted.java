import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {6,18,3,8,25,17,14,5,16,35};
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
		    if(arr[i] > max)
		    {
		        max = arr[i];
		    }
		}
		double maxp = Math.ceil(Math.sqrt((double)max));
		int maxpower = (int)maxp;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<maxpower;i++)
		{
		    list.get(i).add(-1);
		}
		for(int i=0;i<n;i++)
		{
		    int j = arr[i]%maxpower;
		    list.get(j).add(arr[i]);
		}
		ArrayList<ArrayList<Integer>> sortedList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<maxpower;i++)
		{
		    sortedList.get(i).add(0);
		}
		for(int i=0;i<n;i++)
		{
		    int j = arr[i]/maxpower;
		    sortedList.get(j).add(arr[i]);
		}
		for(int i=0;i<maxpower;i++)
		{
    		System.out.println(sortedList.get(i));
		}
	}
}
