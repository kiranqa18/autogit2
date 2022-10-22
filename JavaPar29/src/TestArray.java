
public class TestArray {
	
	class Course{
		
		String cid;
		String cname;
		int ccost;
		
		Course(String cid,String cname,int ccost){
			
			this.cid=cid;
			this.cname=cname;
			this.ccost=ccost;
			
			
		}
	}
	
	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		
	for(int[] r1:a) {
		
		for(int val:r1) {
			
			System.out.print(val);
			
		}
		
		System.out.println();
		
		
	}

		
	}
}
