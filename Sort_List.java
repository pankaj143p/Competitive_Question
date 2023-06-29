class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int tempArr[]=new int[size];
        int j=0;
        while(temp!=null){
            tempArr[j++]=temp.val;
            temp=temp.next;
        }
        temp=head;
        Arrays.sort(tempArr);
       j=0;
        while(temp!=null){
            temp.val=tempArr[j++];
            temp=temp.next;
        }
        return head;
    }
}
