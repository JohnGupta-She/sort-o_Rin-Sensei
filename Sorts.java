import java.util.ArrayList;
public class Sorts {

  public static void bubble( ArrayList<Comparable> data ) {
    int bubblePassCtr = 0;
    for(int i = 0; i < data.size()-1; i++) {

    	for(int j = data.size() - 1; j > i; j--){
    		if((data.get(j)).compareTo(data.get(j-1)) < 0) {
          Comparable temp = data.get(j);
          data.set(j, data.get(j - 1));
          data.set(j-1, temp);
    		}
    	}
    	bubblePassCtr++;
    }
  }

  public static void selection( ArrayList<Comparable> data ) {
    int selectionPassCtr = 0;
    int minPos;

    for(int i=0; i<data.size()-1; i++) {
      minPos = i;

      for(int j=i; j<data.size(); j++) {
        if ((data.get(j)).compareTo(data.get(minPos)) < 0) {
          minPos = j;
        }
      }
      Comparable temp = data.get(i);
      data.set(i, data.get(minPos));
      data.set(minPos, temp);
    }
    selectionPassCtr++;
  }

  public static void insertion( ArrayList<Comparable> data ) {
    int insertionPassCtr = 0;
    for( int i=1; i<data.size(); i++ ) {
      for( int j=i; j>0; j-- ) {

        if ((data.get(j)).compareTo(data.get(j-1)) < 0 ) {
          Comparable temp = data.get(j);
          data.set(j, data.get(j-1));
          data.set(j-1, temp);
        } else {
          break;
        }

      }
      insertionPassCtr++;
    }
    
  }

}
