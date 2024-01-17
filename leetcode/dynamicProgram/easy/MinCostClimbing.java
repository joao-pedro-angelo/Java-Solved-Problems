package dynamicProgram.easy;

// https://leetcode.com/problems/min-cost-climbing-stairs/description/
public class MinCostClimbing {
    public static void main(String[] args){
        System.out.println(minCostClimbingStairs(new int[] {10, 15, 20}));
        System.out.println(minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }

    private static int minCost(int[] cost, int n) {
        if (n < 0) return 0;
        else if (n==0 || n==1) return cost[n];
        else return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
}
