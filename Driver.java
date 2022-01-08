import java.util.ArrayList;
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

		public static void reset( ArrayList<Comparable> w) {
			for(int i=0; i<w.size(); i++) {
				w.set(i, w.size()-i-1);
			}
		}

		public static void main(String[] args) {

			//best
			System.out.println("---------- BEST CASES ----------");
			ArrayList<Comparable> best = new ArrayList<Comparable>();
			for (int i=0; i<10; i++) {
				best.add(i);
			}
			Sorts.bubble(best);
			Sorts.selection(best);
			Sorts.insertion(best);
			System.out.println();

			for(int i=10; i<100; i++) {
				best.add(i);
			}
			Sorts.bubble(best);
			Sorts.selection(best);
			Sorts.insertion(best);
			System.out.println();

			for(int i=100; i<1000; i++) {
				best.add(i);
			}
			Sorts.bubble(best);
			Sorts.selection(best);
			Sorts.insertion(best);
			System.out.println();

			//worst
			System.out.println("---------- WORST CASES ----------");
			ArrayList<Comparable> worst = new ArrayList<Comparable>();
			for(int i=0; i<10; i++) {
				worst.add(0, i);
			}
			Sorts.bubble(worst);
			reset(worst);
			Sorts.selection(worst);
			reset(worst);
			Sorts.insertion(worst);
			reset(worst);
			System.out.println();

			for(int i=10; i<100; i++) {
				worst.add(0, i);
			}
			Sorts.bubble(worst);
			reset(worst);
			Sorts.selection(worst);
			reset(worst);
			Sorts.insertion(worst);
			reset(worst);
			System.out.println();

			for(int i=100; i<1000; i++) {
				worst.add(0, i);
			}
			Sorts.bubble(worst);
			reset(worst);
			Sorts.selection(worst);
			reset(worst);
			Sorts.insertion(worst);
			reset(worst);
			System.out.println();

			//random 5 trials ea size
			System.out.println("---------- RANDOM CASES ----------");
			ArrayList<Comparable> r10 = new ArrayList<Comparable>();
			for (int i=0; i<5; i++) {
				r10 = populate(10, 0, 19);
				Sorts.bubble(r10);
				r10 = populate(10, 0, 19);
				Sorts.selection(r10);
				r10 = populate(10, 0, 19);
				Sorts.insertion(r10);
				System.out.println();
			}

			System.out.println("-----");
			ArrayList<Comparable> r100 = new ArrayList<Comparable>();
			for (int i=0; i<5; i++) {
				r100 = populate(100, 0, 199);
				Sorts.bubble(r100);
				r100 = populate(100, 0, 199);
				Sorts.selection(r100);
				r100 = populate(100, 0, 199);
				Sorts.insertion(r100);
				System.out.println();
			}

			ArrayList<Comparable> r1000 = new ArrayList<Comparable>();
			for (int i=0; i<5; i++) {
				r1000 = populate(1000, 0, 1999);
				Sorts.bubble(r1000);
				r1000 = populate(1000, 0, 1999);
				Sorts.selection(r1000);
				r1000 = populate(1000, 0, 1999);
				Sorts.insertion(r1000);
				System.out.println();
			}
		}

}
