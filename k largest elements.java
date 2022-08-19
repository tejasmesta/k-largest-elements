class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++) {
            pq.add(arr[i]);
        }
        
        int[] ans = new int[k];
        int idx = 0;
        for(int i=k;i<n;i++) {
            if(arr[i]>pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
         
        for(int i=k-1;i>=0;i--) {
            ans[i] = pq.poll();
        }
        
        return ans;
    }
}
