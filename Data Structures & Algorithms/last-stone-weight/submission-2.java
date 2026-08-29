class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Queue<Integer> a = new PriorityQueue<>((d,b)->(b-d));

        for(int n : stones)
            a.offer(n);

        while(a.size()>=2)
        {
            int first = a.peek();
            a.poll();
            int second = a.peek();
            a.poll();

            int c = first - second;

            if(c!=0)
                a.offer(c);
        }

        if(a.size()==0)
            return 0;
        else
            return a.peek();

    }
}
