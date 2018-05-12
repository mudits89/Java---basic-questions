//Given a string, we'll say that the front is the first 3 chars of the string. 
//If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
public String front3(String str) {
  String front;
  
  if (str.length() >= 3){
    front = str.substring(0,3);
  }
  else {
    front = str;
  }
  return front + front + front;
}

//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
//The original string will be length 1 or more
public String backAround(String str) {
  String last = str.substring(str.length()-1);
  return last + str + last;
}


//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
public boolean or35(int n) {
  return (n % 3 ==0 ) || (n % 5 == 0);
}


//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
//If the string length is less than 2, use whatever chars are there.
public String front22(String str) {
  int take = 2;
  if (take > str.length())
  {
    take = str.length();
  }
  
  String front = str.substring(0, take);
  return front + str + front;
}


//Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  if (str.length() < 2){
    return false;
  }
  
  String a = str.substring (0,2);
  
  if (a.equals("hi")){
    return true;
  }
  else {
    return false;
  }
}

//Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public boolean icyHot(int temp1, int temp2) {
  if (temp1 < 0 && temp2 > 100){
    return true;
  }
  else if (temp1 > 100 && temp2 < 0){
    return true;
  }
  else {
    return false;
  }
}

//Given 2 int values, return true if either of them is in the range 10..20 inclusive.
public boolean in1020(int a, int b) {
  if ((10 <= a  && a <= 20) || (10<= b && b <= 20)){
    return true;
  }
  else {
    return false;
  }
}


//We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//Given 3 int values, return true if 1 or more of them are teen.
public boolean hasTeen(int a, int b, int c) {
  if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
    return true;
  }
  else {
    return false;
  }
}

