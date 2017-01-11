
class refactoring_test{

  public static void main(String args[]){
    conditional();
  }

  private static void conditional(){
    int count = 0;
    if(count == 0){
      count = count + 2;
    }else{
      count = count + 1;
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
