public class Driver {

	public static ArrayList populate( int size, int lo, int hi ) {
		ArrayList<Integer> retAL = new ArrayList<Integer>();
		while( size > 0 ) {
			retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
			size--;
    		}
    		return retAL;
  	}
  	
  	public static void shuffle( ArrayList al ) {
    		int randomIndex;
    		for( int i = al.size()-1; i > 0; i-- ) {
      			randomIndex = (int)( (i+1) * Math.random() );
      			al.set( i, al.set( randomIndex, al.get(i) ) );
    		}
  	}
  	
  	
  
}
