public class ChnageCase{
	private String str="",newString="";
	private char[] testForEnd = {33,46,63};
//allowed to use length() charAt() and equals()
	public ChnageCase(String strIn){
		str=strIn;
	}

	public String toUpperCase(){
		for(int i = 0; i<str.length();i++){
			char temp = str.charAt(i);
			if(str.charAt(i)<123 && str.charAt(i)>96){
				newString+=(char)(str.charAt(i)-32);
			}
			else{newString+=(char)(str.charAt(i));}
		}
		return(newString);
	}
	
	public String toLowerCase(){
		newString="";
		for(int i = 0; i<str.length();i++){
			if(str.charAt(i)<91 && str.charAt(i)>64){
				newString+=(char)(str.charAt(i)+32);
			}
			else{newString+=(char)(str.charAt(i));}
		}
		return(newString);

	}

	public String toggleCase(){
		newString="";
		for(int i = 0; i<str.length();i++){
			if(str.charAt(i)<91 && str.charAt(i)>64){
				newString+=(char)(str.charAt(i)+32);
			}
			else if(str.charAt(i)<123 && str.charAt(i)>96){
				newString+=(char)(str.charAt(i)-32);

			}
			else{newString+=(char)(str.charAt(i));}
		}
		return(newString);
	}

	public String toTitleCase(){
		newString="";
		for(int i=0;i<str.length();i++){
			if(i==0 && str.charAt(i)<123 && str.charAt(i)>96){
				newString+=(char)(str.charAt(i)-32);
			}
			else if(i!=0&&str.charAt(i)<91 && str.charAt(i)>64 && str.charAt(i-1)!=32){
				
				newString+=(char)(str.charAt(i)+32);
				

			}

			else if(i!=0&&str.charAt(i)<123 && str.charAt(i)>96 && str.charAt(i-1)==32){
				newString+=(char)(str.charAt(i)-32);
			}
			else{newString+=(char)(str.charAt(i));}

			
		}
		return(newString);

	}

	public String toSentenceCase(){
		newString="";
		for(int i=0;i<str.length();i++){
			if(i==0 && str.charAt(i)<123 && str.charAt(i)>96){
				newString+=(char)(str.charAt(i)-32);
			}
			else if(i!=0 && str.charAt(i)<91 && str.charAt(i)>64){
				newString+=(char)(str.charAt(i)+32);
			}
			else if(i>2 && (str.charAt(i-1)==33 || str.charAt(i-1)==46 || str.charAt(i-1)==63 || str.charAt(i-2)==33 || str.charAt(i-2)==46 || str.charAt(i-2)==63) && str.charAt(i)!=32){
				newString+=(char)(str.charAt(i)-32);
			}
			else{newString+=(char)(str.charAt(i));}

			
		}
		return(newString);

	}

}
