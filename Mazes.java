// package test;
// https://github.com/WCU-CS-CooperLab/csc240-hw2-maze-solver-ClaireBrownell/blob/main/test/Mazes.java

public class Mazes {
public final char[][] oneStepN = {{'G'},{'S'}};
public final char[][] oneStepS = {{'S'},{'G'}};
public final char[][] oneStepW = {{'G','S'}};
public final char[][] oneStepE = {{'S','G'}};
public final char[][] twoStepEN = {{'#','G'},{'S','.'}};
public final char[][] twoStepSW = {{'#','S'},{'G','.'}};
public final char[][] twoStepWN = {{'G','#'},{'.','S'}};
public final char[][] twoStepSE = {{'S','#'},{'.','G'}};
public final char[][] threeStepsFromCenter = {{'#','#','#','#','#'},
{'#','.','.','#','#'},
{'#','.','#','.','G'},
{'#','.','S','.','#'},
{'#','.','#','.','#'},
{'#','#','#','#','#'}};


public final char[][] sevenSteps = {{'#','#','#','#','#'},
{'S','.','.','#','#'},
{'#','.','#','.','G'},
{'#','.','.','.','#'},
{'#','.','#','.','#'},
{'#','#','#','#','#'}};


public final char[][] sevenStepsBack = {{'#','#','#','#','#'},
{'G','.','.','#','#'},
{'#','.','#','.','#'},{'#','.','.','.','#'},
{'#','.','#','.','#'},
{'#','#','#','S','#'}};


public final char[][] noSolution5 = {{'#','#','#','#','#'},
{'G','.','.','#','#'},
{'#','.','#','.','#'},
{'#','.','#','.','#'},
{'#','.','#','.','#'},
{'#','#','#','S','#'}};

public final char[][] noSolution10 = {{'#','#','#','#','#','#','#','#','#','#'},
{'S','.','.','#','#','.','.','.','.','#'},
{'#','.','.','#','#','.','.','.','.','#'},
{'#','.','.','#','#','.','.','.','.','#'},
{'#','.','.','#','#','.','.','.','.','#'},
{'#','.','.','.','.','.','.','.','.','#'},
{'G','#','#','#','#','#','#','#','#','#'}};

public final char[][] noSolution1 = {{'S'}};


public final char[][] noSolution2 = {{'.','.'},{'.','S'}};

}