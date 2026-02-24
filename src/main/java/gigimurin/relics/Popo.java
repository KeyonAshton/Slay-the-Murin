package gigimurin.relics;

import gigimurin.GigiMurinChar;

import static gigimurin.GigiMurinMain.makeID;

public class Popo extends AbstractEasyRelic {
    public static final String ID = makeID("Popo");

    public Popo() {
        super(ID, RelicTier.STARTER, LandingSound.FLAT, GigiMurinChar.Enums.GIGI_COLOR);
    }
}
