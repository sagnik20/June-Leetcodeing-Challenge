class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // sort in ascending order of(diff of costs of flying to 2 cities)
        Arrays.sort(costs,(x, y)->{            
    	   return (x[0] - x[1]) - (y[0] - y[1]);
       });
        
       int i = 0, j = costs.length - 1;
       int sum = 0;
       while(i < j) {
    	   sum += costs[i][0] + costs[j][1];
           ++i;
           --j;
        }
        
       return sum;
    }
}
