class LMR{
    static int solve(int a[],int n)
    {
     int maxLeft[]=new int[n];
     int minRight[]=new int[n];
     
     maxLeft[0]=a[0];
     
     minRight[n-1]=a[n-1];
     
        for(int i=1;i<n;i++)
        {  
            maxLeft[i] = Math.max(a[i-1],maxLeft[i-1]);
        }
        for(int j=n-2;j>=0;j--)
        {
            minRight[j]=Math.min(a[j+1],minRight[j+1]);
        }
        
        for(int k=0;k<n;k++)
        {
            if(a[k]>maxLeft[k] && a[k]<minRight[k])
            {
                return a[k];
            }
        }
        return -1;
    }
    }