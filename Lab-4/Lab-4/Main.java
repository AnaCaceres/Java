public class Main {

	public static void main( String[] args ) {

		MyList<Integer> list = new MyList<Integer>( );
		for( int i = 0; i < 5; i++ ) {
			list.add( i );
		}

		System.out.println( "Print" );
		print( list );

		System.out.println( "Length" );
		System.out.println( length( list ) );

		System.out.println( "Reverse" );
		MyList<Integer> reverse = reverse( list );
		print( reverse );

		System.out.println( "Copy" );
		MyList<Integer> copy = copy( list );
		print( copy );

	}

  /**
	* Method for printing.
	*
	* @param list The list that must be printed.
	*/
	public static void print( final MyList<Integer> list ) {
		final Visitor<Integer> visitor = new PrintVisitor( );
		list.visitAll( visitor );
	}

	/**
	* Method for getting the length of the list.
	*
	* @param list The list that we are getting the lentgh of.
	* @return The length of the list.
	*/
	public static Integer length( final MyList<Integer> list ) {
		final LengthVisitor visitor = new LengthVisitor( );
		list.visitAll( visitor );
		return visitor.getLength( );
	}

	/**
	* Method for reversing the list.
	*
	* @param list The list that we have to reverse.
	* @return The reversed list.
	*/
	public static MyList<Integer> reverse( final MyList<Integer> list ) {
		final ReverseVisitor visitor = new ReverseVisitor( );
		list.visitAll( visitor );
		return visitor.getData( );
	}

	/**
	* Method for copying the list.
	*
	* @param list The list that we have to copy.
	* @return The copied list.
	*/
	public static MyList<Integer> copy( final MyList<Integer> list ) {
		MyList<Integer> copy = reverse( list );
		return reverse( copy );
	}

	/**
	* Inner class for printing
	*/
	private static class PrintVisitor implements Visitor<Integer> {
		@Override
		/**
		* Prints the data.
		*
		* @param data An element of the list that must me printed
		*/
		public void show( final Integer data ) {
			System.out.println( data );
		}
	}

	/**
	* Inner class for getting the length
	*/
	private static class LengthVisitor implements Visitor<Integer> {
		final Holder<Integer> length = new Holder<Integer>( 0 );

		/**
		* Gets the length of the list.
		*
		* @return The length of the list
		*/
		public Integer getLength( ) {
			return length.getData( );
		}

		@Override
		/**
		* Calculates the length of the list.
		*
		* @param data An element of the list..
		*/
		public void show( final Integer data ) {
			length.setData( length.getData( ) + 1 );
		}
	}

	/**
	* Inner class for reversing
	*/
	private static class ReverseVisitor implements Visitor<Integer> {
		final Holder<MyList<Integer>> reverseListHolder = new Holder<MyList<Integer>>( new MyList<Integer>( ) );

		/**
		* Gets the reversed list.
		*
		* @return The reversed list.
		*/
		public MyList<Integer> getData( ) {
			return this.reverseListHolder.getData( );
		}

		@Override
		/**
		* Creates the reversed list.
		*
		* @param data An element of the original list.
		*/
		public void show( final Integer data ) {
			reverseListHolder.getData().add( data );
		}
	}
}
