class KthLargest {
    int k;
    int val;
    Queue<Integer> a = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.k=k;
        for (int n : nums) {
            a.offer(n);
    }
    }
    
    public int add(int val) 
    {
        this.val=val;
        a.offer(val);

        while(a.size()>k)
            a.poll();

        return (a.peek());
    }
}
