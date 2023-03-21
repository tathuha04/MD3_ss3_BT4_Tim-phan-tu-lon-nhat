import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("nhập chiều dài mảng hai chiều : ");
        int size = number.nextInt();
        int [][] matrix= new int [2][size];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j]= (int) (Math.random() * 50);
            }
        }
        System.out.println("Mảng 1"+ Arrays.toString(matrix[0])+ "\n Mảng 2"+ Arrays.toString(matrix[1]));
        int index1= maxValue(matrix[0]);
        int index2= maxValue(matrix[1]);
        int max= (matrix[0][index1]>matrix[1][index2]? matrix[0][index1]: matrix[1][index2]);
        System.out.println("số lớn nhất của mảng là: " + max);
    }
    public static int maxValue(int [] arr){
        int max= arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max= arr[i];
                index= i;
            }
        } return index;
    }
}