import java.util.ArrayList;
public class Sorts {

  public static void bubble( ArrayList<Comparable> data ) {
    int passes = 0;
    int swaps = 0;
    int comps = 0;
    for(int i = 0; i < data.size()-1; i++) {

    	for(int j = data.size() - 1; j > i; j--){
        comps++;
    		if((data.get(j)).compareTo(data.get(j-1)) < 0) {
          Comparable temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
          swaps++;
    		}
    	}
    	passes++;
    }
    System.out.println("Bubble: size " + data.size() + ", passes " + passes + ", swaps " + swaps + ", comparisons " + comps);
  }

  public static void selection( ArrayList<Comparable> data ) {
    int passes = 0;
    int swaps = 0;
    int comps = 0;
    int minPos;

    for(int i=0; i<data.size()-1; i++) {
      minPos = i;

      for(int j=i+1; j<data.size(); j++) {
        comps++;
        if ((data.get(j)).compareTo(data.get(minPos)) < 0) {
          minPos = j;
        }
      }
      Comparable temp = data.get(i);
      data.set(i, data.get(minPos));
      data.set(minPos, temp);
      swaps++;
      passes++;
    }
    System.out.println("Selection: size " + data.size() + ", passes " + passes + ", swaps " + swaps + ", comparisons " + comps);
  }

  public static void insertion( ArrayList<Comparable> data ) {
    int passes = 0;
    int swaps = 0;
    int comps = 0;
    for( int i=1; i<data.size(); i++ ) {
      for( int j=i; j>0; j-- ) {

        comps++;
        if ((data.get(j)).compareTo(data.get(j-1)) < 0 ) {
          Comparable temp = data.get(j);
          data.set(j, data.get(j-1));
          data.set(j-1, temp);
          swaps++;
        } else {
          break;
        }

      }
      passes++;
    }
    System.out.println("Insertion: size " + data.size() + ", passes " + passes + ", swaps " + swaps + ", comparisons " + comps);
  }

}
