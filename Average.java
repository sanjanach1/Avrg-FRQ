public class Average{
  private int[] arr;

  public Average(){
    arr = new int[10];
    for(int i = 0; i<10; i++){
      arr[i] = (int)(Math.random()*101);
    }
  }
  public double listAverage(){
    int sum = 0;
    for(int i = 0; i<10; i++){
      sum += arr[i];
    }
    return sum/10;
  }
}
