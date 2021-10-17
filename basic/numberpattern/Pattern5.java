class Pattern5{
	public static void main(String args[]){
		int row = 9;
		int num = 5;
		for(int i=1;i<=row;i++){
			for(int j=num;j>=1;j--){
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