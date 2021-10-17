class Pattern4{
	public static void main(String args[]){
		int row = 9;
		int num = 5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=num;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<=row/2)
				num--;
			else
				num++;

		}
	}
}