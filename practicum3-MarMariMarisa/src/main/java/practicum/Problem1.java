package practicum;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import practicum.backtracker.Backtracker;
import practicum.backtracker.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 implements Configuration<Problem1> {
    List<Integer> unusedInts;
    List<Integer> solutionInts;
    private int currentSum;
    private int goalSum;

    // Used to create initial configuration
    public Problem1(List<Integer> unusedInts, int goalSum) {
        this.unusedInts = unusedInts;
        this.solutionInts = new LinkedList<Integer>();
        this.currentSum = 0;
        this.goalSum = goalSum;
    }

    // A copy constructor - Used to create successors of this configuration
    public Problem1(List<Integer> unusedInts, List<Integer> solutionInts, int currentSum, int goalSum) {
        this.unusedInts = unusedInts;
        this.solutionInts = solutionInts;
        this.currentSum = currentSum;
        this.goalSum = goalSum;
    }

    @Override
    public Collection<Problem1> getSuccessors() {
        // Complete this method
        List<Problem1> successors = new ArrayList<>();

        for(int unused: unusedInts){
            int currentSumCopy = currentSum;
            currentSumCopy += unused;
            List<Integer> unusedIntsCopy = new LinkedList<Integer>();
            for(int e: unusedInts){
                if(e!= unused){
                    unusedIntsCopy.add(e);
                }
            }
            List<Integer> solutionIntsCopy = new LinkedList<Integer>();
            for(int e: solutionInts){
                    solutionIntsCopy.add(e);
            }
            solutionIntsCopy.add(unused);
            successors.add(new Problem1(unusedIntsCopy, solutionIntsCopy, currentSumCopy, goalSum));
        }
        
        return successors;
    }

    @Override
    public boolean isValid() {
        // Complete this method
        return currentSum <= goalSum;
    }

    @Override
    public boolean isGoal() {
        // Complete this method
        return currentSum == goalSum;

    }

    @Override
    public String toString() {
        return goalSum + " = " + currentSum + " = " + solutionInts;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 4, 8, 16, 32, 64); // don't need to change this

        // Test 1
        int sum = 81;
        Problem1 initConfig = new Problem1(list, sum);
        Backtracker<Problem1> solver = new Backtracker<>(true);
        Problem1 solution = solver.solve(initConfig);
        System.out.println(solution); // 81 = 81 = [1, 16, 64]

        // Test 2
        sum = 120;
        initConfig = new Problem1(list, sum);
        solver = new Backtracker<>(true);
        solution = solver.solve(initConfig);
        System.out.println(solution); // 120 = 120 = [8, 16, 32, 64]

        // You may test with a different sum

    }
}
