
public class HelloWorld {

	public static void main(String[] args) {
		
	for(int i =1; i<=100000000; i++)	// hier wird festgelegt in welchem Zahlenbereich die Collazvermutung durchgeführt wird //
	{
		int n=i;						// n wird von i genommen ohne dass i in der for Schleife geändet wird			   	   //
		System.out.println(n +": ");	// i wird das erste mal mit ":" ausgegeben. danach absatz (wegen "ln")				   //
		do{								
			if(n%2==0)					// in der if Schleife wird getestet ob if durch 2 teilbar ist...  					   //
			{n=n/2;}					// ...wenn ja danach durch 2 geteilt 												   //	
			else{n=n*3+1;}				// ...ansonsten *3+1 gerechnet 														   //
		
			System.out.print(n + " ");} // n wird ausgegeben mit einem "Leerzeichen" dazwischen 							   //
		while(n>1);						// solange n größer 1 ist geht die while Schleife von vorne los						   //
		System.out.println();			// (wenn bei 1 angelangt) Zeilenumbruch für die nächste Zahlenfolge					   //
	}
}

}