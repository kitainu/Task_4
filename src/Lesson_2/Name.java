package Lesson_2;

public class Name {
    public static void main(String[] args) {
        //double Tab[][] = new double[3][3];
      /*  Tab[0][0] = 1.0;
        Tab[0][1] = 1.5;
        Tab[0][2] = 2.0;
        Tab[1][0] = 1.5;
        Tab[1][1] = 2.0;
        Tab[1][2] = 2.5;
        Tab[2][0] = 2.0;
        Tab[2][1] = 2.5;
        Tab[2][2] = 3.0; */
         double Tab [][] = {
        {1.0, 1.5, 2.0},
        {1.5, 2.0, 2.5},
        {2.0, 2.5, 3.0}
        };

        System.out.println(Tab[2][2] + Tab[1][1] + Tab[0][0]);
        System.out.println(Tab[0][2] + Tab[1][1] + Tab[2][0]);
        System.out.println(Tab[0][1] * Tab[1][1] * Tab[2][1] * Tab[1][0]*Tab[1][1]*Tab[1][2]);
        System.out.println(Tab[0][0]+Tab[0][1]+Tab[0][2]+Tab[1][2]+Tab[2][2]+Tab[2][1]+Tab[2][0]+Tab[1][0]);
    }
}
