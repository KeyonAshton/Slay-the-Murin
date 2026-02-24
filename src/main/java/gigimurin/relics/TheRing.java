package gigimurin.relics;

import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.powers.StrengthPower;
import gigimurin.GigiMurinChar;

import static gigimurin.GigiMurinChar.gotTheRing;
import static gigimurin.GigiMurinChar.lostTheRing;
import static gigimurin.GigiMurinMain.makeID;
import static gigimurin.util.Wiz.isBossFight;

public class TheRing extends AbstractEasyRelic {
    public static final String ID = makeID("TheRing");
    private int strengthAmount = 2;

    public TheRing() {
        super(ID, RelicTier.COMMON, LandingSound.FLAT, GigiMurinChar.Enums.GIGI_COLOR);
    }

    public void atBattleStart() {
        if (isBossFight()) {
            this.flash();
            for(AbstractMonster m : AbstractDungeon.getMonsters().monsters) {
              this.addToTop(new RelicAboveCreatureAction(m, this));
              m.addPower(new StrengthPower(m, strengthAmount));
           }
            AbstractDungeon.onModifyPower();
        }
    }

    public void onSpawnMonster(AbstractMonster monster) {
        if (isBossFight()) {
            monster.addPower(new StrengthPower(monster, strengthAmount));
            AbstractDungeon.onModifyPower();
        }
    }

    public void onEquip() {
        ++AbstractDungeon.player.energy.energyMaster;
        gotTheRing = true;
    }

    public void onUnequip() {
        --AbstractDungeon.player.energy.energyMaster;
        lostTheRing = true;
    }
}
