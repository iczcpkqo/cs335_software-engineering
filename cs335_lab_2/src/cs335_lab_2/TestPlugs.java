package cs335_lab_2;

/*
 * Test different brands of plugs.
 */
public final class TestPlugs{

	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}


	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
	}

	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testUKToGermanAdapter(){
		/* create a uk plug connector*/
		UKPlugConnector plug = new Furutech();
		/* create a German socket */
		GermanElectricalSocket socket = new GermanElectricalSocket();
		/* create an adapter */
		GermanPlugConnector ukAdapter = new UKToGermanPlugConnectorAdapter(plug);
		/* use this adapter in a German socket */
		socket.plugIn(ukAdapter);
	}
}

