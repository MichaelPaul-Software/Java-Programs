class ReverseWords {
	//words separated by a single space
	//no leading or trailing spaces
	
	public static  void reverseWords(char[]str) {
		
		int len = str.length;
		if(len == 0)return;
		
		reverse(str, 0, len - 1); //reverse all the characters
		
		int start = 0;
		int end = 0;
		
		for(; end<len; end++) {
			while(end < len && str[end] != ' ') end++;
				if(end < len) {
					reverse(str,start, end-1); //reverse the reversed characters word by word
					start = end+1;
				}
		}
		
		reverse(str, start, end -2);
	}
	
	private static void reverse(char[] str, int start, int end) {
		while(start < end) {
			char temp = str[start];
			str[start++] = str[end];
			str[end--] = temp;
		}
		
		return;
	}
	
	
	public static void main(String[] args) {
		
		String str = "day good a was Today";
		
		char[] str1 = str.toCharArray();
		
		ReverseWords revWo = new ReverseWords();
		
		reverseWords(str1);
		
		System.out.println(str1);

	}
}
