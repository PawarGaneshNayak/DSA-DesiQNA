import java.util.*;

class FrequencyOccurence{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int arr[] = new int[N];
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<N; i++){
          arr[i] = sc.nextInt();

          if(map.containsKey(arr[i])){
              map.put(arr[i], map.get(arr[i]) + 1);
          }
          else{
              map.put(arr[i], 1);
          }
      }
      System.out.println("Frequencies are : ");
      for(int e : map.keySet()){
          System.out.println(e +" : "+ map.get( e));
      }      
  }
}
