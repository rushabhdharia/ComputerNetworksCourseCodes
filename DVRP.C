#include <stdio.h>
struct node{
	int dist[20];
	int from[20];
}rt[10];
int main()
{
	int n,i,j,k,cost[20][20];
	printf("enter number of nodes:");
	scanf("%d",&n);
	printf("enter cost mat:\n");
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			scanf("%d",&cost[i][j]);
			rt[i].dist[j]=cost[i][j];
			rt[i].from[j]=i;
		}

	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			for(k=0;k<n;k++)
			{
				if(rt[i].dist[j]>rt[i].dist[k]+rt[k].dist[j])
				{
				     rt[i].dist[j]=rt[i].dist[k]+rt[k].dist[j];
				     rt[i].from[j]=k;
				}
			}
	for(i=0;i<n;i++)
	{
		printf("\nRouter %d \n",i+1);
		for(j=0;j<n;j++)
		{
			printf("Distance of %d is %d via %d\n",j+1,rt[i].dist[j],rt[i].from[j]+1);
		}
	}
	return 0;
}
