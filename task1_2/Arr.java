public class Arr {
    public static void main(String[] args) {
        int[][] arr=new int[][] { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int d=9999;
        for (int i=0; i<arr.length; i++){
            for (int y=0; y<arr[i].length; y++){
                if(d>arr[i][y]){
                    d=arr[i][y];
                }
            }

        }
        System.out.println("min "+d);
    }
}
