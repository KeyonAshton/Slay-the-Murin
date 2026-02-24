package gigimurin.relics;

import gigimurin.GigiMurinChar;

import static gigimurin.GigiMurinMain.makeID;

public class CrazyFootwear extends AbstractEasyRelic {
    public static final String ID = makeID("CrazyFootwear");

    public CrazyFootwear() {
        super(ID, RelicTier.COMMON, LandingSound.FLAT, GigiMurinChar.Enums.GIGI_COLOR);
    }
}
