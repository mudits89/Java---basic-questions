//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
public boolean makes10(int a, int b) {
  if (a + b == 10)
  {
    return true;
  }
  else if (a == 10 || b == 10)
  {
    return true;
  }
  else {
    return false;
  }
}


//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
public boolean nearHundred(int n) {
  return((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
}

//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
public boolean posNeg(int a, int b, boolean negative) {
  if (negative){
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}



//Given a string, return a new string where "not " has been added to the front. 
//However, if the string already begins with "not", return the string unchanged. 
//Note: use .equals() to compare 2 strings.
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0,3).equals("not"))
  {
    return str;
  }
  return "not " + str;
}


//Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
//The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
public String missingChar(String str, int n) {
  String front = str.substring(0,n);
  
  String back = str. substring(n+1, str.length());
  
  return front + back;
}


//Given a string, return a new string where the first and last chars have been exchanged.
public String frontBack(String str) {
  if (str.length() <= 1) return str;
  
  String x = str.substring(1,str.length() - 1);
  
  return str.charAt(str.length()-1) + x + str.charAt(0);
}
