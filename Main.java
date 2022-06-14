import java.util.*;

class Main {
  public static void main(String[] args) {
    
    int [][] grid = new int [4][3]; // row, then collumn, (row major). also you cant print 2D arrays normally, gotta use a loop

  // new
    for(int r = 0; r<grid.length; r++){
      for(int c = 0; c<grid[0].length; c++)//sometimes you have to specify where the length starts because 2d arrays are square
      {
        grid [r][c] = r*c;
      }
    }

    for(int r = 0; r<grid.length; r++){
      for(int c = 0; c<grid[0].length; c++){
        System.out.print(grid [r][c] + "\t");
      }
      System.out.println();
    }
//raw

    //populating string 2d array
Scanner scan = new Scanner(System.in);

  String [][] grades = new String [6][3];

    for(int r = 0; r< grades.length; r++){
     System.out.println("Enter three grades for hour " + (r +1));
      for ( int c = 0; c < grades[0].length; c ++)
        {
          grades[r][c] = scan.nextLine();
         // System.out.print(grades[r][c] + "\t");
        }
      System.out.println();
    }
// better way to just do a hard print
    
  for ( String[] array: grades)
    {
      for (String element: array)
        {
          System.out.print(element + " ");
        }
      System.out.println();
    }

    System.out.println("Determine if each student is improving: ");
   // public static boolean
  }
}