package com.anshuman.dpProblems;


//  This class contains implementation of Robot in a Grid DP Problem (8.2, Pg 95)
public class RobotInAGrid {

    public boolean isPathExists(int[][] grid,int rowIndex, int columnIndex) {
        if(rowIndex ==0 && columnIndex ==0) {
            return true;
        }

        if(rowIndex<0 || columnIndex<0 || grid[rowIndex][columnIndex] == 0) {
            //  Prohibited Area
            return false;
        }

        return isPathExists(grid,rowIndex,columnIndex-1)
                || isPathExists(grid,rowIndex-1,columnIndex);

    }

    public class Cell {
        public long rowIndex;
        public long columnIndex;
    }


    public static void main(String[] args) {
        RobotInAGrid robotInAGrid = new RobotInAGrid();

        int[][] grid = new int[][]{{1,1,1},{1,0,1},{1,1,1}};

        System.out.println("Path Exists: "+robotInAGrid.isPathExists(grid,2,2));
    }
}
