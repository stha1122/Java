
import java.util.Stack;

class node{
	public node(int ali) {
		// TODO Auto-generated constructor stub
		data=ali;
	}
	int data;
	node next;
}

public class LinkedList {
	node head;
	public void display() {
		node temp=head;
		while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
		}
		System.out.println();
	}
	
	public int size() {
		node temp=head;
		int cnt=0;
		while(temp!=null) {
		cnt++;
		temp=temp.next;
		}
		return cnt;
	}
	
	public int getFirst() {
		if(isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		return head.data;
		
	}
	
	public int getlast() {
		if(isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		node temp=head;
		while(temp.next!=null) {
		temp=temp.next;
			}
		return temp.data;
	}
	
	public int getAt(int idx) {
		if(idx<0|| idx>=size()) {
			throw new RuntimeException("internally : kya dheek rha hein?");
		}
		node temp=head;
	for(int i=0;i<idx;i++) {
		temp=temp.next;
	}
	return temp.data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int ali) {
		node temp=head;
		node nn= new node(ali);
		nn.next=head;
		head=nn;
		
	} 
	
	public void addLast(int ali) {
		if(isEmpty()) {
			addFirst(ali);
			return;
		}
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
				}
		node nn= new node(ali);
		temp.next=nn;
	}
	
	public node getnode(int idx) {
		node temp=head;
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public void addAt(int idx,int ali) {
		if(idx<0|| idx>=size()) {
			throw new RuntimeException("kya daal rha hein?");
		}
		if(idx==0) {
			addFirst(ali);
		}
		else if(idx>size()) {
			addLast(ali);
		}
		else if (idx == size()) {
			addLast(ali);
		}
		else {
		node nn = new node(ali);
		node prev= getnode(idx-1);
		nn.next=prev.next;
		prev.next=nn;}
	
	}
	
	public int removeFirst() {
		if(isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein?");
		}
		int ans=head.data;
		head=head.next;
		return ans;
	}
	
	public int removeLast() {
		if(size()<=1) {
			return removeFirst();
		}
		else{
		node secondlast=getnode(size()-2);
		node last=secondlast.next;
		secondlast.next=null;
		return last.data;}
	}
	
	public int removeat(int idx) {
		if(idx<0|| idx>=size()) {
			throw new RuntimeException("kya daal rha hein?");
		}
		if(idx==0) {
			return removeFirst();
		}
		else if(idx>size()-1) {
			return removeLast();
		}
		else {
		node cur=getnode(idx);
		node prev=getnode(idx-1);
		node after=cur.next;
		prev.next=after;
		return cur.data;}
		}
	
	public void printRev() {
	printRev(head);
		}

	private void printRev(node nn) {
		while(nn==null) {
			return;
		}
		node curr=nn;
		printRev(curr.next);
		System.out.print(curr.data+"<-");
		return;
	}
	public void Rev() {
		node curr=head;
		node prev=null;
		node after=null;
		while(curr!=null){
			after=curr.next;
			curr.next=prev;
			prev=curr;
			curr=after;
		}
		head=prev;
	}
	public void RevRec() {
		RevRec(head);
	}
	private node RevRec(node nn) {
		if(nn.next==null) {
			head=nn;
			return nn;
		}
//	BP:puri linkedlist rev kar aur tail de!!
		node curr=nn;
		node tail=RevRec(nn.next);
		tail.next=curr;
		curr.next=null;
		return nn;
	}
	public void K_Rev(int k) {
		node curr = head;
		Stack<node> S = new Stack<>();
		node nhead = null;
		node ntail = null;
		while (curr != null) {
			node after = curr.next;
			S.add(curr);

			if (S.size() == k) {
//				stack ke elements nikalo and usse new LinkedList mein daalo!!
				while (!S.isEmpty()) {
					node temp = S.pop();
//					add this temp at the end of the ntail
					if (nhead == null) {
						nhead = temp;
						ntail = temp;
						ntail.next = null;
					} else {
						ntail.next = temp;
						ntail = temp;
						ntail.next = null;
					}
				}
			}

			curr = after;
		}
		while (!S.isEmpty()) {
			node temp = S.pop();
//			add this temp at the end of the ntail
			if (nhead == null) {
				nhead = temp;
				ntail = temp;
				ntail.next = null;
			} else {
				ntail.next = temp;
				ntail = temp;
				ntail.next = null;
			}
		}
		head = nhead;
	}
	public int getMid() {
		node fast = head;
		node slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}
	public int lastk(int k) {
		node ahead=head;
		node behind=head;
		for(int cnt=1;cnt<=k;cnt++) {
			ahead=ahead.next;
		}
		while(ahead!=null) {
		ahead=ahead.next;
		behind=behind.next;
		}
		return behind.data;
	}
	public node getIntersectionNode(node headA, node headB) {
		node c1=headA;
		node c2=headB;
        while(c1!=c2){
            c1=c1.next;
            c2=c2.next;
            if(c1==c2){
                return c1;
            }
            if(c1==null){
                c1=headB;
            }
            if(c2==null){
                c2=headA;
            }
        }
        return c1;
    }
	public boolean detectCycle() {
	node fast=head;
	node slow=head;
	while(fast!=null && fast.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(fast==slow) {
			return true;
		}
	}
	return false;
}

	ublic void breakCycle() {
		Node fast = head;
		Node slow = head;
		while (true) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				break;
			}
		}
		Node special = fast;
		Node c1 = head;
		while(c1.next !=special.next){
			c1 = c1.next;
			special= special.next;
		}
		special.next = null;
		
	}

}
