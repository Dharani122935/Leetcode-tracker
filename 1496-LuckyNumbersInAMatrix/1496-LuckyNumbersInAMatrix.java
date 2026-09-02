// Last updated: 02/09/2026, 09:49:23
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int c=0;
            int min=matrix[i][0];
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    c=j;
                }
            }
            boolean l=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][c]>min){
                    l=false;
                    break;
                }
            }
            if(l){
                r.add(min);
            }
        }
        return (r);
    }
}