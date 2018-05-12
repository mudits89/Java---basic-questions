//We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//Given 2 int values, return true if one or the other is teen, but not both.
public boolean loneTeen(int a, int b) {
  if ((a >= 13 && a <= 19) ^ (b  >= 13 && b <= 19)){
    return true;
  }
  else {
    return false;
  }
}

//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
//Otherwise, return the string unchanged.
public String delDel(String str) {
  if (str.length() >= 4 && str.substring(1,4).equals("del")){
    return str.substring(0,1) + str.substring(4);
  }
  return str;
}

//Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count.
public boolean mixStart(String str) {
  if (str.length()<3){
    return false;
  }
  
  String x = str.substring(1,3);
  
  if(x.equals("ix")) {
    return true;
  }
  else {
    return false;
  }
}

//Given a string, return a string made of the first 2 chars (if present), 
//however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
public String startOz(String str) {
  String x = "";
  
  if (str.length() >= 1 && str.charAt(0) == 'o') {
    x = x +str.charAt(0);
  }
  if (str.length() >= 2 && str.charAt(1) == 'z'){
    x = x + str.charAt(1);
  }
  return x;
}

//Given three int values, a b c, return the largest.
public int intMax(int a, int b, int c) {
  int max;
  
  if (a > b){
    max = a;
  }
  else {
    max = b;
  }
  
  if (c > max){
    max = c;
  }
  return max;
}


//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
//Note that Math.abs(n) returns the absolute value of a number.
public int close10(int a, int b) {
  int c = Math.abs(a - 10);
  int d = Math.abs(b - 10);
  
  if (c < d){
    return a;
  }
  if (d < c) {
    return b;
  }
  return 0;
}
