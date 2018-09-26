public class CountEvens {
	
	public int countEvens(int elements[]) {
		int count = 0;
		for(int i=0; i<elements.length; i++) {
			if(elements[i]%2 == 0) {
				count++;
			}
		}
		return count;
	}

}
