public class Main {
    private static MyList<Integer> list = new MyList<Integer>( );

    public static void main( String[] args ) {
        
        Main list = new Main( );
        for(int i = 0; i < 5; i++) {
            list.list.add(i);
        }

        print( );
        length( );
        reverse( );
        copy( );
        
    }

    public static void print( ) {
        final Visitor<Integer> visitor = printVisitor( );
        list.visitAll( visitor );
    }

    public static void length( ) {
        final Visitor<Integer> visitor = lengthVisitor( );
        list.visitAll( visitor );
        System.out.println( visitor.getLength( ) );
    }
    
    public static void reverse( ) {
        final Visitor<Integer> visitor = reverseVisitor( );
        list.visitAll( visitor );
    }

    public static void copy( ) {
        reverse( );
        reverse( );
    }
    

    public static Visitor<Integer> printVisitor( ) {
        return new Visitor<Integer>( ) { 
            @Override
            public void show( final Integer data ) { 
                System.out.println( data ); 
            } 
        };
    }

    public static Visitor<Integer> lengthVisitor( ) {
        return new Visitor<Integer>( ) {
            Holder<Integer> length = new Holder<Integer>( 0 );

            public Integer getLength( ) {
                return length.getData( );
            }

            @Override
            public void show( final Integer data ) {
                length.setData( length.getData( ) + 1 );
            }
        };
    }

    public static Visitor<Integer> reverseVisitor( ) {
        return new Visitor<Integer>( ) {

            @Override
            public void show( final Integer data ) {

            }
        };
    }
    
}