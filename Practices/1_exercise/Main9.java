//
// We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//
// hasTeen(13, 20, 10) → true
// hasTeen(20, 19, 10) → true
// hasTeen(20, 10, 13) → true

//MY ANSWER

public boolean hasTeen(int a, int b, int c) {

  boolean teenA = (a >= 13 && a<=19 );
  boolean teenB = (b >= 13 && b<=19 );
  boolean teenC = (c >= 13 && c<=19 );

  int A = 0;
  int B = 0;
  int C = 0;


  if(teenA){
    A = 1;
  }

 if(teenB){
   B = 1;
 }

 if(teenC){
   C = 1;
 }


  if( A + B + C >= 1){
    return true;
  }else{
    return false;
  }

}

//The BOOK ANSWER
public boolean hasTeen(int a, int b, int c) {
  // Here it is written as one big expression,
  // vs. a series of if-statements.
  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}

//close10

public int close10(int a, int b) {

  int big1 = Math.abs(a - 10);
  int big2 = Math.abs(b - 10);

  if(big1 < big2){
    return a ;
  } else if(big1 > big2){
    return b;
  } else{
    return 0;
  }

}
