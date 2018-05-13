//Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
public boolean in3050(int a, int b) {
  if ((a >= 30 && a <= 40 ) && (b >= 30 && b <= 40 )){
    return true;
  }
  else if ((a >= 40 && a <= 50 ) && (b >= 40 && b <= 50 )){
     return true;
   }
  else {
    return false;
  }
}


//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
public int max1020(int a, int b) {
  if (b > a){
    int temp = a;
    a = b;
    b = temp;
  }
  
  if (a >= 10 && a <= 20){
    return a;
  }
  if (b >= 10 && b <= 20){
    return b;
  }
  return 0;
}


//
Return true if the given string contains between 1 and 3 'e' chars.
public boolean stringE(String str) {
  int count = 0;
  
  for (int i = 0; i<str.length(); i++){
   if (str.charAt(i) == 'e'){
     count++;
   }
  }
  return (count >= 1 && count <= 3);
}


//Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
//Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
public boolean lastDigit(int a, int b) {
  return (a %10 == b%10);
}


//