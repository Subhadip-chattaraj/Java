 class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) 
    {       
        int row=matrix.length;
        int col=matrix[0].length;
        int count=0;
        int startingrow=0;
        int endingrow=row-1;
        int startingcol=0; 
        int endingcol=col-1;
        List<Integer> arr=new ArrayList<>();
        while(row*col>count)
        {
            //For top row left to right
            for(int i=startingcol;i<=endingcol && count<row*col;i++)
            {
                arr.add(count,matrix[startingrow][i]);
                count++;
            }
            startingrow++;
            //For end column top to bottom
            for(int i=startingrow;i<=endingrow && count<row*col;i++)
            {
                arr.add(count,matrix[i][endingcol]);
                count++;
            }
            endingcol--;
            //For end row right to left
            for(int i=endingcol;i>=startingcol && count<row*col;i--)
            {
                arr.add(count,matrix[endingrow][i]);
                count++;
            }
            endingrow--;
            //For Start column bottom to top
            for(int i=endingrow;i>=startingrow && count<row*col;i--)
            {
                arr.add(count,matrix[i][startingcol]);
                count++;
            }
            startingcol++;
        }
        return arr;
    }
}