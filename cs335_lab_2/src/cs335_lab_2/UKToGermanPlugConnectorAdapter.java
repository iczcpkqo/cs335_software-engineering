package cs335_lab_2;

public class UKToGermanPlugConnectorAdapter implements GermanPlugConnector{
	private UKPlugConnector plug;

    public UKToGermanPlugConnectorAdapter(UKPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void giveElectricity() {
        plug.provideElectricity();
    }
}