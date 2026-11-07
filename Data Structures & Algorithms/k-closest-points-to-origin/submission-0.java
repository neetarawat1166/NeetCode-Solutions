class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> dis = new PriorityQueue<>((a,b)->Integer.compare(distance(b),distance(a)));
    
       for(int[] a : points)
       {
            dis.add(a);

            if(dis.size()>k)
            {
                dis.poll();
            }
       }

       int[][] res = new int[k][2];
       for (int i = 0; i < k; i++) {
            res[i] = dis.poll();
        }

       return res;

    }

    public int distance(int[] point)
    {
        int x = point[0];
        int y = point[1];

        return (x*x + y*y);
    }
}
