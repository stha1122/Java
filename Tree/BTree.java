package cb;

public class BTree {

	class Node{
		public Node(int i) {
			int data=i;
		}
		int data;
		Node left;
		Node right;
	}
	Node root;
	public void disp() {
		disp(root);
	}
	private void disp(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.println(nn.data);
		disp(nn.left);
		disp(nn.right);
	}
	  public BTree(int[] pre,int[] in) {
		root = createTree(pre,0,pre.length-1,in,0,in.length-1);  
	  }
	private Node createTree(int[] pre, int pre_s, int pre_e, int[] in, int in_s, int in_e) {
		if(pre_s>pre_e || in_s>in_e) {
			return null;
		}
		Node nn = new Node(pre[pre_s]);
		
		int f=-1;
		int l_size=0;
		for(int idx=in_s;idx<=in_e;idx++) {
			if (in[idx]==pre[pre_s]) {
				f=idx;
				break;
			}
			l_size++;
		}
		nn.left=createTree(pre, pre_s+1, pre_s+l_size, in, in_s, f-1);
		nn.right=createTree(pre, pre_s+l_size+1, pre_e, in, f+1, in_e);
		return nn;
	}
	public int size() {
		return size(root);
	}
	private int size(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L=size(nn.left);
		int R=size(nn.right);
		return L+R+1;
	}
	 public int ht() {
		 return ht(root);
	 }
	 int max_Dia=0;
	private int ht(Node nn) {
		if(nn==null) {
			return -1;
		}
		int L=ht(nn.left);
		int R=ht(nn.right);
		int S=2+L+R;
		max_Dia=Math.max(max_Dia,S);
		return Math.max(L, R)+1;
//		-1 because when node is null 0 should be returned
	}
	public int Dia() {
//		max_Dia=0;
//		ht(root);
//		return max_Dia;
		return Dia(root);
	}
	private int Dia(Node nn) {
		if(nn==null) {
			return 0;
		}
		int L=Dia(nn.left);
		int R=Dia(nn.right);
		int S = 2+ht(nn.left)+ht(nn.right);
		return Math.max(Math.max(R, L), S);
	}
	
	class diaPair{
		int Ht=-1;
		int Dia=0;
	}
	
	private diaPair Dia2(Node nn) {
		if(nn==null) {
			return new diaPair();
		}
		diaPair L = Dia2(nn.left);
		diaPair R = Dia2(nn.left);
		
		diaPair ans = new diaPair();
		
		ans.Ht = Math.max(L.Ht,R.Ht)+1;
		
		int S = L.Ht+R.Ht+2;
		ans.Dia=Math.max(L.Ht,R.Ht);
		
		return ans;
	}
	public boolean isBal() {
		return isBal(root);
	}
	private boolean isBal(Node nn) {
		if(nn==null) {
			return true;
		}
		boolean L= isBal(nn.left);
		boolean R= isBal(nn.right);
		
		
		boolean self = Math.abs(ht(nn.left)-ht(nn.right))<=1;
		
		return self && L && R;
	
	}
}
