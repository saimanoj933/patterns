class Pattern12{
	public static void main(String[] args){
		int row=9;
		int num=1;
		int spc=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=num;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			if (i<=row/2) {
				num+=2;
				spc--;
			}
			else{
				num-=2;
				spc++;
			}
		}
	}
}