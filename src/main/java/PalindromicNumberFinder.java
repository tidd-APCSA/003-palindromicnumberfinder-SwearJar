public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // // accessor/getter method
    public int getNum(){
        return this.num;
    }

    ////////// this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
        num++;
        while(testPalindromicNum(num)!= true){
          num++;
        }
        return num-this.num;
    }

    // // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String convert = Integer.toString(num);
      if(convert.equals(reverseNum(num))){
        return true;
      }else{
        return false;
      }

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      Integer number = num;
      //String convert = Interger.toString(num); Why doesnt't this wrap not work? It worked in a different enviroment
      String reversed = "";
      int length = number.toString().length();
      for (int i = 0; i < length; i++){
        reversed = number.toString().charAt(i) + reversed;
      
      } 
      return reversed;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
