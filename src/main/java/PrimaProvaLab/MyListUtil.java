package PrimaProvaLab;


public class MyListUtil {
	
	public int[] orderNumber(int [] list) {
		int l= list.length;
		boolean change;
		for (int i=0; i<l; i++) {
			change= false;
			for (int j=1; j<(l-i); j++) {
				if (list[j-1] > list[j]) {
					int temp= list[j-1];
					list [j-1]= list[j];
					list[j]= temp;
					change=true;
				}
				
			}
			if (!change)
				break;
		}
		return list;
	}

	
	
}
