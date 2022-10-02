class Solution {
    public int romanToInt(String s) {
		int result = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i = 0; i < s.length(); i++) {
        	char simbol = s.charAt(i);
        	int number = map.get(simbol);
        	
        	if(i < s.length()-1) {
        		if(simbol == 'I' && s.charAt(i+1) == 'V') {
        			number = 4;
        			i++;
        		} else if(simbol == 'I' && s.charAt(i+1) == 'X') {
        			number = 9;
        			i++;
        		} else if(simbol == 'X' && s.charAt(i+1) == 'L') {
        			number = 40;
        			i++;
        		} else if(simbol == 'X' && s.charAt(i+1) == 'C') {
        			number = 90;
        			i++;
        		} else if(simbol == 'C' && s.charAt(i+1) == 'D') {
        			number = 400;
        			i++;
        		} else if(simbol == 'C' && s.charAt(i+1) == 'M') {
        			number = 900;
        			i++;
        		}
        	}
        	result += number;
        }
        return result;
    }
}
