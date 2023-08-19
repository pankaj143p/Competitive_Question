//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        first = reverseList(first);
        second  = reverseList(second);
        Node allSum = new Node(0);
        Node tempNode = allSum;
        int eleSum1 = 0,eleSum2=0,carry=0,tempSum = 0;
        while(first!=null || second!=null || carry!=0){
        eleSum1 = (first!=null) ? first.data : 0;
        eleSum2 = (second!=null) ? second.data : 0;
        tempSum = eleSum1+eleSum2+carry;
        // carry = tempSum/10;
        tempNode.next  = new Node(tempSum%10);
         carry = tempSum/10;
        tempNode = tempNode.next;
        if(first!=null){
            first = first.next;
        }
        if(second!=null){
            second = second.next;
        }
    }
        return reverseList(allSum.next);
        // return head of sum list
    }
       static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }
}
