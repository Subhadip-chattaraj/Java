class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        if(board.length!=9 | board[0].length!=9) return false;

        for(int i=0;i<9;i++)
        {
            if(checkRow(board,i)==false) return false;

            if(checkCol(board,i)==false) return false;
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                if(checkbox(board,i,j)==false) return false;
            }
        }    
        return true;
    }

    public boolean checkRow(char [][] board,int i)
    {
        int freq[]=new int[10];
        for(char ch:board[i])
        {
            if(ch!='.')
            {
                int num=ch-'0';
                if(num<1) return false;
                freq[num]++;
                if(freq[num]>1) return false;
            }
        }
        return true;
    }

    public boolean checkCol(char [][]board,int j)
    {
        int freq[]=new int[10];
        for(int i=0;i<board.length;i++)
        {
            if(board[i][j]!='.')
            {
                int num=board[i][j]-'0';
                if(num<1) return false;
                freq[num]++;
                if(freq[num]>1) return false;
            }
        }
        return true;
    }

    public boolean checkbox(char [][]board,int i,int j)
    {
        int freq[]=new int[10];
        for(int m=i;m<i+3;m++)
        {
            for(int n=j;n<j+3;n++)
            {
                if(board[m][n]!='.')
                {
                    int num=board[m][n]-'0';
                    if(num<1) return false;
                    freq[num]++;
                    if(freq[num]>1) return false;
                }
            }
        }
        return true;
    }
}
