class Alpha3{
	public static void main(String[] args) {
		int row=10;
		int num=5;
		int spc=0;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=spc;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=num;j++){
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
			if(i<=row/2){
				num--;
				spc++;
			}
			else{
				num++;
				spc--;
			}
		}
	}
}