// Last updated: 09/07/2026, 22:10:51
1class Solution {
2    void dfs(int[][] img,int r,int c,int clr,int oc){
3        if(r<0|| c<0 || r>=img.length||c>=img[0].length||img[r][c]!=oc){
4            return;
5        }
6        img[r][c]=clr;
7        dfs(img,r-1,c,clr,oc);
8        dfs(img,r,c+1,clr,oc);
9        dfs(img,r+1,c,clr,oc);
10        dfs(img,r,c-1,clr,oc);
11    }
12    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
13        int oldCol=image[sr][sc];
14        if(image[sr][sc]!=color){
15            dfs(image,sr,sc,color,oldCol);
16        }
17        return image;
18    }
19}