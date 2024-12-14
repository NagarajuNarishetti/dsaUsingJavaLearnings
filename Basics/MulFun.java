package Basics;

public class MulFun {
  public static void main(String[] args){
    int arr[]= {22,33,443,22,22,332,332,33,32};
    sum(arr);
  }    
  static void sum(int ...v){
    System.out.println(Arrays .toString(v));
  }
}
