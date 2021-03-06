/**
 * Interface named myList to detail my list operations
 * @author James, Mohib
 *
 */
public interface myList {

		public boolean add(int index, Song song);
		public boolean add(Song s);
		public boolean clear();
		public boolean contains(Song s);
		public Song get(int index);
		public int indexOf(Song s);
		public boolean isEmpty();
		public Song remove(int index);
		public Song remove(Song s);
		public boolean set(int index, Song s);
		public int size();
		public myList subList(int fromIndex, int toIndex);
		public Song[] toArray();
		public boolean swap(int position1, int position2);
		public boolean shift(int positions);
		
}
