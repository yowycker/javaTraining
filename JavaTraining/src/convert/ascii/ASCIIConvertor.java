package convert.ascii;

public class ASCIIConvertor {
	private int hexaToDecimal(String hexadecimal){
		String digits = "0123456789ABCDEF";
		hexadecimal = hexadecimal.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char c = hexadecimal.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
	}
	
	public String convertCharToASCIICode(String ascii){
	      // Step-1 - Convert ASCII string to char array
	      char[] ch = ascii.toCharArray();

	      // Step-2 Iterate over char array and cast each element to Integer.
	      StringBuilder builder = new StringBuilder();

	      for (char c : ch) {
	         int i = (int) c;
	         // Step-3 Convert integer value to hex using toHexString() method.
	         builder.append(Integer.toHexString(i).toUpperCase()+" ");
	      }
	      return builder.toString();
	}
	public String convertCharToASCIICode(char ascii){
	         int i = (int) ascii;
	         return Integer.toHexString(i).toUpperCase();
	}
	
	public char convertASCIICodeToChar(String codeHexaASCII){
		int dec = hexaToDecimal(codeHexaASCII);
		if(0 <= dec && dec < 256)
			return(char)dec;
		else
			return '0';
	}
	public char convertASCIICodeToCharLIMITED(String codeHexaASCII){
		int dec = hexaToDecimal(codeHexaASCII);
		if(64 < dec && dec < 91)
			return(char)dec;
		else
			return '0';
	}
}
