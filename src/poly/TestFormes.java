package poly;

import java.text.DecimalFormat;

public class TestFormes {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(".##");
		Forme[ ] figures = new Forme[3] ;
		figures [ 0 ] = new Carre( 2 ) ; 
		figures [ 1 ] = new Cercle( 3 ) ; 
		figures [ 2 ] = new Carre( 5.2 ) ; 
		for( int i=0 ; i< figures.length ; i++ )
		 System.out.println( figures[i] +" : surface = "+ df.format(figures[i].getSurface()) +"cm2" ) ;

	}

}
