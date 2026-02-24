package gigimurin.relics;

import gigimurin.GigiMurinChar;

import static gigimurin.GigiMurinMain.makeID;

public class Shoebox extends AbstractEasyRelic {
    public static final String ID = makeID("Shoebox");

    public Shoebox() {
        super(ID, RelicTier.COMMON, LandingSound.FLAT, GigiMurinChar.Enums.GIGI_COLOR);
    }
}
