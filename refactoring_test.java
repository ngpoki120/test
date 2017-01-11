
class refactoring_test{

  public static void main(String args[]){
    conditional();
  }

  private static void conditional(){
    int count = 0;
    if(isCountZero(count)){
      count = thenCount(count);
    }else{
      count = elseCount(count);
    }
  }

  private static boolean isCountZero(int count){
    return count == 0;
  }

  private static int thenCount(int count){
    return count + 2;
  }

  private static int elseCount(int count){
    return count + 1;
  }
}
