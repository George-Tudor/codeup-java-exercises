package music;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable{

    private String saxType;

    public void Sax() {
        super.getInstrumentClassification();
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    @Override
    public void tuneInstrument() {

    }

    @Override
    public void detuneInstrument() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
