import java.util.PriorityQueue;

public class shortestpath {
   
    public static void main(String[] args) {
      int[][]grid = {{0,1,3,2},{5,1,2,5},{4,3,8,6}};
       System.out.println(name(grid));
    }


    public static int name(int[][]grid) {
        
    
   int n = grid.length, m = grid[0].length;
    if(grid[0][0] > 1) return -1;
    if(grid[0][1] > 1 && grid[1][0] > 1) return -1;
    
    int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    
    PriorityQueue<int[]> q = new PriorityQueue<>( (a, b)->(a[2]-b[2]) );
    boolean[][] vis = new boolean[n][m];
    q.offer(new int[]{0, 0, 0});
    
    while(!q.isEmpty()){
        int[] e = q.remove();
        
        vis[e[0]][e[1]] = true;
        
        if(e[0]  == n-1 && e[1] == m-1) return e[2];
        
        for(int[] d: dir){
            int new_x = e[0]+d[0], new_y = e[1]+d[1];
            
            if(new_x < 0 || new_y < 0 || new_x >= n || new_y >= m || vis[new_x][new_y]) continue;
            vis[new_x][new_y] = true;
            int diff = grid[new_x][new_y]-e[2];
            
            if(diff <= 1){
                q.offer(new int[]{new_x, new_y, e[2]+1});
            }else{
                if(diff%2 == 0){
                    q.offer(new int[]{new_x, new_y, e[2]+diff+1});
                }else{
                    q.offer(new int[]{new_x, new_y, e[2]+diff});
                }
            }
            
        }
        
    }
    return -1;
    }
}
