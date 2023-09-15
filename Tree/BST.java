package cb;

public class BST {
	
		class Node {
			public Node(int i) {
				// TODO Auto-generated constructor stub
				data = i;
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
			if (nn == null) {
				return;
			}
//			10K 
			System.out.println(nn.data);
			disp(nn.left);
			disp(nn.right);
		}

		public BST(int[] pre, int[] in) {
			root = createTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}

		private Node createTree(int[] pre, int pre_s, int pre_e, int[] in, int in_s, int in_e) {
			if(pre_s>pre_e ||in_s>in_e) {
				return null;
			}
			
//			print(pre, pre_s, pre_e);
//			System.out.println("in_idx" +in_s+"-"+ in_e);
//			print(in, in_s, in_e);
//			System.out.println("======================");
			Node nn = new Node(pre[pre_s]);

			int f = -1;
			int l_size = 0;
			for (int idx = in_s; idx <= in_e; idx++) {
				if (in[idx] == pre[pre_s]) {
					f = idx;
					break;
				}
				l_size++;
			}
			nn.left = createTree(pre, pre_s + 1, pre_s + l_size, in, in_s, f - 1);
			nn.right = createTree(pre, pre_s + l_size + 1, pre_e, in, f + 1, in_e);

			return nn;
		}
		
		public boolean Find(int alo) {
			return Find(root, alo);
		}

		private boolean Find(Node nn, int aloo) {
			if (nn == null) {
				return false;
			}
			if (nn.data == aloo) {
				return true;
			}
			if (nn.data > aloo) {
				return Find(nn.left, aloo);

			} else {
				return Find(nn.right, aloo);
			}
		}

	public void Add(int aloo) {
		root = Add(root, aloo);
	}

	private Node Add(Node nn, int aloo) {
		if (nn == null) {
			return new Node(aloo);
		}
		if (nn.data >= aloo) {
			nn.left = Add(nn.left, aloo);
		} else {
			nn.right = Add(nn.right, aloo);
		}
		return nn;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}


	public void remove(int ali){
		root=remove(root,ali);
	}
	
	private Node remove(Node nn, int aloo) {
		if (nn.data > aloo) {
			nn.left = remove(nn.left, aloo);
		} else if (nn.data < aloo) {
			nn.right = remove(nn.right, aloo);
		} else {
//			case 1: aloo is leaf Node!!
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2: aloo has only a single child!!
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
//			case 3: has both children!!
			if (nn.left != null && nn.right != null) {
//				update nn.data to left sub tree ka max ya fir 
//				right sub tree ka min!!
				int max = Max(nn.left);
				nn.data = max;
				nn.left = remove(nn.left, aloo);
			}
		}
		return nn;
	}
		
	}

