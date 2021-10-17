class Alpha5{
	public static void main(String[] args) {
		int row =6;
		int spc =5;
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=num;j++){
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
			spc--;
			num+=2;

		}
	}
}