//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == false && vacation == false)
  {
    return true;
  }
  else if (weekday == false && vacation == true)
  {
    return true;
  }
  else if (weekday == true && vacation == true)
  {
    return true;
  }
  else {
    return false;
  }
}

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
//We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile == true && bSmile == true)
  {
    return true;
  }
  else if (aSmile == true && bSmile == false)
  {
   return false;
  }
  else if (aSmile == false && bSmile == false)
  {
    return true;
  }
  else {
    return false;
  }
}


//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
public int sumDouble(int a, int b) {
  int sum = a+b;
  
  if (a == b)
  {
    int sum = 2*sum;
  }
  return sum;
}

//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
public int diff21(int n) {
 if (n <= 21) {
   return 21 - n;
 }
 else {
   return (n - 21) * 2;
 }
}

//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
public boolean parrotTrouble(boolean talking, int hour) {
  if (talking == true && hour < 7)
  {
    return true;
  }
  else if (talking == true && hour == 7)
  {
    return false;
  }
  else if (talking == false && hour == 6)
  {
    return false;
  }
  else if (talking == true && hour > 20){
    return true;
  }
  
  else {
    return false;
  }
}
