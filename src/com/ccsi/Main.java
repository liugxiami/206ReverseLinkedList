package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    ListNode root =new ListNode(1);
        ListNode curr=root;
        for (int i = 2; i <= 5; i++) {
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        ListNode a=root;
        while (a!=null){
            System.out.println(a.val);
            a=a.next;
        }
        ListNode rList=reverseList(root);
        while (rList!=null){
            System.out.println(rList.val);
            rList=rList.next;
        }
    }
    //Reverse a singly Linked list
    public static ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode pre=head;
        ListNode curr=head.next;
        ListNode next=null;
        while(curr.next!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        head.next=null;       //注意此步，没有的话将形成循环（最后两node）
        curr.next=pre;
        head=curr;

        return head;
    }
}
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
