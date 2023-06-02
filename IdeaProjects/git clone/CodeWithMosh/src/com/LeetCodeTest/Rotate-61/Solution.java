public class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val  = val;
            this.next  = next;
        }

    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tem1 = head;
        int count = 0;
        while(tem1  != null){
            count++;
            tem1 = tem1.next;
        }
        if(k ==0|| head == null)
            return head;
        k = k%count;
        int m = count-k;
        int m1 = m;
        ListNode tem2 = head;
        ListNode tem3 = new ListNode(-1);
        ListNode ans = tem3;
        ListNode first = new ListNode(-1);
        ListNode fir = first;
        while(m-- > 0){
            first.next = new ListNode(tem2.val);
            tem2 =tem2.next;
            first =first.next;
        }
        while (tem2!=null){
            tem3.next =tem2 ;
            tem2 =tem2.next;
            tem3 =tem3.next;
        }
        ListNode temp4 =head;
        tem3.next =fir.next;
        return ans.next;

    }
}



