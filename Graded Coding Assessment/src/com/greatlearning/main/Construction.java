package com.greatlearning.main;

public class Construction {
	public void floorConstruction(int n,int x[]) {
		int j=n;
		boolean flag;
		System.out.println("Orderof construction:");
		for(int i=1;i<=n;i++)
		{
			flag=false;System.out.println("Day:"+i+" :");
			while(j>=1 && x[j]<=i) {
				flag=true;
				System.out.println(j+" ");
				j--;
			}
			if(flag==true)
			{
				System.out.println();
			}
		}
		
	}

}
