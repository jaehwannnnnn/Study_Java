package chapter5;

public class Q8 {
    public static void main(String[] args) {
        int[][] array={
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int total=0;
        int totalSum=0;
        double avg=0;
        for(int i=0;i<array.length;i++){
            for(int k=0;k<array[i].length;k++){
                totalSum+=array[i][k];
            }
            total+=array[i].length;
        }
        avg= (double)totalSum/total;
        System.out.println("전체 합 : "+totalSum);
        System.out.println("전체 평균 : "+avg);
    }

}
