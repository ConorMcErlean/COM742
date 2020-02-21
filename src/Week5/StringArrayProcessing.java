package Week5;

/*
Written By Conor McE (mcerlean-c13@ulster.ac.uk) on 21/02/2020
*/
public class StringArrayProcessing {
    public static boolean nameSearch(String[][] grid, String name){
        boolean found = false;
        int row = 0;
        do{
            for (int column = 0; column< grid[row].length; column++){
                if (name.equals(grid[row][column])){
                    found = true;
                }
            }//for
            // Iterate to next row
            row++;

        }while(!found & row < grid.length);
        return found;
    }

    public static boolean duplicateSearch(String[][] grid){
        boolean duplicateFound = false;
        for (int checkRow = 0; checkRow < grid.length; checkRow ++){
            for (int checkCol = 0; checkCol < grid[checkRow].length; checkCol++){
                for (int dupRow = 0; dupRow < grid.length; dupRow++){
                    for (int dupCol = 0; dupCol< grid[dupRow].length; dupCol++){
                        if (checkCol == dupCol && checkRow == dupRow){

                        }
                        else if
                        (grid[checkRow][checkCol].equals(grid[dupRow][dupCol])){
                            duplicateFound = true;
                        }
                    }// dupCol
                }// dupRow
            }//Checkcol
        }//check row
        return duplicateFound;
    }

    public static void main(String[] arg) {
    }// main
}// class
