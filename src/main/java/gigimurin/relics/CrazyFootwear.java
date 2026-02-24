package gigimurin.relics;

import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.DexterityPower;
import com.megacrit.cardcrawl.powers.LoseDexterityPower;
import gigimurin.GigiMurinChar;

import static gigimurin.GigiMurinMain.makeID;
import static gigimurin.util.Wiz.applyToSelf;
import static gigimurin.util.Wiz.atb;

public class CrazyFootwear extends AbstractEasyRelic {
    public static final String ID = makeID("CrazyFootwear");
    private static final int turns = 3;
    private static final int dexAmount = 1;

    public CrazyFootwear() {
        super(ID, RelicTier.COMMON, LandingSound.FLAT, GigiMurinChar.Enums.GIGI_COLOR);
    }

    public void atBattleStart() {
        this.counter = turns;
    }
    public void atTurnStart() {
        if (this.counter > 0) {
            this.counter--;
            this.flash();
            atb(new RelicAboveCreatureAction(AbstractDungeon.player, this));
            applyToSelf(new DexterityPower(AbstractDungeon.player, dexAmount));
            applyToSelf(new LoseDexterityPower(AbstractDungeon.player, dexAmount));
        } else {
            this.counter = 0;
        }
    }
}
