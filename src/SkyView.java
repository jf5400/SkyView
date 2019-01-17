public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        view = new double[numRows][numCols];
        int num =0;

        for(int i=0; i<numRows; i++){
            if( i%2 == 0){
                for(int j=0; j<numCols; j++){
                    view[i][j] = scanned[num];
                }
            }
            else{
                for(int k=numCols-1; k>-1; k--){
                    view[i][k] = scanned[num];
                }
            }
            num++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double sum = 0;
        int num = 0;

        for(int i = startRow; i < endRow; i++){
            for(int j = startCol; j < endCol; j++){
                sum+=view[i][j];
                num+=1;
            }
        }

        return sum/num;
    }
}
